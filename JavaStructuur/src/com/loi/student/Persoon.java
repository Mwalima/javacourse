/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loi.student;
/**
 *
 * @author mpelt
 */
public class Persoon {
    
    protected int id;
    protected String naam;
    protected String woonplaats;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public Persoon(int id, String naam, String woonplaats) {
        this.id = id;
        this.naam = naam;
        this.woonplaats = woonplaats;
    }
    
    public String toString(){
        return "id =" + id + ", naam =" + naam + ", woonplaats = " + woonplaats;
    }
}
