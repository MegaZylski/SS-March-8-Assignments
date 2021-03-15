/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
     * Test of lambdaStrings method, of class Lambdas.
     */
    @Test
    public void testLambdaStrings()
    {
        //Should start with e letter words first based on final sort
        System.out.println("lambdaStrings");
        String[] expResult = {"extra", "enemy", "eat", "Astronomy", "quack", "bend", "taco", "one"};
        String[] result = Lambdas.lambdaStrings();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of oddEvenList method, of class Lambdas.
     */
    @Test
    public void testOddEvenList()
    {
        System.out.println("oddEvenList");
        List<Integer> nums = new ArrayList <Integer>(Arrays.asList(666,777));
        String expResult = "e666,o777";
        String result = Lambdas.oddEvenList(nums);
        assertEquals(expResult, result);
    }

    /**
     * Test of aList method, of class Lambdas.
     */
    @Test
    public void testAList()
    {
        System.out.println("aList");
        List<String> strings = new ArrayList <String> (Arrays.asList("dictionary","act","a","and","any","anyways"));
        List<String> expResult = new ArrayList <String>(Arrays.asList("act","and","any"));
        List<String> result = Lambdas.aList(strings);
        assertEquals(expResult, result);
    }

    /**
     * Test of main method, of class Lambdas.
     */
    @Test
    public void testMain()
    {
        System.out.println("main");
        String[] args = null;
        Lambdas.main(args);
    }
    
}
