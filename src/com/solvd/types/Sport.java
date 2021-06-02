package com.solvd.types;

public class Sport implements Information {
    public String name;

    public Sport() {
    }

    public void driveFast(){
        System.out.println("High speed movement");
    }

    private int speed;

    public Sport(int speed){
        this.speed = speed;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(){
        this.speed = speed;
    }
        public Sport(String name){
        this.name = name;

        }


    @Override
    public void printInfo() {

    }

    @Override
    public void ride() {

    }
}




