package com.solvd.body;

public class Minivan extends Carbody {
    private String Information;

    public Minivan (String name, String driver, int year) {
        super(name, driver, year);
    }


    @Override
    public void ride() {
        System.out.println("Minivan - Big comfortable car");


    }

    @Override
    public void removeCarBody() {

    }
}
