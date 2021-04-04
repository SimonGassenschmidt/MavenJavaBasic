/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Simon
 */
public class BasicTest {
    
    public BasicTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class Basic.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Basic.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAddition method, of class Basic.
     */
    @Test
    public void testGetAddition() {
        System.out.println("getAddition");
        int a = 1;
        int b = 2;
        int expResult = 3;
        int result = Basic.getAddition(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubstraction method, of class Basic.
     */
    @Test
    public void testGetSubstraction() {
        System.out.println("getSubstraction");
        int a = 1;
        int b = 2;
        int expResult = -1;
        int result = Basic.getSubstraction(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMultiplication method, of class Basic.
     */
    @Test
    public void testGetMultiplication() {
        System.out.println("getMultiplication");
        int a = 2;
        int b = 3;
        int expResult = 6;
        int result = Basic.getMultiplication(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDivision method, of class Basic.
     */
    @Test
    public void testGetDivision() {
        System.out.println("getDivision");
        int a = 8;
        int b = 2;
        int expResult = 4;
        int result = Basic.getDivision(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getModulo method, of class Basic.
     */
    @Test
    public void testGetModulo() {
        System.out.println("getModulo");
        int a = 32;
        int b = 20;
        int expResult = 12;
        int result = Basic.getModulo(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSumofIntArray method, of class Basic.
     */
    @Test
    public void testGetSumofIntArray() {
        System.out.println("getSumofIntArray");
        int[] array = {1, 2, 3, 4};
        int expResult = 10;
        int result = Basic.getSumofIntArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNegativeSumofIntArray method, of class Basic.
     */
    @Test
    public void testGetNegativeSumofIntArray() {
        System.out.println("getNegativeSumofIntArray");
        int[] array = {1, 2, 3, 4};
        int expResult = -10;
        int result = Basic.getNegativeSumofIntArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSubstractionElementbyElementArray method, of class Basic.
     */
    @Test
    public void testGetSubstractionElementbyElementArray() {
        System.out.println("getSubstractionElementbyElementArray");
        int[] array = {1, 2, 3, 4};
        int expResult = -8;
        int result = Basic.getSubstractionElementbyElementArray(array);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getappendStringwithSpace method, of class Basic.
     */
    @Test
    public void testGetappendStringwithSpace() {
        System.out.println("getappendStringwithSpace");
        String a = "Test";
        String b = "String";
        String expResult = "Test String";
        String result = Basic.getappendStringwithSpace(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
