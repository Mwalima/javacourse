package com.loi.mwalima;

import java.util.ArrayList;

/**
 * Lineaire hypotheek
 *
 * @author Mwalima
 */
public class LineaireHypotheek extends Hypotheek {

    private final String hypotheekvorm = "Lineair";
    private int varlooptijd;

    public LineaireHypotheek(int hypotheeksom, int looptijd, int rentepercentage) {
        super(hypotheeksom, looptijd, rentepercentage);
        this.hypotheeksom = hypotheeksom;
        this.varlooptijd = looptijd;
    }

    @Override
    public double getMaandlast() {
        return hypotheeksom / looptijd;
    }

    @Override
    public double aflossing() {
        return getMaandlast() + (getHypotheeksom(looptijd) / 100 * getRentepercentage());
    }

    @Override
    public double getRenteBedrag() {
        return aflossing() - (getHypotheeksom(looptijd) / looptijd);
    }

    @Override
    public ArrayList<String> hypotheekOverzicht() {
        ArrayList<String> list = new ArrayList();
        String result = "";
       
        for (int i = 0; i < looptijd; i--) {
            if (varlooptijd >= 0) {               
                result = ("hypotheekvorm :" + hypotheekvorm + " rente: " + Math.round(getRentepercentage()) + "%  aflossing(per maand): " + Math.round(aflossing()) + " rentebedrag " + Math.round(getRenteBedrag()) + " vaste maandlasten " + Math.round(getMaandlast()) + " RestSom :" + Math.round(getHypotheeksom(varlooptijd)) + " Looptijd " + this.varlooptijd + " jaar");
                //result = "adsfafds"+getHypotheeksom(1);
                list.add(result);                
            }
             varlooptijd--;  
        }
        return list;
    }
}
