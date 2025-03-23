package com.kulsin.beverage_decorator.concrete_decorator;

import com.kulsin.beverage_decorator.component.Beverage;
import com.kulsin.beverage_decorator.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }

}
