package com.loi.mwalima;

public class ArrayUtil {
    private int x;
    private int y;
    
    public int testArray(int x, int y){
        int multiArray [][] = new int[x][y];

        String result = "";

        for (int i = 0; i < multiArray.length; x++){

            for(int j = 1; j < multiArray[i].length; j++){
                multiArray[i][j] = i + j;
            }

        }
        return 1;
    }

}
