/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Zylski
 */
public class LambdasTest
{
    
    public LambdasTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of isOdd method, of class Lambdas.
     */
    @Test
    public void testIsOdd()
    {
        System.out.println("isOdd");
        Integer i = null;
        String expResult = "";
        String result = Lambdas.isOdd(i);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPrime method, of class Lambdas.
     */
    @Test
    public void testIsPrime()
    {
        System.out.println("isPrime");
        Integer num = null;
        String expResult = "";
        String result = Lambdas.isPrime(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPalindrome method, of class Lambdas.
     */
    @Test
    public void testIsPalindrome()
    {
        System.out.println("isPalindrome");
        Integer num = null;
        String expResult = "";
        String result = Lambdas.isPalindrome(num);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performOperation method, of class Lambdas.
     */
    @Test
    public void testPerformOperation() throws Exception
    {
        System.out.println("performOperation");
        Lambdas.performOperation();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Lambdas.
     */
    @Test
    public void testMain() throws Exception
    {
        System.out.println("main");
        String[] args = null;
        Lambdas.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
