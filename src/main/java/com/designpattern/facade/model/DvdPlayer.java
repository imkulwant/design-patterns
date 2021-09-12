package com.designpattern.facade.model;

public class DvdPlayer {

    private Amplifier amplifier;

    public DvdPlayer(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println("DVD Player ON");

    }

    public void off() {
        System.out.println("DVD Player OFF");

    }

    public void eject() {
        System.out.println("DVD Player EJECTED");

    }

    public void pause() {
        System.out.println("DVD Player PAUSED");

    }

    public void play(String movie) {
        System.out.println("DVD Player PLAYING " + movie);

    }

    public void stop() {
        System.out.println("DVD Player STOP");

    }

    public void setSurroundAudio() {
        System.out.println("DVD Player setting changed to surround sound");

    }

    public void setTwoChannelAudio() {
        System.out.println("DVD Player setting changed to stereo sound");

    }

}
