package com.solvd.types.drivers;

import com.solvd.types.Information;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DriversList implements Information {

    private String name;
    private String lastname;
    private int years;
    private List<Experienced> experiencedList;
    private List<Inexperienced> inexperiencedList;

    public DriversList(){
        experiencedList = new ArrayList<>();
        inexperiencedList = new LinkedList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getYears() {
        return this.years;
    }

    public void setExperienced(Experienced experienced){
        experiencedList.add(experienced);
    }
    public void setInexperienced(Inexperienced inexperienced){
        inexperiencedList.add(inexperienced);
    }
    public List<Experienced> getExperiencedList(){
        return experiencedList;
    }
    public List<Inexperienced> getInexperiencedList(){
        return inexperiencedList;
    }

    public String toString() {
        return "Name: " + getName() + " LastName: " + getLastname() + " Years: " + getYears();

    }

    @Override
    public void ride() {

    }
}

