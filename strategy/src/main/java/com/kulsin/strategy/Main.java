package com.kulsin.strategy;

import com.kulsin.strategy.client.Duck;
import com.kulsin.strategy.client.MallardDuck;
import com.kulsin.strategy.client.ModelDuck;
import com.kulsin.strategy.fly_behavior.FlyRocketPowered;

public class Main {

    public static void main(String[] args) {
        miniDuckSimulator();
    }

    private static void miniDuckSimulator() {

        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();

        Duck modelDuck = new ModelDuck();

        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }

}
