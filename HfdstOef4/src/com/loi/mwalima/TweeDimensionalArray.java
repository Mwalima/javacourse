package com.loi.mwalima;

public class TweeDimensionalArray {

    private int [][] fillarray;

    public TweeDimensionalArray(){
        fillarray = new int[2][2];
    }

    public TweeDimensionalArray(int m, int n){
        fillarray = new int[m][n];
    }

    public void vulRandom(){
        for(int i = 0; i < fillarray.length; i++) {
            for(int j = 0; j <fillarray.length; j++){
                fillarray[i][j] =(int) (100 * Math.random());
            }
        }
    }

    public int kleinsteGetal(){
        int getal = 100;
        for(int i = 0; i <fillarray.length; i++){
            for(int j = 0; j < fillarray.length; j++){
                if(getal > fillarray[i][j]){
                    getal = fillarray[i][j];
                }
            }
        }
        return getal;
    }

    public int grootsteGetal(){
        int getal = 0;
        for(int i = 0; i <fillarray.length; i++){
            for(int j = 0; j < fillarray.length; j++){
                if(getal > fillarray[i][j]){
                    getal = fillarray[i][j];
                }
            }
        }
        return getal;
    }

    public String indexen(int index){
        for (int i = 0; i < fillarray.length; i++) {
            for(int j = 0; i<fillarray.length; j++){
               if(index == fillarray[i][j]){
                   return i + " " + j;
               }
            }
        }
        return "-1 -1";
    }
}
