/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nikhil
 */
public class testclass {
    private String ew;
    ;
  public String adminuser(String query,String column) throws SQLException{
      String sr = "";
     
             java.sql.Connection con  = java.sql.DriverManager.getConnection("jdbc:derby://localhost:1527/student","Root","root");
             Statement stmt = con.createStatement();
                ResultSet rs;
           
       this.ew = ew ;
            rs  = stmt.executeQuery(query);
            if(rs.next()){
                    
                    sr = rs.getString(column);
              
                      return sr;
            }
           
            
  }
  void check() throws SQLException{
  
   String query  = "SELECT * FROM ROOT.STUDENTS";
             java.sql.Connection con  = java.sql.DriverManager.getConnection("jdbc:derby://localhost:1527/student","Root","root");
            PreparedStatement stmt  = con.prepareStatement(query);
            java.sql.ResultSet rs;
            rs = stmt.executeQuery();
            rs.next();
            
            String col = rs.getString("GROUPS");
            String roll = rs.getString(2);
            System.out.println("roll"+roll);
            
           System.out.println("col"+col);
           if(roll=="2019btechcse033"){
                String NAME = rs.getString("NAME");
                
                System.out.println("name"+NAME);
           }
  
  
  }
    public static void main(String []args) throws SQLException{
       testclass tt = new testclass();
       tt.check();
        
        
}}
