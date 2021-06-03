package com.solvd.types;

public class HyperCar implements Sport {

    String name = "MacLaren";

    @Override
    public void printInfo() {
        System.out.println("This is Hyper Car");
    }

    @Override
    public String getName() {
        return this.name;

    }
}

