package com.solvd.body;

public class Cabriolet extends Carbody {

    private int speed;
    private String name;
    private String city;

    public Cabriolet(int speed, String name, String city) {
        this.name = name;
        this.speed = speed;
        this.city = city;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public Cabriolet() {

    }

    @Override
    public void ride() {
        System.out.println("Car with open roof");

    }
}


