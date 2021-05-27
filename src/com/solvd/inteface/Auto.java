package com.solvd.inteface;

public class Auto implements Information{
    public String brand;
    public Auto(String brand) {
        this.brand = brand;
    }
    public void makeNoise(){
        System.out.println("Vroom-Vroom");
    }

    @Override
    public void showInformation() {
        System.out.println("Brand is "+this.brand);
    }
}

