<%@page import="java.util.Iterator"%>
<%@page import="Model.faculty"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Model.fprofile"%>
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

.image_outer_container{
       	margin-top: auto;
       	margin-bottom: auto;
       	border-radius: 50%;
       	position: relative;
       }

/*       .image_inner_container{
       	border-radius: 50%;
       	padding: 5px;
        background: #833ab4; 
        background: -webkit-linear-gradient(to bottom, #fcb045, #fd1d1d, #833ab4); 
        background: linear-gradient(to bottom, #fcb045, #fd1d1d, #833ab4);
       }*/
       .image_inner_container img{
       	height: 60px;
       	width: 60px;
       	border-radius: 50%;
       	border: 5px solid white;
       }

       .image_outer_container .green_icon{
         background-color: #4cd137;
         position: absolute;
         right: 40px;
         bottom: 10px;
         height: 10px;
         width: 10px;
         border:1px solid white;
         border-radius: 50%;
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
<body><%if(session.getAttribute("facultyid")!=null){%>
<div class="bs-example">
    <nav class="navbar navbar-expand-md navbar-light bg-white fixed-top">
         &nbsp;&nbsp;&nbsp;<a href="#" class="navbar-brand"><img src="img/logo.jpeg" height="70"></a>
        <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarCollapse">
            <div class="navbar-nav">
               &nbsp;&nbsp; <a href="#" class="nav-item nav-link active"><i class="fa fa-fw fa-home"></i> Home</a>
            </div>
            <%
                    fprofile s1 = new fprofile(session);
                    ArrayList<faculty> ar = s1.getuserdata();

//                            ArrayList<User> mydata = (ArrayList) ar;
                    Iterator<faculty> itr = ar.iterator();
                    while (itr.hasNext()) {
                        faculty s = itr.next();%>
            
           
       
            <div class="navbar-nav ml-auto">
   
    <li class="nav-item dropdown">
      <a class="nav-link dropdown" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          <div class="d-flex justify-content-center h-100">
			<div class="image_outer_container">
				<div class="green_icon"></div>
				<div class="image_inner_container">
					<img src="images/<%=s.getf_img()%>">
				</div>
                        </div><div style="text-align: center;margin-top: 10px;">
                        <div class="nav-link dropdown-toggle "> <%= session.getAttribute("uname")%> <%= session.getAttribute("uname2")%></div>
                        </div></div>
      </a>
      <div class="dropdown-menu" aria-labelledby="navbarDropdown">
        <a class="dropdown-item" href="f_profile.jsp">View Profile</a>
        <a class="dropdown-item" href="logout?logout=logout">Logout</a>
      </div>
    </li>
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
<!--  <a href="#contact"><i class='far fa-question-circle'></i> FAQ's</a>-->
</div>
     
   <div class="container">
        
    <center>
       <div class="signup-form">
        <form action="dedit" method="POST">
            <h2> Upload Student Dues</h2>
            <div class="form-group">
                <input type="text" class="form-control" name="id" placeholder="Student ID" required>
            </DIV>
           <div class="form-group">
               <input type="submit" name="edit" class="btn btn-success btn-lg btn-block" value="Get" />
           </div>
        </form>
        </div>
    </center>


</div>
</div><br><br><br><br><br><br><br><br>
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
        </div></footer> 
     
<%}}else{%>
    <a href="login.jsp" class="nav-item nav-link"> please login</a> 
    <%}%>
    </body>
</html>