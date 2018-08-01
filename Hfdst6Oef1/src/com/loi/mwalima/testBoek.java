package com.loi.mwalima;


public class testBoek {

    public static void main(String[] args){

//        Exemplaar exp1 = new Exemplaar("Titelje",1234567,"afdsfsadfsad");
//        exp1.staat = "goed";
//        exp1.druk =2;
//        exp1.id = 123456789;
//        exp1.prijs = 12.34;
//        System.out.println(exp1.getBoekGegevens());

//        Boek boek2 = new Exemplaar("Boekje",34343434,"beeee",2,"foed",11,3);
//        Exemplaar exp = (Exemplaar)boek2;
//        exp.setPrijs(34);
//        System.out.println(exp.getBoekGegevens());

        Boekgegevens[] gegevens = new Boekgegevens[2];

        gegevens[0] = new Boek("Fruit",545454,"twee");
       gegevens[1] = new Exemplaar("Kiwik",121212,"drie",2,"slecht",23,2);
//
//        for (Boekgegevens gegeven:gegevens) {
//            System.out.println(gegeven.getBoekGegevens());
//        }

        for(Boekgegevens gegeven:gegevens){
            Boek boek = (Boek)gegeven;
            int a = boek.getISBN();
            boek.setISBN(+a);
        }

//        for(Boekgegevens gegeven:gegevens){
//            System.out.println(gegeven.getBoekGegevens());
//        }

        Exemplaar e = null;
        for(Boekgegevens gegeven:gegevens){
            if(gegeven.getClass() == Exemplaar.class){
                e = (Exemplaar)gegeven;
                int druk = e.getDruk();
                e.setDruk(druk + 1);
            }
        }
        for(Boekgegevens gegeven:gegevens){
            System.out.println(gegeven.getBoekGegevens());
        }
    }
}
