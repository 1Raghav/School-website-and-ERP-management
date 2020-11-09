/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Vinay B K
 */
public class Atdinsert {
    
    Connection con;
    Statement st;
    ResultSet rs;
    
    public Atdinsert() {
        try {

            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
            // connection with data base
      } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public String atdinsert(String s_id)
    {
        PreparedStatement ps;
        String status = "";
           Statement st = null;
        ResultSet rs = null;
        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from student_data where s_id='" + s_id + "';");
            boolean b = rs.next();
            System.out.println("printat"+b);
            if (b) {
              
                ps = (PreparedStatement) con.prepareStatement("insert into attendence values(?,'','','','')");
                ps.setString(1, s_id);
               
                
                int a = ps.executeUpdate();
                if (a > 0) {
                    status = "success";
                } else {
                    status = "failure";
                }
            }else{
            
             status = "failure";
            
            
            
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        
              System.out.println("print"+status);

        return status;
       
    }

}
