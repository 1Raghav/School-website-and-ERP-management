/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.entryreport;
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
@WebServlet(name = "reportentry", urlPatterns = {"/reportentry"})
public class reportentry extends HttpServlet {

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
        entryreport reg = new entryreport();
        try  {
            /* TODO output your page here. You may use following sample code. */
            if(request.getParameter("submit") != null){
            
     
                String s_id = request.getParameter("s_id");
                 String s_name1 = request.getParameter("s_name1");
                String s_name2 = request.getParameter("s_name2");
                String classname = request.getParameter("classname");
                  String sec = request.getParameter("sec");
                   String ia = request.getParameter("ia");
                String kannada = request.getParameter("kan");
                  String english = request.getParameter("eng");
                    String hindi = request.getParameter("hindi");
                      String science = request.getParameter("sc");
                      String ss = request.getParameter("ss");
                      String maths = request.getParameter("math");
          
                 String status = reg.insertreport(s_id,s_name1,s_name2,classname,sec,ia,kannada,english,hindi,science,ss,maths);
        
        
         if (status.equals("success")) {
                        out.println("<script type=\"text/javascript\">");
   out.println("alert('IA Report Uploaded Successfully...!!!');");
   out.println("location='inputreport.jsp';");
   out.println("</script>");
                  
                    } 
                    else if (status.equals("failure")) {
                        // RequestDispatcher rd1 = request.getRequestDispatcher("failure.jsp" );
                       // rd1.forward(request, response);
                        out.println("<html>");
                    out.println("<center>");
                    out.println("<br><br>");
                    out.println("<body bgcolor='lightgreen'>");
                    out.println("<font color='red' size='6'>");
                    out.println("student does not exist");
                      out.println("<h3> <a href='fsuccess.jsp'>BACK</a></h3>");  
                    out.println("</font></center></body></html)");

                    }
                    
         else {
                     
                    out.println("<html>");
                         out.println("<center>");
                         out.println("<br><br>");
                     out.println("<body bgcolor='lightgreen'>");
                out.println("<font color='red' size='6'>");
                out.println(" you cant enter the report card");
             
                out.println("</font></center></body></html)");
                }
        
        
        
        
        
        
           }  
        }     
         catch (Exception e) {
            e.printStackTrace();
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
