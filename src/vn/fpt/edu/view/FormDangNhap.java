/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

import vn.fpt.edu.connect.Connect;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Le Huy
 */
public class FormDangNhap extends javax.swing.JFrame {

    Connect cnn = new Connect();     Vector id = null,pass=null;
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;

    /**
     * Creates new form FormDangNhap
     */
    public FormDangNhap() {
        initComponents();
        
    }

    public void check() {
        String sql="select * from users where taikhoan=? and matkhau=?";
        try {
            stm=cn.prepareStatement(sql);
            stm.setString(1, txtTaiKhoan.getText());
            stm.setString(2, txtMatKhau.getText());
            ResultSet rs=stm.executeQuery();
            while(rs.next()){
             
            
            if(rs.getString(1).equals(txtTaiKhoan.getText())&&rs.getString(2
            ).equals(txtMatKhau.getText())){
                JOptionPane.showMessageDialog(null, "Login sucess");
                FormQuanLy t=new FormQuanLy();
                t.setVisible(true);
        t.setSize(900, 500);
        t.setLocationRelativeTo(null);}
            else
                JOptionPane.showMessageDialog(null, "sai tk/mk");}
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi ở "+ex);
            Logger.getLogger(FormDangNhap.class.getName()).log(Level.SEVERE, null, ex);
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

        lblTaiKhoan = new javax.swing.JLabel();
        lblDangNhap = new javax.swing.JLabel();
        lblMatKhau = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JTextField();
        btnDangNhap = new javax.swing.JButton();
        txtTaiKhoan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 500));

        lblTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTaiKhoan.setText("Tài khoản");

        lblDangNhap.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblDangNhap.setText("Đăng nhập");

        lblMatKhau.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMatKhau.setText("Mật khẩu");

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("PHẦN MỀM QUẢN LÝ BÁN HÀNG SIÊU THỊ MINI");

        txtMatKhau.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatKhauActionPerformed(evt);
            }
        });

        btnDangNhap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        txtTaiKhoan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(289, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMatKhau)
                            .addComponent(lblTaiKhoan))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDangNhap)
                            .addComponent(lblDangNhap)))
                    .addComponent(lblTitle))
                .addGap(259, 259, 259))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblTitle)
                .addGap(83, 83, 83)
                .addComponent(lblDangNhap)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTaiKhoan)
                    .addComponent(txtTaiKhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMatKhau)
                    .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnDangNhap)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatKhauActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
check();

    }//GEN-LAST:event_btnDangNhapActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel lblDangNhap;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables
}
