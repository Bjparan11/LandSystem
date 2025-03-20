package Logs;


import Logs.Login;
import dbConnect.PasswordHasher;
import dbConnect.dbConnector;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class Registration extends javax.swing.JFrame {

    /**
     * Creates new form Registration
     */
    public Registration() {
        initComponents();
    }
    public static String em, usname;
    public boolean duplicateCheck(){
        
        dbConnector dbc = new dbConnector();
        
       try{
           String query = "SELECT * FROM user  WHERE i_username = '" +username.getText()+ "' OR i_email = '" + email.getText()+ "'";
            ResultSet resultSet = dbc.getData(query);
      if(resultSet.next()){
      em = resultSet.getString("i_email");
      if(em.equals(email.getText())){
      JOptionPane.showMessageDialog(null, "Email is Already Used! ");
      email.setText("");
      }
      usname = resultSet.getString("i_username");
      if(usname.equals(username.getText())){
          JOptionPane.showMessageDialog(null, "Username is Already Used! ");
      }
       username.setText("");
      return true;
      
      }else{
      return false;
      }
       }catch(SQLException ex){
           System.out.println(""+ex);
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

        jLabel2 = new javax.swing.JLabel();
        cnum = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cpass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 180, -1, 30));
        getContentPane().add(cnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 340, 180, 30));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REAL ESTATE MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(251, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/33.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 490, 420));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Confirm Password :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 140, 30));
        getContentPane().add(cpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 180, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("REGISTRATION FORM");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 230, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Logout");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 420, 110, 40));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Registration");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 120, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Last Name :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 90, 30));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("First Name :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 90, 30));
        getContentPane().add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 100, 180, 30));
        getContentPane().add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 140, 180, 30));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Phone Number :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 140, 30));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 220, 180, 30));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Password :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 80, 30));
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 180, 30));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Email :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 80, 30));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 300, 180, 30));

        type.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 380, 180, -1));

        jLabel3.setBackground(new java.awt.Color(204, 204, 255));
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 340, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Login ln = new Login();
       ln.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(fname.getText().isEmpty()|| lname.getText().isEmpty()|| username.getText().isEmpty()||
               password.getText().isEmpty()|| email.getText().isEmpty()
               || email.getText().isEmpty()|| cnum.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "All fields are required!");
        }else if(password.getText().length() < 8){
            JOptionPane.showMessageDialog(null, "Characters password is 8 above!");
            password.setText("");
        }else if(!password.getText().equals(cpass.getText())){
            JOptionPane.showMessageDialog(null, "Password Does Not Match");
            password.setText("");
        }else if(!isValidEmail(email.getText())){
            JOptionPane.showMessageDialog(null, "Invalid Email");
        } else if (!isNumeric(cnum.getText())) {
             JOptionPane.showMessageDialog(null, "Contact number must contain only numbers.");
        }else if(cnum.getText().length() > 15 || cnum.getText().length() < 11)
        {
            JOptionPane.showMessageDialog(null, "Invalid Phone num");
        }else if(duplicateCheck())
        {
            System.out.println("Duplicate Exists");
        }else{

            dbConnector dbc = new dbConnector();
            try
            {
            String pass = PasswordHasher.hashPassword(password.getText());

            if (dbc.insertData("INSERT INTO user(i_fname, i_lname, i_username, i_password, i_email, i_phonenumber, i_type, status) "
                + "VALUES('" + fname.getText() + "', '" + lname.getText() + "', '"
                + username.getText() + "', '" + pass + "', '"
                + email.getText() + "','" + cnum.getText() + "', '" + type.getSelectedItem().toString() + "', 'PENDING')")) {
            JOptionPane.showMessageDialog(null, "Register Successfully");

            Login ads = new Login();
            ads.setVisible(true);
            this.dispose(); 

        }
            }catch(NoSuchAlgorithmException ex){
                System.out.println(""+ex);
        }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cnum;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JPasswordField password;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JTextField username;
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
