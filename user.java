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
class user {
    private String  group;
    private int gcode;
    private String facuilty;
    public user(String Group,int gcode,String facuilty){
    this .group = Group;
    this.gcode = gcode;
    this.facuilty = facuilty;
    }
    public String groupname(){
    
    return group;}
    public int groupcode(){
    
    return gcode;
    }
    public String groupfac(){
      return facuilty;
    }
    }

