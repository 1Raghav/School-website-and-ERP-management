
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Model.Registration;

@WebServlet(name = "form", urlPatterns = {"/form"})
public class form extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
         
            Registration reg=new Registration();
              String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
          String gender = request.getParameter("gender");  
         // String gender = "male";
           
            String dob = request.getParameter("dob");
            String religion = request.getParameter("religion");
            String cast = request.getParameter("cast");
            String nationality = request.getParameter("nationality");
            String address = request.getParameter("address");
           String preclass = request.getParameter("preclass");
           //  String preclass = "9";
            String preper = request.getParameter("preper");
            String preschool = request.getParameter("preschool");
            String fathername = request.getParameter("fathername");
            String fatheroccuption= request.getParameter("fatheroccuption");
            String fatherphno = request.getParameter("fatherphno");
            String fatheremail = request.getParameter("fatheremail");
            String mothername = request.getParameter("mothername");
            String motheroccuption= request.getParameter("motheroccuption");
            String motherphno = request.getParameter("motherphno");
            String motheremail = request.getParameter("motheremail");
                
             String status = reg.addform(fname,lname,gender,dob,religion,cast,nationality,address,preclass,preper,preschool,fathername,fatheroccuption,fatherphno,fatheremail,mothername,motheroccuption,motherphno,motheremail);
            
            
                    if (status.equals("existed"))
                    {
                        out.println("<script type=\"text/javascript\">");
   out.println("alert('Admission form Already Existed...!!!');");
   out.println("location='admission.html';");
   out.println("</script>");
                  
                    } else if (status.equals("success"))
                    {
                         out.println("<script type=\"text/javascript\">");
   out.println("alert('Admission form submitted Successfully...!!!');");
   out.println("location='admission.html';");
   out.println("</script>");
                    } else if (status.equals("failure"))
                    {
                         RequestDispatcher rd1 = request.getRequestDispatcher("signup.html" );
                        rd1.forward(request, response);
                    }
                    
                
            else {
                     
                    out.println("<html>");
                         out.println("<center>");
                         out.println("<br><br>");
                     out.println("<body bgcolor='lightgreen'>");
                out.println("<font color='red' size='6'>");
                out.println(" password does not match");
             
                out.println("</font></center></body></html)");
                    
  }}
        
         catch (Exception e) {
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
