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
@WebServlet(name = "scounselling", urlPatterns = {"/scounselling"})
public class scounselling extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session =request.getSession();
        attfetch s = new attfetch(session);
        try  {
             if(request.getParameter("report") != null){
           
 
                
                ArrayList<atdata> ar = s.getat_details2();
            request.setAttribute("myatArray", ar);
            RequestDispatcher dispatcher = request.getRequestDispatcher("scounselling.jsp");
            dispatcher.forward(request, response);
               
           
        }}
              catch(Exception e)
        {
            e.printStackTrace();
        }
            
    } @Override
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
    }// </editor    

}