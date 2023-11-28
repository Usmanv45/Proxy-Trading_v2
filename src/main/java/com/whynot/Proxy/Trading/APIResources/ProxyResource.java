package com.whynot.Proxy.Trading.APIResources;

import com.whynot.Proxy.Trading.DataUtils.BrokerageUtils;
import com.whynot.Proxy.Trading.DataUtils.UserDetails;
import com.whynot.Proxy.Trading.Services.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProxyResource {
    @Autowired
    UserService userService;

    @PostMapping("/proxy/saveChild")
    public ResponseEntity<String> registerChildBrokerages(@RequestBody UserDetails userDetails){
        if(BrokerageUtils.ALICE_BLUE.equals(userDetails.getCompany())){
            userService.saveAliceUserDetails(userDetails);
        } else if (BrokerageUtils.ANGEL_ONE.equals(userDetails.getCompany())) {
            userService.saveAngelUserDetails(userDetails);
        }
        return new ResponseEntity<String>("UserId"+userDetails.getUserId()+"Saved SuccessFully:-", HttpStatus.OK);
    }
}
