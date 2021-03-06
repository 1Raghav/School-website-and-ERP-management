<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Gurukul</title>
<link rel="icon" href="images/logo.png">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
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


</style>
</head>
<body>
<div class="bs-example">
    <nav class="navbar navbar-expand-md navbar-light bg-white fixed-top">
     &nbsp;&nbsp;&nbsp; <a href="#" class="navbar-brand"><img src="img/logo.jpeg" height="70"></a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav">
                &nbsp; &nbsp; <a href="#" class="nav-item nav-link active"><i class="fa fa-fw fa-home"></i> Home</a>
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
    <!-- Demo Content -->    
    <div class="container">
                <div class="alert alert-success" role="alert">
  <h4 class="alert-heading"><% if (session.getAttribute("uname") != null) {%>  
      <center> <h1>Welcome to Admin Section</h1> </center>
                <%}%>
                <br>
               
  
                <hr><center>
                    <p class="mb-0">Gurukul Edu Hub.</p></center> </div><br><br>
                    
                    <div class="container"> 
        <div class="card-deck">
    <div class="card bg-white">
      <div class="card-body text-center">
          <a href="timetable.html">
              <img src="images/calendar.png" width="60px" height="60px"><br>TIME TABLE</a>
      </div><br>
    </div>
                       
    <div class="card bg-white">
      <div class="card-body text-center">
        <a href="asdata.jsp">
              <img src="images/exam.png" width="60px" height="60px"><br>STUDENT DATA</a>
      </div>
    </div>
            <div class="card bg-white">
      <div class="card-body text-center">
        <a href="afac?report=report">
              <img src="images/fac.png" width="65px" height="65px"><br>FACULTY DATA</a>
      </div>
    </div>
            <div class="card bg-white">
      <div class="card-body text-center">
        <a href="fenroll.jsp">
              <img src="images/report.png" width="60px" height="60px"><br>GENERATE FACULTY ID</a>
      </div>
    </div>
     
        </div><br><br><br><br><br>
                    </div></div>   </div>
            <footer>
    
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
    </body>
</html>

