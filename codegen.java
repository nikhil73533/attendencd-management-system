/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;
import java.util.Random;

/**
 *
 * @author nikhil
 */
public class codegen {
    int code(){
   Random rad = new Random();
    int arr[] = new int[7];
   arr[0] = rad.nextInt(10);
   arr[1] = rad.nextInt(10);
   arr[2] = rad.nextInt(10);
   arr[3]= rad.nextInt(10);
    arr[4] = rad.nextInt(10);
    arr[5] = rad.nextInt(10);
    arr[6 ] = 0;
    
     int count = 0;
     int rem = 0;
     for(int i = 0; i<=5;i++){
         rem = arr[i+1];
          count = count*10+rem;
    
          
     
     }
      return count;
     
    }
     public static void main(String[]args){
     codegen obj = new codegen();
    int a =  obj.code();
         System.out.println(a);
     
     }
    }
    
    
  

