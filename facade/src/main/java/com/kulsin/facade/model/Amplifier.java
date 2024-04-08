package com.kulsin.facade.model;

public class Amplifier {

    private Tuner tuner;
    private DvdPlayer dvdPlayer;
    private CdPlayer cdPlayer;

    public void on() {
        System.out.println("Amplifier ON");
    }

    public void off() {
        System.out.println("Amplifier OFF");

    }

    public void setCd() {
        System.out.println("Amplifier setting CD player selected");
    }

    public void setDvd(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Amplifier setting DVD player selected");
    }

    public void setStereoSound() {
        System.out.println("Amplifier setting stereo sound ON");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setting surround sound ON");
    }

    public void setTuner() {
        System.out.println("Amplifier setting Tuner selected");
    }

    public void setVolume() {
        System.out.println("Amplifier setting volume updated");
    }

    public Tuner getTuner() {
        return tuner;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public DvdPlayer getDvdPlayer() {
        return dvdPlayer;
    }

    public void setDvdPlayer(DvdPlayer dvdPlayer) {
    }

    public CdPlayer getCdPlayer() {
        return cdPlayer;
    }

    public void setCdPlayer(CdPlayer cdPlayer) {
        this.cdPlayer = cdPlayer;
    }
}

