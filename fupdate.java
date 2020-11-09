package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import Model.fprofile;

@WebServlet(name = "fupdate", urlPatterns = {"/fupdate"})
public class fupdate extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        try         {
           
             if (request.getParameter("submit") != null) {
                 String f_id = request.getParameter("f_id");
                String first_name = request.getParameter("first_name");
                String last_name = request.getParameter("last_name");
                String f_img = request.getParameter("f_img");
                String f_pass = request.getParameter("f_pass");
                String f_phone = request.getParameter("f_phone");
                String f_email = request.getParameter("f_email");
//                String s_dob = request.getParameter("s_dob");
//                String s_std = request.getParameter("s_std");
                String f_subject = request.getParameter("f_subject");
                String f_qualification = request.getParameter("f_qualification");
                String f_experience = request.getParameter("f_experience");
                String f_address = request.getParameter("f_address");
                String f_about = request.getParameter("f_about");
                
                fprofile u = new  fprofile(session);
                 
                String status = u.update(f_id, first_name, last_name,f_img,f_pass,f_email,f_phone,f_subject,f_qualification,f_experience,f_address,f_about);
                out.println("<html>");
                out.println("<body>");
                out.println("<br>");

                out.println("<br>");
                out.println("<h2>");
                if (status.equals("success")) {
                    
                    out.println("<script type=\"text/javascript\">");
   out.println("alert('Profile Updated Successfully...!!!');");
   out.println("location='f_profile.jsp';");
   out.println("</script>");

                   // out.println("student updated successfully <br>");
                } else {
                    out.println("student updation failure <br>");
                }
                 out.println("<html>");
                out.println("<body>");
                out.println("<br>");
                   out.println("<center>");
                out.println("<h3> <a href='s_profile.jsp'>BACK</a></h3>");
                out.println("</center></body></html)");
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
