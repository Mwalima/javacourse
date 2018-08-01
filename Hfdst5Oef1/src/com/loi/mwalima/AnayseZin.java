package com.loi.mwalima;

import java.util.ArrayList;

import static java.lang.String.valueOf;

public class AnayseZin {

    private String zin;
    private int aantalWoorden;
    int i1 = 0;
    int i2 = 0;
    public String woord;
    public ArrayList<String[]> woorden;

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

    public String[] getWoord() {

        String str = zin;
        String [] arrOfStr = str.split(" ", 5);

        return arrOfStr;
    }

    public int getAantalLeestekens() {
        //do while constructie
        int nTekens = 0;
        int i = 0;
        StringBuilder leesteken = new StringBuilder();
        do {
            System.out.println(zin.length());
            if (i < zin.length() - 1) {

                char c = zin.charAt(i);

                switch (c) {
                    case '?':
                    case '!':
                    case ',':
                        //leesteken.append(c);
                        ++nTekens;
                        System.out.println(nTekens + "leestekens gevonden");
                }
            }

        } while (i++ < zin.length());
        return nTekens;
    }

    public void woordenNaarLijst() {
        String[] s;

        while(true){
            s = getWoord();
            if(zin.length() == 0)break;
                woorden.add(s);
                aantalWoorden++;
        }
    }

    public String woordenNaarLijst1(String woord) {

        StringBuilder nieuweZin = new StringBuilder();
        nieuweZin.append(zin);

        if (woord.length() > 0) {
            nieuweZin.append(woord);
        }
        return nieuweZin.toString();
    }

    public String langsteWoord(){
        String[] s;
        s = getWoord();


       for(String element:s) {
           int i = 0;
           i++;

           if(s[i].length() >= element.length())
               continue;
               return element.toString();

       }
        return s.toString();
    }

    public String toString() {

        return "de index die terug gegeven is: " + getIndex(i1);
    }
}
