package com.loi.mwalima;

public class testIfStatements {

    public static void main(String[] args){
        int n = 0, p = 48, q =4;
        while(p!=q){
            p = p / q;
            q--;
            n++;
        }
        System.out.println(n);

        int[][] two = new int [2][3];

        for(int[] b:two){
            for(int a:b) a = 20;
        }
    }
}
