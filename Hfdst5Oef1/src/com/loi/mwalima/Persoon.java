package com.loi.mwalima;

public class Persoon {

    private String Naam;
    private String CadeauWens;

    public Persoon(String naam, String cadeauWens) {
        this.Naam = naam;
        this.CadeauWens = cadeauWens;
    }

    public String getNaam() {
        return Naam;
    }

    public void setNaam(String naam) {
        Naam = naam;
    }

    public String getCadeauWens() {
        return CadeauWens;
    }

    public void setCadeauWens(String cadeauWens) {
        CadeauWens = cadeauWens;
    }

    public String toString(){
        return "Cadeau wens van "+getNaam()+" = "+getCadeauWens();
    }
}
