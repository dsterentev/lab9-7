package com.company;
import java.util.Scanner;

public class Helicopter extends Aircraft{
    private String model;
    private int crew;
    private int power;

    public Helicopter(){
        super();
        model="";
        power=0;
        crew=3;
    }
    public Helicopter(String firma, int speed, String name, int n, int g){
        super(firma,speed);
        model=name;
        crew=n;
        power=g;
    }

    public void setModel(String name){
        model=name;
    }
    public String getModel(){
        return model;
    }
    public void setCrew(int n){
        crew=n;
    }
    public int getCrew(){
        return crew;
    }
    public void setPower(int g){
        power=g;
    }
    public int getPower(){
        return power;
    }
    public void setAllInfo(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фирму-производитель вертолета: ");
        String nazv=in.next();
        setFirm(nazv);
        System.out.println("Введите максимальную скорость вертолета: ");
        int s=in.nextInt();
        setMaxSpeed(s);
        System.out.println("Введите модель вертолета: ");
        model=in.next();
        System.out.println("Введите количество пассажиров вертолета: ");
        crew=in.nextInt();
        System.out.println("Введите мощность вертолета: ");
        power=in.nextInt();
        System.out.println();
    }
    public String toString(){
        return "\n\tВертолет"+"Фирма: "+getFirm()+"\n\t"+"Максимальная скорость: "+getMaxSpeed()+"\n\t"+"Модель: "+model+"\n\t"+"Число пассажиров: "+crew+"\n\t"+"Мощность: "+power+"\n";
    }
}