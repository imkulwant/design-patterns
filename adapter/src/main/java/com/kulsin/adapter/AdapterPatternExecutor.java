package com.kulsin.adapter;


import com.kulsin.adapter.payd.PayD;
import com.kulsin.adapter.xpay.Xpay;
import com.kulsin.adapter.xpay.XpayImpl;

import java.math.BigDecimal;

public class AdapterPatternExecutor {
    /***
     * The Adapter pattern lets us to adapt what an object or a class exposes to what another object or class expects.
     * It converts the interface of a class into another interface the client expects.
     * It lets classes work together that couldn’t otherwise because of incompatible interfaces.
     * It allows to fix the interface between the objects and the classes without modifying the objects and the classes directly.
     */
    public static void run() {

        Xpay xpay = new XpayImpl();
        xpay.setCreditCardNo("4789565874102365");
        xpay.setFirstName("David");
        xpay.setLastName("Warner");
        xpay.setCardExpMonth(9);
        xpay.setCardExpYear(25);
        xpay.setCardCVVNo((short)235);
        xpay.setBalance(BigDecimal.valueOf(2565.23));

        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD){
        System.out.println(payD.getCardOwnerName());
        System.out.println(payD.getCardNumber());
        System.out.println(payD.getCardExpiry());
        System.out.println(payD.getCVVNo());
        System.out.println(payD.getAmount());
    }

}
