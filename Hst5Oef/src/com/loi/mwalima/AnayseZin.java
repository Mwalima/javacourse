package com.loi.mwalima;

import java.util.ArrayList;
import java.util.Arrays;

public class AnayseZin {

    private String zin;
    private int aantalWoorden;
    int i1 = 0;
    int i2 = 0;
    public ArrayList<StringBuilder> woorden;

    /**
     *
     */
    public AnayseZin() {
        this.woorden = new ArrayList();
        this.aantalWoorden = 0;
    }

    /**
     * @param zin
     */
    public AnayseZin(String zin) {
        this();
        this.zin = zin;

    }

    /**
     * @param i
     * @return
     */
    public int getIndex(int i) {
        char c;


        for (i = 0; i < zin.length(); i++) {

            if ((zin.charAt(i) == '\n') || (zin.charAt(i) == ',') || (zin.charAt(i) == '.') || (zin.charAt(i) == ' ')) {

                return i++;
            }
        }
        return i;
    }

    public int telKlinkers(String woord) {
        char c;
        int it = 0;

        for (int i = 0; i < woord.length(); i++) {

            c = woord.charAt(i);

            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    it++;
            }
        }
        return it;
    }

    public StringBuilder getWoord(){
        //zet de teller op 0
        i1 = 0;
        StringBuilder woordlijst = new StringBuilder();

        for(int i = 0; i < zin.length(); i++) {
            //tel het aantal characters
            i2 = getIndex(i);char c = zin.charAt(i);
            woordlijst.append(c);
            //zoek naar de spatie waardoor de letters ervoor dus een woord moeten zijn
            if(zin.charAt(i) == ' '){

                return woordlijst;
            }
        }
        i1 =i2 + 1;
        return woordlijst;

    }

    public String toString() {
        return "de index die terug gegeven is: " + getIndex(i1);
    }
}
