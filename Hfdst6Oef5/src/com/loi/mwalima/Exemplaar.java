package com.loi.mwalima;

public class Exemplaar extends Boek implements Boekgegevens {

    protected int id;
    public String staat;
    protected double prijs;
    protected int druk;
    static int aantal_exemplaren;

    public Exemplaar(){
        aantal_exemplaren++;
        System.out.println(aantal_exemplaren+"default");
    }

    public Exemplaar(String titel, int ISBN, String uitgever) {
        super(titel, ISBN, uitgever);
        aantal_exemplaren+=1;
        System.out.println(aantal_exemplaren+"second constr.");
    }

    public String getBoekGegevens(){

        return "titel: "+ getTitel()+"\nISBN: "+ getISBN() +"\nuitgever: "+getUitgever()+ "\nId: "+ id +"\nStaat: " + staat +"\nPrijs: " + prijs + "\nDruk: " + druk;
    }
}
