package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.*;

@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet
{

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        
        Registration reg = new Registration();
        
        try {
            if (request.getParameter("submit") != null) 
            {
                String first_name = request.getParameter("first_name");
                String last_name = request.getParameter("last_name");
                String user = request.getParameter("user");
                String id = request.getParameter("id");
                String pw = request.getParameter("pw");
                String cp = request.getParameter("cp");
                String email = request.getParameter("email");
                
                
                if (pw.equals(cp)) 
                {
                    String status = reg.Registration(first_name, last_name, user, id, pw, email);
                    System.out.println(status);
                    if (status.equals("existed")) {
                        RequestDispatcher rd1 = request.getRequestDispatcher("fexist.jsp" );
                        rd1.forward(request, response);
                  
                    }
                    else if (status.equals("existed2")) {
                        RequestDispatcher rd1 = request.getRequestDispatcher("stue.jsp" );
                        rd1.forward(request, response);
                  
                    }
                    else if (status.equals("success")) {
                         RequestDispatcher rd1 = request.getRequestDispatcher("success.jsp" );
                        rd1.forward(request, response);
                    } else if (status.equals("failure")) {
                         RequestDispatcher rd1 = request.getRequestDispatcher("failure.jsp" );
                        rd1.forward(request, response);
                    }
                    else if (status.equals("failure2")) {
                         RequestDispatcher rd1 = request.getRequestDispatcher("failure2.html" );
                        rd1.forward(request, response);
                    }
                    
                }
                
                else {
                     
                    out.println("<html>");
                         out.println("<center>");
                         out.println("<br><br>");
                     out.println("<body bgcolor='lightgreen'>");
                out.println("<font color='red' size='6'>");
                out.println(" password does not match");
             
                out.println("</font></center></body></html)");
                }
            }

        } 
        
        
     


   catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
