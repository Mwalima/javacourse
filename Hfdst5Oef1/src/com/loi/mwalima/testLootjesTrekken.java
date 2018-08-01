package com.loi.mwalima;

public class testLootjesTrekken {

    public static void main(String[] args){
        Pot pot = new Pot();

        pot.voegToe("Harrie","playstation");
        pot.voegToe("Claire","Laarzen");
        pot.voegToe("Lieke","pyama");

        String sp[] = pot.loten();

        for(String s:sp){
            System.out.println(s);
        }
    }
}
