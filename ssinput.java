/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.scholar;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vinay B K
 */
@WebServlet(name = "ssinput", urlPatterns = {"/ssinput"})
public class ssinput extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
     scholar reg = new scholar();
        try {
            if(request.getParameter("submit") != null){
            
     
               String ss_name = request.getParameter("ss_name");
                String ss_link = request.getParameter("ss_link");
           // String ss_name="nmms";
           // String ss_link="nmms.com";
                    String status;
                    status = reg.sclrinsert(ss_name,ss_link);
                    
                     if (status.equals("success")) {
                        out.println("<script type=\"text/javascript\">");
   out.println("alert('Scholarship Uploaded Successfully...!!!');");
   out.println("location='scholarship.jsp';");
   out.println("</script>");
                  
                    } 
                     else {
                        // RequestDispatcher rd1 = request.getRequestDispatcher("failure.jsp" );
                       // rd1.forward(request, response);
                        out.println("<html>");
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<body bgcolor='lightgreen'>");
                    out.println("<font color='red' size='6'>");
                    out.println("Sorry you cant insert the scholarship detailes");
                      out.println("<h3> <a href='lsuccess.jsp'>BACK</a></h3>");  
                    out.println("</font></center></body></html)");

                    }}
                    
         else {
                     
                    out.println("<html>");
                         out.println("<center>");
                         out.println("<br><br>");
                     out.println("<body bgcolor='lightgreen'>");
                out.println("<font color='red' size='6'>");
                out.println(" you cant enter the scholarship details");
             
                out.println("</font></center></body></html)");
                }
        
        
        
        
        
        
            
        }     

          catch(Exception e)
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

    

