package com.loi.mwalima;

import java.util.HashMap;
import java.util.Map;

public class TestAnalyseZin {

    public static void main(String[] args){

        AnayseZin test = new AnayseZin("Het geluk , komt mij aanwaaien.");
//        System.out.println(test.getIndex(9));
//        System.out.println(test.getIndex(0));
        System.out.println(test.telKlinkers("Default"));
        System.out.println(test.toString());
        System.out.println(test.getWoord());
    }
}
