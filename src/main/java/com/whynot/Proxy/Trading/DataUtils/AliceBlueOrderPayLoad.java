package com.whynot.Proxy.Trading.DataUtils;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AliceBlueOrderPayLoad {
    private String complexty;
    private int discqty;
    private String exch;
    private String pCode;
    private String prctyp;
    private String price;
    private int qty;
    private String ret;
    private String symbol_id;
    private String trading_symbol;
    private String transtype;
    private String trigPrice;

    public String getComplexty() {
        return complexty;
    }

    public void setComplexty(String complexty) {
        this.complexty = complexty;
    }

    public int getDiscqty() {
        return discqty;
    }

    public void setDiscqty(int discqty) {
        this.discqty = discqty;
    }

    public String getExch() {
        return exch;
    }

    public void setExch(String exch) {
        this.exch = exch;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

    public String getPrctyp() {
        return prctyp;
    }

    public void setPrctyp(String prctyp) {
        this.prctyp = prctyp;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getSymbol_id() {
        return symbol_id;
    }

    public void setSymbol_id(String symbol_id) {
        this.symbol_id = symbol_id;
    }

    public String getTrading_symbol() {
        return trading_symbol;
    }

    public void setTrading_symbol(String trading_symbol) {
        this.trading_symbol = trading_symbol;
    }

    public String getTranstype() {
        return transtype;
    }

    public void setTranstype(String transtype) {
        this.transtype = transtype;
    }

    public String getTrigPrice() {
        return trigPrice;
    }

    public void setTrigPrice(String trigPrice) {
        this.trigPrice = trigPrice;
    }



}
