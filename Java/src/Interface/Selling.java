 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Asanka
 */
public class Selling extends javax.swing.JFrame {

    int Number_of_items = 0;
    float Total_amount = 0;
    float Qty = 0;
    float Enter_Qty = 0;
    int Item_Code = 0;
    int Id;
String RealName=null;
    /**
     * Creates new form Selling
     */
    public Selling(String realName) {
        initComponents();
        RealName=realName;
        setLocationRelativeTo(null);
        // Bindcombo();
        jLabel_bill_no.setText("" + autoBill_no());
        Show_jTable();
        jLabel_date_time.setText(today);
        jLabel_time.setText(time);
        jTextField_item_Code.requestFocus();
        Show_jTable1();// completed order table
   jLabel_Realname.setText(realName);
   setIcon();
    }

    
     private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        }
    
    
    Selling() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int autoBill_no() {

        int number = 1;

        try {
            String sql = "Select max(Bill_no) from Selling";

            PreparedStatement pst = DBconnect.connectdb().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                number = rs.getInt(1);
            }
            number++;

        } catch (SQLException e) {
        }
        return number;
    }

    //table view
    public ArrayList<Selling_Details> getuserList() {

        ArrayList<Selling_Details> userList = new ArrayList<Selling_Details>();
        Connection connection = DBconnect.connectdb();

        String query = "SELECT Product,Qty,Price,Unit_Price from Invoice  where Bill_no='" + jLabel_bill_no.getText() + "'";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Selling_Details user;
            while (rs.next()) {
                user = new Selling_Details(rs.getString("Product"), rs.getFloat("Qty"), rs.getFloat("Price"), rs.getFloat("Unit_Price"));
                userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    //Display data
    public void Show_jTable() {

        ArrayList<Selling_Details> list = getuserList();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        Object[] row = new Object[4];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getItem();
            row[1] = list.get(i).getQty();
            //calculate price
            row[2] = list.get(i).getUnit_Price();
            row[3] = (list.get(i).getPrice()) * (list.get(i).getQty());

            model.addRow(row);

        }

    }

    // Calculate Total amount and number of items
    float value = 0;

    public void Total_Item_and_Amount() {
  float value1 = 0;
    float sum = 0;
        int item_count = 0;
        //Amount

        for (int i = 0; i < jTable1.getRowCount(); i++) {
            sum = sum + Float.parseFloat(jTable1.getValueAt(i, 3).toString());
        }

        jLabel_total_amount.setText("" + sum);
        jLabel_net_total.setText("" + sum);
        Total_amount = sum;
        value1 = sum;
        value=value1;

        //Item 
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            item_count++;
        }
        jLabel_number_of_Items.setText("" + item_count);

    }

    public void Ballance() {
        float ballance = 0;

        ballance = Integer.parseInt(jTextField_cash.getText()) - Total_amount;
        jLabel_ballance.setText("" + ballance);

    }

