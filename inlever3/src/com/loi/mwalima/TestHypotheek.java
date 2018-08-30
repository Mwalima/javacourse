/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.loi.mwalima;

import java.util.ArrayList;

class Shoe{
String name;
}
class Boot extends Shoe{
    String name;
}


public class TestHypotheek { 
    class ColorPack{
    int shadeccout = 10;    
     int getShadecount(){
        return shadeccout;
    }
    }
    
     public static void main(String... args){
         Hypotheek linear = new LineaireHypotheek(100000,5,4);
      Hypotheek spaar = new SpaarHypotheek(100000,5,4);
      Hypotheek anuiteit = new Annuïteitenhypotheek(100000,5,4);
        try{
            ArrayList<String>lineairlist = linear.hypotheekOverzicht();
            for(String lijstje :lineairlist){
            System.out.println(lijstje); 
            }    

            ArrayList<String>anuiteitlist = anuiteit.hypotheekOverzicht();
                        for(String anuiteitoverzicht :anuiteitlist){
                        System.out.println(anuiteitoverzicht); 
                        }    

            ArrayList<String>spaarlist = spaar.hypotheekOverzicht();
                        for(String spaaroverzicht :spaarlist){
                        System.out.println(spaaroverzicht); 
                        }    

        }
        catch(IndexOutOfBoundsException index){
            System.err.println(index);
        }
        catch(ArithmeticException arre){
            System.err.println(arre);
        }
        catch(Exception e){
            System.err.println(e);
        }
        finally{
            System.err.println("Hypotheek is berekend");
        }
        

    }    
     
     
     
     
}
