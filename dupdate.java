/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.dueupdate;
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
@WebServlet(name = "dupdate", urlPatterns = {"/dupdate"})
public class dupdate extends HttpServlet {

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
     
         dueupdate u = new  dueupdate();
        
        try  {
            if (request.getParameter("submit") != null) {
               String s_id = request.getParameter("s_id");
                 String fname = request.getParameter("fname");
                String lname = request.getParameter("lname");
                String classname = request.getParameter("classname");
                  String sec = request.getParameter("sec");
             String totalfee= request.getParameter("totalfee");
                 String amountpaid = request.getParameter("amountpaid");
                
                
            
            
            
        
                String status = u.dueupdate(s_id,totalfee,amountpaid);

                out.println("<html>");
                out.println("<body>");
                out.println("<br>");

                out.println("<br>");
                out.println("<h2>");
                if (status.equals("success")) {
                     out.println("<script type=\"text/javascript\">");
   out.println("alert('Due Updated Successfully...!!!');");
   out.println("location='dueedit.jsp';");
   out.println("</script>");

                } else {
                    out.println("student due updation failure <br>");
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
            throws ServletException, IOException {
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
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
