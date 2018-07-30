package com.loi.mwalima;

public class Personeel extends Persoon {

    private boolean kookboek;
    private int aantalKoks;
    private boolean eigenBrommer;
    private int aantalBezorgers;
    private int sofinummer;
    private double salaris;

    public Personeel(){
    }

    public boolean isKookboek() {
        return kookboek;
    }

    public void setKookboek(boolean kookboek) {
        this.kookboek = kookboek;
    }

    public int getAantalKoks() {
        return aantalKoks;
    }

    public void setAantalKoks(int aantalKoks) {
        this.aantalKoks = aantalKoks;
    }

    public boolean isEigenBrommer() {
        return eigenBrommer;
    }

    public void setEigenBrommer(boolean eigenBrommer) {
        this.eigenBrommer = eigenBrommer;
    }

    public int getAantalBezorgers() {
        return aantalBezorgers;
    }

    public void setAantalBezorgers(int aantalBezorgers) {
        this.aantalBezorgers = aantalBezorgers;
    }

    public int getSofinummer() {
        return sofinummer;
    }

    public void setSofinummer(int sofinummer) {
        this.sofinummer = sofinummer;
    }

    public double getSalaris() {
        return salaris;
    }

    public void setSalaris(double salaris) {
        this.salaris = salaris;
    }

}
