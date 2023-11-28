package com.whynot.Proxy.Trading.Dao;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.whynot.Proxy.Trading.DataUtils.*;
import com.whynot.Proxy.Trading.Entities.Proxy;
import com.whynot.Proxy.Trading.Entities.ProxyOrder;
import com.whynot.Proxy.Trading.Repository.ProxyOrderRepository;
import com.whynot.Proxy.Trading.Repository.ProxyRepository;
import com.whynot.Proxy.Trading.Services.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.Exchanger;

@Service
public class OrderServiceImpl implements OrderService {
    public static final String BEARER ="Bearer ";
    public static String ALICE_BLUE = "AliceBlue";
    public static String ANGEL_ONE ="AngelOne";
    @Autowired
    ProxyRepository proxyRepository;
    @Autowired
    ProxyOrderRepository proxyOrderRepository;
    RestTemplate restTemplate = new RestTemplate();
    @Override
    public ResponseEntity<String> placeOrder(OrderPayLoad orderPayLoad, String company) {
        return null;
    }

    @Override
    public void placeOrderForAliceBlueMaster(String companyName, String userId) {
        AliceBlueOrderPayLoad aliceBlueOrderPayLoad = getAliceBlueMasterLatestOrderPayLoad(companyName, userId);
        //Getting children
        List<Proxy> proxyList = proxyRepository.findAll();
        for (Proxy proxy : proxyList){
                if(!proxy.getMaster()) {
                    placeOrdersForProxyChildren(proxy, aliceBlueOrderPayLoad);
                }
        }



    }

    private void placeOrdersForProxyChildren(Proxy proxy, AliceBlueOrderPayLoad aliceBlueOrderPayLoad) {
        String company = proxy.getProxyCompany();
        switch (company){
            case "AliceBlue":
                placeOrderForAlice(proxy,aliceBlueOrderPayLoad);
                break;
        }
    }

    private void placeOrderForAlice(Proxy proxy, AliceBlueOrderPayLoad aliceBlueOrderPayLoad){
        try {
            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");
            String sessionId = BEARER+proxy.getProxyUserToken();
            headers.set("Authorization", sessionId);
            ObjectMapper objectMapper = new ObjectMapper();
            List<AliceBlueOrderPayLoad> aliceBlueOrderPayLoads = new ArrayList<>();
            aliceBlueOrderPayLoads.add(aliceBlueOrderPayLoad);
            String requestBody = objectMapper.writeValueAsString(aliceBlueOrderPayLoads);
            HttpEntity<List<AliceBlueOrderPayLoad>> requestEntity = new HttpEntity<>(aliceBlueOrderPayLoads, headers);
            String response = restTemplate.postForEntity(BrokerageUtils.ALICE_BLUE_PLACE_ORDER, requestEntity, String.class).getBody();
            System.out.println(response);
            ProxyOrder proxyOrder = new ProxyOrder();
            proxyOrder.setProxyId(proxy.getProxyUserId());
            proxyOrder.setCompany(proxy.getProxyCompany());
            proxyOrder.setProxyOrder(aliceBlueOrderPayLoad.getTrading_symbol());
            proxyOrderRepository.saveAndFlush(proxyOrder);

            System.out.println("order placed for " + proxy.getProxyUserId() + "with" + proxy.getProxyCompany());
        }catch (Exception e){
            throw new RuntimeException(e.getCause());
        }
    }

    private AliceBlueOrderPayLoad getAliceBlueMasterLatestOrderPayLoad(String companyName,String userId)  {
        try {
            HttpHeaders headers = new HttpHeaders();
         //   headers.set("Content-Type", "application/json");
            Proxy proxy = proxyRepository.findByProxyUserId(userId);
            String SESSION_ID = BEARER + proxy.getProxyUserToken();
            headers.set("Authorization", SESSION_ID);
            ParameterizedTypeReference<List<Object>> responseType = new ParameterizedTypeReference<List<Object>>() {};

            ResponseEntity<List<Object>> responseEntity = restTemplate.exchange(
                    BrokerageUtils.ALICE_BLUE_ORDERBOOK,
                    HttpMethod.GET,
                    new HttpEntity<>(headers),
                    responseType
            );

            Object aliceBlueOrderBookObject = Objects.requireNonNull(responseEntity.getBody()).get(0);
            ObjectMapper mapper = new ObjectMapper();
            Gson gson = new Gson();
            String json = gson.toJson(aliceBlueOrderBookObject,LinkedHashMap.class);
            AliceBlueOrderBook aliceBlueOrderBook = mapper.readValue(json,AliceBlueOrderBook.class);
           BeanUtils.copyProperties(aliceBlueOrderBookObject,aliceBlueOrderBook);
            return MapDataUtil.convertToAliceBlueOrderPayLoad(aliceBlueOrderBook);
        }catch (Exception e){
            throw new RuntimeException(e.getCause());
        }
    }

    @Override
    public void placeOrderForAngelOneMaster(String companyName, String userId) {

    }
}
