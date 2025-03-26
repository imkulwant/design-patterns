package com.kulsin.factory.abstract_pizza_store;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    public enum Size {SMALL, MEDIUM, LARGE, JUMBO}

    public enum Crust {CHEESY, HAND_TOSSED, THIN_AND_CRISPY, DEEP_PAN}

    protected Crust crust;
    protected List<String> toppings = new ArrayList<>();
    protected Size size;
    protected String dough;
    protected String name;
    protected String sauce;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public Crust getCrust() {
        return crust;
    }

    public void setCrust(Crust crust) {
        this.crust = crust;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
