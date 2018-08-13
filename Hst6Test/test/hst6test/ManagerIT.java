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
public class ManagerIT {
    
    public ManagerIT() {
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
     * Test of conductInterview method, of class Manager.
     */
    @Test
    public void testConductInterview() {
        System.out.println("conductInterview");
        Manager instance = null;
        String expResult = "";
        String result = instance.conductInterview();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of teamsize method, of class Manager.
     */
    @Test
    public void testTeamsize() {
        System.out.println("teamsize");
        Manager instance = null;
        int expResult = 0;
        int result = instance.teamsize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
