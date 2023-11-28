package com.whynot.Proxy.Trading.Dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.whynot.Proxy.Trading.DataUtils.*;
import com.whynot.Proxy.Trading.Entities.Proxy;
import com.whynot.Proxy.Trading.Repository.ProxyRepository;
import com.whynot.Proxy.Trading.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.function.ServerRequest;

import java.util.Objects;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    ProxyRepository proxyRepository;
    RestTemplate restTemplate = new RestTemplate();

    @Override
    public String saveAliceUserDetails(UserDetails userDetails) {
        try {
            if(proxyRepository.existsByProxyUserId(userDetails.getUserId())){
                return "User Already exists";
            }
            //GetEncryptionKey
            String encryptionKey = getEncryptionKeyForAliceBlueUser(userDetails);
            System.out.println(encryptionKey);
            String sessionId = getSessionIdForAliceBlueUser(userDetails.getUserId(),userDetails.getApiKey(),encryptionKey);
            System.out.println(sessionId);
            Proxy proxy = new Proxy();
            proxy.setProxyUserId(userDetails.getUserId());
            proxy.setProxyUserToken(sessionId);
            proxy.setMaster(userDetails.getMaster());
            proxy.setProxyCompany(userDetails.getCompany());
            proxyRepository.saveAndFlush(proxy);
            return "User saved successFully:-"+userDetails.getUserId();
        }catch (Exception e){
            throw  new RuntimeException(e.getCause());
        }
    }

    private String getSessionIdForAliceBlueUser(String userId, String apiKey, String encryptionKey){
     try {
         HttpHeaders headers = new HttpHeaders();
         headers.set("Content-Type", "application/json");
         ObjectMapper objectMapper = new ObjectMapper();
         String input = SHA256Conversion.sha256(userId + apiKey + encryptionKey);
         AliceBlueUser aliceBlueUser = new AliceBlueUser();
         aliceBlueUser.setUserId(userId);
         aliceBlueUser.setUserData(input);
         String requestBody = objectMapper.writeValueAsString(aliceBlueUser);
         HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
         ResponseEntity<AliceBlueSessionGenerator> responseEntity = restTemplate.postForEntity(BrokerageUtils.ALICE_BLUE_SESSIONID, requestEntity, AliceBlueSessionGenerator.class);
         if (responseEntity.getStatusCode().is2xxSuccessful()) {
             return Objects.requireNonNull(responseEntity.getBody()).getSessionID();
         } else {
             System.out.println("Request failed with status code: " + responseEntity.getStatusCode());
         }
     }catch (Exception e){
         throw new RuntimeException(e.getCause());
     }
            return null;

        }

    private String getEncryptionKeyForAliceBlueUser(UserDetails userDetails) throws JsonProcessingException {
        HttpHeaders headers= new HttpHeaders();
        headers.set("Content-Type", "application/json");
        ObjectMapper objectMapper = new ObjectMapper();
        String requestBody = objectMapper.writeValueAsString(userDetails);
        HttpEntity<String> requestEntity = new HttpEntity<>(requestBody, headers);
        ResponseEntity<AliceBlueEncryption> responseEntity = restTemplate.postForEntity(BrokerageUtils.ALICE_BLUE_ENCRYPTIONKEY,requestEntity,AliceBlueEncryption.class);
        if (responseEntity.getStatusCode().is2xxSuccessful()) {

            return Objects.requireNonNull(responseEntity.getBody()).getEncKey();
        } else {
            System.out.println("Request failed with status code: " + responseEntity.getStatusCode());
        }
        return null;
    }

    @Override
    public String saveAngelUserDetails(UserDetails userDetails) {
        return null;
    }
}
