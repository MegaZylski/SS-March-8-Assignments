/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

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
public class LineTest
{
    
    public LineTest()
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
    
    //TO DO: Need to write 2 more test cases for each method

    /**
     * Test of getSlope method, of class Line.
     */
    @Test
    public void testGetSlope()
    {
        System.out.println("getSlope Test with input 5, 10, 7, 5");
        Line instance = new Line(5.0,10.0,7.0,5.0);
        double expResult = -2.5;
        double result = instance.getSlope();
        assertEquals(expResult, result, 0.0);        
    }

    /**
     * Test of getDistance method, of class Line.
     */
    @Test
    public void testGetDistance()
    {
        System.out.println("getDistance Test with input 5, 10, 7, 5");
        Line instance = new Line(5.0,10.0,7.0,5.0);
        double expResult = 5.385164807134504;
        double result = instance.getDistance();
        assertEquals(expResult, result, 0.0);

    }

    /**
     * Test of parallelTo method, of class Line.
     */
    @Test
    public void testParallelTo()
    {
        System.out.println("parallelTo Test with input 5, 10, 7, 5");
        System.out.println("Expecting true for 6,10,8,5 comparison");
        Line l = new Line(6.0, 10.0, 8.0, 5.0);
        Line instance = new Line(5.0,10.0,7.0,5.0);
        boolean expResult = true;
        boolean result = instance.parallelTo(l);
        assertEquals(expResult, result);
    }
    
}
