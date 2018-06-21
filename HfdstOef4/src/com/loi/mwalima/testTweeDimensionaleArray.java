package com.loi.mwalima;

public class testTweeDimensionaleArray {

    public static void main(String[] arg){

        TweeDimensionalArray test = new TweeDimensionalArray(5,5);
        test.vulRandom();
        System.out.println(test.kleinsteGetal());
        System.out.println(test.grootsteGetal());
        System.out.println(test.indexen(38));
    }
}
