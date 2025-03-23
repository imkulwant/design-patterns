package com.kulsin.beverage_decorator.component;

public class Decaf extends Beverage {

    public Decaf(CupSize cupSize) {
        description = "Decaf";
        this.cupSize = cupSize;
    }

    @Override
    public double cost() {
        return 1.05 + cupSize.getValue();
    }

}
