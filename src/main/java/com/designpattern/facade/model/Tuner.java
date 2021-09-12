package com.designpattern.facade.model;

public class Tuner {

    private Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("Tuner Player ON");

    }

    public void off() {
        System.out.println("Tuner Player OFF");

    }

    public void setAM() {
        System.out.println("Tuner Player set to AM");

    }

    public void setFM() {
        System.out.println("Tuner Player set to FM");

    }

    public void setFrequency() {
        System.out.println("Tuner Player frequency changed");

    }

}
