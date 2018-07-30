package com.loi.mwalima;

public class Persoon {

    private String naam;
    private String achternaam;
    private String woonplaats;

    public Persoon(){
    }

    public Persoon(String naam, String achternaam, String woonplaats) {
        this.naam = naam;
        this.achternaam = achternaam;
        this.woonplaats = woonplaats;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public String toonNAW(){
        return "NAW \nnaam: " + naam + "\nachternaam: " + achternaam +"\nwoonplaats: "+ woonplaats;
    }
}
