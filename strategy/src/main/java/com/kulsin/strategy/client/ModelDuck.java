package com.kulsin.strategy.client;

import com.kulsin.strategy.fly_behavior.FlyNoWay;
import com.kulsin.strategy.quack_behavior.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I’m a model duck");
    }

}
