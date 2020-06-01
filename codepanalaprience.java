/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nikhil
 */
public class codepanalaprience {
    
    
   public String nik(String rollnumber) throws SQLException{
   
    
             String query  = "SELECT * FROM ROOT.STUDENTS WHERE  ROLLNUMBER = ?";
             java.sql.Connection con  = java.sql.DriverManager.getConnection("jdbc:derby://localhost:1527/student","Root","root");
          
            PreparedStatement stmt  = con.prepareStatement(query);
            ResultSet rs;
            stmt.setString(1, rollnumber);
         
          rs = stmt.executeQuery();
          String groups = rs.getString("GROUPS");
          return groups;
       }
   
   }
   
 