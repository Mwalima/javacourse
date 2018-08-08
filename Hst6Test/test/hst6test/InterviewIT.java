/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hst6test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mwalima
 */
public class InterviewIT {
    
    public InterviewIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conductInterview method, of class Interview.
     */
    @Test
    public void testConductInterview() {
        System.out.println("conductInterview");
        Interview instance = new InterviewImpl();
        String expResult = "planning CreATED";
        String result = instance.conductInterview();
        assertEquals(expResult, result);        
       
        String expResult2 = "planning created";
        String result2 = instance.createDayPlanning();
        assertEquals(expResult2, result2);
    }

    public class InterviewImpl implements Interview {

        public String conductInterview() {
            return "planning CreATED";
        }
        
        public String createDayPlanning(){
            return "planning created";
        }
    }
    
}
