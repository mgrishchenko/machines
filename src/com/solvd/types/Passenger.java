package com.solvd.types;

public class Passenger {
    private String name;
    private int age;
    private String type;

    public Passenger(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Passenger() {

    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    public String getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }

}


