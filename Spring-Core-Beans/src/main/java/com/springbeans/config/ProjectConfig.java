package com.springbeans.config;


import com.springbeans.beans.Person;
import com.springbeans.beans.Vehicle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
// two type of scans
@ComponentScan(basePackages = {"com.springbeans.implementations",
        "com.springbeans.services"})
@ComponentScan(basePackageClasses = {Vehicle.class, Person.class})
public class ProjectConfig {


}
