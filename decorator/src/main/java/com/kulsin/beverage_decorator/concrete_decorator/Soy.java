package com.kulsin.beverage_decorator.concrete_decorator;

import com.kulsin.beverage_decorator.component.Beverage;
import com.kulsin.beverage_decorator.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }

}
