package com.solvd.body;

public class Minivan extends Carbody {
    private String brand;

    public Minivan(String brand) {
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Minivan(){

    }


    @Override
    public void ride() {
        System.out.println("Minivan - Big comfortable car");

    }
}
