package com.solvd.body;

public class Sedan extends Carbody {
    private int year;

    public Sedan(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
    public void setYear(){
        this.year = year;
    }

    public Sedan(){

    }
    @Override
    public void ride() {
        System.out.println("Speed riding");

    }

    @Override
    public void printInfo() {

    }
}

