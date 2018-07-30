package com.loi.mwalima;

import java.util.ArrayList;

public class TrekLoten{
    //define array size
    private int aantal;
    private int[] loten;

    public TrekLoten(int aantal) {
        this.aantal = aantal;
        //maak array grootte
        loten = new int[aantal];
        for(int i = 0; i < loten.length; i++){
            loten[i] = i;
        }
        Loten();
    }

    private void Loten() {
        int g, k;

        for(int i =aantal -1; i > 0; i--){
            g = (int)(i*Math.random());
            k = loten[i];
            loten[i]= loten[g];
            loten[g]= k;
        }
    }

    public int lot(int n) {
        if(n >= 0 && n < aantal)
            return loten[n];
        return -1;
    }
}
