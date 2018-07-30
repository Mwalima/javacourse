package com.loi.mwalima;

public class Inwoner {

    private int leeftijd;
    private byte geslacht;

    public Inwoner(){

    }
    public Inwoner(int leeftijd,byte geslacht){
        this.leeftijd = leeftijd;
        this.geslacht = geslacht;
    }

    public int getLeetijd() {
        return leeftijd;
    }

    public byte getGeslacht() {
        return geslacht;
    }


}