//clear text field
    public void clear() {
        jTextField_Item.setText("");
        jTextField_qty.setText("");
        jTextField_unit_price.setText("");
        jTextField_item_Code.setText("");
        jTextField_item_Code.requestFocus();

    }

    String today = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
    String time = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel_bill_no = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_date_time = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Item = new javax.swing.JTextField();
        jTextField_qty = new javax.swing.JTextField();
        jTextField_unit_price = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel_time = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel_ballance = new javax.swing.JLabel();
        jLabel_number_of_Items = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel_total_amount = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_cash = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel_net_total = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_Discount = new javax.swing.JLabel();
        jTextField_last = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField_item_Code = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField_table_No = new javax.swing.JTextField();
        jTextField_Emp_Id = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable_Complete1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jTextField_UserId_Barcode = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel_Realname = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Selling Details");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Bill No:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        jLabel_bill_no.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_bill_no.setText("00");
        getContentPane().add(jLabel_bill_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Date:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel_date_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_date_time.setText("DD-MM-YYYY");
        getContentPane().add(jLabel_date_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Product");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 590, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Unit Price");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, -1, -1));

        jTextField_Item.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Item.setEnabled(false);
        jTextField_Item.setOpaque(false);
        jTextField_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ItemActionPerformed(evt);
            }
        });
        jTextField_Item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ItemKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Item, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 610, 190, -1));

        jTextField_qty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_qty.setOpaque(false);
        jTextField_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_qtyActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 610, 74, -1));

        jTextField_unit_price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_unit_price.setEnabled(false);
        jTextField_unit_price.setOpaque(false);
        jTextField_unit_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_unit_priceActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_unit_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 610, 112, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item ", "Qty", "Unit Price", "Price"
            }
        ));
        jTable1.setOpaque(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(200);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(200);
            jTable1.getColumnModel().getColumn(1).setMinWidth(50);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(50);
            jTable1.getColumnModel().getColumn(2).setMinWidth(100);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(3).setMinWidth(100);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(100);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 650, -1, 220));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 650, -1, 63));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Time:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        jLabel_time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_time.setText("00-00-00");
        getContentPane().add(jLabel_time, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Summery"));
        jPanel1.setOpaque(false);

        jLabel_ballance.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_ballance.setText("0000");

        jLabel_number_of_Items.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_number_of_Items.setText("00");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Number Of Items");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Gross Amount:");

        jLabel_total_amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_total_amount.setText("00");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Cash");

        jTextField_cash.setText("0");
        jTextField_cash.setOpaque(false);
        jTextField_cash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_cashActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Balance");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Net Total:");

        jLabel_net_total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_net_total.setText("00000.00");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Your Discount");

        jLabel_Discount.setText("00.00");

        jTextField_last.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_total_amount, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                    .addComponent(jLabel_number_of_Items, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabel9)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel_ballance, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField_last, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_net_total, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Discount, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_number_of_Items)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_total_amount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel_Discount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField_cash, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel_net_total))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel15)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel_ballance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_last, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, -1, 270));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel12.setText("Selling Home Page");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, -1, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Product Code");

        jTextField_item_Code.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_item_Code.setOpaque(false);
        jTextField_item_Code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_item_CodeActionPerformed(evt);
            }
        });
        jTextField_item_Code.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_item_CodeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jTextField_item_Code, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_item_Code, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("**Start in 1000");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Completed Orders");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Employee ID");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Table No");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jTextField_table_No.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_table_No.setOpaque(false);
        jTextField_table_No.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_table_NoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_table_No, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 66, -1));

        jTextField_Emp_Id.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Emp_Id.setOpaque(false);
        jTextField_Emp_Id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Emp_IdKeyTyped(evt);
            }
        });
        getContentPane().add(jTextField_Emp_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 65, -1));

        jTable_Complete1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Table No", "Employee ID", "Product Name", "Quantity", "Size", "Price"
            }
        ));
        jTable_Complete1.setOpaque(false);
        jTable_Complete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_Complete1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable_Complete1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 671, 180));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        jPanel2.setOpaque(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Membership Card ");

        jTextField_UserId_Barcode.setOpaque(false);
        jTextField_UserId_Barcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_UserId_BarcodeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_UserId_Barcode)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel13)
                .addContainerGap(261, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_UserId_Barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 671, 73));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logO.png"))); // NOI18N
        jLabel22.setText("LogOut");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 100, -1));

        jLabel_Realname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Realname.setText("name");
        getContentPane().add(jLabel_Realname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 140, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Name:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/selling1.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 950));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ItemKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ItemKeyTyped


    }//GEN-LAST:event_jTextField_ItemKeyTyped

    private void jTextField_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ItemActionPerformed

    }//GEN-LAST:event_jTextField_ItemActionPerformed

    private void jTextField_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_qtyActionPerformed

        String query = "insert into Invoice (Product,Product_Code,Qty,Price,Bill_no,Unit_Price,Table_No,Emp_No) values('" + jTextField_Item.getText() + "','" + jTextField_item_Code.getText() + "','" + jTextField_qty.getText() + "','" + jTextField_unit_price.getText() + "','" + jLabel_bill_no.getText() + "','" + jTextField_unit_price.getText() + "','" + jTextField_table_No.getText() + "','" + jTextField_Emp_Id.getText() + "')";
        executeQuery(query);



    }//GEN-LAST:event_jTextField_qtyActionPerformed

    public void executeQuery(String query) {

        Connection con = DBconnect.connectdb();
        Statement st;

        try {
            st = con.createStatement();
            st.executeUpdate(query);

            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            Show_jTable();
            Total_Item_and_Amount();
            clear();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    public void executeQuery1(String query) {

        Connection con = DBconnect.connectdb();
        Statement st;

        try {
            st = con.createStatement();
            st.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }


    private void jTextField_unit_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_unit_priceActionPerformed

    }//GEN-LAST:event_jTextField_unit_priceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(!(jTextField_Item.getText().equals(""))){
 String query = "DELETE FROM Invoice WHERE Product='" + jTextField_Item.getText() + "' and Qty= '" + jTextField_qty.getText() + "'";
        executeQuery(query);
        // Total_Item_and_Amount();
}else{
JOptionPane.showMessageDialog(rootPane, " Sorry! Select Order...", "Warning", JOptionPane.WARNING_MESSAGE);


}
        
        
       

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField_cashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_cashActionPerformed
        Ballance();
        String query = "insert into Selling (Bill_No,Date,Total_Amount,Discount,Table_No,Emp_Id)values('" + jLabel_bill_no.getText() + "','" + jLabel_date_time.getText() + "','" + jLabel_net_total.getText() + "','" + jLabel_Discount.getText() + "','" + jTextField_table_No.getText() + "','" + jTextField_Emp_Id.getText() + "')";
        executeQuery1(query);
        jTextField_last.requestFocus();
       //After save Selling


    }//GEN-LAST:event_jTextField_cashActionPerformed

    public void printsupport(){
      String queryS = "insert into Invoice (Product,Product_Code,Qty,Price,Bill_no,Unit_Price,Table_No,Emp_No) values('      TOTAL AMOUNT****** ','" + jTextField_item_Code.getText() + "',1,'"+jLabel_net_total.getText()+"','" + jLabel_bill_no.getText() + "','"+jLabel_net_total.getText()+"','" + jTextField_table_No.getText() + "','" + jTextField_Emp_Id.getText() + "')";
        executeQuery(queryS);
    
    
    
    }
    
    
    public void print(){
     MessageFormat hedder = new MessageFormat("Invoice No: '" +jLabel_bill_no.getText()+"'");
        MessageFormat fotter = new MessageFormat("RestPro Restaurant");
       
        
        try {
           jTable1.print(JTable.PrintMode.NORMAL, hedder,  fotter);
         
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot Print %s %n", e.getMessage());
        }
        
    
    }
    
    public void Membership_Activity() {

        String query1 = "insert into Membership_Activity(Member_Id,Date,Bill_No,Amount,Discount,No_of_Products) values('" + Id + "','" + jLabel_date_time.getText() + "','" + jLabel_bill_no.getText() + "','" + jLabel_total_amount.getText() + "','" + jLabel_Discount.getText() + "','" + jLabel_number_of_Items.getText() + "')";
        executeQuery1(query1);

    }

    private void jTextField_item_CodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_item_CodeActionPerformed

        if((!(jTextField_Emp_Id.getText().equals(""))) && (!(jTextField_table_No.getText().equals("")))){
        
        String sql = "SELECT Product_Name,Selling_Price,Qty FROM Product where Product_Code='" + jTextField_item_Code.getText() + "' ";

        try {

            PreparedStatement pst = DBconnect.connectdb().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                jTextField_Item.setText(rs.getString(1));
                jTextField_unit_price.setText("" + rs.getFloat(2));

                Qty = rs.getFloat(3);
                // to Update Store table Qty coloumn
                Item_Code = Integer.parseInt(jTextField_item_Code.getText());

                jTextField_qty.requestFocus();

            }
            pst.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
        }
        else{
          JOptionPane.showMessageDialog(rootPane, " Sorry! Please enter Table Number and Employee ID ", "Warning", JOptionPane.WARNING_MESSAGE);

        
        }

    }//GEN-LAST:event_jTextField_item_CodeActionPerformed

    //check membership card
    private void jTextField_UserId_BarcodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_UserId_BarcodeKeyTyped
        if (evt.getKeyChar() == 10) {
            String sql = "select Barcode ,Member_Id from Member where Barcode = '" + jTextField_UserId_Barcode.getText() + "' ";

            float Discount = 0;

            try {
                PreparedStatement pst = DBconnect.connectdb().prepareStatement(sql);
                ResultSet rs = pst.executeQuery();
                if (rs.next()) {

                    Id = rs.getInt(2);//member id for membership activity table 
                    Total_amount = (float) (value * 0.9);
                    Discount = (float) (value * 0.1);

                    jLabel_net_total.setText("" + Total_amount);
                    jLabel_Discount.setText("" + Discount);
                    jTextField_cash.requestFocus();

                    Membership_Activity();

                }
                pst.close();
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, "Invaied Membership Card");
            }
        }


    }//GEN-LAST:event_jTextField_UserId_BarcodeKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyChar() == 112) {

            new Selling().setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        jTextField_Item.setText(model.getValueAt(i, 0).toString());
        jTextField_qty.setText(model.getValueAt(i, 1).toString());
        jTextField_unit_price.setText(model.getValueAt(i, 2).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable_Complete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_Complete1MouseClicked
        int i = jTable_Complete1.getSelectedRow();
        TableModel model = jTable_Complete1.getModel();
        jTextField_table_No.setText(model.getValueAt(i, 0).toString());
        jTextField_Emp_Id.setText(model.getValueAt(i, 1).toString());
        jTextField_Item.setText(model.getValueAt(i, 2).toString());
        jTextField_qty.setText(model.getValueAt(i, 3).toString());
        jTextField_unit_price.setText(model.getValueAt(i, 5).toString());

        Enter_Qty = Float.parseFloat(jTextField_qty.getText());//used qty
        // update Qty Colomn in Product table After Selling
        getCurrentQty_and_ItemCode();
        float Curreny_Qty = Qty - Enter_Qty;//new qty

        String query1 = " update Product SET Qty='" + Curreny_Qty + "' WHERE Product_Code= '" + Item_Code + "'";

        String query = "insert into Invoice (Product,Product_Code,Qty,Price,Bill_no,Unit_Price,Table_No,Emp_No) values('" + jTextField_Item.getText() + "','" + jTextField_item_Code.getText() + "','" + jTextField_qty.getText() + "','" + jTextField_unit_price.getText() + "','" + jLabel_bill_no.getText() + "','" + jTextField_unit_price.getText() + "','" + jTextField_table_No.getText() + "','" + jTextField_Emp_Id.getText() + "')";

        String query2 = "DELETE FROM Orders WHERE Table_No='" + jTextField_table_No.getText() + "' and Qty= '" + jTextField_qty.getText() + "' and Price='" + jTextField_unit_price.getText() + "' and Emp_Id='" + jTextField_Emp_Id.getText() + "' and Product_Name='" + jTextField_Item.getText() + "' ";

        int reply = JOptionPane.showConfirmDialog(null, "Are you Sure", "Serve Order", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {

            executeQuery(query);//if yes, then save the details in invoice table

            executeQuery1(query1);// update Qty Colomn in Product table After Selling

            executeQuery1(query2);//delete details after selling
            Show_jTable1();
           // Show_jTable();
           // Total_Item_and_Amount();
          // new Selling().setVisible(true);
          // this.dispose();

        }
    }//GEN-LAST:event_jTable_Complete1MouseClicked

    private void jTextField_lastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lastActionPerformed
 int reply = JOptionPane.showConfirmDialog(null, "Are You want to print", "Print", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            printsupport();   
this.dispose();
print();

new Selling(RealName).setVisible(true);
        }
        else{
        this.dispose();
        new Selling(RealName).setVisible(true);
        }
        
        
        
        
    }//GEN-LAST:event_jTextField_lastActionPerformed

    private void jTextField_Emp_IdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Emp_IdKeyTyped
       
        char c = evt.getKeyChar();//numbers only
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_ENTER) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_jTextField_Emp_IdKeyTyped

    private void jTextField_table_NoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_table_NoKeyTyped
  
        char c = evt.getKeyChar();//numbers only
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_ENTER) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        } 
    }//GEN-LAST:event_jTextField_table_NoKeyTyped

    private void jTextField_item_CodeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_item_CodeKeyTyped
     char c = evt.getKeyChar();//Only numbers can enter (4)
        if ((jTextField_item_Code.getText().length() >= 4) || (c == KeyEvent.VK_SPACE) || (Character.isLetter(c)))//   cannot input this items
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_item_CodeKeyTyped

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        int reply = JOptionPane.showConfirmDialog(null, "Are you Sure", "Loging Out", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel22MouseClicked

    public void getCurrentQty_and_ItemCode() {
        String sql = "SELECT Product_Code,Qty FROM Product where Product_Name='" + jTextField_Item.getText() + "' ";

        try {

            PreparedStatement pst = DBconnect.connectdb().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                Qty = rs.getFloat(2);

                Item_Code = rs.getInt(1);

            }
            pst.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    //table view for completed order table
    public ArrayList<Selling_Details> getuserList1() {

        ArrayList<Selling_Details> userList = new ArrayList<Selling_Details>();
        Connection connection = DBconnect.connectdb();

        String query = " select * from Orders  where  Status=2  ";
        Statement st;
        ResultSet rs;

        try {
            st = connection.createStatement();
            rs = st.executeQuery(query);
            Selling_Details user;
            while (rs.next()) {
                user = new Selling_Details(rs.getInt("Table_No"), rs.getInt("Emp_Id"), rs.getString("Product_Name"), rs.getString("Size"), rs.getFloat("Qty"), rs.getFloat("Price"));
                userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }

    //Display data
    public void Show_jTable1() {

        ArrayList<Selling_Details> list = getuserList1();
        DefaultTableModel model = (DefaultTableModel) jTable_Complete1.getModel();

        Object[] row = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getTable_no();
            row[1] = list.get(i).getEmp_id();
            row[2] = list.get(i).getItem();
            row[3] = list.get(i).getQty();
            row[4] = list.get(i).getSize();
            row[5] = list.get(i).getPrice();

            model.addRow(row);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Selling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Selling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_Discount;
    private javax.swing.JLabel jLabel_Realname;
    private javax.swing.JLabel jLabel_ballance;
    private javax.swing.JLabel jLabel_bill_no;
    private javax.swing.JLabel jLabel_date_time;
    private javax.swing.JLabel jLabel_net_total;
    private javax.swing.JLabel jLabel_number_of_Items;
    private javax.swing.JLabel jLabel_time;
    private javax.swing.JLabel jLabel_total_amount;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_Complete1;
    private javax.swing.JTextField jTextField_Emp_Id;
    private javax.swing.JTextField jTextField_Item;
    private javax.swing.JTextField jTextField_UserId_Barcode;
    private javax.swing.JTextField jTextField_cash;
    private javax.swing.JTextField jTextField_item_Code;
    private javax.swing.JTextField jTextField_last;
    private javax.swing.JTextField jTextField_qty;
    private javax.swing.JTextField jTextField_table_No;
    private javax.swing.JTextField jTextField_unit_price;
    // End of variables declaration//GEN-END:variables
}
