package com.loi.mwalima;

public class Exemplaar extends Boek implements Boekgegevens {

    int id;
    String staat;
    double prijs;
    int druk;

    public Exemplaar(String titel, int ISBN, String uitgever) {
        super(titel, ISBN, uitgever);
    }

    public String getBoekGegevens(){

        return "titel: "+ getTitel()+"\nISBN: "+ getISBN() +"\nuitgever: "+getUitgever()+ "\nId: "+ id +"\nStaat: " + staat +"\nPrijs: " + prijs + "\nDruk: " + druk;
    }
}
