package com.loi.mwalima;

public class Kok extends Personeel{

   static int teller = 0;

   public Kok(){
      teller++;
   }

   public Kok(String naam, String adres, int sofinummer, double salaris,boolean kookboek){
      this.setKookboek(kookboek);
      this.setNaam(naam);
      this.setAdres(adres);
      this.setSofinummer(sofinummer);
      this.setSalaris(salaris);
      this.setKookboek(kookboek);
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
   public boolean isKookboek() {
      return super.isKookboek();
   }

   public String toString(){
      return "kok {"+ getNaam()+ "\n kookboek "+ isKookboek() +  "\n adres "+ getAdres()+ "\n sofinummer "+ getSofinummer()+ "\n salaris "+ getSalaris()+"} \n";
   }
}
