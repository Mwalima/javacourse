package javastructuur;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//import com.loi.student.Persoon;


/**
 *
 * @author mpelt
 * Oefening 2
 * Deze code is geschreven door: Mwalima Pelenburg
 */
public class JavaStructuur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s = "LOI wenst u veel succes met deze cursus";        
        System.out.println(s);
        System.out.println(args[0]);
        System.out.println(args[1]); 
        
        com.loi.student.Persoon pers = new com.loi.student.Persoon(12,"Klaas","Lutjebroek");
        
        System.out.println(pers.toString());        
        Student student = new Student(23, "hjhjjl", "gkgkhhkghgk");
        System.out.println(student.toString());        
    }       
}
