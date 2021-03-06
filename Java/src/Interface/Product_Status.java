/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asanka
 */
public class Product_Status extends javax.swing.JFrame {
String RealName;
    /**
     * Creates new form Cost_Checker
     */
    public Product_Status(String realName) {
        initComponents();
        setLocationRelativeTo(null);
        jLabel_Realname.setText(realName);
        RealName=realName;
        Show_jTable();
         setIcon();
    }

    
    
       private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
        }

    
    Product_Status() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
     
    //check product status
       public ArrayList <User> getuserList(){
    
        ArrayList<User> userList = new ArrayList<User>();
        Connection con = DBconnect.connectdb();
        
        Statement st;
        ResultSet rs;
        
        try {
          
         String today = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
      
      
        String query= "SELECT * FROM Product ";//get all details            
            st = con.createStatement();
            rs= st.executeQuery(query);
            User user;
            while(rs.next()){
            user = new User(rs.getString("Product_Name"),rs.getInt("Product_Code"),rs.getDate("Made_Date"),rs.getDate("EXP_Date"),rs.getFloat("Qty"),rs.getFloat("Selling_Price"));
            userList.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
    }
       
       
       //jtabale update
       public void Show_jTable(){
    int count=0;
    float T_Amount=0;
        ArrayList<User> list = getuserList();
        DefaultTableModel model =(DefaultTableModel)jTable1.getModel();
        Object [] row = new Object[6];
        for (int i=0; i<list.size(); i++){
            row[0]=list.get(i).getProduct_Name();
            row[1]=list.get(i).getProduct_Code();
            row[2]=list.get(i).getMade_Date();
            row[3]=list.get(i).getEXP_Date();
            row[4]=list.get(i).getQty();
            row[5]=list.get(i).getSelling_Price1();
            
            count++;
            T_Amount=T_Amount+(list.get(i).getSelling_Price1()*list.get(i).getQty());
            model.addRow(row);
            
           } 
        jLabel_no_of_Products.setText(Integer.toString(count));
        jLabel_Stock_value.setText(""+T_Amount);
    }
       
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel_no_of_Products = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_Stock_value = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel_Realname = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product Status");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Product Status");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Product Code", "Made Date", "EXP Date", "Quantity", "Price"
            }
        ));
        jTable1.setOpaque(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 742, 227));

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.jpg"))); // NOI18N
        jButton6.setText("Back");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 660, 100, -1));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home.jpg"))); // NOI18N
        jButton9.setText("Home");
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 660, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Summary"));
        jPanel2.setOpaque(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("No of Products");

        jLabel_no_of_Products.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_no_of_Products.setText("0000");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Value of Stock");

        jLabel_Stock_value.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Stock_value.setText("0000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel_no_of_Products, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(jLabel_Stock_value, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel_Stock_value)
                    .addComponent(jLabel_no_of_Products))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, 740, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logO.png"))); // NOI18N
        jLabel15.setText("LogOut");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 100, -1));

        jLabel_Realname.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Realname.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Realname.setText("name");
        getContentPane().add(jLabel_Realname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, 160, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/productStatuss.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new Salse_Unit(RealName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        new Manager(RealName).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        int reply = JOptionPane.showConfirmDialog(null, "Are you Sure", "Loging Out", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            new Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(Product_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_Status.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Status().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Realname;
    private javax.swing.JLabel jLabel_Stock_value;
    private javax.swing.JLabel jLabel_no_of_Products;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
