package com.springbeans.main;

import com.springbeans.beans.Person;
import com.springbeans.beans.Vehicle;
import com.springbeans.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeans {
    public static void main(String[] args) {


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();

    }
}
