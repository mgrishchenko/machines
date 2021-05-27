package com.solvd.inteface;

public class Driver implements Information {
    public String name;

    public Driver(String name){
        this.name = name;
    }
    public void drive(){
        System.out.println("Jack is driving");
    }
    public void showInformation(){
        System.out.println("Name is "+this.name);

    }
}
