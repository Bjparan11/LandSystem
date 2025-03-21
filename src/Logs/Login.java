/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logs;

import Logs.Registration;
import dbconnect.Session;
import dbConnect.dbConnector;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static sun.security.jgss.GSSUtil.login;
import Admin.AdminDashboard;
import User.UserDashboard;
import dbConnect.PasswordHasher;
import java.security.NoSuchAlgorithmException;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    static String status1;
    static String type1;

    
    public static boolean loginAccount(String username, String password)
    {
        dbConnector connector = new dbConnector();
        try
        {
            
            String query = "SELECT * FROM user WHERE i_username='"+ username +"'";
            ResultSet resultSet = connector.getData(query);
            if(resultSet.next())
            {
                

                String hashedPass = resultSet.getString("i_password");
                String rehashedPass = PasswordHasher.hashPassword(password);
                
                if(hashedPass.equals(rehashedPass))
                {
                    

                status1 = resultSet.getString("status");
                type1 = resultSet.getString("i_type");
                Session sess = Session.getInstance();
                sess.setIid(resultSet.getInt("i_id"));
                sess.setFname(resultSet.getString("i_fname"));
                sess.setLname(resultSet.getString("i_lname"));
                sess.setUsername(resultSet.getString("i_username"));
                sess.setType(resultSet.getString("i_type"));
                sess.setEmail(resultSet.getString("i_email"));
                    

                return true;
                }else
                {
                    
                    return false;
                }
            }else
            {
               
                return false;
            }
        }catch(SQLException | NoSuchAlgorithmException ex)
        {
            System.out.println(""+ex); // Always put 
            return false;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LOGIN = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        pw = new javax.swing.JPasswordField();
        Clickhere = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Cancel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGIN.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LOGIN.setText("Login");
        LOGIN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LOGINMouseClicked(evt);
            }
        });
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        getContentPane().add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 90, 40));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REAL ESTATE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/33.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 420));
        getContentPane().add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 170, 30));

        password.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.setText("Password :");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 90, 30));

        pw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwActionPerformed(evt);
            }
        });
        getContentPane().add(pw, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 270, 170, 30));

        Clickhere.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Clickhere.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clickhere.setText("Add new owner account? click here");
        Clickhere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClickhereMouseClicked(evt);
            }
        });
        getContentPane().add(Clickhere, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 310, 290, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setText("LOGIN FORM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 130, -1));

        Cancel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cancel.setText("Cancel");
        getContentPane().add(Cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 90, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel7.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("REAL ESTATE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        username.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        username.setText("Username :");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 90, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/33.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 420));

        jLabel10.setBackground(new java.awt.Color(204, 204, 255));
        jLabel10.setOpaque(true);
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 280, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LOGINMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGINMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LOGINMouseClicked

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed

        dbConnector db = new dbConnector();
        
        if (uname.getText().isEmpty() && pw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter your username & password !!.");
        } else if (uname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please cannot be empty.");
        } else if (pw.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Password cannot be empty.");
            
        } else if (loginAccount(uname.getText(), pw.getText())) 
            {
                if (!status1.equals("Active")) 
                {
                    JOptionPane.showMessageDialog(null, "Pending Account, Please wait for the approval");
                } else 
                {
                    JOptionPane.showMessageDialog(null, "Login successful!");

                    if (type1.equals("Admin")) 
                    {
                        AdminDashboard ad = new AdminDashboard();
                        ad.setVisible(true);
                        this.dispose();
                    }else if (type1.equals("User")) 
                    {
                        UserDashboard ud = new UserDashboard();
                        ud.setVisible(true);
                        this.dispose();
                    }  else {
                        JOptionPane.showMessageDialog(null, "No account type found!");
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Account, Please register first !!" );
            
        }
    }//GEN-LAST:event_LOGINActionPerformed

    private void pwActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwActionPerformed

    private void ClickhereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClickhereMouseClicked
        Registration r = new Registration();
        r.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ClickhereMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JLabel Clickhere;
    private javax.swing.JButton LOGIN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField pw;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
