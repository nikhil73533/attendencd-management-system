/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;
import java.sql.*;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author nikhil
 */

public class Testapplication {
codepanal obj = new codepanal();
    /**
     * @param args the command line arguments
     */
 public static String[] addX(int n, String arr[], String x) 
    { 
        int i; 
  
        // create a new array of size n+1 
        String newarr[] = new String[n + 1]; 
  
        // insert the elements from 
        // the old array into the new array 
        // insert all elements till n 
        // then insert x at n+1 
        for (i = 0; i < n; i++) 
            newarr[i] = arr[i]; 
  
        newarr[n] = x; 
  
        return newarr; 
    } 
    
    public static void main(String[] args) {
        
           
           String arr[] = {"0"};
        arr = addX(1,arr,"Hlo");
        System.out.println(arr);
        
    }
    
}
