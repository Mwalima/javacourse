/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hst6test;

import java.util.ArrayList;

/**
 *
 * @author Mwalima
 */
public class Manager extends Person implements Interview {

    public Manager(String name, String lastname, String age) {
        super(name, lastname, age);
    }

    public String conductInterview() {
        ArrayList<String> questions = new ArrayList();
        questions.add(getName());
        questions.add(getLastname());
        questions.add(getAge());

        if (!questions.isEmpty()) {
            for (String a : questions) {
                int nummer = 0;
                switch(nummer){
                    case 0: System.out.println("Manager what is you`re name:" + questions.get(0) + "?");
                            nummer ++;                    
                    case 1: System.out.println("Manager what is you`re lastnamename:" + questions.get(1) + "?");
                            nummer ++;
                    case 2: System.out.println("Manager what is you`re age:" + questions.get(2) + "?");
                            nummer ++;
                         
                }
            }
        }
        return "";
    }
    
    public int teamsize(){
        int size = 12;
        return size;
    }
}
