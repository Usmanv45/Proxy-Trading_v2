package com.whynot.Proxy.Trading.DataUtils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AliceBlueOrderBook {

        @JsonProperty("Prc")
        private String Prc;

        @JsonProperty("RequestID")
        private String RequestID;

        @JsonProperty("Cancelqty")
        private int Cancelqty;

        @JsonProperty("discQtyPerc")
        private String discQtyPerc;

        @JsonProperty("customText")
        private String customText;

        @JsonProperty("Mktpro")
        private String Mktpro;

        @JsonProperty("defmktproval")
        private String defmktproval;

        @JsonProperty("optionType")
        private String optionType;

        @JsonProperty("usecs")
        private String usecs;

        @JsonProperty("mpro")
        private String mpro;

        @JsonProperty("Qty")
        private int Qty;

        @JsonProperty("ordergenerationtype")
        private String ordergenerationtype;

        @JsonProperty("Unfilledsize")
        private int Unfilledsize;

        @JsonProperty("orderAuthStatus")
        private String orderAuthStatus;

        @JsonProperty("Usercomments")
        private String Usercomments;

        @JsonProperty("ticksize")
        private String ticksize;

        @JsonProperty("Prctype")
        private String Prctype;

        @JsonProperty("Status")
        private String Status;

        @JsonProperty("Minqty")
        private int Minqty;

        @JsonProperty("orderCriteria")
        private String orderCriteria;

        @JsonProperty("Exseg")
        private String Exseg;

        @JsonProperty("Sym")
        private String Sym;

        @JsonProperty("multiplier")
        private String multiplier;

        @JsonProperty("ExchOrdID")
        private String ExchOrdID;

        @JsonProperty("ExchConfrmtime")
        private String ExchConfrmtime;

        @JsonProperty("Pcode")
        private String Pcode;

        @JsonProperty("SyomOrderId")
        private String SyomOrderId;

        @JsonProperty("Dscqty")
        private int Dscqty;

        @JsonProperty("Exchange")
        private String Exchange;

        @JsonProperty("Ordvaldate")
        private String Ordvaldate;

        @JsonProperty("accountId")
        private String accountId;

        @JsonProperty("exchangeuserinfo")
        private String exchangeuserinfo;

        @JsonProperty("Avgprc")
        private String Avgprc;

        @JsonProperty("Trgprc")
        private String Trgprc;

        @JsonProperty("Trantype")
        private String Trantype;

        @JsonProperty("bqty")
        private String bqty;

        @JsonProperty("Trsym")
        private String Trsym;

        @JsonProperty("Fillshares")
        private int Fillshares;

        @JsonProperty("AlgoCategory")
        private String AlgoCategory;

        @JsonProperty("sipindicator")
        private String sipindicator;

        @JsonProperty("strikePrice")
        private String strikePrice;

        @JsonProperty("reporttype")
        private String reporttype;

        @JsonProperty("AlgoID")
        private String AlgoID;

        @JsonProperty("noMktPro")
        private String noMktPro;

        @JsonProperty("BrokerClient")
        private String BrokerClient;

        @JsonProperty("OrderUserMessage")
        private String OrderUserMessage;

        @JsonProperty("decprec")
        private String decprec;

        @JsonProperty("ExpDate")
        private String ExpDate;

        @JsonProperty("COPercentage")
        private double COPercentage;

        @JsonProperty("marketprotectionpercentage")
        private String marketprotectionpercentage;

        @JsonProperty("Nstordno")
        private String Nstordno;

        @JsonProperty("ExpSsbDate")
        private String ExpSsbDate;

        @JsonProperty("OrderedTime")
        private String OrderedTime;

        @JsonProperty("RejReason")
        private String RejReason;

        @JsonProperty("modifiedBy")
        private String modifiedBy;

        @JsonProperty("Scripname")
        private String Scripname;

        @JsonProperty("stat")
        private String stat;

        @JsonProperty("orderentrytime")
        private String orderentrytime;

        @JsonProperty("PriceDenomenator")
        private String PriceDenomenator;

        @JsonProperty("panNo")
        private String panNo;

        @JsonProperty("RefLmtPrice")
        private double RefLmtPrice;

        @JsonProperty("PriceNumerator")
        private String PriceNumerator;

        @JsonProperty("token")
        private String token;

        @JsonProperty("ordersource")
        private String ordersource;

        @JsonProperty("Validity")
        private String Validity;

        @JsonProperty("GeneralDenomenator")
        private String GeneralDenomenator;

        @JsonProperty("series")
        private String series;

        @JsonProperty("InstName")
        private String InstName;

        @JsonProperty("GeneralNumerator")
        private String GeneralNumerator;

        @JsonProperty("user")
        private String user;

        @JsonProperty("remarks")
        private String remarks;

        @JsonProperty("iSinceBOE")
        private int iSinceBOE;

    public String getPrc() {
        return Prc;
    }

    public void setPrc(String prc) {
        Prc = prc;
    }

    public String getRequestID() {
        return RequestID;
    }

    public void setRequestID(String requestID) {
        RequestID = requestID;
    }

    public int getCancelqty() {
        return Cancelqty;
    }

    public void setCancelqty(int cancelqty) {
        Cancelqty = cancelqty;
    }

    public String getDiscQtyPerc() {
        return discQtyPerc;
    }

    public void setDiscQtyPerc(String discQtyPerc) {
        this.discQtyPerc = discQtyPerc;
    }

    public String getCustomText() {
        return customText;
    }

    public void setCustomText(String customText) {
        this.customText = customText;
    }

    public String getMktpro() {
        return Mktpro;
    }

    public void setMktpro(String mktpro) {
        Mktpro = mktpro;
    }

    public String getDefmktproval() {
        return defmktproval;
    }

    public void setDefmktproval(String defmktproval) {
        this.defmktproval = defmktproval;
    }

    public String getOptionType() {
        return optionType;
    }

    public void setOptionType(String optionType) {
        this.optionType = optionType;
    }

    public String getUsecs() {
        return usecs;
    }

    public void setUsecs(String usecs) {
        this.usecs = usecs;
    }

    public String getMpro() {
        return mpro;
    }

    public void setMpro(String mpro) {
        this.mpro = mpro;
    }

    public int getQty() {
        return Qty;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public String getOrdergenerationtype() {
        return ordergenerationtype;
    }

    public void setOrdergenerationtype(String ordergenerationtype) {
        this.ordergenerationtype = ordergenerationtype;
    }

    public int getUnfilledsize() {
        return Unfilledsize;
    }

    public void setUnfilledsize(int unfilledsize) {
        Unfilledsize = unfilledsize;
    }

    public String getOrderAuthStatus() {
        return orderAuthStatus;
    }

    public void setOrderAuthStatus(String orderAuthStatus) {
        this.orderAuthStatus = orderAuthStatus;
    }

    public String getUsercomments() {
        return Usercomments;
    }

    public void setUsercomments(String usercomments) {
        Usercomments = usercomments;
    }

    public String getTicksize() {
        return ticksize;
    }

    public void setTicksize(String ticksize) {
        this.ticksize = ticksize;
    }

    public String getPrctype() {
        return Prctype;
    }

    public void setPrctype(String prctype) {
        Prctype = prctype;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public int getMinqty() {
        return Minqty;
    }

    public void setMinqty(int minqty) {
        Minqty = minqty;
    }

    public String getOrderCriteria() {
        return orderCriteria;
    }

    public void setOrderCriteria(String orderCriteria) {
        this.orderCriteria = orderCriteria;
    }

    public String getExseg() {
        return Exseg;
    }

    public void setExseg(String exseg) {
        Exseg = exseg;
    }

    public String getSym() {
        return Sym;
    }

    public void setSym(String sym) {
        Sym = sym;
    }

    public String getMultiplier() {
        return multiplier;
    }

    public void setMultiplier(String multiplier) {
        this.multiplier = multiplier;
    }

    public String getExchOrdID() {
        return ExchOrdID;
    }

    public void setExchOrdID(String exchOrdID) {
        ExchOrdID = exchOrdID;
    }

    public String getExchConfrmtime() {
        return ExchConfrmtime;
    }

    public void setExchConfrmtime(String exchConfrmtime) {
        ExchConfrmtime = exchConfrmtime;
    }

    public String getPcode() {
        return Pcode;
    }

    public void setPcode(String pcode) {
        Pcode = pcode;
    }

    public String getSyomOrderId() {
        return SyomOrderId;
    }

    public void setSyomOrderId(String syomOrderId) {
        SyomOrderId = syomOrderId;
    }

    public int getDscqty() {
        return Dscqty;
    }

    public void setDscqty(int dscqty) {
        Dscqty = dscqty;
    }

    public String getExchange() {
        return Exchange;
    }

    public void setExchange(String exchange) {
        Exchange = exchange;
    }

    public String getOrdvaldate() {
        return Ordvaldate;
    }

    public void setOrdvaldate(String ordvaldate) {
        Ordvaldate = ordvaldate;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getExchangeuserinfo() {
        return exchangeuserinfo;
    }

    public void setExchangeuserinfo(String exchangeuserinfo) {
        this.exchangeuserinfo = exchangeuserinfo;
    }

    public String getAvgprc() {
        return Avgprc;
    }

    public void setAvgprc(String avgprc) {
        Avgprc = avgprc;
    }

    public String getTrgprc() {
        return Trgprc;
    }

    public void setTrgprc(String trgprc) {
        Trgprc = trgprc;
    }

    public String getTrantype() {
        return Trantype;
    }

    public void setTrantype(String trantype) {
        Trantype = trantype;
    }

    public String getBqty() {
        return bqty;
    }

    public void setBqty(String bqty) {
        this.bqty = bqty;
    }

    public String getTrsym() {
        return Trsym;
    }

    public void setTrsym(String trsym) {
        Trsym = trsym;
    }

    public int getFillshares() {
        return Fillshares;
    }

    public void setFillshares(int fillshares) {
        Fillshares = fillshares;
    }

    public String getAlgoCategory() {
        return AlgoCategory;
    }

    public void setAlgoCategory(String algoCategory) {
        AlgoCategory = algoCategory;
    }

    public String getSipindicator() {
        return sipindicator;
    }

    public void setSipindicator(String sipindicator) {
        this.sipindicator = sipindicator;
    }

    public String getStrikePrice() {
        return strikePrice;
    }

    public void setStrikePrice(String strikePrice) {
        this.strikePrice = strikePrice;
    }

    public String getReporttype() {
        return reporttype;
    }

    public void setReporttype(String reporttype) {
        this.reporttype = reporttype;
    }

    public String getAlgoID() {
        return AlgoID;
    }

    public void setAlgoID(String algoID) {
        AlgoID = algoID;
    }

    public String getNoMktPro() {
        return noMktPro;
    }

    public void setNoMktPro(String noMktPro) {
        this.noMktPro = noMktPro;
    }

    public String getBrokerClient() {
        return BrokerClient;
    }

    public void setBrokerClient(String brokerClient) {
        BrokerClient = brokerClient;
    }

    public String getOrderUserMessage() {
        return OrderUserMessage;
    }

    public void setOrderUserMessage(String orderUserMessage) {
        OrderUserMessage = orderUserMessage;
    }

    public String getDecprec() {
        return decprec;
    }

    public void setDecprec(String decprec) {
        this.decprec = decprec;
    }

    public String getExpDate() {
        return ExpDate;
    }

    public void setExpDate(String expDate) {
        ExpDate = expDate;
    }

    public double getCOPercentage() {
        return COPercentage;
    }

    public void setCOPercentage(double COPercentage) {
        this.COPercentage = COPercentage;
    }

    public String getMarketprotectionpercentage() {
        return marketprotectionpercentage;
    }

    public void setMarketprotectionpercentage(String marketprotectionpercentage) {
        this.marketprotectionpercentage = marketprotectionpercentage;
    }

    public String getNstordno() {
        return Nstordno;
    }

    public void setNstordno(String nstordno) {
        Nstordno = nstordno;
    }

    public String getExpSsbDate() {
        return ExpSsbDate;
    }

    public void setExpSsbDate(String expSsbDate) {
        ExpSsbDate = expSsbDate;
    }

    public String getOrderedTime() {
        return OrderedTime;
    }

    public void setOrderedTime(String orderedTime) {
        OrderedTime = orderedTime;
    }

    public String getRejReason() {
        return RejReason;
    }

    public void setRejReason(String rejReason) {
        RejReason = rejReason;
    }

    public String getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(String modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    public String getScripname() {
        return Scripname;
    }

    public void setScripname(String scripname) {
        Scripname = scripname;
    }

    public String getStat() {
        return stat;
    }

    public void setStat(String stat) {
        this.stat = stat;
    }

    public String getOrderentrytime() {
        return orderentrytime;
    }

    public void setOrderentrytime(String orderentrytime) {
        this.orderentrytime = orderentrytime;
    }

    public String getPriceDenomenator() {
        return PriceDenomenator;
    }

    public void setPriceDenomenator(String priceDenomenator) {
        PriceDenomenator = priceDenomenator;
    }

    public String getPanNo() {
        return panNo;
    }

    public void setPanNo(String panNo) {
        this.panNo = panNo;
    }

    public double getRefLmtPrice() {
        return RefLmtPrice;
    }

    public void setRefLmtPrice(double refLmtPrice) {
        RefLmtPrice = refLmtPrice;
    }

    public String getPriceNumerator() {
        return PriceNumerator;
    }

    public void setPriceNumerator(String priceNumerator) {
        PriceNumerator = priceNumerator;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getOrdersource() {
        return ordersource;
    }

    public void setOrdersource(String ordersource) {
        this.ordersource = ordersource;
    }

    public String getValidity() {
        return Validity;
    }

    public void setValidity(String validity) {
        Validity = validity;
    }

    public String getGeneralDenomenator() {
        return GeneralDenomenator;
    }

    public void setGeneralDenomenator(String generalDenomenator) {
        GeneralDenomenator = generalDenomenator;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getInstName() {
        return InstName;
    }

    public void setInstName(String instName) {
        InstName = instName;
    }

    public String getGeneralNumerator() {
        return GeneralNumerator;
    }

    public void setGeneralNumerator(String generalNumerator) {
        GeneralNumerator = generalNumerator;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public int getiSinceBOE() {
        return iSinceBOE;
    }

    public void setiSinceBOE(int iSinceBOE) {
        this.iSinceBOE = iSinceBOE;
    }
}
