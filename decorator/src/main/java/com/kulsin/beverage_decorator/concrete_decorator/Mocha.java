package com.kulsin.beverage_decorator.concrete_decorator;

import com.kulsin.beverage_decorator.component.Beverage;
import com.kulsin.beverage_decorator.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    // An instance variable to hold the beverage we are wrapping
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        // Computes the cost of beverage with Mocha
        return 0.20 + beverage.cost();
    }

}
