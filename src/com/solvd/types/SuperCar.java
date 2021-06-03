package com.solvd.types;

public class SuperCar implements Sport {

    String name = "Lamborghini";


    @Override
    public void printInfo() {
        System.out.println("This is Super Car!");
    }

    @Override
    public String getName() {
        return this.name;
    }

}

