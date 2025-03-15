/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Logs.Login;
import dbConnect.dbConnector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Windows 10
 */
public class CreateUserForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateUserForm
     */
    public CreateUserForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        name1 = new javax.swing.JLabel();
        IID = new javax.swing.JTextField();
        name = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        LastName = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        password1 = new javax.swing.JTextField();
        dob1 = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        stats1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cnum = new javax.swing.JTextField();
        stats2 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        status = new javax.swing.JComboBox<>();
        stats = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(153, 153, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Creat User Form");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 300, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 50));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name1.setText("USER ID :");
        jPanel1.add(name1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 90, 20));

        IID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IIDActionPerformed(evt);
            }
        });
        jPanel1.add(IID, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 180, 30));

        name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        name.setText("FIRSTNAME:");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 90, 20));

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 180, 30));

        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        jPanel1.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, -1));

        LastName.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        LastName.setText("LASTNAME:");
        jPanel1.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 80, 20));

        user.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        user.setText("USERNAME:");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, -1));

        password1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password1ActionPerformed(evt);
            }
        });
        jPanel1.add(password1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 170, -1));

        dob1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dob1.setText("PASSWORD:");
        jPanel1.add(dob1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        dob.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dob.setText("CONFIRM PASSWORD :");
        jPanel1.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 190, 30));

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 190, 30));

        stats1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stats1.setText("EMAIL:");
        jPanel1.add(stats1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("PHONENUMBER:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, -1, -1));

        cnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnumActionPerformed(evt);
            }
        });
        jPanel1.add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 190, 30));

        stats2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stats2.setText("ACCOUNT TYPE :");
        jPanel1.add(stats2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 120, 20));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin" }));
        type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeActionPerformed(evt);
            }
        });
        jPanel1.add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 190, 30));

        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Pending" }));
        jPanel1.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 190, 30));

        stats.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        stats.setText("USER STATUS :");
        jPanel1.add(stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 110, -1));

        add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 100, 30));

        update.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, 30));

        remove.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        remove.setText("REMOVE");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 100, 30));

        refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refresh.setText("REFRESH");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 100, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 100, 30));

        register.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        jPanel1.add(register, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 100, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 690, 310));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty()
            || password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(password.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            password.setText("");
        }else if(!isValidEmail(email.getText())){
            JOptionPane.showMessageDialog(null, "Invalid Email");
        } else if (!isNumeric(cnum.getText())) {
            JOptionPane.showMessageDialog(null, "Contact number must contain only numbers.");
        }else if(cnum.getText().length() > 15 || cnum.getText().length() < 11)
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone num");
        }else{

            dbConnector dbc = new dbConnector();

            if (dbc.insertData("INSERT INTO user(i_fname, i_lname, i_username, i_password, i_email, i_phonenumber, i_type, status) "
                + "VALUES('" + fname.getText() + "', '" + lname.getText() + "', '"
                + username.getText() + "', '" + password.getText() + "', '"
                + email.getText() + "','" + cnum.getText() + "', '" + type.getSelectedItem().toString() + "', 'PENDING')")) {
            JOptionPane.showMessageDialog(null, "Register Successfully");

            JOptionPane.showMessageDialog(null, "Inserted Successfully!");
            Login ads = new Login();
            ads.setVisible(true);
            this.dispose();

        }else{
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
        }
    }//GEN-LAST:event_fnameActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed

    }//GEN-LAST:event_registerActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        U_Admin ua = new U_Admin();
        ua.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        if(fname.getText().isEmpty() || lname.getText().isEmpty() || email.getText().isEmpty() || username.getText().isEmpty()
            || password.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(password.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            password.setText("");
        }else if(!isValidEmail(email.getText())){
            JOptionPane.showMessageDialog(null, "Invalid Email");
        } else if (!isNumeric(cnum.getText())) {
            JOptionPane.showMessageDialog(null, "Contact number must contain only numbers.");
        }else if(cnum.getText().length() > 15 || cnum.getText().length() < 11)
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone num");
        }else{

            dbConnector dbc = new dbConnector();

            dbc.updateData("UPDATE user Set i_fname = '" + fname.getText() + "', i_lname =  '" + lname.getText() + "', i_username = '"+ username.getText() + "'"
                + ", i_password = '" + password.getText() + "', i_email = '"+ email.getText() + "', i_phonenumber = '" + cnum.getText() + "', i_type = '" + type.getSelectedItem().toString() + "', "
                + "status = '" + status.getSelectedItem().toString() + "'");

            U_Admin ua = new U_Admin();
            ua.setVisible(true);
            this.dispose();

        }
    }//GEN-LAST:event_updateActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removeActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refreshActionPerformed

    private void password1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password1ActionPerformed

    private void cnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnumActionPerformed

    private void IIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IIDActionPerformed

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
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateUserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField IID;
    private javax.swing.JLabel LastName;
    public javax.swing.JButton add;
    public javax.swing.JTextField cnum;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel dob1;
    public javax.swing.JTextField email;
    public javax.swing.JTextField fname;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField lname;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name1;
    public javax.swing.JTextField password;
    public javax.swing.JTextField password1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton register;
    private javax.swing.JButton remove;
    private javax.swing.JLabel stats;
    private javax.swing.JLabel stats1;
    private javax.swing.JLabel stats2;
    public javax.swing.JComboBox<String> status;
    public javax.swing.JComboBox<String> type;
    public javax.swing.JButton update;
    private javax.swing.JLabel user;
    public javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
private boolean isValidEmail(String text) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(text);
    return matcher.matches();

    }
    
    private boolean isNumeric(String text) {
        try {
        Double.parseDouble(text);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
    }
}

