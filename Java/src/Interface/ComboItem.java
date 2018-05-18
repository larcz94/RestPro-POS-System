/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import java.sql.*;
import javax.swing.*;

/**
/**
 *
 * @author Asanka
 */
public class ComboItem {
    private String Item;
     private int id;
    private float Unit_Price;
     private float qty;
     
     //Salary interface
      private String Emp_Name;
    private int Emp_Id;
    
  public  ComboItem(String a, float b){
  this.Item=a;
  this.Unit_Price=b;
  }
 
  public  ComboItem(float a, float b){
  this.qty=a;
  this.Unit_Price=b;
  }
  
  //Salary
   public  ComboItem(String a, int b){
  this.Emp_Name=a;
  this.Emp_Id=b;
  }
   

  
  public String getItem(){
  
  return Item;
  }
  
  public float getUnit_Price(){
  
  return Unit_Price;
  }
  
  public float getQty(){
  
  return qty;
  }
  
  
  //salary
   public String getEmp_Name(){
  
  return Emp_Name;
  }
    public int getEmp_Id(){
  
  return Emp_Id;
  }
 
  
}
