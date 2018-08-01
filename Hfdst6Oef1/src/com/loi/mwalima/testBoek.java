package com.loi.mwalima;


public class testBoek {

    public static void main(String[] args){

        Exemplaar exp1 = new Exemplaar("Titelje",1234567,"afdsfsadfsad");
        exp1.staat = "goed";
        exp1.druk =2;
        exp1.id = 123456789;
        exp1.prijs = 12.34;


        System.out.println(exp1.getBoekGegevens());
    }
}
