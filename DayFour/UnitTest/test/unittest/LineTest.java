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
        System.out.println("getSlope");
        Line instance = null;
        double expResult = 0.0;
        double result = instance.getSlope();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDistance method, of class Line.
     */
    @Test
    public void testGetDistance()
    {
        System.out.println("getDistance");
        Line instance = null;
        double expResult = 0.0;
        double result = instance.getDistance();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of parallelTo method, of class Line.
     */
    @Test
    public void testParallelTo()
    {
        System.out.println("parallelTo");
        Line l = null;
        Line instance = null;
        boolean expResult = false;
        boolean result = instance.parallelTo(l);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
