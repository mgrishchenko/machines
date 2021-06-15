package com.solvd.body;

public class Sedan extends Carbody {

    public Sedan(String name, String driver, int year){
        super(name, driver, year);
    }

    public Sedan(){

    }
    @Override
    public void ride() {
        System.out.println("Speed riding");


    }

    @Override
    public void removeCarBody() {

    }
}

