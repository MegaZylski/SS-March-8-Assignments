package unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Zylski
 * LineTest
 * 3/12/21
 * Unit test for line class
 */
public class LineTest
{
    
    public LineTest()
    {
    }
    
    @BeforeAll
    public static void setUpClass()
    {
    }
    
    @AfterAll
    public static void tearDownClass()
    {
    }
    
    @BeforeEach
    public void setUp()
    {
    }
    
    @AfterEach
    public void tearDown()
    {
    }

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
