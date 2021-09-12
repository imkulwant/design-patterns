package com.designpattern.facade.model;

public class CdPlayer {

    private Amplifier amplifier;

    public CdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("CD Player ON");

    }

    public void off() {
        System.out.println("CD Player OFF");

    }

    public void eject() {
        System.out.println("CD Player EJECTED");

    }

    public void pause() {
        System.out.println("CD Player PAUSED");

    }

    public void play() {
        System.out.println("CD Player PLAYING");

    }

    public void stop() {
        System.out.println("CD Player STOPPED");

    }

}
