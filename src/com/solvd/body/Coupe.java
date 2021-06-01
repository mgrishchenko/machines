package com.solvd.body;

public class Coupe extends Carbody {

    private int speed;
    private String brand;

    public Coupe(int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;

    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand = brand;
    }

    public Coupe(){

        }

    @Override
    public void ride() {
        System.out.println("Three doors car");
    }

    @Override
    public void printInfo() {

    }
}

