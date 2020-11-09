/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.due_data;
import Model.duee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Vinay B K
 */
@WebServlet(name = "dedit", urlPatterns = {"/dedit"})
public class dedit extends HttpServlet {

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
        duee reg = new duee();
        try {

            String s_id = request.getParameter("id");

            due_data s = reg.getd_due(s_id);
            if (s == null) {

                out.println("<html>");
                out.println("<body>");
                out.println("<br>");
                out.println("<font color='red' size='6'>");
                out.println("student Not Existed");
                out.println("</font>");
                out.println("<br>");
                out.println("<h3> <a href='edit.html'>back</a></h3>");
                out.println("</body></html)");

            } else {
                out.println("<html>");
                out.println("<body bgcolor='white'>");
                out.println("<br>");
                out.println("<link rel=\"icon\" href=\"images/logo.png\">\n"
                        + "<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\">\n"
                        + "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n"
                        + "<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n"
                        + "<script src='https://kit.fontawesome.com/a076d05399.js'></script>\n"
                        + "<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\n"
                        + "<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"></script>\n"
                        + "<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"></script>\n"
                        + " <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n"
                        + " <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n"
                        + "<style>\n"
                        + "    .bs-example{\n"
                        + "        margin: 20px;\n"
                        + "    }\n"
                        + "    body{\n"
                        + "        padding-top: 20px;"
                        + "background-color:#F9F8F6;\n"
                        + "    }\n"
                        + "    \n"
                        + "    .sidenav {\n"
                        + "  width: 160px;\n"
                        + "  position: fixed;\n"
                        + "  z-index: 1;\n"
                        + "  top: 115px;\n"
                        + "  left: 10px;\n"
                        + "  background-color: white;\n"
                        + "  overflow-x: hidden;\n"
                        + "  padding: 8px 0;\n"
                        + "}\n"
                        + "\n"
                        + ".sidenav a {\n"
                        + "  padding: 6px 8px 6px 16px;\n"
                        + "  text-decoration: none;\n"
                        + "  font-size: 16px;\n"
                        + "  color: grey;\n"
                        + "  display: block;\n"
                        + "}\n"
                        + "\n"
                        + ".sidenav a:hover {\n"
                        + "  color: black;\n"
                        + "}\n"
                        + "\n"
                        + "footer {\n" +
"   \n" +
"  text-align: center;\n" +
"  padding: 30px;\n" +
"  background-color: #313130;\n" +
"  color: white;\n" +
"}\n" +
"footer a{\n" +
"    color: #FFC300 ;\n" +
"}\n"
                        + "\n"
                        + "\n"
                        + ".form-control {\n"
                        + "	height: 40px;\n"
                        + "box-shadow: none;\n"
                        + "border-color: #ddd;\n"
                        + "}\n"
                        + ".form-control:focus {\n"
                        + "	border-color: #4aba70;\n"
                        + "}\n"
                        + ".form-control, .btn {      \n"
                        + "	border-radius: 3px;\n"
                        + "}\n"
                        + ".signup-form {\n"
                        + "	width: 400px;\n"
                        + "	margin: 0 auto;\n"
                        + "	padding: 30px 0;\n"
                        + "  	font-size: 15px;\n"
                        + "}\n"
                        + ".signup-form h2 {\n"
                        + "	color: #636363;\n"
                        + "	margin: 0 0 15px;\n"
                        + "	position: relative;\n"
                        + "	text-align: center;\n"
                        + "}\n"
                        + ".signup-form h2:before, .signup-form h2:after {\n"
                        + "	color: #434343;\n"
                        + "	border-radius: 1px\n"
                        + "	margin-bottom: 15px;\n"
                        + "	background: #fff;\n"
                        + "	border: 1px solid #f3f3f3;\n"
                        + "	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n"
                        + "	padding: 60px;\n"
                        + "}	\n"
                        + ".signup-form h2:before {\n"
                        + "	left: 0;\n"
                        + "}\n"
                        + ".signup-form h2:after {\n"
                        + "	right: 0;\n"
                        + "}\n"
                        + ".signup-form .hint-text {\n"
                        + "	color: #999;\n"
                        + "	margin-bottom: 30px;\n"
                        + "	text-align: center;\n"
                        + "}\n"
                        + ".signup-form form {\n"
                        + "	color: #434343;\n"
                        + "	border-radius: 1px;\n"
                        + "	margin-bottom: 20px;\n"
                        + "	background: #fff;\n"
                        + "	border: 1px solid #f3f3f3;\n"
                        + "	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);\n"
                        + "	padding: 30px;\n"
                        + "}\n"
                        + ".signup-form .form-group {\n"
                        + "	margin-bottom: 20px;\n"
                        + "}\n"
                        + ".signup-form input[type='checkbox'] {\n"
                        + "	margin-top: 3px;\n"
                        + "}\n"
                        + ".signup-form .btn {        \n"
                        + "	background: #4aba70 !important;\n"
                        + "	border: none;\n"
                        + "	line-height: normal;\n"
                        + "}\n"
                        + ".signup-form .row div:first-child {\n"
                        + "	padding-right: 10px;\n"
                        + "}\n"
                        + ".signup-form .row div:last-child {\n"
                        + "	padding-left: 10px;\n"
                        + "} \n"
                        + ".signup-form a {\n"
                        + "	color: #fff;\n"
                        + "	text-decoration: underline;\n"
                        + "}\n"
                        + ".signup-form a:hover {\n"
                        + "	text-decoration: none;\n"
                        + "}\n"
                        + ".signup-form form a {\n"
                        + "	color: #5cb85c;\n"
                        + "	text-decoration: none;\n"
                        + "}	\n"
                        + ".signup-form form a:hover {\n"
                        + "	text-decoration: underline;\n"
                        + "}\n"
                        + "</style>\n"
                        + "</head>\n"
                        + "<body>\n"
                        + "<div class=\"bs-example\">\n"
                        + "    <nav class=\"navbar navbar-expand-md navbar-light bg-white fixed-top\">\n"
                        + "        &nbsp;&nbsp;&nbsp;<a href=\"#\" class=\"navbar-brand\"><img src=\"img/logo.jpeg\" height=\"70\"></a>\n"
                        + "        <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n"
                        + "            <span class=\"navbar-toggler-icon\"></span>\n"
                        + "        </button>\n"
                        + "\n"
                        + "        <div class=\"collapse navbar-collapse\" id=\"navbarCollapse\">\n"
                        + "            <div class=\"navbar-nav\">\n"
                        + "                &nbsp;&nbsp;<a href=\"fsuccess.jsp\" class=\"nav-item nav-link active\"><i class=\"fa fa-fw fa-home\"></i> Home</a>\n"
                        + "            </div>\n"
//                        + "            <div class=\"navbar-nav\">\n"
//                        + "                <a href=\"f_profile.jsp\" class=\"nav-item nav-link\"><i class=\"fa fa-fw fa-user\"></i> My Profile</a>\n"
//                        + "            </div>\n"
                        + "            \n"
                        + "            <div class=\"navbar-nav ml-auto\">\n"
                        + "                <a href=\"login.jsp\" class=\"nav-item nav-link\"><i class=\"fa fa-fw fa-user\"></i>Logout</a>\n"
                        + "            </div>\n"
                        + "        </div>\n"
                        + "    </nav>\n"
                        + "    <br>\n"
                        + "    \n"
                        + "    <div  class=\"sidenav\">\n"
                        + "   <a href=\"academics2.jsp\"><i class='far fa-calendar-alt'></i> Academics</a>\n" +
"    <a href=\"counselling.jsp\"><i class='fas fa-chalkboard-teacher'></i> Counselling</a>\n" +
"  <a href=\"#contact\"><i class='far fa-bell'></i> Feedback</a>\n" +
"  <a href=\"scholarship.jsp\"><i class='far fa-edit'></i> Scholarship</a>\n" +
"  <a href=\"dues.jsp\"><i class='far fa-clipboard'></i> Dues</a>\n"
                        + "<!--  <a href=\"#contact\"><i class='far fa-question-circle'></i> FAQ's</a>-->\n"
                        + "</div>\n"
                        + "    <!-- Demo Content -->    \n"
                        + "    <div class=\"container\">");
                out.println("<center>");
                out.println("<div class=\"signup-form\">");

                out.println("<form action='dupdate' method='POST'>");
                out.println("<h2>Student Due Edit Form</h2>");
                out.println("<table>");
                out.println(" <div class=\"form-group\">");
                out.println("<tr><td>Student Id</td> <td>" + s_id + "</td></tr>");
                out.println("<input type='hidden' class='form-control' name='s_id' value='" + s_id + "'/> ");
                out.println("</div>");
                out.println(" <div class=\"form-group\">");
                out.println("<tr><td>First Name</td> <td>" + s.getfname() + "</td></tr>");
                out.println("<input type='hidden' class='form-control' name='s_name1' value='" + s.getfname() + "'/> ");
                out.println("</div>");
                out.println(" <div class=\"form-group\">");
                out.println("<tr><td>Last Name</td> <td>" + s.getlname() + "</td></tr>");
                out.println("<input type='hidden' class='form-control' name='s_name2' value='" + s.getlname() + "'/> ");
                out.println("</div>");
                out.println(" <div class=\"form-group\">");
                out.println("<tr><td>Class</td> <td>" + s.getclassname() + "</td></tr>");
                out.println("<input type='hidden' class='form-control' name='classname' value='" + s.getclassname() + "'/> ");
                out.println("</div>");
                out.println(" <div class=\"form-group\">");
                out.println("<tr><td>Sec</td> <td>" + s.getsec() + "</td></tr>");
                out.println("<input type='hidden' class='form-control' name='sec' value='" + s.getsec() + "'/> ");
                out.println("</div>");
                out.println(" <div class=\"form-group\">");
                out.println("<tr><td>Total Fee</td> <td><input type='text' class='form-control' name='totalfee' value='" + s.gettotalfee() + "' </td></tr>");
                out.println("</div>");
                out.println(" <div class=\"form-group\">");
                out.println("<tr><td>Amount paid</td> <td><input type='text' class='form-control' name='amountpaid' value='" + s.getamountpaid() + "' </td></tr>");
               out.println("</div>");
                out.println(" <div class=\"form-group\">");
//                out.println("<tr><td>Balance</td> <td>" +s.getfeebalance()+ "</td></tr>");
                out.println("<tr><td>Balance</td> <td><input type='text' class='form-control' name='feebalance' value='" + s.getfeebalance() + "' disabled></td></tr>");
out.println("</div></table>");
                out.println(" <div class=\"form-group\">");
                out.println(" <br><td> <input type='submit' class='btn btn-info btn-lg btn-block' name='submit' value='Update'/></td>");
                out.println("</form></div></div></center></div></div><footer>\n" +
" <div class=\"probootstrap-copyright\">\n" +
"          <div class=\"container\">\n" +
"            <div class=\"row\">\n" +
"              <div class=\"col-md-8 text-left\">\n" +
"                <p>&copy; 2020 <a href=\"#\">NVRHSV:Gurukul</a>. All Rights Reserved. Designed &amp; Developed with <i class=\"icon icon-heart\"></i> by <a href=\"#\">NVRHSV</a></p>\n" +
"              </div>\n" +
"              <div class=\"col-md-4 probootstrap-back-to-top\">\n" +
"                <p><a href=\"#\" class=\"js-backtotop\">Back to top <i class=\"icon-arrow-long-up\"></i></a></p>\n" +
"              </div>\n" +
"            </div>\n" +
"          </div>\n" +
"        </div></footer></body></html>");
            }
        } catch (Exception e) {
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
