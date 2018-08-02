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
public class Employee extends Person implements Interview{

    @Override
    public String conductInterview() {
        ArrayList<String> questions = new ArrayList();
        questions.add(getName());
        questions.add(getLastname());
        questions.add(getAge());

        if (!questions.isEmpty()) {
            for (String a : questions) {
                return "Employee what is you`re:" + a + "?";
            }
        }
        return "";
    }

    public Employee(String name, String lastname, String age) {
        super(name, lastname, age);
    }
    
    
    
    
}
