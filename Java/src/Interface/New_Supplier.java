/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import com.sun.glass.events.KeyEvent;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Asanka
 */
public class New_Supplier extends javax.swing.JFrame {

    String RealName;

    /**
     * Creates new form New_Supplier
     */
    public New_Supplier(String realName) {
        initComponents();
        Auto_Supplier_Id();
        setLocationRelativeTo(null);
        RealName = realName;
        setIcon();
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
    }

    New_Supplier() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jTextField_NIC = new javax.swing.JTextField();
        jTextField_Contact = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Address = new javax.swing.JTextArea();
        jLabel_ID = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("NIC");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Address");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Contact No");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Supplier Id");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Supplier Name");

        jTextField_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NameKeyTyped(evt);
            }
        });

        jTextField_NIC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_NICKeyTyped(evt);
            }
        });

        jTextField_Contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ContactKeyTyped(evt);
            }
        });

        jTextArea_Address.setColumns(20);
        jTextArea_Address.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Address);

        jLabel_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_ID.setText("Id");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_NIC, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_Name)
                            .addComponent(jTextField_Contact, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_ID)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel_ID))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_NIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(9, 9, 9))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("New Supplier");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.jpg"))); // NOI18N
        jButton2.setText("Back");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 630, 100, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ADDsuplier.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ((!(jTextField_Name.getText().equals(""))) && (!(jTextField_NIC.getText().equals(""))) && (!(jTextField_Email.getText().equals(""))) && (!(jTextField_Contact.getText().equals(""))) && (!(jTextArea_Address.getText().equals("")))) {
            if ((jTextField_NIC.getText().trim().matches("^[0-9]{9}[vVxX]$")))//NIC validation
            {

                if ((Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", jTextField_Email.getText()))) //email validate
                {
                  
                     int reply = JOptionPane.showConfirmDialog(null, "Are you Sure", "Register Supplier", JOptionPane.YES_NO_OPTION);

                if (reply == JOptionPane.YES_OPTION) {
                  Save();
                }
                    
                  
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);

                }

            } else {
                JOptionPane.showMessageDialog(rootPane, " Sorry! Please enter a valid NIC number!", "Warning", JOptionPane.WARNING_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(rootPane, " Sorry! Please Fill all the fields!", "Warning", JOptionPane.WARNING_MESSAGE);

        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new Add_Inventory(RealName).setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NameKeyTyped
        char c = evt.getKeyChar(); //String only
        if (!(Character.isLetter(c) || (c == KeyEvent.VK_ENTER) || (c == KeyEvent.VK_SPACE) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE))) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_NameKeyTyped

    private void jTextField_NICKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_NICKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NICKeyTyped

    private void jTextField_ContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ContactKeyTyped
       char c = evt.getKeyChar();//Only numbers can enter (10)
        if ((jTextField_Contact.getText().length() >= 10) || (c == KeyEvent.VK_SPACE) || (Character.isLetter(c)))//   cannot input this items
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_ContactKeyTyped
    int number = 1;

    private int Auto_Supplier_Id() {

        try {
            String sql = "Select max(Supplier_Id) from Supplier";

            PreparedStatement pst = DBconnect.connectdb().prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                number = rs.getInt(1);

            }

            number++;

            jLabel_ID.setText("" + number);
            jTextField_Name.requestFocus();
        } catch (SQLException e) {
        }
        return number;
    }

    public void Save() {
        String query = "insert into Supplier (Supplier_Id,Name,Contact_No,Email,Address,NIC) values('" + jLabel_ID.getText() + "','" + jTextField_Name.getText() + "','" + jTextField_Contact.getText() + "','" + jTextField_Email.getText() + "','" + jTextArea_Address.getText() + "','" + jTextField_NIC.getText() + "')";
        try {

            Statement stmt;
            Connection con = DBconnect.connectdb();
            stmt = con.createStatement();

            stmt.executeUpdate(query);

            JOptionPane.showMessageDialog(rootPane, "New Supplier Save Successfully");
            new Add_Inventory(RealName).setVisible(true);
            this.dispose();

        } catch (SQLException ex) {
            Logger.getLogger(Add_Inventory.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(New_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(New_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(New_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(New_Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new New_Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Address;
    private javax.swing.JTextField jTextField_Contact;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_NIC;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}
