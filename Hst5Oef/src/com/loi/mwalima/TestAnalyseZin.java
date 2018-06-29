package com.loi.mwalima;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TestAnalyseZin {

    public static void main(String[] args){

        AnayseZin test = new AnayseZin("Het geluk, komt mij aanwaaien.!!??");
//        System.out.println(test.getIndex(9));
//        System.out.println(test.getIndex(0));
        System.out.println(test.telKlinkers("Default"));
        System.out.println(test.toString());
        System.out.println(test.getWoord());

        ArrayList<String>myList = new ArrayList();
        myList.add("Henk");
        myList.add("Piet");
        myList.add("Klaas");

        for(String namen:myList){
            System.out.println(namen);
        }

        System.out.println(test.getAantalLeestekens());
    }
}
