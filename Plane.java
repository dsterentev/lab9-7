package com.company;

public class Plane extends Aircraft{
    private String model;
    private String typeEngine;
    private int crew;

    public Plane(){
        super();
        model="";
        typeEngine="";
        crew=5;
    }

    public Plane(String firma, int speed, String name, String type, int n) {
        super(firma, speed);
        model=name;
        typeEngine=type;
        crew=n;
    }
    public void setModel (String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setTypeEngine (String type){
        typeEngine=type;
    }
    public String getTypeEngine(){
        return typeEngine;
    }
    public void setCrew (int n){
        crew=n;
    }
    public int getCrew(){
        return crew;
    }
    public String toString(){
        return getFirm()+" "+getMaxSpeed()+" "+model+" "+typeEngine+" "+crew;
    }
}