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
    public static void main(String []args){
 
    
     
}
