package com.loi.mwalima;

public class Klant extends Persoon {

    private boolean tevreden;
    private boolean bezorgen;
    static int teller = 0;


    public Klant(String naam, String adres, boolean tevreden, boolean bezorgen) {
        this.setNaam(naam);
        this.setAdres(adres);
        this.tevreden = tevreden;
        this.bezorgen =bezorgen;
        teller++;
    }

    @Override
    public String getNaam() {
        return super.getNaam();
    }

    @Override
    public String getAdres() {
        return super.getAdres();
    }

    public String tevreden(boolean tevreden) {

        if (tevreden == true) {
            return "\nKlant "+ getNaam()+" zegt : Dank u dit is een heerlijk broodje Shoarma";
        }
        return "\nKlant "+ getNaam()+ " zegt : ik ga hier nooit meer iets bestellen";
    }

    public String bezorgen(boolean bezorgen) {

        if (bezorgen == true) {

            return "\nBezorg de bestelling bij deze klant";
        }
        return "\nKlant komt de bestelling ophalen";
    }

    public String toString() {

        return "\nKlant {" + getNaam() + "\n adres: " + getAdres() + bezorgen(bezorgen)+ "\nbezorgkosten komen boven op de bestelling: "+ Bezorger.getBenzineKosten() + tevreden(tevreden)+"}";
    }

}
