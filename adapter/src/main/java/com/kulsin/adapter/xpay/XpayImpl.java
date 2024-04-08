package com.kulsin.adapter.xpay;

import java.math.BigDecimal;

public class XpayImpl implements Xpay {

    private String creditCardNo;
    private String firstName;
    private String lastName;
    private int cardExpMonth;
    private int cardExpYear;
    private Short cardCVVNo;
    private BigDecimal balance;


    @Override
    public String getCreditCardNo() {
        return creditCardNo;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public int getCardExpMonth() {
        return cardExpMonth;
    }

    @Override
    public int getCardExpYear() {
        return cardExpYear;
    }

    @Override
    public Short getCardCVVNo() {
        return cardCVVNo;
    }

    @Override
    public BigDecimal getBalance() {
        return balance;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setCardExpMonth(int cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCardExpYear(int cardExpYear) {
        this.cardExpYear = cardExpYear;
    }

    @Override
    public void setCardCVVNo(Short cardCVVNo) {
        this.cardCVVNo = cardCVVNo;
    }

    @Override
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}