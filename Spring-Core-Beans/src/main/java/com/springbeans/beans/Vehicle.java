package com.springbeans.beans;

import com.springbeans.interfaces.Speakers;
import com.springbeans.interfaces.Tyres;
import com.springbeans.services.VehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("vehicleBean")
public class Vehicle {

    private String name="Honda";
    private final VehicleServices vehicleServices;

    @Autowired
    public Vehicle(VehicleServices vehicleServices){
        this.vehicleServices = vehicleServices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VehicleServices getVehicleServices() {
        return vehicleServices;
    }

    public void printHello(){
        System.out.println(
                "Printing Hello from Component Vehicle Bean");
    }

    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}