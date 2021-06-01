package com.solvd.types.drivers;

import com.solvd.types.Information;

public abstract class DriversList implements Information {

    private String name;
    private String lastname;
    private  int years;


    public DriversList(String name, String lastname, int years){
        this.name = name;
        this.lastname = lastname;
        this.years = years;
    }

    public DriversList() {

    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setYears(int years){
        this.years = years;
    }
    public int getYears(){
        return this.years;
    }
    public void printInfo(){
        System.out.println(getName());
        System.out.println(getLastname());
        System.out.println(getYears());

    }


    }

