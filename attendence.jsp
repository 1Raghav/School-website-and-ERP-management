<%-- 
    Document   : freport
    Created on : 1 Sep, 2020, 11:55:18 AM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><center>
         <form method="POST" id="freport" action="atdinput">
            <font size="4">
            <h2> attendence detailes</h2>
            </font>
            <div>
                <table>
                    <br><br>
                   <tr>
                        <td> Student ID </td>
                        <td> <input type="text" name="s_id"/></td>
                    </tr>
                     <br><br>
                  <!--  <tr>
                        <td> class </td>
                        <td> <input type="text" name="class"/></td>
                    </tr>
                    
                    <tr>
                        <td> sec </td>
                        <td> <input type="txt" name="sec"/></td>
                    </tr>-->
                </table>
                <div style="text-align: center;margin-left: 70px;margin-top: 10px;">
                    <input type="submit" name="submit" class="button" value="submit"/>
                </div>
                
            </div>
            
           
         </form>
    </center>
    </body>
</html>

