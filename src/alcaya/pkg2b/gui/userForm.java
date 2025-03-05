/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alcaya.pkg2b.gui;

import admin.addpatient;
import admin.adminDashboard;
import admin.updatpatient;
import config.dbConnect;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author alcay
 */
public class userForm extends javax.swing.JFrame {
private javax.swing.JLabel approved;
    private javax.swing.JLabel pending;
    private javax.swing.JLabel regis;
    /**
     * Creates new form userForm
     */
    public userForm() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        displayData();
         getTotalAcc();
        getPatientCount();
        getPendingAccount();   
        getDoctorCount();
        getStaffCount();
    }
        Color navcolor = new Color (0,102,102);
    Color headcolor = new Color (51,51,51);
    Color bodycolor = new Color (51,51,51);
    
    public void displayData() {
        try {
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT p_id,fn,cityAddress,contactNo,username,usertype,status FROM patient");
            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
        } catch (SQLException ex) {
            System.out.println("Errors: " + ex.getMessage());
        }
    }
    
    public void getTotalAcc() {
        try {
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT COUNT(*) FROM patient ");
            if (rs.next()) {
                int count = rs.getInt(1);
               ta.setText(String.valueOf(count));
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }
public void getPatientCount() {
        try {
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT COUNT(*) FROM patient WHERE usertype = 'Patient'");
            if (rs.next()) {
                int count = rs.getInt(1);
                pc.setText(String.valueOf(count));
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }
public void getPendingAccount() {
        try {
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT COUNT(*) FROM patient WHERE status = 'Pending'");
            if (rs.next()) {
                int count = rs.getInt(1);
                pa.setText(String.valueOf(count));
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }
public void getDoctorCount() {
        try {
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT COUNT(*) FROM patient WHERE usertype = 'Doctor'");
            if (rs.next()) {
                int count = rs.getInt(1);
                doc.setText(String.valueOf(count));
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
        }
    }
public void getStaffCount() {
        try {
            dbConnect dbc = new dbConnect();
            ResultSet rs = dbc.getData("SELECT COUNT(*) FROM patient WHERE usertype = 'Staff'");
            if (rs.next()) {
                int count = rs.getInt(1);
                staff.setText(String.valueOf(count));
            }
        } catch (SQLException ex) {
            System.out.println("" + ex);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        pa = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        staff = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        add = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        up = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        del = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ref = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ta = new javax.swing.JLabel();
        userty = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setForeground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/menu.png"))); // NOI18N
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel5.setText("I");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        acc_name.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        acc_name.setForeground(new java.awt.Color(204, 204, 204));
        acc_name.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/person.png"))); // NOI18N
        jPanel3.add(acc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 10, 170, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 25)); // NOI18N
        jLabel18.setText("USER FORM");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 160, -1));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 30));
        jPanel3.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 60, 110, 10));
        jPanel3.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 240, 10));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 170, 410));

        jPanel4.setBackground(new java.awt.Color(238, 238, 238));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pa.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        pa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/GWAPO.png"))); // NOI18N
        jPanel4.add(pa, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 120, 60));

        pc.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        pc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/patienticon.png"))); // NOI18N
        jPanel4.add(pc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 100, 80));

        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel19.setText("Pending Accounts");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 140, 20));

        jLabel20.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel20.setText("Total Accounts");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 120, 30));

        jLabel21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel21.setText("Staff");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 50, 90, 20));
        jPanel4.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 150, 20));
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 150, 10));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 150, 20));

        jLabel23.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel23.setText("Patients");
        jPanel4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 60, 20));

        doc.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        doc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hahsy.png"))); // NOI18N
        jPanel4.add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, 130, 60));
        jPanel4.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 150, -1));

        staff.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        staff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sssstaaff.png"))); // NOI18N
        staff.setText(" ");
        jPanel4.add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 140, 60));

        jLabel24.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        jLabel24.setText("Doctors");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, 90, 20));
        jPanel4.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 70, 150, 10));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        table.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Full Name", "City & Address", "Date of Birth", "Email", "Contact Number", "Username", "Password", "UserType", "Status"
            }
        ));
        jScrollPane1.setViewportView(table);

        jScrollPane2.setViewportView(jScrollPane1);

        jPanel5.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 820, 260));

        jLabel22.setFont(new java.awt.Font("Segoe UI Semilight", 2, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ACCOUNT REGISTERED OVERVIEW :");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 300, 20));

        add.setBackground(new java.awt.Color(51, 51, 51));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
        });
        add.setLayout(null);

        jPanel7.setLayout(null);
        add.add(jPanel7);
        jPanel7.setBounds(0, 0, 0, 0);

        jLabel2.setBackground(new java.awt.Color(153, 0, 153));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("       ADD");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jLabel2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel2KeyPressed(evt);
            }
        });
        add.add(jLabel2);
        jLabel2.setBounds(0, 10, 100, 22);

        jPanel5.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 100, 40));

        up.setBackground(new java.awt.Color(51, 51, 51));
        up.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                upMouseExited(evt);
            }
        });
        up.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("     UPDATE");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        up.add(jLabel3);
        jLabel3.setBounds(0, 10, 100, 20);

        jPanel5.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 100, 40));

        del.setBackground(new java.awt.Color(51, 51, 51));
        del.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delMouseExited(evt);
            }
        });
        del.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("     DELETE");
        del.add(jLabel6);
        jLabel6.setBounds(0, 10, 100, 20);

        jPanel5.add(del, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 100, 40));

        ref.setBackground(new java.awt.Color(51, 51, 51));
        ref.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refMouseExited(evt);
            }
        });
        ref.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("     REFRESH");
        ref.add(jLabel1);
        jLabel1.setBounds(0, 10, 100, 20);

        jPanel5.add(ref, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 100, 40));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_user_group_woman_man_24px.png"))); // NOI18N
        jLabel13.setText("Users");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 240, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sort_window_24px.png"))); // NOI18N
        jLabel10.setText("Logout");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Features");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_24px.png"))); // NOI18N
        jLabel12.setText("Home ");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 80, 40));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 940, 320));

        ta.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        ta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/acc.png"))); // NOI18N
        jPanel4.add(ta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 110, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 960, 410));

        userty.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        userty.setText(" ");
        getContentPane().add(userty, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 230, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        loginForm log = new loginForm();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        userForm usf = new userForm();
        usf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new adminDashboard().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered

    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited

    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        addpatient apt = new addpatient();
        apt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel2KeyPressed
        addpatient apt = new addpatient();
        apt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2KeyPressed

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(navcolor);
    }//GEN-LAST:event_addMouseEntered

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setBackground(headcolor);
    }//GEN-LAST:event_addMouseExited

    private void upMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseEntered
        up.setBackground(navcolor);
    }//GEN-LAST:event_upMouseEntered

    private void upMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upMouseExited
        up.setBackground(headcolor);
    }//GEN-LAST:event_upMouseExited

    private void delMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseEntered
        del.setBackground(navcolor);
    }//GEN-LAST:event_delMouseEntered

    private void delMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delMouseExited
        del.setBackground(headcolor);
    }//GEN-LAST:event_delMouseExited

    private void refMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseEntered
        ref.setBackground(navcolor);
    }//GEN-LAST:event_refMouseEntered

    private void refMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refMouseExited
        ref.setBackground(headcolor);
    }//GEN-LAST:event_refMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        int rowIndex = table.getSelectedRow();
        
        if(rowIndex<0){
         JOptionPane.showMessageDialog(null, "Please Select an Item");
        }else{
         try{
             
         
         dbConnect dbc = new dbConnect();
         TableModel tbl = table.getModel();
        ResultSet rs = dbc.getData("SELECT * FROM patient WHERE p_id = '" + tbl.getValueAt(rowIndex, 0) + "'");
        if(rs.next()){
         updatpatient adp = new updatpatient();
         adp.id.setText(""+rs.getInt("p_id"));
         adp.fn.setText(""+rs.getString("fn")); 
         adp.ct.setText(""+rs.getString("cityAddress")); 
         adp.cn.setText(""+rs.getString("contactNo")); 
         adp.em.setText(""+rs.getString("email")); 
         adp.un.setText(""+rs.getString("username")); 
         adp.pass.setText(""+rs.getString("password")); 
         adp.utype.setSelectedItem(""+rs.getString("usertype")); 
         adp.status.setSelectedItem(""+rs.getString("status"));
         adp.add.setEnabled(false);
         adp.update.setEnabled(true);
         adp.setVisible(true);
         this.dispose();
        }
         
       
        }catch(SQLException ex){
             System.out.println(""+ex);
        }
        }
        TableModel tbl = table.getModel();
      
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static final javax.swing.JLabel acc_name = new javax.swing.JLabel();
    private javax.swing.JPanel add;
    private javax.swing.JPanel del;
    private javax.swing.JLabel doc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel pa;
    private javax.swing.JLabel pc;
    private javax.swing.JPanel ref;
    private javax.swing.JLabel staff;
    private javax.swing.JLabel ta;
    private javax.swing.JTable table;
    private javax.swing.JPanel up;
    private javax.swing.JLabel userty;
    // End of variables declaration//GEN-END:variables
}
