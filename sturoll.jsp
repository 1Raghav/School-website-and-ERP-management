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
        padding-top: 50px;
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
.form-control {
	height: 40px;
	box-shadow: none;
	border-color: #ddd;
}
.form-control:focus {
	border-color: #4aba70;
}
.form-control, .btn {        
	border-radius: 3px;
}
.signup-form {
	width: 450px;
	margin: 0 auto;
	padding: 30px 0;
  	font-size: 15px;
}
.signup-form h2 {
	color: #636363;
	margin: 0 0 15px;
	position: relative;
	text-align: center;
}
.signup-form h2:before, .signup-form h2:after {
	color: #434343;
	border-radius: 1px;
	margin-bottom: 15px;
	background: #fff;
	border: 1px solid #f3f3f3;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}	
.signup-form h2:before {
	left: 0;
}
.signup-form h2:after {
	right: 0;
}
.signup-form .hint-text {
	color: #999;
	margin-bottom: 30px;
	text-align: center;
}
.signup-form form {
	color: #434343;
	border-radius: 1px;
	margin-bottom: 15px;
	background: #fff;
	border: 1px solid #f3f3f3;
	box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
	padding: 30px;
}
.signup-form .form-group {
	margin-bottom: 20px;
}
.signup-form input[type="checkbox"] {
	margin-top: 3px;
}
.signup-form .btn {        
	background: #4aba70 !important;
	border: none;
	line-height: normal;
}
.signup-form .row div:first-child {
	padding-right: 10px;
}
.signup-form .row div:last-child {
	padding-left: 10px;
}    	
.signup-form a {
	color: #fff;
	text-decoration: underline;
}
.signup-form a:hover {
	text-decoration: none;
}
.signup-form form a {
	color: #5cb85c;
	text-decoration: none;
}	
.signup-form form a:hover {
	text-decoration: underline;
}


</style>
</head>
<body>
<div class="bs-example">
    <nav class="navbar navbar-expand-md navbar-light bg-white fixed-top">
        &nbsp;&nbsp;&nbsp;<a href="#" class="navbar-brand"><img src="img/logo.jpeg" height="70"></a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav">
                &nbsp;&nbsp;&nbsp;<a href="asuccess.jsp" class="nav-item nav-link active"><i class="fa fa-fw fa-home"></i> Home</a>
            </div>
            
            <div class="navbar-nav ml-auto">
                <a href="logout?logout=logout" class="nav-item nav-link"><i class="fa fa-fw fa-user"></i>Logout</a>
            </div>
        </div>
    </nav>
    <br>
    
    <div  class="sidenav">
  
  <a href="academics2.jsp"><i class='far fa-calendar-alt'></i> Academics</a>
    <a href="counselling.jsp"><i class='fas fa-chalkboard-teacher'></i> Counselling</a>
  <a href="#contact"><i class='far fa-bell'></i> Feedback</a>
  <a href="scholarship.jsp"><i class='far fa-edit'></i> Scholarship</a>
  <a href="dues.jsp"><i class='far fa-clipboard'></i> Dues</a>
</div>
    <!-- Demo Content -->    
    <div class="container">
           <div class="signup-form">
         <form method="POST" action="Sturoll">
            <font size="4">
            <h2>Generate Faculty Id</h2>
            </font>
            
                
                   
                    
                    
                       
                      
            <div class="form-group">
                      
                       <input type="text" class="form-control" name="f_id" placeholder="STUDENT ID">
                        </div>
               <div class="form-group">
                
                    <input type="submit" name="submit" class="btn btn-success btn-lg btn-block" value="Generate Id">
                </div>
                
            
            
           
                        </form></div>   
     
        <br><br></div><br><br><br><br><br><br>
                    
          </div>  <footer>
    
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

