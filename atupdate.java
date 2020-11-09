/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.d_at;
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
@WebServlet(name = "atupdate", urlPatterns = {"/atupdate"})
public class atupdate extends HttpServlet {

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
     
         d_at u = new  d_at();
        try  {
            
             if (request.getParameter("submit") != null) {
               String s_id = request.getParameter("s_id");
                 String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String classname = request.getParameter("classname");
                  String sec = request.getParameter("sec");
                   String date = request.getParameter("date");
             String clstaken= request.getParameter("clstaken");
                 String clsattended = request.getParameter("clsattended");
                
                
            
            
            
        
                String status = u.attupdate(s_id,date,clstaken,clsattended);

                out.println("<html>");
                out.println("<body>");
                out.println("<br>");

                out.println("<br>");
                out.println("<h2>");
                if (status.equals("success")) {
                      out.println("<script type=\"text/javascript\">");
   out.println("alert('Attendance Uploaded Successfully...!!!');");
   out.println("location='atedit.jsp';");
   out.println("</script>");

                } else {
                    out.println("student attendence updation failure <br>");
                }
                 out.println("<html>");
                out.println("<body>");
                out.println("<br>");
                   out.println("<center>");
                out.println("<h3> <a href='edit.html'>BACK</a></h3>");
                out.println("</center></body></html)");
            }
           
        }
        
        catch(Exception e)
        {
            
        }
        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    }

 
