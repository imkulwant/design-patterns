package com.kulsin.facade;


import com.kulsin.facade.model.Amplifier;
import com.kulsin.facade.model.CdPlayer;
import com.kulsin.facade.model.DvdPlayer;
import com.kulsin.facade.model.PopcornPopper;
import com.kulsin.facade.model.Projector;
import com.kulsin.facade.model.Screen;
import com.kulsin.facade.model.TheaterLights;
import com.kulsin.facade.model.Tuner;

public class FacadePatternExecutor {

    /***
     * The Facade Pattern provides a unified interface to a
     * set of interfaces in a subsystem. Facade deﬁ nes a higher-
     * level interface that makes the subsystem easier to use.
     */
    public static void run() {

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner(amp);
        DvdPlayer dvd = new DvdPlayer(amp);
        CdPlayer cd = new CdPlayer(amp);
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater =
                new HomeTheaterFacade(amp, tuner, dvd, cd,
                        projector, screen, lights, popper);
        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();

    }
}
