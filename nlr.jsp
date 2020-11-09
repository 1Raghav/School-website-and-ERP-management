



<%@page import="Model.nldata"%>
<%@page import="Model.faculty"%>
<%@page import="Model.student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.due_data"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Gurukul</title>
        <link rel="icon" href="images/logo.png">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src='https://kit.fontawesome.com/a076d05399.js'></script>
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
        <style>
            .bs-example{
                margin: 20px;
            }
            body{
        padding-top: 70px;
        background-color:#F9F8F6;
    }

            .sidenav {
                width: 160px;
                position: fixed;
                z-index: 1;
                top: 115px;
                left: 10px;
                background-color: white;
                overflow-x: hidden;
                padding: 8px 0;
            }

            .sidenav a {
                padding: 6px 8px 6px 16px;
                text-decoration: none;
                font-size: 16px;
                color: grey;
                display: block;
            }

            .sidenav a:hover {
                color: black;
            }

            footer {
   
  text-align: center;
  padding: 30px;
  background-color: #313130;
  color: white;
}
footer a{
    color: #FFC300 ;
}
            #customers {
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            #customers td, #customers th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            #customers tr:nth-child(even){background-color: #f2f2f2;}

            #customers tr:hover {background-color: #ddd;}

        </style>
    </head>
    <body><%if (session.getAttribute("uname") != null) {%>
        <div class="bs-example">
            <nav class="navbar navbar-expand-md navbar-light bg-white fixed-top">
                &nbsp;&nbsp;&nbsp;<a href="#" class="navbar-brand"><img src="img/logo.jpeg" height="70"></a>
                <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav">
                        &nbsp; &nbsp; <a href="asuccess.jsp" class="nav-item nav-link active"><i class="fa fa-fw fa-home"></i> Home</a>
                    </div>
                    

                    <div class="navbar-nav ml-auto">
                        <a href="logout?logout=logout" class="nav-item nav-link"><i class="fa fa-fw fa-user"></i>Logout</a>
                    </div>
                </div>
            </nav>
            <br>

            <div  class="sidenav">
                 <a href="#services"><i class="fa fa-calendar"></i> Events</a>
  <a href="adm?report=report"><i class='fas fa-chalkboard-teacher'></i> Admissions</a>
  <a href="nl?news=news"><i class='far fa-bell'></i> Newsletter</a>
<!--  <a href="#contact"><i class='far fa-edit'></i> </a>-->
<!--  <a href="#contact"><i class='far fa-clipboard'></i> Dues</a>-->
  <a href="#contact"><i class='far fa-question-circle'></i> FAQ's</a>
                <!--  <a href="#contact"><i class='far fa-question-circle'></i> FAQ's</a>-->
            </div>
            <div class="container">
                <h1 style="text-align: center">-: <u>News Letter Emails Data</u> :-</h1>
                <br>
                <table border="4" cellspacing="15" align="center" id="customers">
                    <tr>  
                        <TH bgcolor="#6CBFE8" ><center>Sl no</center></TH>
                <TH bgcolor="#6CBFE8" ><center>Email</center></TH>
<TH bgcolor="#6CBFE8" ><center>Date & Time</center></TH>
                        



                    </tr>  

                    <% ArrayList<nldata> mydata = (ArrayList) request.getAttribute("myatArray");
                        Iterator<nldata> itr = mydata.iterator();
                        while (itr.hasNext()) {
                            nldata s = itr.next();%> 
                    <tr>
                        <td align="center" width="15%"><%=s.getid()%></td>  
                        <td align="center" width="15%"><%=s.getemail()%></td> 
                        <td align="center" width="10%"><%=s.getdate()%></td> 
                       



                    </tr>
                    <%}%> 


                </table> </div>  
            <br><br><br> 
            <br><br> <br><br> <br><br>
           </div><br><br><br><br><br><br><br> <footer>

                 <div class="probootstrap-copyright">
          <div class="container">
            <div class="row">
              <div class="col-md-8 text-left">
                <p>&copy; 2020 <a href="#">NVRHSV:Gurukul</a>. All Rights Reserved. Designed &amp; Developed with <i class="icon icon-heart"></i> by <a href="#">NVRHSV</a></p>
              </div>
              <div class="col-md-4 probootstrap-back-to-top">
                <p><a href="#" class="js-backtotop">Back to top <i class="icon-arrow-long-up"></i></a></p>
              </div>
            </div>
          </div>
        </div> 

    </footer>
    <%} else {%>
    <a href="login.jsp" class="nav-item nav-link"> please login</a> 
    <%}%> </body>
</html>
