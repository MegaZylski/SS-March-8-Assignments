/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginservlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
public class LoginServletTest
{
    
    public LoginServletTest()
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
     * Test of processRequest method, of class LoginServlet.
     */
    @Test
    public void testProcessRequest() throws Exception
    {
        //Not sure how to test these
        System.out.println("processRequest");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        LoginServlet instance = new LoginServlet();
        boolean expResult = false;
        boolean result = instance.processRequest(request, response);
        assertEquals(expResult, result);
    }

    /**
     * Test of doGet method, of class LoginServlet.
     */
    @Test
    public void testDoGet() throws Exception
    {
        System.out.println("doGet");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        LoginServlet instance = new LoginServlet();
        instance.doGet(request, response);
    }

    /**
     * Test of doPost method, of class LoginServlet.
     */
    @Test
    public void testDoPost() throws Exception
    {
        System.out.println("doPost");
        HttpServletRequest request = null;
        HttpServletResponse response = null;
        LoginServlet instance = new LoginServlet();
        instance.doPost(request, response);
    }

    /**
     * Test of getServletInfo method, of class LoginServlet.
     */
    @Test
    public void testGetServletInfo()
    {
        System.out.println("getServletInfo");
        LoginServlet instance = new LoginServlet();
        String expResult = "";
        String result = instance.getServletInfo();
        assertEquals(expResult, result);
    }
    
}
