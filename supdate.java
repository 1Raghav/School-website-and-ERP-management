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
import Model.profile;


@WebServlet(name = "supdate", urlPatterns = {"/supdate"})
public class supdate extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        try         {
           
             if (request.getParameter("submit") != null) {
                 String s_id = request.getParameter("s_id");
                String first_name = request.getParameter("first_name");
                String last_name = request.getParameter("last_name");
                String s_img = request.getParameter("s_img");
                String s_pass = request.getParameter("s_pass");
                String s_phone = request.getParameter("s_phone");
                String s_email = request.getParameter("s_email");
//                String s_dob = request.getParameter("s_dob");
                String s_std = request.getParameter("s_std");
                String s_sec = request.getParameter("s_sec");
                String f_name = request.getParameter("f_name");
                String f_occupation = request.getParameter("f_occupation");
                String f_contact = request.getParameter("f_contact");
                String m_name = request.getParameter("m_name");
                String m_occupation = request.getParameter("m_occupation");
                String m_contact = request.getParameter("m_contact");
//                
                profile u = new  profile(session);
                 
                String status = u.update(s_id, first_name, last_name,s_img,s_pass,s_email,s_phone,s_std,s_sec,f_name,f_occupation,f_contact,m_name,m_occupation,m_contact);
                out.println("<html>");
                out.println("<body>");
                out.println("<br>");

                out.println("<br>");
                out.println("<h2>");
                if (status.equals("success")) {
                    
                    out.println("<script type=\"text/javascript\">");
   out.println("alert('Profile Updated Successfully...!!!');");
   out.println("location='s_profile.jsp';");
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
