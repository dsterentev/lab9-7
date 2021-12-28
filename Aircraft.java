package com.company;
public class Aircraft {
    private String firm;
    private int maxSpeed;

    public void setFirm(String firma) {
        firm=firma;
    }
    public void setMaxSpeed(int speed){
        maxSpeed=speed;
    }
    public int getMaxSpeed(){
        return maxSpeed;
    }
    public String getFirm(){
        return firm;
    }
    public Aircraft(){
        firm="Без названия";
        maxSpeed=0;
    }
    public Aircraft(String firma, int speed){
        firm=firma;
        maxSpeed=speed;
    }
}
