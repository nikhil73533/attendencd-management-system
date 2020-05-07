/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author nikhil
 */
class adstd {
    String group(String[] group){
        
         StringBuffer sb = new StringBuffer();
      for(int i = 0; i < group.length; i++) {
         sb.append(group[i]+" ");
      }
      String str = sb.toString();
        return str ;
   }
    
    
   
     public void adstudent(String Name,String rollnumber,String org) throws SQLException{
        
     String query =   "INSERT INTO ROOT.STUDENTS (NAME,ROLLNUMBER,ORGNAZATION) VALUES (?,?,?)";
             java.sql.Connection con  = java.sql.DriverManager.getConnection("jdbc:derby://localhost:1527/student","Root","root");
            PreparedStatement stmt  = con.prepareStatement(query);
           
           stmt.setString(1,Name);
           stmt.setString(2,rollnumber);
           stmt.setString(3, org);
         
            if(stmt.executeUpdate()>0){
                    JOptionPane.showMessageDialog(null,"welcome");
                
            }
            else{
                    
            }
           
            
  }
}
