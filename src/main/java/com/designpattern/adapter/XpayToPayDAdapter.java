package com.designpattern.adapter;

import com.designpattern.adapter.payd.PayD;
import com.designpattern.adapter.xpay.Xpay;

public class XpayToPayDAdapter implements PayD {

    private String cardNumber;
    private String cardOwnerName;
    private String cardExpiry;
    private Integer cvv;
    private Double amount;

    public XpayToPayDAdapter(Xpay xpay) {
        setCardOwnerName(xpay.getFirstName() + " " + xpay.getLastName());
        setCardNumber(xpay.getCreditCardNo());
        setCardExpiry(xpay.getCardExpMonth() + "/" + xpay.getCardExpYear());
        setCVVNo(xpay.getCardCVVNo().intValue());
        setAmount(xpay.getBalance().doubleValue());
    }

    @Override
    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpiry() {
        return cardExpiry;
    }

    @Override
    public Integer getCVVNo() {
        return cvv;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpiry(String cardExpiry) {
        this.cardExpiry = cardExpiry;
    }

    @Override
    public void setCVVNo(Integer cVVNo) {
        this.cvv = cVVNo;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }

}
