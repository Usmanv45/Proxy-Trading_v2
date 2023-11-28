package com.whynot.Proxy.Trading.DataUtils;

public class MapDataUtil {

    public static AliceBlueOrderPayLoad convertToAliceBlueOrderPayLoad(AliceBlueOrderBook orderBook) {
            AliceBlueOrderPayLoad order = new AliceBlueOrderPayLoad();
        order.setComplexty("Regular");
        order.setExch(orderBook.getExchange());
        order.setDiscqty(orderBook.getDscqty());
        order.setpCode(orderBook.getPcode());
        order.setPrctyp(orderBook.getPrctype());
        order.setPrice(orderBook.getPrc());
        order.setRet(orderBook.getValidity());
        order.setSymbol_id(orderBook.getToken());
        order.setTrading_symbol(orderBook.getScripname());
        order.setTranstype(orderBook.getTrantype());
        order.setTrigPrice(orderBook.getTrgprc());
        order.setQty(orderBook.getQty());
        return order;
    }
}
