/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.atdata;
import Model.attfetch;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vinay B K
 */
@WebServlet(name = "atfetch", urlPatterns = {"/atfetch"})
public class atfetch extends HttpServlet {

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
        HttpSession session =request.getSession();
        
        try {
            
              attfetch s = new attfetch(session);
            
           String s_std = (request.getParameter("classname"));
             String s_sec = (request.getParameter("sec"));
             
               ArrayList<atdata> ar = s.getat_details(s_std,s_sec);
            request.setAttribute("myatArray", ar);
            RequestDispatcher dispatcher = request.getRequestDispatcher("atrecord.jsp");
            dispatcher.forward(request, response);
   
           
        }
        catch (Exception e) 
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

  
