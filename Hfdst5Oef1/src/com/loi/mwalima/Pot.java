package com.loi.mwalima;

import java.util.ArrayList;

public class Pot {

    ArrayList<Persoon>persList;
    TrekLoten trekLoten;

    public Pot() {
        persList = new ArrayList<Persoon>();
    }

    void voegToe(String naam, String wens){
        persList.add(new Persoon(naam,wens));
    }

    public String[] loten(){
        String[] s = new String[persList.size()];
        int i = 0, n;
        trekLoten = new TrekLoten(persList.size());

        for(Persoon p:persList){
        n = trekLoten.lot(i);
        s[i] = p.getNaam() + " heeft geloot " + persList.get(n).toString();
        i++;
        }
        return s;
    }
}
