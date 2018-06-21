package com.loi;


public class TestKat {

    public static void main(String[] args){

        Kat k1 = new Kat();
        k1.naam =("Tijger");
        k1.ras=("Siamees");
        k1.leeftijd=(4);

        System.out.println(k1.miauwt());

        Kat k2 = new Kat();
        k2.naam=("Puk");
        k2.ras=("Bengaal");
        k2.leeftijd=(10);

        System.out.println(k2.miauwt());

        Kat k3 = new Kat();
        k3.naam =("Sammie");
        k3.ras=("Europeese korthaar");
        k3.leeftijd=(19);

        System.out.println(k3.miauwt());


    }
}
