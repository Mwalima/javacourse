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
public class Vogel extends Dier {

    private Boolean tam;
    private String soort;

    public Vogel(Boolean tam, String soort, String naam, String voedsel) {
        super(naam, voedsel);
        this.tam = tam;
        this.soort = soort;
    }   
    
    @Override
    public String kenmerken() {
        if(tam){
            return getNaam() + " behoort tot het soort " + soort + " eet "+ getVoedsel() + " is tam";
        }else{
            return getNaam() + " behoort tot het soort " + soort + " eet "+ getVoedsel() + " is niet tam";
        }
    } 
}
