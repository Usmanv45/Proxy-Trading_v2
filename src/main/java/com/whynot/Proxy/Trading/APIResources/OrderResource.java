package com.whynot.Proxy.Trading.APIResources;

import com.whynot.Proxy.Trading.DataUtils.BrokerageUtils;
import com.whynot.Proxy.Trading.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderResource {
    @Autowired
    OrderService orderService;

   @GetMapping("/process-proxy-trading/{company}/{userId}")
   public ResponseEntity<String> processChildOrders(@PathVariable("company") String companyName,@PathVariable("userId") String userId ){
       if(companyName.equals(BrokerageUtils.ALICE_BLUE)){
           orderService.placeOrderForAliceBlueMaster(companyName,userId);
       } else if (companyName.equals(BrokerageUtils.ANGEL_ONE)) {
           orderService.placeOrderForAngelOneMaster(companyName,userId);

       }
    return null;
   }
}
