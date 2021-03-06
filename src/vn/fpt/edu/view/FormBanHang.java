/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

import java.io.IOException;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.*;
import vn.fpt.edu.beans.ChiTietHDX;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.Date;
import jxl.write.WriteException;
import vn.fpt.edu.beans.users;
import vn.fpt.edu.process.*;

/**
 *
 * @author Le Huy
 */
public class FormBanHang extends javax.swing.JFrame {

    JLabel lblmaHd = new JLabel();
    PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();
    int maHd;
    String mdh;

    /**
     * Creates new form FormBanHang
     */
    public FormBanHang() {
        initComponents();

        jLabel2.setVisible(false);
        HoaDonXuat tm = new HoaDonXuat();
        maHd = tm.getMhd();
        tm.HoaDonXuat();
        users u = new users();
        System.out.println(maHd);
        txtTenNhanVien.setText(u.getMauser() + "");
        txtma.setDocument(new DigitsDocument());
        
        // getDataGioHang();

        //  String a=(String) jSpinner1.getValue();
        //  int giatien=Integer.parseInt(txtGia.getText())*Integer.parseInt(a);
        // JOptionPane.showMessageDialog(null, a);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        pnlMain = new javax.swing.JPanel();
        pnltop = new javax.swing.JPanel();
        lblMaHang = new javax.swing.JLabel();
        lblTenHang = new javax.swing.JLabel();
        lblDonVi = new javax.swing.JLabel();
        cbDonVi = new javax.swing.JComboBox<>();
        lblNhaSanXuat = new javax.swing.JLabel();
        lblNgaySanXuat = new javax.swing.JLabel();
        lblHanSuDung = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        txtTenHang = new javax.swing.JLabel();
        txtNgaySX = new javax.swing.JLabel();
        txtNSX = new javax.swing.JLabel();
        txtHSD = new javax.swing.JLabel();
        txtGia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        pnlLeft = new javax.swing.JPanel();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblGia1 = new javax.swing.JLabel();
        lblgia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtTenNhanVien = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Bán Hàng");

        lblMaHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaHang.setText("Mã hàng");

        lblTenHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenHang.setText("Tên hàng");

        lblDonVi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDonVi.setText("Đơn vị");

        cbDonVi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDonVi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "Hộp", "Cái" }));

        lblNhaSanXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNhaSanXuat.setText("Nhà sản xuất");

        lblNgaySanXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNgaySanXuat.setText("Ngày sản xuất");

        lblHanSuDung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHanSuDung.setText("Hạn sử dụng");

        lblGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGia.setText("Đơn giá");

        lblSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoLuong.setText("Số lượng");

        txtma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnltopLayout = new javax.swing.GroupLayout(pnltop);
        pnltop.setLayout(pnltopLayout);
        pnltopLayout.setHorizontalGroup(
            pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltopLayout.createSequentialGroup()
                .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnltopLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTenHang)
                            .addComponent(lblMaHang)))
                    .addGroup(pnltopLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblSoLuong)))
                .addGap(49, 49, 49)
                .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgaySanXuat)
                    .addComponent(lblDonVi))
                .addGap(42, 42, 42)
                .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgaySX, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnltopLayout.createSequentialGroup()
                        .addComponent(lblGia)
                        .addGap(69, 69, 69)
                        .addComponent(txtGia, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnltopLayout.createSequentialGroup()
                        .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHanSuDung)
                            .addComponent(lblNhaSanXuat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnltopLayout.createSequentialGroup()
                                .addComponent(txtNSX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnltopLayout.createSequentialGroup()
                                .addComponent(txtHSD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );
        pnltopLayout.setVerticalGroup(
            pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltopLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNhaSanXuat)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNSX))
                .addGap(15, 15, 15)
                .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblTenHang)
                    .addComponent(lblNgaySanXuat)
                    .addComponent(lblHanSuDung)
                    .addComponent(txtTenHang)
                    .addComponent(txtNgaySX)
                    .addComponent(txtHSD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnltopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lblSoLuong)
                    .addComponent(lblDonVi)
                    .addComponent(cbDonVi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGia)
                    .addComponent(txtGia)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnTim.setText("Tìm");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLeftLayout = new javax.swing.GroupLayout(pnlLeft);
        pnlLeft.setLayout(pnlLeftLayout);
        pnlLeftLayout.setHorizontalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnThanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlLeftLayout.setVerticalGroup(
            pnlLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTim)
                .addGap(18, 18, 18)
                .addComponent(btnThem)
                .addGap(18, 18, 18)
                .addComponent(btnXoa)
                .addGap(18, 18, 18)
                .addComponent(btnThanhToan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã hàng", "Tên hàng", "Số lượng", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        lblGia1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGia1.setText("Tổng tiền:");

        lblgia.setText("0");

        jLabel1.setText("Nhân Viên:");

        txtTenNhanVien.setText("jLabel3");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(pnlLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGia1)
                                .addGap(18, 18, 18)
                                .addComponent(lblgia, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))))
                    .addComponent(pnltop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnltop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGia1)
                            .addComponent(lblgia)
                            .addComponent(jLabel1)
                            .addComponent(txtTenNhanVien))
                        .addContainerGap(23, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:

        xoa();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        Tim();
    }//GEN-LAST:event_btnTimActionPerformed

    private void txtmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmaActionPerformed

    }//GEN-LAST:event_txtmaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        ThemHang();

        txtGia.setText("");
        txtHSD.setText("");
        txtNSX.setText("");
        txtNgaySX.setText("");
        txtTenHang.setText("");

       
        jSpinner1.setValue(0);
        txtma.setText("");
        getDataGioHang();
        tt();
    }//GEN-LAST:event_btnThemActionPerformed
    public void tt() {
        TinhTienHDX tt = new TinhTienHDX();
        int a = tt.TinhTienHDX(maHd, jTable1.getRowCount());
        String b = Integer.toString(a);
        lblgia.setText(b);
    }
    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        
        thanhtoan();
        try {
            XuatHDX hdx = new XuatHDX(maHd);
        } catch (IOException ex) {
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (WriteException ex) {
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed
    public void Tim() {
        String sql = "select * from hanghoa where mahanghoa=?";
        try {
            ;
            stm = cnn.prepareStatement(sql);
            stm.setString(1, txtma.getText());
            rs = stm.executeQuery();
            Vector data = new Vector();
            while (rs.next()) {
                Vector user = new Vector();
                txtma.setText(rs.getString(1));
                txtTenHang.setText(rs.getString(2));
                JTextField donVi = new JTextField();
                donVi.setText(rs.getString(3));
                String a = donVi.getText();
                if (a.equalsIgnoreCase("Kg")) {
                    cbDonVi.setSelectedIndex(0);
                } else if (a.equalsIgnoreCase("Hộp")) {
                    cbDonVi.setSelectedIndex(1);
                } else {
                    cbDonVi.setSelectedIndex(2);
                }

                txtNgaySX.setText(rs.getString(4));
                txtNSX.setText(rs.getString(5));
                txtHSD.setText(rs.getString(6));
                txtGia.setText(rs.getString(8));
                jLabel2.setText(rs.getString(7));

            }
            jSpinner1.setEnabled(true);
            // tableList.setModel(new DefaultTableModel(data, tittle));
        } catch (SQLException ex) {
            Logger.getLogger(FormQuanLy.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ko có hàng");
        }
    }

    
    public void close() {
        this.dispose();
    }

    public void thanhtoan() {
        TinhTienHDX tt = new TinhTienHDX();
        tt.ThanhToan(maHd, jTable1.getRowCount());

    }

    public void getDataGioHang() {
        Vector head = new Vector();

        head.add("mã HDX");
        head.add("Đơn giá");
        head.add("Số lượng");
        head.add("Mã Hàng");
        head.add("Thành tiền");

        getDataHDX dt = new getDataHDX();
        // dt.getDataHDX(maHd);

        jTable1.setModel(new DefaultTableModel(dt.getDataHDX(maHd), head));

    }

    public void ThemHang() {
try{
        int a = Integer.parseInt(txtGia.getText());
        int b = (int) jSpinner1.getValue();
        ThemHangVaoGio m = new ThemHangVaoGio(maHd, txtGia.getText(), jSpinner1.getValue() + "", txtma.getText(), a * b + "");
}
catch(Exception e){
JOptionPane.showMessageDialog(null, "chưa chọn hàng");
}
    }

    public void xoa() {
        int row = jTable1.getSelectedRow();
        int a = (int) jTable1.getValueAt(row, 1);
        // if(JOptionPane.showConfirmDialog(null, maHd, mdh, WIDTH, HEIGHT))
        XoaHangTrongGio xh = new XoaHangTrongGio(a, maHd);
        getDataGioHang();

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbDonVi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDonVi;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblGia1;
    private javax.swing.JLabel lblHanSuDung;
    private javax.swing.JLabel lblMaHang;
    private javax.swing.JLabel lblNgaySanXuat;
    private javax.swing.JLabel lblNhaSanXuat;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenHang;
    private javax.swing.JLabel lblgia;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnltop;
    private javax.swing.JLabel txtGia;
    private javax.swing.JLabel txtHSD;
    private javax.swing.JLabel txtNSX;
    private javax.swing.JLabel txtNgaySX;
    private javax.swing.JLabel txtTenHang;
    private javax.swing.JLabel txtTenNhanVien;
    private javax.swing.JTextField txtma;
    // End of variables declaration//GEN-END:variables
}

class OrderDetail {

    private int ID;

    /*
            Làm như cái này này
            cái result set thì nhét dữ liệu bằng cái này
            Orderdetail o = new (rs.getInt(1),....)
            xong rồi add thằng này vào trong vector
            thôi nhé =.=
            hết mẹ 20p rồi =.=
            =mo)ử)\
            memowr  
            mở cái source ra sợ vl :V 
            m k làm theo MVC à :V 
            em làm xong mới chia lại đrạit mvc =)
            địt mẹ điên =)))
            chia từ đầu đi =)))
            project bên anh 
            anh bắt bọn nó làm 1 bảng bên database là 1 class bên java
            lúc lấy dữ liệu đóng gói dễ hơn
            thế nhé :v goodluck :V 
            ok 
     */
}
