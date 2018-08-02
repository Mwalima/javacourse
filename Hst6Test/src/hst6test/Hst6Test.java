/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hst6test;

/**
 *
 * @author Mwalima
 */
public class Hst6Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Interview interviewer = new Manager("Theo","De Bruin", "45");
//        System.out.println(interviewer.conductInterview());
        
        Interview interviewer2[] = new Interview[2];
        interviewer2[0] = new Employee("Bart","Flapdrol", "66");      
        interviewer2[1] = new Manager("Cor","Niew", "26");
        
        for(Interview interview: interviewer2){
            //cast person to interview interface from manager
           Person p = (Person)interview;
           String newName = "Jezus";
           p.setName(newName);        
        }
        
        for(Interview interviewer:interviewer2){
            
            if(interviewer instanceof Manager){
                int teamsize = ((Manager)interviewer).teamsize();
                if(teamsize > 10){
                  interviewer.conductInterview();
                }else{
                     System.out.println("interview can not be taken");
                }
            }
        }
        
//        Person p = new Manager("Cor","Niew", "26");
//        p.getAge();
        
        //trying to assign the reference of a base class to a derived class
        //Manager m = new Person("Cor","Niew", "26");
        //m.conductInterview();
        
       }
    
}
