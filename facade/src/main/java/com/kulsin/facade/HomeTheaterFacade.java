package com.kulsin.facade;

import com.kulsin.facade.model.Amplifier;
import com.kulsin.facade.model.CdPlayer;
import com.kulsin.facade.model.DvdPlayer;
import com.kulsin.facade.model.PopcornPopper;
import com.kulsin.facade.model.Projector;
import com.kulsin.facade.model.Screen;
import com.kulsin.facade.model.TheaterLights;
import com.kulsin.facade.model.Tuner;

public class HomeTheaterFacade {

    Amplifier amp;
    Tuner tuner;
    DvdPlayer dvd;
    CdPlayer cd;
    Projector projector;
    TheaterLights lights;
    Screen screen;
    PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp,
                             Tuner tuner,
                             DvdPlayer dvd,
                             CdPlayer cd,
                             Projector projector,
                             Screen screen,
                             TheaterLights lights,
                             PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim();
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume();
        dvd.on();
        dvd.play(movie);
    }
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }

}
