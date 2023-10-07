/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package oop_template;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author R.BLack
 */
public class StockTest {
    
    public StockTest() {
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
     * Test of setIdNum method, of class Stock.
     */
    @Test
    public void testSetIdNum() {
        System.out.println("setIdNum");
        int value = 1;
        Stock instance = new Stock();
        instance.setIdNum(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class Stock.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        int value = 30;
        Stock instance = new Stock();
        instance.setQuantity(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Stock.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String value = "Hair Dye";
        Stock instance = new Stock();
        instance.setName(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getIdNum method, of class Stock.
     */
    @Test
    public void testGetIdNum() {
        System.out.println("getIdNum");
        Stock instance = new Stock();
        instance.setIdNum(1);
        int expResult = 1;
        int result = instance.getIdNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class Stock.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        Stock instance = new Stock();
        instance.setQuantity(30);
        int expResult = 30;
        int result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Stock.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Stock instance = new Stock();
        instance.setName("Hair Dye");
        String expResult = "Hair Dye";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
