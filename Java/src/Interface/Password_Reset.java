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
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import javax.swing.JOptionPane;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Asanka
 */
public class Password_Reset extends javax.swing.JFrame {

    String Email=null;
    String password=null;
    String Realpassword=null;
    
    /**
     * Creates new form Password_Reset
     */
    public Password_Reset() {
        initComponents();
        setLocationRelativeTo(null);
        setIcon();
    }

    
    
       private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.png")));
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
        jTextField_answer = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_barcode = new javax.swing.JTextField();
        jTextField_username = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel_email = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Psaaword Reset");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Details"));
        jPanel1.setOpaque(false);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "What is your favorite Book ? ", "Where is your favorite place to vacation ?", "What was the name of your first pet ?", "What is your favorite Food ? ", "What city were you born ?", "What is your favorite color?", "Where is your working place?" }));
        jComboBox1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Barcode Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Security Question");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Answer");

        jTextField_barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_barcodeActionPerformed(evt);
            }
        });

        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/approved.png"))); // NOI18N
        jButton1.setText("Check Details");
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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_username)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_barcode)
                            .addComponent(jTextField_answer))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_answer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setText("Password Reset");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/pass.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, -1, -1));

        jLabel_email.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_email.setText("abc@gmail.com");
        getContentPane().add(jLabel_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Your Email:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 255));
        jLabel10.setText("Login Now");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 560, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/send.png"))); // NOI18N
        jLabel2.setText("Send Password");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 560, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/resetpass.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if((!(jTextField_answer.getText().equals(""))) && (!(jTextField_barcode.getText().equals(""))) && (!(jTextField_username.getText().equals("")))  ){
        
        
        reserp();
        
        }
        else{
        JOptionPane.showMessageDialog(rootPane, " Sorry! Please Fill all fields...", "Warning", JOptionPane.WARNING_MESSAGE);

        
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        
        if(type==true){
            
             int reply = JOptionPane.showConfirmDialog(null, "Are you Sure", "Serve Order", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
        
        SendEmail();
        }
           
        }
        else{
         JOptionPane.showMessageDialog(rootPane, "Opps!  Please fill the correct details");
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jTextField_barcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_barcodeActionPerformed
        jTextField_username.requestFocus();
    }//GEN-LAST:event_jTextField_barcodeActionPerformed

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
             jComboBox1.requestFocus();
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
      new Login().setVisible(true);
      this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    boolean type=false;
    public void reserp(){
    String query="select Status from Employee where Barcode ='"+jTextField_barcode.getText()+"' ";
      String sql = "SELECT m.Username,m.Password,m.Question ,m.Answer ,e.Email  FROM Manager m, Employee e  where e.Emp_Id=m.Id and Barcode='"+jTextField_barcode.getText()+"' ";
       String sql2 = "SELECT m.Username,m.Password,m.Question ,m.Answer, e.Email  FROM Cashier m, Employee e  where e.Emp_Id=m.Id and Barcode='"+jTextField_barcode.getText()+"' ";
       String sql3 = "SELECT m.Username,m.Password,m.Question ,m.Answer ,e.Email  FROM Inventory_Manager m, Employee e  where e.Emp_Id=m.Id and Barcode='"+jTextField_barcode.getText()+"' ";
       String sql4 = "SELECT m.Username,m.Password,m.Question ,m.Answer, e.Email  FROM Kitchan_Manager m, Employee e  where e.Emp_Id=m.Id and Barcode='"+jTextField_barcode.getText()+"' ";
       String sql5 = "SELECT m.Username,m.Password,m.Question ,m.Answer ,e.Email  FROM Waiter m, Employee e  where e.Emp_Id=m.Id and Barcode='"+jTextField_barcode.getText()+"' ";
      
       String Real_Query = null;
      try {
          Connection con=DBconnect.connectdb();
       Statement st;
        ResultSet rs;
      
           
            st = con.createStatement();
            rs= st.executeQuery(query);
           
            if(rs.next()){
                
               String Status=rs.getString("Status");
               
               if("Manager".equals(Status)){
               Real_Query=sql;
               
               }
               else if("Cashier".equals(Status)){
                Real_Query=sql2;
               }
               else if("Inventory_Keeper".equals(Status)){
                Real_Query=sql3;
               }
               else if("Kitchan_Manager".equals(Status)){
                Real_Query=sql4;
               }
               else if("Waiter".equals(Status)){
                Real_Query=sql5;
               }
               else{
               JOptionPane.showMessageDialog(rootPane, "You Can't Access this Page");
               }
               
                ResultSet rs1;
               rs1= st.executeQuery(Real_Query);
               
               if(rs1.next()){
                   
                String username=rs1.getString(1);
                password=  rs1.getString(2);
                Realpassword=abbb.decrypt(password);
                String question =rs1.getString(3);
                String answer =rs1.getString(4);
                Email=  rs1.getString(5);
                
                if(username.equals(jTextField_username.getText()) && question.equals(jComboBox1.getSelectedItem()) &&  answer.equals(jTextField_answer.getText())){
                
                     jLabel_email.setText(Email);
                     type=true;
               
                   
                 
                 
                
                }
                else{
                
                 JOptionPane.showMessageDialog(rootPane, "Invalied Username,Question and Answer");
                
                }
                
                
                
               
               
               }
               
               
            
             
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Invalied Barcode Number");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    
    }
    
    
    public void SendEmail(){
    
        try{
            String host ="smtp.gmail.com" ;
            String user = "asankasampath2u@gmail.com";
            String pass = "0778936522";
            String to = Email;
            String from = "asankasampath2u@gmail.com";
            String subject = "Password Reset RestPro System";
            String messageText = "Your Password is :  "+Realpassword;
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
           JOptionPane.showMessageDialog(rootPane, "Password send successfully");
          this.dispose();
          new Login().setVisible(true);
           
        }catch(Exception ex)
        {
            
            JOptionPane.showMessageDialog(rootPane, ex);
            this.dispose();
          new Login().setVisible(true);
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
            java.util.logging.Logger.getLogger(Password_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Password_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Password_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Password_Reset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Password_Reset().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_email;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_answer;
    private javax.swing.JTextField jTextField_barcode;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
