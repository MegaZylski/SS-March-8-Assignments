/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shinra.utopia.admin;

import com.shinra.utopia.entity.User;
import com.shinra.utopia.service.AdminService;
import com.shinra.utopia.service.LoginService;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.InputMismatchException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * Programmer: Damian Zylski
 * Project:    LoginServlet
 * Date:       03/22/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To handle login requests for administrator functions
 */
public class AdminServlet extends HttpServlet
{
    private AdminService admin;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //Variables 
        boolean correct = false;
        String adminPage = "<a href=\"adminlanding.html\" >Proceed to Admin Page</a>";
        String agentPage = "";
        String travellerPage = "";
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            //login servlet needs to get list of users and their info
            admin = new AdminService();
            User user = null;
            Integer role = 2;
            
            
            //handle input and check if login success
            String inputID = request.getParameter("action");
            System.out.println(inputID);
            System.out.println("Quack!");
            String inputPassword = request.getParameter("Password");
            
            //Check if input id is numeric
            boolean isNumber = isNumeric(inputID);            
            
            //Check if password matches what is in the system
            //Make sure input is numeric
            if(isNumber)
            {                             
                Integer id = Integer.parseInt(inputID);
                if(false)
                {
                    //Password is correct
                    correct = true;
                    //Create user
                    //user = login.getUser(id);  
                }
            }
            else
            {
                //password is wrong
                correct = false;
            }
            
            /* Output Servlet info*/
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>UTOPIA LOGIN</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Utopia Login Page</h1>");
            out.println("<br>");
            out.println("<br>");
            //output based on whether password is correct or not
            if(correct) //correct
            {
                //welcome user and log them in
                out.println("<h3>Welcome " + user.getFirstName() + "! You are now logged in. </h3>");
                out.println("<br>");
               
                out.println("<br>");
                out.println(adminPage);
                out.println("<br>");
            }
            else //wrong
            {
              //give login error response
              out.println("<h3>Username or password is incorrect!</h3>");
              out.println("<br>");
              //Link back to login page
              out.println("<a href=index.html >Return to login screen</a>"); //This is weird because it doesn't like quotes
              out.println("<br>");
            }
            out.println("</body>");
            out.println("</html>");
            
            this.getServletInfo();
            
            out.close();
        }
        //Both cathes should open an error page. 
        catch(NumberFormatException e)
        {
            e.printStackTrace();
            System.out.println("Input is invalid!");
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://localhost:8080/UtopiaProject/loginerror.html"));
            
        }
        catch(IOException | InputMismatchException | IllegalArgumentException | IllegalStateException e)
        {
            e.printStackTrace();
            System.out.println("Error! Something went wrong.");
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("http://localhost:8080/UtopiaProject/loginerror.html"));
        }
        finally
        {
            //If it throws, we need to throw  
            throw new ServletException();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }
    
    //*isNumeric****************************************************************
    //checks if value is numeric
    public boolean isNumeric(String str) 
    { 
        try 
        {  
            Integer.parseInt(str);  
            return true;
        } 
        catch(NumberFormatException e)
        {  
            return false;  
        }  
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

}
