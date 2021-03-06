/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TitledPane;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vn.fpt.edu.beans.users;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.process.LayduLieuNhanVien;
import vn.fpt.edu.process.SuaNhanVien;
import vn.fpt.edu.process.XoaNhanVien;
import vn.fpt.edu.process.*;

/**
 *
 * @author Le Huy
 */
public class FormQuanLy extends javax.swing.JFrame {

    String maUser = null;
    Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;
    Vector tittle = new Vector();

    /**
     * Creates new form FormQuanLy
     */
    public FormQuanLy() {

        initComponents();
        layData();
        txtTimKiem.setDocument(new DigitsDocument()); 

    }

    public String getMaUserTb() {

        int a = tableList.getSelectedRow();
        maUser = (String) tableList.getValueAt(a, 0);
        //System.out.println(maUser);

        return maUser;
    }

    public String getmanv() {
        return getMaUserTb();
    }

    public void layData() {
        tittle.add("Mã");
        tittle.add("ten");
        tittle.add("sdt");
        tittle.add("email");
        tittle.add("ngay sinh");
        tittle.add("chuc vu");
        LayduLieuNhanVien ldlnv = new LayduLieuNhanVien();
        tableList.setModel(new DefaultTableModel(ldlnv.LayduLieuNhanVien(), tittle));
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
        txtTimKiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblDanhSachNhanVien = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Quản lý");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnThem)
                .addGap(39, 39, 39)
                .addComponent(btnSua)
                .addGap(48, 48, 48)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 407, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTimKiem)
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        lblDanhSachNhanVien.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDanhSachNhanVien.setText("Danh Sách Nhân Viên");

        tableList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tableList);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDanhSachNhanVien)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblDanhSachNhanVien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        FormThemNhanVien t = new FormThemNhanVien();
        t.setVisible(true);
        t.setSize(380, 500);
        t.setLocationRelativeTo(null);
        layData();
        this.dispose();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed

        int row = tableList.getSelectedRow();
        String mauser = (String) tableList.getValueAt(row, 0);
        XoaNhanVien xnv = new XoaNhanVien(mauser);
        this.dispose();
        FormQuanLy m=new FormQuanLy();
        m.setVisible(true);
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:

      
        FormSuaUsers t = new FormSuaUsers();
        t.setVisible(true);
        //t.setSize(380, 500);
        t.setLocationRelativeTo(null);
t.getmanv(getMaUserTb());
t.setTitle(txtTimKiem.getText());
LayduLieuNhanVien dl=new LayduLieuNhanVien();
  t.getdata(getMaUserTb(), dl.getten(getMaUserTb()), dl.getsdt(getMaUserTb()), dl.getemail(getMaUserTb()), dl.getngaysinh(getMaUserTb()), dl.getchucvu(getMaUserTb()), dl.getmatkhau(getMaUserTb()), dl.gettaikhoan(getMaUserTb()), dl.getgioitinh(getMaUserTb()));
        this.dispose();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
      FormTimUser t = new FormTimUser();
        t.setVisible(true);
        //t.setSize(380, 500);
        t.setLocationRelativeTo(null);
t.getmanv(txtTimKiem.getText());
t.setTitle(txtTimKiem.getText());
LayduLieuNhanVien dl=new LayduLieuNhanVien();
  t.getdata(txtTimKiem.getText(), dl.getten(txtTimKiem.getText()), dl.getsdt(txtTimKiem.getText()), dl.getemail(txtTimKiem.getText()), dl.getngaysinh(txtTimKiem.getText()), dl.getchucvu(txtTimKiem.getText()), dl.getmatkhau(txtTimKiem.getText()), dl.gettaikhoan(txtTimKiem.getText()), dl.getgioitinh(txtTimKiem.getText()));
        this.dispose();
    }//GEN-LAST:event_btnTimKiemActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDanhSachNhanVien;
    private javax.swing.JTable tableList;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
