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

@WebServlet(name = "fenroll", urlPatterns = {"/fenroll"})
public class fenroll extends HttpServlet
{

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        
        
        Fenroll reg = new Fenroll();
        
        try {
            if (request.getParameter("submit") != null) 
            {
                
                String f_id = request.getParameter("f_id");
                
                
                
                
                    String status = reg.Fenroll(f_id);
                    System.out.println(status);
                    if (status.equals("existed")) {
                       out.println("<script type=\"text/javascript\">");
   out.println("alert('FACULTY ID is already generated...!!!');");
   out.println("location='fenroll.jsp';");
   out.println("</script>");
                  
                    } else if (status.equals("success")) {
                         out.println("<script type=\"text/javascript\">");
   out.println("alert('FACULTY ID Generated Successfully...!!!');");
   out.println("location='fenroll.jsp';");
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
                out.println(" password does not match");
             
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
