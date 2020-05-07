/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;

/**
 *
 * @author nikhil
 */
class studentdetails {
   
    private String  name;
    private String rollnumber;
    private String org;
    private String groups;
    public studentdetails(){}
    public studentdetails(String name,String rollnumber,String orgi,String groups){
    this.name= name;
    this.rollnumber = rollnumber;
    this.org = orgi;
    this.groups = groups;
    
    }
    public String studentname(){
    
    return name;}
    public String rollnumber(){
    
    return rollnumber;
    }
    public String orgnaization(){
    return org;
    }
    public String groups(){
return groups;
}

    }

