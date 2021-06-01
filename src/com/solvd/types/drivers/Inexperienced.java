package com.solvd.types.drivers;

public class Inexperienced extends DriversList{

    public Inexperienced() {
    }

    public Inexperienced(String name, String lastname){
        super();
        setName(name);
        setLastname(lastname);
    }

    public void ride() {

    }
    public void printInfo(String str) {
        System.out.println("Drivers without experience!"+ str);

    }
}

