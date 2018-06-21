
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
abstract class Dier {
    
    private String naam;
    private String voedsel;
    static int aantal=0;
    
    public Dier(){
        aantal++;
    }
    
    public Dier(String naam, String voedsel) {
        this();
        this.naam = naam;
        this.voedsel = voedsel;
  }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoedsel() {
        return voedsel;
    }

    public void setVoedsel(String voedsel) {
        this.voedsel = voedsel;
    }
    
    public abstract String kenmerken();
    
    final int geefAantal(){
        return aantal;
    }
}
