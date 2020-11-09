package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.Login;


@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        try  {
            HttpSession session = request.getSession();
            String user = request.getParameter("user");
            String email = request.getParameter("name");
            String pass = request.getParameter("pw");

            Login log = new Login();
            String status = log.login(user,email, pass,session);
            if (status.equals("asuccess")) {
                //How to get the HttpSession object 

                //The RequestDispatcher interface provides the facility of 
                //dispatching the request to another resource it may be html, servlet or jsp.
                RequestDispatcher rd1 = request.getRequestDispatcher("asuccess.jsp");

                //The getRequestDispatcher() method of ServletRequest interface returns the object of RequestDispatcher
                rd1.forward(request, response);

                //   Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.
            }

            if (status.equals("fsuccess")) {
                //How to get the HttpSession object 

                //The RequestDispatcher interface provides the facility of 
                //dispatching the request to another resource it may be html, servlet or jsp.
                RequestDispatcher rd1 = request.getRequestDispatcher("fsuccess.jsp");

                //The getRequestDispatcher() method of ServletRequest interface returns the object of RequestDispatcher
                rd1.forward(request, response);

                //   Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.
            }
            if (status.equals("lsuccess")) {
                //How to get the HttpSession object 

                //The RequestDispatcher interface provides the facility of 
                //dispatching the request to another resource it may be html, servlet or jsp.
                RequestDispatcher rd1 = request.getRequestDispatcher("lsuccess.jsp");

                //The getRequestDispatcher() method of ServletRequest interface returns the object of RequestDispatcher
                rd1.forward(request, response);

                //   Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.
            }
            else if (status.equals("failure")) {

                RequestDispatcher rd1 = request.getRequestDispatcher("lfailure.html");

                rd1.forward(request, response);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
