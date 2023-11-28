package com.whynot.Proxy.Trading.DataUtils;

import org.springframework.data.jpa.support.PageableUtils;

public class BrokerageUtils {
    public static String ALICE_BLUE = "AliceBlue";
    public static String ANGEL_ONE ="AngelOne";

    //AliceBlue
    public static String ALICE_BLUE_ENCRYPTIONKEY= "https://ant.aliceblueonline.com/rest/AliceBlueAPIService/api/customer/getAPIEncpkey";
    public static String ALICE_BLUE_SESSIONID = "https://ant.aliceblueonline.com/rest/AliceBlueAPIService/api/customer/getUserSID";
    public static String ALICE_BLUE_ORDERBOOK ="https://ant.aliceblueonline.com/rest/AliceBlueAPIService/api/placeOrder/fetchOrderBook";
    public static String ALICE_BLUE_PLACE_ORDER = "https://ant.aliceblueonline.com/rest/AliceBlueAPIService/api/placeOrder/executePlaceOrder";

    //AngelOne
    public static String ANGEL_ONE_LOGIN ="https://apiconnect.angelbroking.com/rest/auth/angelbroking/user/v1/loginByPassword";
    public static String ANGEL_ONE_TOKEN_GENERATOR="https://apiconnect.angelbroking.com/rest/auth/angelbroking/jwt/v1/generateTokens";
    public static String ANGEL_ONE_PLACEORDER ="https://apiconnect.angelbroking.com/rest/secure/angelbroking/order/v1/placeOrde";
}
