package com.loi.mwalima;


class Bezorger extends Personeel {

    static double aantalKm;
    static double kmvergoeding = 0.19;
    static int teller = 0;

    public Bezorger(){
        teller++;
    }

    public Bezorger(String naam, String adres, int sofinummer, double salaris,boolean brommer){
        this.setEigenBrommer(brommer);
        this.setNaam(naam);
        this.setAdres(adres);
        this.setSofinummer(sofinummer);
        this.setSalaris(salaris);
        teller++;
    }

   public Bezorger(String naam, String adres, int sofinummer, double salaris,boolean brommer, double ingegevenkm){
        this.setEigenBrommer(brommer);
        this.setNaam(naam);
        this.setAdres(adres);
        this.setSofinummer(sofinummer);
        this.setSalaris(salaris);
        this.setBenzinekosten(ingegevenkm);
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

    @Override
    public int getSofinummer() {
        return super.getSofinummer();
    }

    @Override
    public double getSalaris() {
        return super.getSalaris();
    }

    @Override
    public boolean isEigenBrommer() {
        return super.isEigenBrommer();
    }

    public void setBenzinekosten(double ingegevenkm){

        this.aantalKm = ingegevenkm;
    }

    public static double getBenzineKosten(){

        double kosten = ((aantalKm * kmvergoeding) * 100)/100;
        return Math.round(kosten);
    }

    public String toString(){

        return "Bezorger {" + getNaam() + "\n eigenbrommer ="+isEigenBrommer()+"\n adres "+ getAdres()+ "\n sofinummer "+ getSofinummer()+ "\n salaris "+ getSalaris()+"\n bezorgkosten " + getBenzineKosten()+"}\n";
    }
}
