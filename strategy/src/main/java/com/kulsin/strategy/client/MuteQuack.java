package com.kulsin.strategy.client;

import com.kulsin.strategy.quack_behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }

}
