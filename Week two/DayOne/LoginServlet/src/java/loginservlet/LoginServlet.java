package loginservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Programmer: Damian Zylski
 * Project:    LoginServlet
 * Date:       03/17/2021
 * System:     Windows 7 Enterprise - Netbeans 12
 * 
 * Purpose:    To handle login requests for the HTTP server. So far this seems to work
 */

@WebServlet("/path")
public class LoginServlet extends HttpServlet
{

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    //hard coded private login and password info, I'm sure there's a way to pull this from
    //the server but don't know how yet
    private final String name = "Zylski";
    private final String password = "wordpass111";
    
    
    protected boolean processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        //Variables 
        boolean correct = false;
        boolean requestError = false;
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter())
        {
            //Hard coded login info
            Servlet s = null;
            //handle input and check if login success
            String inputName = request.getParameter("Name");
            String inputPassword = request.getParameter("Password");
            
            //Check if password matches what is in the system
            if(name.equalsIgnoreCase(inputName) && password.equals(inputPassword))
            {
                //Password is correct
                correct = true;
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
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
            out.println("<br>");
            out.println("<h2>" + this.getServletInfo() + "</h2>");
            out.println("<br>");
            out.println("<br>");
            //output based on whether password is correct or not
            if(correct) //correct
            {
                //welcome user and log them in
                out.println("<h3>Welcome " + this.name + ", you are now logged in. </h3>");
                out.println("<br>");
                out.println("<br>");
                out.println("<a href=https://www.youtube.com/watch?v=s0akG-V_Y30 >Click here!</a>");
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
        }
        catch(IOException | InputMismatchException | IllegalArgumentException e)
        {
            e.printStackTrace();
            requestError = true;
            
        }
        
        //If it throws, we need to throw
        throw new ServletException();
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
        //set content type
        response.setContentType("text/html");        
        //process request
        RequestDispatcher rd = request.getRequestDispatcher("/path");
        //rd.forward(request, response);
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Login Status:";
    }
    

// </editor-fold>

}
