/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dier;

/**
 *
 * @author mpelt
 */
public class TestDier {
    public static void main(String[] args){
        Dier dier = new Vogel(true, "duif", "Tortelduif", "mais");
        Dier vis = new Vis("haai","vlees");
        System.out.println(dier.kenmerken());    
        System.out.println("het aantal= " + dier.geefAantal());
    }
}
