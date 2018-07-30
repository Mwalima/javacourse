package com.loi.mwalima;

import java.util.Scanner;

public class TestDamacusShoarma {

    private Scanner keyboard;

    public TestDamacusShoarma() {

        keyboard = new Scanner(System.in);
    }

    public static void main(String[] args) {

        TestDamacusShoarma test = new TestDamacusShoarma();

        //bevat 2 koks
        Kok kok = new Kok("Jan de vries", "lijsterstraat 15", 123564789, 12.50, true);
        System.out.println(kok.toString());
        kok = new Kok("Piet Bakker", "Flueweelhof 15", 212121217, 22.50, true);
        System.out.println(kok.toString());
        System.out.println("Aantal koks: " + Kok.teller);

        //en 2 bezorgers
        Bezorger bezorger = new Bezorger("Ali Babba", "sperwerstraat 13", 1245785201, 6.12, true, test.kmgereden());
        System.out.println(bezorger.toString());
        bezorger = new Bezorger("Rudy de bruin", "Loosduinsekade 343", 457856982, 4.12, false);
        System.out.println(bezorger.toString());
        System.out.println("Aantal bezorgers: " +Bezorger.teller );

        Klant k = new Klant("Kevin", "Prieelstraat 23", true,true);

        System.out.println(k.toString());
    }


    public int kmgereden() {
        System.out.println("\nGeef het aantal kilometers op naar de klant!!!");
        int aantalkm = keyboard.nextInt();
        return aantalkm;
    }
}
