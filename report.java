/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.rreport;
import Model.s_marks;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
@WebServlet(name = "report", urlPatterns = {"/report"})
public class report extends HttpServlet {

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
        s_marks s=new s_marks();
        try  {
            if(request.getParameter("report") != null){
            
 
                 String ia = request.getParameter("ia");
                String classname = request.getParameter("class");
                  String sec = request.getParameter("sec");
                ArrayList<rreport> ar = s.getstudent_marks(ia,classname,sec);
            request.setAttribute("stdreport", ar);
            RequestDispatcher dispatcher = request.getRequestDispatcher("studentreport.jsp");
            dispatcher.forward(request, response);
                
            
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
    }
    }

  
