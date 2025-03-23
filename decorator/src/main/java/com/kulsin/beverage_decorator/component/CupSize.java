package com.kulsin.beverage_decorator.component;

public enum CupSize {

    small(0.10), medium(0.15), large(0.20);

    private final double value;

    CupSize(final double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}