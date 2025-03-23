package com.kulsin.beverage_decorator.component;

public class Espresso extends Beverage {

    public Espresso(CupSize cupSize) {
        description = "Espresso";
        this.cupSize = cupSize;
    }

    @Override
    public double cost() {
        return 1.99 + cupSize.getValue();
    }

}
