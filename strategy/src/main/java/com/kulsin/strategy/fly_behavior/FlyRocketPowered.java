package com.kulsin.strategy.fly_behavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }

}
