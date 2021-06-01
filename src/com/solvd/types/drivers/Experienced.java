package com.solvd.types.drivers;

public class Experienced extends DriversList{

    public Experienced(){

    }

    public Experienced(String name, String lastname, int years){
        setName(name);
        setLastname(lastname);
        setYears(years);
    }

    public void printInfo() {
        System.out.println("Drivers with great driving experience!!!");

    }

    @Override
    public void ride() {
        System.out.println("Driver1");
    }
}
