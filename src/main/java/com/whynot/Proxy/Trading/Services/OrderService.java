package com.whynot.Proxy.Trading.Services;

import com.whynot.Proxy.Trading.DataUtils.OrderPayLoad;
import org.springframework.http.ResponseEntity;

public interface OrderService {
    public ResponseEntity<String> placeOrder(OrderPayLoad orderPayLoad,String company);

    void placeOrderForAliceBlueMaster(String companyName, String userId);

    void placeOrderForAngelOneMaster(String companyName, String userId);
}
