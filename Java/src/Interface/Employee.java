/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.util.ErrorMessages;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Asanka
 */
public class Employee extends javax.swing.JFrame {

    /**
     * Creates new form Employee
     */
    public Employee() {
        initComponents();
        setLocationRelativeTo(null);
        jLabel_date.setText(today);
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
        jLabel_date = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Employee_id = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Attendance");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Employee Attendance");

        jLabel_date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_date.setText("0000-00-00");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Scan Your ID ");

        jTextField_Employee_id.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTextField_Employee_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_Employee_idKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextField_Employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(106, 106, 106))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField_Employee_id, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jButton6.setText("Back");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Home");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(324, 324, 324)
                        .addComponent(jLabel_date)))
                .addContainerGap(186, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jLabel_date)
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

// get current hour in day
    LocalDateTime time = LocalDateTime.now();
    int hour = time.getHour();

    //Generate message
    public void getGreeting() {

        if (6 <= hour && 12 > hour) {
            JOptionPane.showMessageDialog(rootPane, "Good Morning! ");
        } else if (12 == hour) {
            JOptionPane.showMessageDialog(rootPane, "Good Afternoon! ");
        } else {
            JOptionPane.showMessageDialog(rootPane, "Good Evening! Come Again ");
        }

    }


    private void jTextField_Employee_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_Employee_idKeyTyped

        if (evt.getKeyChar() == 10 || evt.getKeyChar() == 13) {
            
            String sql = "select e.Barcode , e.Emp_Id, ed.Date, ed.In_Time, ed.Out_Time ,e.Salary from Employee e, Employee_Details ed where e.Emp_Id=ed.Emp_Id and e.Barcode = '" + jTextField_Employee_id.getText() + "' and Date='"+today+"' ";
        
            Connection con = DBconnect.connectdb(); 
             Statement st;
             ResultSet rs;

            //Convert String to Date
            String Today = today;
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);

            try {
                 st = con.createStatement();
                 rs= st.executeQuery(sql);
                
                
                if (rs.next()) {

                    int id = rs.getInt(2);//get id number in Database
                    Date day = rs.getDate(3);//get date in database
                    Date date = format.parse(Today); //get current date
                    int In_Time = rs.getInt(4); //get IN_Time in database
                    int Out_Time = rs.getInt(5); // get OUT_TIME in data base
                    float Salary = rs.getFloat(6);//get Salary per Hour in database

                    //chek wether current date is already insered or not(inserted then update off time in employee) and OUT TIME is not inserted
                    if (Out_Time == 0 && date.equals(day)) {
                        
                        int Hour_Now = time.getHour();//current hour
                        int Working_Hours=Hour_Now-In_Time;//(OUT TIME - IN TIME)
                        float Amount= Working_Hours*Salary;

                        //call for update table
                        Emplyee_Details_Update(id,Working_Hours,Amount);
                        getGreeting(); //show Greeting
                        
                        jTextField_Employee_id.setText("");
                        jTextField_Employee_id.requestFocus();

                    } 
                    
                    //check ID is Used or Not
                    else if  (Out_Time != 0 && date.equals(day)) {
                        JOptionPane.showMessageDialog(rootPane, "Oops! This ID has already taken for today");
                        jTextField_Employee_id.setText("");
                        jTextField_Employee_id.requestFocus();
                    } 
                    
                    
                  //id ara not match in current day. then id check valied or not . if it is valied then input new day
                } else {
                    
                    String sql1=" select Emp_Id from Employee where Barcode='"+jTextField_Employee_id.getText()+"' ";
                    rs= st.executeQuery(sql1);
                    
                    if(rs.next()){
                    int id = rs.getInt(1);//get id number in Database
                    
                    //call for insert table
                        Emplyee_Details_Input(id);
                        getGreeting();
                        
                        jTextField_Employee_id.setText("");
                        jTextField_Employee_id.requestFocus();
                    
                    
                    }
                    else{
                    
                    JOptionPane.showMessageDialog(rootPane, "Invaied Membership Card");
                    }

                }
                
                rs.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane, e);
            } catch (ParseException ex) {
                Logger.getLogger(Employee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jTextField_Employee_idKeyTyped

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        //   new Manager().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 //      new HRM().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    public void executeQuery(String query) {

        Connection con = DBconnect.connectdb();
        Statement st;

        try {
            st = con.createStatement();
            st.executeUpdate(query);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }

    }

    // Update Out time in Employee(date= today)  
    public void Emplyee_Details_Update(int Emp_Id,int Working_Hours,float Amount) {
        String query = "UPDATE Employee_Details SET Out_Time='" + hour + "' , Hours='"+Working_Hours+"' ,Amount='"+Amount+"' WHERE Date='" + today + "' and Emp_Id='" + Emp_Id + "' ";
        executeQuery(query);

    }

    // Insert  In time in Employee  
    public void Emplyee_Details_Input(int Emp_Id) {
        String query = "insert into Employee_Details (Emp_Id,Date,In_Time,Out_Time,Hours,Amount) values('" + Emp_Id + "','" + today + "','" + hour + "',0,0,0)";
        executeQuery(query);

    }

    String today = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());

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
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_date;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Employee_id;
    // End of variables declaration//GEN-END:variables
}