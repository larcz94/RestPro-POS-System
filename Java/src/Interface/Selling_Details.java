/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Asanka
 */
public class Selling_Details {

    private float price;
    private float Unit_price;
    private String item;
    private float qty;
    private int Emp_Id;
    private int Table_No;
    private String size;
    private int Status;

    public Selling_Details(String item, float qty, float price, float Unit_price) {

        this.item = item;
        this.qty = qty;
        this.price = price;
        this.Unit_price = Unit_price;
    }

    //order form
    public Selling_Details(String item, String size, float qty) {

        this.item = item;
        this.qty = qty;
        this.size = size;

    }

    //Kitchan manager  form
    public Selling_Details(int Table_No, int Emp_Id, String item, String size, float qty) {

        this.item = item;
        this.qty = qty;
        this.size = size;
        this.Emp_Id = Emp_Id;
        this.Table_No = Table_No;

    }

    //Complete order form waiter interface
    public Selling_Details(int Table_No, int Emp_Id, String item, String size, float qty, int Status) {

        this.item = item;
        this.qty = qty;
        this.size = size;
        this.Emp_Id = Emp_Id;
        this.Table_No = Table_No;
        this.Status = Status;
    }
    
     //Complete order form Selling interface
    public Selling_Details(int Table_No, int Emp_Id, String item, String size, float qty, float price) {

        this.item = item;
        this.qty = qty;
        this.size = size;
        this.Emp_Id = Emp_Id;
        this.Table_No = Table_No;
        this.price = price;
    }

    public String getItem() {

        return item;
    }

    public float getPrice() {

        return price;
    }

    public float getQty() {

        return qty;
    }

    public float getUnit_Price() {

        return Unit_price;
    }

    public String getSize() {

        return size;
    }

    public int getTable_no() {

        return Table_No;
    }

    public int getEmp_id() {

        return Emp_Id;
    }

    public String getStatus() {
        String result = null;

        if (Status == 1) {

            result = "Ready to Serve";
        }
        else if(Status==2){
            
        result = "Served";
        }

        return result;
    }

}
