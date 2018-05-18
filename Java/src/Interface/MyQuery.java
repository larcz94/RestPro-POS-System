/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.management.Query;

/**
 *
 * @author Asanka
 */
public class MyQuery {
    
   
    
    public HashMap<String , Float> populateCombo(String query){
    HashMap<String , Float> map = new  HashMap<String , Float>();
    Connection con = DBconnect.connectdb();
    Statement st;
    ResultSet rs;
    
    
        try {
            st=con.createStatement();
            rs= st.executeQuery(query);
            ComboItem cmi;
            
            while(rs.next()){
            cmi= new ComboItem(rs.getString(1),rs.getFloat(2));
            map.put(cmi.getItem(),cmi.getUnit_Price());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return map;
    }
    
    
      public HashMap<Float , Float> populateCombo1(String query){
    HashMap<Float , Float> map = new  HashMap<Float , Float>();
    Connection con = DBconnect.connectdb();
    Statement st;
    ResultSet rs;
    
    
        try {
            st=con.createStatement();
            rs= st.executeQuery(query);
            ComboItem cmi;
            
            while(rs.next()){
            cmi= new ComboItem(rs.getString(1),rs.getFloat(2));
            map.put(cmi.getUnit_Price(),cmi.getQty());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MyQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return map;
    }
}
