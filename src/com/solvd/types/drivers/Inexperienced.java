package com.solvd.types.drivers;

public class Inexperienced extends DriversList {

    public Inexperienced(String name, String lastname, int years) {
        setName(name);
        setLastname(lastname);
        setYears(years);
    }

    @Override
    public String toString() {
        return ("Driver information:" + "\n"
                + "Driver name: " + getName() + "\n"
                + "Driver lastname: " + getLastname() + "\n"
                + "Driver age: " + getYears() + "\n");
    }

    @Override
    public void ride() {

    }
}
