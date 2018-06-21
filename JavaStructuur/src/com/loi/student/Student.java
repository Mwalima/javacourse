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
class Student extends Persoon{

    private String opleiding;

    public Student(String opleiding, int id, String naam, String woonplaats) {
        super(id, naam, woonplaats);
        this.opleiding = opleiding;
    }
    
    @Override
    public String toString(){
        return "id =" + id + ", naam =" + naam + ", woonplaats = " + woonplaats + "opleiding: "+opleiding;
    }
    
    
        
}
