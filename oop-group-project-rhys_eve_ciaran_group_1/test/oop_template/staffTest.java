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
 * @author ciara
 */
public class staffTest {
    
    public staffTest() {
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
     * Test of setId method, of class staff.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int value = 1;
        staff instance = new staff();
        instance.setId(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setHours method, of class staff.
     */
    @Test
    public void testSetHours() {
        System.out.println("setHours");
        int value = 1;
        staff instance = new staff();
        instance.setHours(value);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setWage method, of class staff.
     */
    @Test
    public void testSetWage() {
        System.out.println("setWage");
        int value = 1;
        staff instance = new staff();
        instance.setWage(value);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class staff.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String value = "James";
        staff instance = new staff();
        instance.setFirstName(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class staff.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String value = "Smyth";
        staff instance = new staff();
        instance.setLastName(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setphoneNum method, of class staff.
     */
    @Test
    public void testSetphoneNum() {
        System.out.println("setphoneNum");
        String value = "09876567655";
        staff instance = new staff();
        instance.setphoneNum(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setemail method, of class staff.
     */
    @Test
    public void testSetemail() {
        System.out.println("setemail");
        String value = "james90@hotmail.co.uk";
        staff instance = new staff();
        instance.setemail(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setStartDate method, of class staff.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("setStartDate");
        String value = "09/01/2021";
        staff instance = new staff();
        instance.setStartDate(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class staff.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String value = "1 Moylena Road";
        staff instance = new staff();
        instance.setAddress(value);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class staff.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        staff instance = new staff();
        int expResult = 1;
        instance.setId(1);
        int result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class staff.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        staff instance = new staff();
        String expResult = "James";
        instance.setFirstName(expResult);
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class staff.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        staff instance = new staff();
        String expResult = "Smyth";
        instance.setLastName("Smyth");
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPhoneNum method, of class staff.
     */
    @Test
    public void testGetPhoneNum() {
        System.out.println("getPhoneNum");
        staff instance = new staff();
        String expResult = "02983873873";
        instance.setphoneNum("02983873873");
        String result = instance.getPhoneNum();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class staff.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        staff instance = new staff();
        String expResult = "james90@hotmail.co.uk";
        instance.setemail(expResult);
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getHours method, of class staff.
     */
    @Test
    public void testGetHours() {
        System.out.println("getHours");
        staff instance = new staff();
        int expResult = 1;
        instance.setHours(1);
        int result = instance.getHours();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getWage method, of class staff.
     */
    @Test
    public void testGetWage() {
        System.out.println("getWage");
        staff instance = new staff();
        float expResult = 1;
        instance.setWage(1);
        float result = instance.getWage();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getStartDate method, of class staff.
     */
    @Test
    public void testGetStartDate() {
        System.out.println("getStartDate");
        staff instance = new staff();
        String expResult = "01/09/2021";
        instance.setStartDate(expResult);
        String result = instance.getStartDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class staff.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        staff instance = new staff();
        String expResult = "1 Moylena Road";
        instance.setAddress("1 Moylena Road");
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
