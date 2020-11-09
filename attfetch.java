/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Vinay B K
 */
public class attfetch {
    Connection con;
    Statement st;
    ResultSet rs;
    HttpSession se;
    public attfetch(HttpSession session) {
        try {
se=session;
            Class.forName("com.mysql.jdbc.Driver"); // load the drivers
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sms", "root", "root");
            // connection with data base
      } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<atdata> getat_details(String s_std,String s_sec) 
{
        ArrayList<atdata> al = new ArrayList<atdata>();
        try 
{
            st = con.createStatement();
           String qry="select  st.first_name,st.last_name,st.s_std,st.s_sec,at.* from  student_data st right join attendence at on st.s_id=at.s_id where st.s_sec='" + s_sec + "'and st.s_std='" + s_std + "'";
            rs = st.executeQuery(qry);
            while (rs.next())
 {
                atdata f = new atdata();
               // p.setId(rs.getString("studentid"));
                //p.setName(rs.getString("sname"));
                //p.setMarks(rs.getString("smarks"));
                 f.setfname(rs.getString(1));
                f.setlname(rs.getString(2));
                f.setclassname(rs.getString(3));
                f.setsec(rs.getString(4));
                f.sets_id(rs.getString(5));
                 f.setdate(rs.getString(6));
                
                  f.setclstaken(rs.getString(7));
                f.setclsattended(rs.getString(8));
                f.setpercentage(rs.getString(9));
             
                al.add(f);
            }

        } catch (Exception e) 
{
            e.printStackTrace();
        }
        return al;
    }
    
    
   public ArrayList<atdata> getat_details2() 
{
        ArrayList<atdata> al = new ArrayList<atdata>();
        try 
{
            st = con.createStatement();
           String qry="select  st.first_name,st.last_name,st.s_std,st.s_sec,at.* from  student_data st right join attendence at on st.s_id=at.s_id where st.s_id='" + se.getAttribute("studentid")+"'";
            rs = st.executeQuery(qry);
            while (rs.next())
 {
                atdata f = new atdata();
               // p.setId(rs.getString("studentid"));
                //p.setName(rs.getString("sname"));
                //p.setMarks(rs.getString("smarks"));
                 f.setfname(rs.getString(1));
                f.setlname(rs.getString(2));
                f.setclassname(rs.getString(3));
                f.setsec(rs.getString(4));
                f.sets_id(rs.getString(5));
                 f.setdate(rs.getString(6));
                
                  f.setclstaken(rs.getString(7));
                f.setclsattended(rs.getString(8));
                f.setpercentage(rs.getString(9));
             
                al.add(f);
            }

        } catch (Exception e) 
{
            e.printStackTrace();
        }
        return al;
    }
   
   public ArrayList<student> getat_details3(String s_std,String s_sec) 
{
        ArrayList<student> al = new ArrayList<student>();
        try 
{
          student s = null;
            st = con.createStatement();
           String qry="select * from  student_data where s_sec='" + s_sec + "'and s_std='" + s_std + "' order by s_id";
            rs = st.executeQuery(qry);
            while (rs.next())
 {
                s = new student();
                s.setfirst_name(rs.getString(2));
                s.setlast_name(rs.getString(3));
                s.sets_id(rs.getString(4));
                s.sets_pass(rs.getString(5));
                s.sets_email(rs.getString(6));  
                s.sets_img(rs.getString(7));
                s.sets_phone(rs.getString(8));
                s.setuser(rs.getString(9));
//                s.sets_dob(rs.getString(10));
                s.sets_std(rs.getString(11));
                s.sets_sec(rs.getString(12));
                s.setf_name(rs.getString(13));
                 s.setf_occupation(rs.getString(14));
                  s.setf_contact(rs.getString(15));
                   s.setm_name(rs.getString(16));
                    s.setm_occupation(rs.getString(17));
                 s.setm_contact(rs.getString(18));
             
                al.add(s);
            }

        } catch (Exception e) 
{
            e.printStackTrace();
        }
        return al;
    }
}
