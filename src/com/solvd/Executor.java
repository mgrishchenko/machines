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

        Experienced driver = new Experienced("John", "Gofman", 18);
        Experienced driver1 = new Experienced("Bob", "Deelan", 12);
        Experienced driver3 = new Experienced("Michael", "Johnson", 19);

        DriversList driversList = new DriversList();
        driversList.setExperienced(driver);
        driversList.setExperienced(driver1);

        for (Experienced experienced1 : driversList.getExperiencedList())
            System.out.println(experienced1.getName() + " " + experienced1.getLastname() + "," + experienced1.getYears());

        Inexperienced driver2 = new Inexperienced("Alan", "Crow", 3);
        Inexperienced driver5 = new Inexperienced("Steven", "Watson", 2);

        DriversList nonExperienceDrivers = new DriversList();
        nonExperienceDrivers.setInexperienced(driver2);
        nonExperienceDrivers.setInexperienced(driver5);

        for (Inexperienced inexperienced1 : nonExperienceDrivers.getInexperiencedList())
            System.out.println(inexperienced1.getName() + "," + inexperienced1.getYears());

        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("driver", 5);
        map.put("driver1", 15);
        map.put("driver2", 3);
        map.put("driver3", 7);

        Integer driver6 = map.get("driver2");
        System.out.println(driver6);

        map.remove("driver1");

        Set<String> strings = map.keySet();
        for (String k : strings) {
            System.out.println(k);
        }
        for (Integer k : map.values()) {
            System.out.println(k);

        }
        Info info1 = new Info();
        info1.showInfo();


        Scanner in = new Scanner(System.in);
        System.out.println("Choose your drive experience:" + "\n 0-1 - Inexperienced, \n 2-4 - Middle experience, \n 5-7 - Good experience, \n 8-10 - Excellent experience");

        int years = in.nextInt();
        switch (years) {
            case 0:
            case 1:
                System.out.println("Inexperienced driver");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Middle experienced driver");
                break;
            case 5:
            case 6:
            case 7:
                System.out.println("Good experienced driver");
                break;
            case 8:
            case 9:
            case 10:
                System.out.println("Excellent experienced driver");
                break;
            default:
                System.out.println("You can choose any car");
                break;
        }

        }

}




















