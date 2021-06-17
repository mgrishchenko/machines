package com.solvd;

import com.solvd.body.Cabriolet;
import com.solvd.body.Sedan;
import com.solvd.types.Garage;
import com.solvd.types.HyperCar;
import com.solvd.types.Passenger;
import com.solvd.types.SuperCar;
import com.solvd.types.drivers.DriversList;
import com.solvd.types.drivers.Experienced;
import com.solvd.types.drivers.Inexperienced;
import java.util.HashMap;
import java.util.Map;

import java.util.Scanner;
import java.util.Set;

public class Executor {


    public static void main(String[] args) {
        Passenger car = new Passenger("Volkswagen", 30, "Polo");

        String carName = car.getName();
        int carAge = car.getAge();
        String carType = car.getType();
        System.out.println("name: " + carName + " age- " + carAge + " type-" + carType);

        Cabriolet Chevrolet = new Cabriolet(250, "Chevrolet", "New York");
        String ChevroletName = Chevrolet.getName();
        int ChevroletSpeed = Chevrolet.getSpeed();
        String ChevroletCity = Chevrolet.getCity();

        System.out.println("Car name: " + ChevroletName);
        System.out.println("Car speed: " + ChevroletSpeed);
        System.out.println("Car city: " + ChevroletCity);

        Chevrolet = new Cabriolet(250, "Chevrolet", "New York");
        System.out.println("First car name -" + Chevrolet.getName());
        Chevrolet.setName("Chevrolet Camaro");
        System.out.println("New car name -" + Chevrolet.getName());

        Experienced man1 = new Experienced("John", "Smith", 17);
        String info = man1.toString();
        System.out.println(info);

        Inexperienced man2 = new Inexperienced("Bob", "Johnson", 28);
        info = man2.toString();
        System.out.println(info);

        Garage garage = new Garage();

//        Experienced driver = new Experienced("John", "Gofman", 18);
//        Experienced driver1 = new Experienced("Bob", "Deelan", 12);
//        Experienced driver3 = new Experienced("Michael", "Johnson", 19);
//
//        DriversList driversList = new DriversList();
//        driversList.setExperienced(driver);
//        driversList.setExperienced(driver1);
//
//        for (String experienced1 : driversList.getExperiencedList())
//            System.out.println(experienced1.getName() + " " + experienced1.getLastname() + "," + experienced1.getYears());
//
//        Inexperienced driver2 = new Inexperienced("Alan", "Crow", 3);
//        Inexperienced driver5 = new Inexperienced("Steven", "Watson", 2);
//
//        DriversList nonExperienceDrivers = new DriversList();



    Menu menu1 = new Menu();
        menu1.showMenu();

}

}




















