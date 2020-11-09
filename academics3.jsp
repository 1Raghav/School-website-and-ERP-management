<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="Model.profile"%>
<%@page import="Model.student"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Gurukul</title>
<link rel="icon" href="images/logo.png">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
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
    }
    
    .sidenav {
  width: 160px;
  position: fixed;
  z-index: 1;
  top: 115px;
  left: 10px;
  background-color: #F7F9F9;
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
  background-color: darkslategrey;
  color: white;
}

.image_outer_container{
       	margin-top: auto;
       	margin-bottom: auto;
       	border-radius: 50%;
       	position: relative;
       }

       .image_inner_container{
       	border-radius: 50%;
       	padding: 5px;
        background: #833ab4; 
        background: -webkit-linear-gradient(to bottom, #fcb045, #fd1d1d, #833ab4); 
        background: linear-gradient(to bottom, #fcb045, #fd1d1d, #833ab4);
       }
       .image_inner_container img{
       	height: 200px;
       	width: 200px;
       	border-radius: 50%;
       	border: 5px solid white;
       }

       .image_outer_container .green_icon{
         background-color: #4cd137;
         position: absolute;
         right: 30px;
         bottom: 10px;
         height: 30px;
         width: 30px;
         border:5px solid white;
         border-radius: 50%;
       }
      
       
</style>
</head>
<body><%if(session.getAttribute("uname")!=null){%>
<div class="bs-example">
    <nav class="navbar navbar-expand-md navbar-light bg-light fixed-top">
        <a href="#" class="navbar-brand"><img src="images/logo.png" height="70"></a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav">
                <a href="asuccess.jsp" class="nav-item nav-link active"><i class="fa fa-fw fa-home"></i> Home</a>
            </div>
            
            
            <div class="navbar-nav ml-auto">
                <a href="logout?logout=logout" class="nav-item nav-link"><i class="fa fa-fw fa-user"></i>Logout</a>
            </div>
        </div>
    </nav>
    <br>
    
    <div  class="sidenav">
  
  <a href="#services"><i class='far fa-building'></i> Academics</a>
  <a href="#services"><i class="fa fa-calendar"></i> Events</a>
  <a href="#clients"><i class='fas fa-chalkboard-teacher'></i> Admissions</a>
  <a href="#contact"><i class='far fa-bell'></i> Newsletter</a>
<!--  <a href="#contact"><i class='far fa-edit'></i> </a>-->
<!--  <a href="#contact"><i class='far fa-clipboard'></i> Dues</a>-->
  <a href="#contact"><i class='far fa-question-circle'></i> FAQ's</a>
</div>
     
   <div class="container"> 
        <div class="card-deck">
    <div class="card bg-light">
      <div class="card-body text-center">
          <a href="timetable.html">
              <img src="images/calendar.png" width="60px" height="60px"><br>TIME TABLE</a>
      </div>
    </div>
                       
    <div class="card bg-light">
      <div class="card-body text-center">
        <a href="inputreport.jsp">
              <img src="images/exam.png" width="60px" height="60px"><br>STUDENT DATA</a>
      </div>
    </div>
            <div class="card bg-light">
      <div class="card-body text-center">
        <a href="freport.jsp">
              <img src="images/fac.png" width="65px" height="65px"><br>FACULTY DATA</a>
      </div>
    </div>
            <div class="card bg-light">
      <div class="card-body text-center">
        <a href="fenroll.jsp">
              <img src="images/report.png" width="60px" height="60px"><br>GENERATE FACULTY ID</a>
      </div>
    </div>
     
  </div>

        

   

       <br><br><br>
     <footer>
    
    <div class="container-fluid">
    <div class="row">
        <div class="col" style="background-color:darkslategrey;"><h3>BE - PROGRAMS</h3>
Computer Science & Engg
<br>Information Science & Engg
<br>Electronics & Communication Engg
<br>Civil Engg
<br>Mechanical Engg
Biotechnology</div>
        <div class="col" style="background-color:darkslategrey;"><h3>NEWS LETTER</h3>
Get latest update, news & academic offers
<br>
<br>
<form action="" method="post">
<input type="email" class="form-control" name="email" placeholder="Enter Your E-mail">
<br>
<input type="submit" class="btn btn-primary" name="submit" >
</form>
     </div>
    <div class="col" style="background-color:darkslategrey;"><h3>CONTACT</h3>
P.O. Box 4, PB Road, Davangere, Karnataka, India
<br>Phone: (+91 8192) - 233377
<br>Website: gmit.ac.in
Email: info@gmit.ac.in</div>
  </div>
</div> </footer> 
  </div>
  </div>   
<%}else{%>
    <a href="login.jsp" class="nav-item nav-link"> please login</a> 
    <%}%>
    </body>
</html>

