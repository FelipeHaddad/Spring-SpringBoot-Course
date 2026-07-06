package com.eazybytes.ex2;


import com.eazybytes.ex2.beans.Vehicle;
import com.eazybytes.ex2.config.AnotherProjectConfig;
import com.eazybytes.ex2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class, AnotherProjectConfig.class);
        var veh = context.getBean("teslaVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh.getName());

        var vehicle = context.getBean("audiVehicle", Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

        var vhcle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + vehicle.getName());

        var helloWorld = context.getBean(String.class);
        System.out.println("String value from Spring Context: " + helloWorld);
    }
}
