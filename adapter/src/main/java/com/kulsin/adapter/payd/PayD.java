package com.kulsin.adapter.payd;

public interface PayD {

    public String getCardNumber();
    public String getCardOwnerName();
    public String getCardExpiry();
    public Integer getCVVNo();
    public Double getAmount();

    public void setCardNumber(String cardNumber);
    public void setCardOwnerName(String cardOwnerName);
    public void setCardExpiry(String cardExpiry);
    public void setCVVNo(Integer cVVNo);
    public void setAmount(Double amount);
}