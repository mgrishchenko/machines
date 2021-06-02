package com.solvd;
import com.solvd.body.*;
import com.solvd.types.*;
import com.solvd.types.drivers.DriversList;
import com.solvd.types.drivers.Experienced;
import com.solvd.types.drivers.Inexperienced;

public class Executor {

    public static void main(String[] args) {
        Passenger car = new Passenger("Volkswagen", 30, "Polo");
        Passenger car1 = new Passenger(2005);
        car1.transportation();
        car1.printInfo();

        String carName = car.getName();
        int carAge = car.getAge();
        String carType = car.getType();
        System.out.println("name: " + carName + " age- " + carAge + " type-" + carType);

        Sport auto = new Sport("Ferrari");
        auto.driveFast();
        auto.printInfo();

        int autoSpeed = auto.getSpeed();
        System.out.println("speed:" + autoSpeed);

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

        Sedan sedan1 = new Sedan();
        sedan1.ride();
        Sedan Mazda = new Sedan(2013);
        int MazdaYear = Mazda.getYear();
        System.out.println("year: " + MazdaYear);

        //Overloading and Override

        Experienced man1 = new Experienced("John", "Smith", 17);
        man1.printInfo();
        Inexperienced man2 = new Inexperienced();
        man2.printInfo("Or with minimum driving experience");
        Cabriolet cabriolet1 = new Cabriolet();
        cabriolet1.ride();

        Sport superCar1 = new SuperCar();
        Sport hyperCar = new HyperCar();

        TestDrive testDrive = new TestDrive();
        testDrive.testdrive(superCar1);


        }




            }















