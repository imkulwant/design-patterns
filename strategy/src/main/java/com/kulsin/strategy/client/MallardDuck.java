package com.kulsin.strategy.client;

import com.kulsin.strategy.fly_behavior.FlyWithWings;
import com.kulsin.strategy.quack_behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I’m a real Mallard duck");
    }

}
