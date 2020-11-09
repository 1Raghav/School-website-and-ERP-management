/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.due;
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
@WebServlet(name = "dueinput", urlPatterns = {"/dueinput"})
public class dueinput extends HttpServlet {

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
         due reg = new due();
        try  {
           if(request.getParameter("submit") != null){
            
     
                String s_id = request.getParameter("s_id");
             //    String classname = request.getParameter("class");
             //   String sec = request.getParameter("sec");
                    String status;
                    status = reg.dueinsert(s_id);
                    
                     if (status.equals("success")) {
                        RequestDispatcher rd1 = request.getRequestDispatcher("duedetailes.jsp" );
                        rd1.forward(request, response);
                  
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
                      out.println("<h3> <a href='lsuccess.jsp'>BACK</a></h3>");  
                    out.println("</font></center></body></html)");

                    }
                    
         else {
                     
                    out.println("<html>");
                         out.println("<center>");
                         out.println("<br><br>");
                     out.println("<body bgcolor='lightgreen'>");
                out.println("<font color='red' size='6'>");
                out.println(" you cant enter the due details");
             
                out.println("</font></center></body></html)");
                }
        
        
        
        
        
        
           }  
        }     

          catch(Exception e)
        {
            e.printStackTrace();
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

