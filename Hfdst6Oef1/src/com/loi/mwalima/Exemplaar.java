package com.loi.mwalima;

public class Exemplaar extends Boek implements Boekgegevens {

    private int id;
    private String staat;
    private double prijs;
    private int druk;
    private int exemplaar;

    public Exemplaar() {
        exemplaar++;
        System.out.println("default constructor aangeroepen:"+ exemplaar);
    }

    public Exemplaar(String titel, int ISBN, String uitgever, int id, String staat, double prijs, int druk) {
        super(titel, ISBN, uitgever);
        this.id = id;
        this.staat = staat;
        this.prijs = prijs;
        this.druk = druk;
        exemplaar++;
        System.out.println("Constructor aangeroepen:"+ exemplaar);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStaat() {
       return staat;
    }

    public void setStaat(String staat) {
            this.staat = staat;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public int getDruk() {
        return druk;
    }

    public void setDruk(int druk) {
        this.druk = druk;
    }

    public String getBoekGegevens(){

        return "titel: "+ titel+"\nISBN: "+ ISBN +"\nuitgever: "+uitgever+ "\nId: "+ id +"\nStaat: " + staat +"\nPrijs: " + prijs + "\nDruk: " + druk;
    }
}
