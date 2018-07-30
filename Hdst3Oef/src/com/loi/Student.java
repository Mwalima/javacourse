package com.loi;

import java.util.Scanner;

public class Student {

    private String naam;
    private double wiskTotaal = 0, aantalCijfers = 0 ,klasWiskTotaal = 0 ,klasWiskAantalcijfers =0;
    Scanner keybord;
    public int height;
    public String name;


    public Student() {
        wiskTotaal = 0;
        aantalCijfers = 0;
        keybord = new Scanner(System.in);
    }

    public Student(String name){
        this();
        this.naam = name;
    }

    public Student(String name, double cijfer){
        this();
        this.naam = name;
        setCijfer(cijfer);
    }

    public Student(double cijfer, String name){
        this(name,cijfer);
    }

    public Student(String name, double... cijfer){
        this(name);
        for(int i = 0; i < cijfer.length; i++) {
            setCijfer(cijfer[i]);
        }

    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setCijfer(double cijfer){
            wiskTotaal += cijfer;
            aantalCijfers++;
            klasWiskTotaal += cijfer;
            klasWiskAantalcijfers++;
    }

    public void setCijfer(double... cijfer){

        for(int i = 0; i < cijfer.length; i++) {
            setCijfer(cijfer[i]);
        }
    }

    public double getGemiddelde(){
        //reken  het gemiddelde uit
        double result = wiskTotaal/aantalCijfers;

        return result;
    }


    public double getKlasGemiddelde(){

        double result = klasWiskTotaal/klasWiskAantalcijfers;

        return result;
    }

    public String toString(){

        String text = naam+" heeft voor wiskunde gemiddeld het cijfer "+getGemiddelde();

        return text;
    }

    public void setHeight(int newHeight){
        if(newHeight <= 300){
            height = newHeight;
            System.out.println("value is 300 or smaller");
        }
    }

}
