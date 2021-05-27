package com.solvd;
import com.solvd.inteface.Auto;
import com.solvd.inteface.Driver;
import com.solvd.body.Cabriolet;
import com.solvd.body.Coupe;
import com.solvd.body.Minivan;
import com.solvd.body.Sedan;
import com.solvd.types.Passenger;
import com.solvd.types.Sport;

public class Executor {

    public static void main(String[] args) {
        Passenger car  = new Passenger("Volkswagen", 30, "Polo");;
        String carName = car.getName();
        int carAge = car.getAge();
        String carType = car.getType();
        System.out.println("name: " +carName + " age- "+carAge + " type-" +carType);

        Sport auto = new Sport(250);
        int autoSpeed = auto.getSpeed();
        System.out.println("speed:" +autoSpeed);

        Cabriolet cabriolet1 = new Cabriolet();
        cabriolet1.ride();
        Cabriolet Chevrolet = new Cabriolet(250, "Chevrolet", "New York");
        String ChevroletName = Chevrolet.getName();
        int ChevroletSpeed = Chevrolet.getSpeed();
        String ChevroletCity = Chevrolet.getCity();

        System.out.println("Car name: " +ChevroletName);
        System.out.println("Car speed: " + ChevroletSpeed);
        System.out.println("Car city: " + ChevroletCity);

        Chevrolet = new Cabriolet(250, "Chevrolet", "New York");
        System.out.println("First car name -" + Chevrolet.getName());
        Chevrolet.setName("Chevrolet Camaro");
        System.out.println("New car name -" + Chevrolet.getName());

        Coupe coupe1 = new Coupe();
        coupe1.ride();
        Coupe Honda = new Coupe(200, "Honda");
        String HondaBrand = Honda.getBrand();
        int HondaSpeed = Honda.getSpeed();

        System.out.println("car: " +HondaBrand);
        System.out.println("speed: " +HondaSpeed);

        Minivan mini1 = new Minivan();
        mini1.ride();
        Minivan Toyota = new Minivan("Toyota");
        String ToyotaBrand = Toyota.getBrand();
        System.out.println("brand: " +ToyotaBrand);

        Sedan sedan1 = new Sedan();
        sedan1.ride();
        Sedan Mazda = new Sedan(2013);
        int MazdaYear = Mazda.getYear();
        System.out.println("year: " +MazdaYear);

        Auto auto1 = new Auto("Lamborghini");
        Driver driver1 = new Driver("Jack");
        auto1.makeNoise();
        driver1.drive();
        auto1.showInformation();
        driver1.showInformation();

	// write your code here

    }
}
