package com.kulsin.strategy.client;

import com.kulsin.strategy.fly_behavior.FlyBehavior;
import com.kulsin.strategy.quack_behavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {

    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly(); // Delegate to the behavior class.
    }

    public void performQuack() {
        quackBehavior.quack(); // Delegate to the behavior class.
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}
