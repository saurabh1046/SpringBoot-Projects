package com.springbeans.services;

import com.springbeans.interfaces.Speakers;
import com.springbeans.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleServices {

    @Autowired                     // Field DI
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public Tyres getTyres() {
        return tyres;
    }

    @Autowired          // setter DI
    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}