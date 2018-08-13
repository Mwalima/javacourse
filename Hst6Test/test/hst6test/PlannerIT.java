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
public class PlannerIT {
    
    public PlannerIT() {
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
     * Test of createDayPlanning method, of class Planner.
     */
    @Test
    public void testCreateDayPlanning() {
        System.out.println("createDayPlanning");
        Planner instance = new PlannerImpl();
        String expResult = "";
        String result = instance.createDayPlanning();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class PlannerImpl implements Planner {

        public String createDayPlanning() {
            return "";
        }
    }
    
}
