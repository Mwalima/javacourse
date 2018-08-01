package com.loi.mwalima;

public class Boek implements Boekgegevens{

    protected String titel;
    protected int ISBN;
    protected String uitgever;

    public Boek(String titel, int ISBN, String uitgever) {
        this.titel = titel;
        this.ISBN = ISBN;
        this.uitgever = uitgever;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getUitgever() {
        return uitgever;
    }

    public void setUitgever(String uitgever) {
        this.uitgever = uitgever;
    }

    public String getBoekGegevens(){

        return "titel:"+ getTitel()+"\nISBN:"+ getISBN() +"\nuitgever:"+getUitgever();
    }
}
