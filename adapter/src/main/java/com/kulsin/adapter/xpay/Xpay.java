package com.kulsin.adapter.xpay;

import java.math.BigDecimal;

public interface Xpay {

    public String getCreditCardNo();
    public String getFirstName();
    public String getLastName();
    public int getCardExpMonth();
    public int getCardExpYear();
    public Short getCardCVVNo();
    public BigDecimal getBalance();

    public void setCreditCardNo(String creditCardNo);
    public void setFirstName(String firstName);
    public void setLastName(String lastName);
    public void setCardExpMonth(int cardExpMonth);
    public void setCardExpYear(int cardExpYear);
    public void setCardCVVNo(Short cardCVVNo);
    public void setBalance(BigDecimal balance);

}
