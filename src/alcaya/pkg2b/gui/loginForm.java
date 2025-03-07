
package alcaya.pkg2b.gui;

import admin.addpatient;
import admin.adminDashboard;
import admin.dashBoard;
import cashier.cashierDashboard;
import config.Session;
import config.dbConnect;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.management.remote.JMXConnectorFactory.connect;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class loginForm extends javax.swing.JFrame {

    /**
     * Creates new form loginForm
     */
    public loginForm() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.icon2.setVisible(false);
    }
        static String status;
        static String usertype;
        Connection con;
        PreparedStatement pst;
        
        Color hover = new Color (204,255,255);
        Color defaultcolor = new Color (0,204,255);
        
    public static boolean loginAcc(String username,String password){
        dbConnect connect = new dbConnect();

        try{
            String query = "SELECT * FROM patient WHERE username = '" +username+ "' AND password = '" +password+"'";
            ResultSet resultSet = connect.getData(query);
            if(resultSet.next()){
                status = resultSet.getString("status");
                usertype = resultSet.getString("usertype");
                Session sess = Session.getInstance();
                sess.setPid(resultSet.getInt("p_id"));
                sess.setFn(resultSet.getString("fn"));
                sess.setCityAddress(resultSet.getString("cityAddress"));
                sess.setDateofBirth(resultSet.getString("dateofBirth"));
                sess.setEmail(resultSet.getString("email"));
                sess.setContactNo(resultSet.getString("contactNo"));
                sess.setUsername(resultSet.getString("username"));
                sess.setPassword(resultSet.getString("password"));
                sess.setUsertype(resultSet.getString("usertype"));
                sess.setStatus(resultSet.getString("status"));
                System.out.println(""+sess.getPid());
                return true;
            }else {
                return false;
            }
        }catch(SQLException ex){
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        login = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        icon2 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setText("LOG IN");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 230, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel4.setText("Username :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 100, 30));

        un.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        un.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        un.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unActionPerformed(evt);
            }
        });
        jPanel1.add(un, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, 350, 50));

        login.setBackground(new java.awt.Color(102, 204, 255));
        login.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/login.png"))); // NOI18N
        login.setText("Login");
        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                loginMouseExited(evt);
            }
        });
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 160, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semilight", 1, 16)); // NOI18N
        jLabel5.setText("Don't have an account? Register here");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 470, 310, 30));

        jCheckBox1.setBackground(new java.awt.Color(51, 255, 255));
        jCheckBox1.setForeground(new java.awt.Color(51, 255, 255));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, 30, 0));

        icon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eyehide.png"))); // NOI18N
        icon2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon2MousePressed(evt);
            }
        });
        jPanel1.add(icon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eyeee.png"))); // NOI18N
        icon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                icon1MousePressed(evt);
            }
        });
        icon1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                icon1KeyPressed(evt);
            }
        });
        jPanel1.add(icon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        pass.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 350, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/weweew-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 70, 70));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel6.setText("ABOUT US");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 90, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel9.setText("CONTACT US");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 110, 20));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("HOSITAL  BILLING SYSTEM");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 320, 60));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel11.setText("WE ARE HERE FOR YOU!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 430, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel12.setText("EXIT");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 50, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel15.setText("HOME ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 60, 20));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ambulance-removebg-preview.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 120, 70));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel8.setText("Password :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 100, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 170, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/image.background2.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
      String username = un.getText();
    String password = new String(pass.getPassword());

if (un.getText().isEmpty() && pass.getPassword().length == 0) {
    JOptionPane.showMessageDialog(null, "Invalid Email and Password");
} else if (un.getText().isEmpty()) {
    JOptionPane.showMessageDialog(null, "Username is required");
} else if (pass.getPassword().length == 0) {
    JOptionPane.showMessageDialog(null, "Password is required");
} else if (pass.getPassword().length < 8) {
    JOptionPane.showMessageDialog(null, "Password should have at least 8 characters");
    pass.setText("");
} else {
    
    if(loginAcc(username,password)){
    
    dbConnect db = new dbConnect();
    boolean isValidUser = db.checkLogin(username, password);

    if (isValidUser) {
        String usertype = db.getUserType(username);

        if ("Doctor".equalsIgnoreCase(usertype)) {
            new adminDashboard().setVisible(true);
        } else if ("Staff".equalsIgnoreCase(usertype)) {
            new dashBoard().setVisible(true);
         } else if ("Patient".equalsIgnoreCase(usertype)) {
            new dashBoard().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid UserType");
        }

        this.setVisible(false);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Invalid username or password");
    }
    
    }
    
}
    }//GEN-LAST:event_loginActionPerformed

    private void loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseEntered
        login.setBackground(hover);
    }//GEN-LAST:event_loginMouseEntered

    private void loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseExited
       login.setBackground(defaultcolor );
    }//GEN-LAST:event_loginMouseExited

    private void unActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
         if (jCheckBox1.isSelected()){
            pass.setEchoChar((char)0);
         }
        else{
            pass.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginMouseClicked
        dashBoard dbd = new dashBoard();
        dbd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginMouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void icon2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon2MousePressed
       icon1.setVisible(true);
        icon2.setVisible(false);
        pass.setEchoChar('*');
        
    }//GEN-LAST:event_icon2MousePressed

    private void icon1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_icon1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_icon1KeyPressed

    private void icon1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon1MousePressed
         icon2.setVisible(true);
        icon1.setVisible(false);
        pass.setEchoChar((char)0);
    }//GEN-LAST:event_icon1MousePressed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
       int a = JOptionPane.showConfirmDialog(null,"Do you want to Close the System?","Select",JOptionPane.YES_NO_OPTION);
       if(a==0)
       {
           System.exit(0);
       }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       registrationForm rfm = new registrationForm();
        rfm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
    }//GEN-LAST:event_jLabel5MouseEntered
    
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
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new loginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel icon2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField un;
    // End of variables declaration//GEN-END:variables
}
