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

@WebServlet(name = "newsletter", urlPatterns = {"/newsletter"})
public class newsletter extends HttpServlet
{

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        
        Newsletter nl = new Newsletter();
        
        try {
            if (request.getParameter("submit") != null) 
            {
                
                String email = request.getParameter("email");
                
                
                   
                String status = nl.Newsletter(email);

                    if (status.equals("existed")) {
                        RequestDispatcher rd1 = request.getRequestDispatcher("existed.jsp" );
                        rd1.forward(request, response);
                  
                    } else if (status.equals("success")) {
                        out.println("<script type=\"text/javascript\">");
   out.println("alert('Email Registered Success:Gurukul Edu Hub ');");
   out.println("location='index.html';");
   out.println("</script>");
                        
                        
                    } else if (status.equals("failure")) {
                         RequestDispatcher rd1 = request.getRequestDispatcher("failure.jsp" );
                        rd1.forward(request, response);
                    }
            }   
            
            
                else {
                     
                    out.println("<html>");
                         out.println("<center>");
                         out.println("<br><br>");
                     out.println("<body bgcolor='lightgreen'>");
                out.println("<font color='red' size='6'>");
                out.println(" BIdkohogo sumne");
             
                out.println("</font></center></body></html)");
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
