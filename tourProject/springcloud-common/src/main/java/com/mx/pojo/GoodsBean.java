package com.mx.pojo;

public class GoodsBean {
    private Integer id;
    private String goodsId;
    private String goodsName;
    private Double goodsPrice;
    private String startDate;
    private Integer oldPeople;
    private Integer youngPeople;
    private String goodsArea;
    private String recommendReason;
    private String tripCharacteristics;
    private String moneyDescription;
    private String travelInformation;
    private String visaInformation;
    private String contractPayment;
    private String referTravel;
    private String goodsImg;
    private String goodsType;
    private String goodsDays;
    private Integer goodsTraffic;
    private String goodsDate;
    private String applyPrompt;
    private String payType;
    private String typeName;
    private Double totalMoney;

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(String goodsType) {
        this.goodsType = goodsType;
    }

    public String getGoodsDays() {
        return goodsDays;
    }

    public void setGoodsDays(String goodsDays) {
        this.goodsDays = goodsDays;
    }

    public Integer getGoodsTraffic() {
        return goodsTraffic;
    }

    public void setGoodsTraffic(Integer goodsTraffic) {
        this.goodsTraffic = goodsTraffic;
    }

    public String getGoodsDate() {
        return goodsDate;
    }

    public void setGoodsDate(String goodsDate) {
        this.goodsDate = goodsDate;
    }

    public String getApplyPrompt() {
        return applyPrompt;
    }

    public void setApplyPrompt(String applyPrompt) {
        this.applyPrompt = applyPrompt;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Double goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getOldPeople() {
        return oldPeople;
    }

    public void setOldPeople(Integer oldPeople) {
        this.oldPeople = oldPeople;
    }

    public Integer getYoungPeople() {
        return youngPeople;
    }

    public void setYoungPeople(Integer youngPeople) {
        this.youngPeople = youngPeople;
    }

    public String getGoodsArea() {
        return goodsArea;
    }

    public void setGoodsArea(String goodsArea) {
        this.goodsArea = goodsArea;
    }

    public String getRecommendReason() {
        return recommendReason;
    }

    public void setRecommendReason(String recommendReason) {
        this.recommendReason = recommendReason;
    }

    public String getTripCharacteristics() {
        return tripCharacteristics;
    }

    public void setTripCharacteristics(String tripCharacteristics) {
        this.tripCharacteristics = tripCharacteristics;
    }

    public String getMoneyDescription() {
        return moneyDescription;
    }

    public void setMoneyDescription(String moneyDescription) {
        this.moneyDescription = moneyDescription;
    }

    public String getTravelInformation() {
        return travelInformation;
    }

    public void setTravelInformation(String travelInformation) {
        this.travelInformation = travelInformation;
    }

    public String getVisaInformation() {
        return visaInformation;
    }

    public void setVisaInformation(String visaInformation) {
        this.visaInformation = visaInformation;
    }

    public String getContractPayment() {
        return contractPayment;
    }

    public void setContractPayment(String contractPayment) {
        this.contractPayment = contractPayment;
    }

    public String getReferTravel() {
        return referTravel;
    }

    public void setReferTravel(String referTravel) {
        this.referTravel = referTravel;
    }

    @Override
    public String toString() {
        return "GoodsBean{" +
                "id=" + id +
                ", goodsId='" + goodsId + '\'' +
                ", goodsName='" + goodsName + '\'' +
                ", goodsPrice=" + goodsPrice +
                ", startDate='" + startDate + '\'' +
                ", oldPeople=" + oldPeople +
                ", youngPeople=" + youngPeople +
                ", goodsArea='" + goodsArea + '\'' +
                ", recommendReason='" + recommendReason + '\'' +
                ", tripCharacteristics='" + tripCharacteristics + '\'' +
                ", moneyDescription='" + moneyDescription + '\'' +
                ", travelInformation='" + travelInformation + '\'' +
                ", visaInformation='" + visaInformation + '\'' +
                ", contractPayment='" + contractPayment + '\'' +
                ", referTravel='" + referTravel + '\'' +
                ", goodsImg='" + goodsImg + '\'' +
                '}';
    }
}
