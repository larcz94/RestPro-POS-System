/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Date;

/**
 *
 * @author Asanka
 */
public class User {

    private String FullName;
    private String ShortName;
    private String Nic;
    private String Gender;
    private int Contact;
    private String Address;
    private String Email;

    //salary table filling
    private int Hours;
    private Date date;
    private float Amount;
    private float Discount;
    private float selling_Price;
    private float Qty;

    private float Employee;
    private float Inventory;
    private float Wastage;

    private int id;
    private String First_Name;
     private String barcode;
    private String feedback;
    private int value;
    
    //product status
   private String  Product_Name;
    private int  Product_Code;
     private Date  Made_Date;
      private Date  EXP_Date;
       private float  Selling_Price;
       

    public User(String FullName, String ShortName, String Nic, String Gender, int Contact, String Address, String Email) {

        this.FullName = FullName;
        this.ShortName = ShortName;
        this.Nic = Nic;
        this.Gender = Gender;
        this.Contact = Contact;
        this.Address = Address;
        this.Email = Email;
    }

    //salary table filling
    public User(Date date, int Hours, float Amount) {

        this.date = date;
        this.Hours = Hours;
        this.Amount = Amount;

    }

    //salary checker table in manager interface

    public User(int id, float Amount) {

        this.Hours = id;
        this.Amount = Amount;

    }
    
    //salary checker table in manager interface
      public User(String name, float Amount) {

        this.FullName = name;
        this.Amount = Amount;

    }

    //Salse calculate in last day in manager interface

    public User(Date date, float Amount, float Discount) {

        this.date = date;
        this.Amount = Amount;
        this.Discount = Discount;

    }

    //Wastage cal in manager 
    public User(Date date, int id, float selling_Price, float Qty) {

        this.date = date;
        this.Hours = id;

        this.selling_Price = selling_Price;
        this.Qty = Qty;
    }

    //cost calculate  interface
    public User(Date date, float Emp, float Inventory, float wastage) {

        this.date = date;
        this.Employee = Emp;
        this.Inventory = Inventory;
        this.Wastage = wastage;

    }

    //Feedback  interface
    public User(String barcode, Date date, String feedback, int value, String  name) {
this.barcode = barcode;
this.date = date;
this.feedback = feedback;
this.value = value;
this.First_Name = name;
       

    }

    
    //product status interface
    public User(String Product_Name,int Product_Code ,Date Made_Date,Date EXP_Date,float Qty, float Selling_Price) {
this.Product_Name = Product_Name;
this.Product_Code = Product_Code;
this.Made_Date = Made_Date;
this.EXP_Date = EXP_Date;
this.Qty = Qty;
this.Selling_Price = Selling_Price;
       

    }
    
    
     //product EXP interface
    public User(String Product_Name,int Product_Code ,Date EXP_Date,float Qty, float Selling_Price) {
this.Product_Name = Product_Name;
this.Product_Code = Product_Code;

this.EXP_Date = EXP_Date;
this.Qty = Qty;
this.Selling_Price = Selling_Price;
       

    }
    
    
       //top emp cus interface

    public User(int id, String name, float amount) {

        this.id = id;
        this.FullName = name;
        this.Amount = amount;

    }
    
    //product status
    public String getProduct_Name() {

        return Product_Name;
    }
    public int getProduct_Code() {

        return Product_Code;
    }
    public Date getMade_Date() {

        return Made_Date;
    }
    public Date getEXP_Date() {

        return EXP_Date;
    }
    public float getSelling_Price1() {

        return Selling_Price;
    }
    
    
    
    
    
    
    public String getFullName() {

        return FullName;
    }

    public String getShortName() {

        return ShortName;
    }

    public String getNic() {

        return Nic;
    }

    public String getGender() {

        return Gender;
    }

    public int getContact() {

        return Contact;
    }

    public String getAddress() {

        return Address;
    }

    public String getEmail() {

        return Email;
    }

    //salary table filling
    public int getHours() {

        return Hours;
    }

    public Date getDate() {

        return date;
    }

    public float getAmount() {

        return Amount;
    }

    public float getDiscount() {

        return Discount;
    }

    public float getSelling_Price() {

        return selling_Price;
    }

    public float getQty() {

        return Qty;
    }

    public float getEmployee() {

        return Employee;
    }

    public float getInventory() {

        return Inventory;
    }

    public float getWastage() {

        return Wastage;
    }

    public int getID() {

        return id;
    }

    public String getMemberName() {

        return First_Name;
    }

    public String getFeedback() {

        return feedback;
    }

    public int getValue() {

        return value;
    }

    
    
    
     public String getBarcode1() {

        return barcode;
    }
      public Date getDate1() {

        return date;
    }
       public String getFeedback1() {

        return feedback;
    }
        public int getValue1() {

        return value;
    }
         public int getId1() {

        return id;
    }
    
    
}
