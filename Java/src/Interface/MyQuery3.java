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
public class MyQuery3 {
    
   
    
    public HashMap<String , Integer> populateCombo(){
    HashMap<String , Integer> map = new  HashMap<String , Integer>();
    Connection con = DBconnect.connectdb();
    Statement st;
    ResultSet rs;
    
    
        try {
            st=con.createStatement();
            rs= st.executeQuery("SELECT Item, Item_Code FROM Inventory ");
            ComboItem cmi;
            
            while(rs.next()){
            cmi= new ComboItem(rs.getString(1),rs.getInt(2));
            map.put(cmi.getEmp_Name(),cmi.getEmp_Id());
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(MyQuery3.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return map;
    }
    
}
