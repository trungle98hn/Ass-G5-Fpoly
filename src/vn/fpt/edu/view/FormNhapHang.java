/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import vn.fpt.edu.beans.ChiTietHDN;
import vn.fpt.edu.beans.ChiTietHDX;
import vn.fpt.edu.beans.HoaDonNhap_DAO;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.process.*;
import vn.fpt.edu.process.ThemHangVaoGio;
import vn.fpt.edu.process.ThemHangVaoGioNhap;

/**
 *
 * @author Le Huy
 */
public class FormNhapHang extends javax.swing.JFrame {

    JLabel lblmaHd = new JLabel();
    JLabel lbl = new JLabel();
    PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();
    //int maHd;
    HoaDonNhap tm = new HoaDonNhap();
    int maHd = tm.getMhd();
    String mdh;
    Vector head = new Vector();
    Vector head1 = new Vector();
    Vector data = new Vector();

    /**
     * Creates new form FormNhapHang
     */
    public FormNhapHang() {
        initComponents();
        tm.HoaDonnhap();
       // getDataGioHang();
        head.add("Mã Hàng");
        head.add("mã HDn");
        head.add("Số lượng");
        head.add("Đơn giá");
        head.add("Thành tiền");
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
        pnlTop = new javax.swing.JPanel();
        lblNhaSanXuat1 = new javax.swing.JLabel();
        lblNgaySanXuat1 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        lblHanSuDung1 = new javax.swing.JLabel();
        lblGia1 = new javax.swing.JLabel();
        lblSoLuong1 = new javax.swing.JLabel();
        lblMaHang1 = new javax.swing.JLabel();
        txtMaHang = new javax.swing.JTextField();
        lblTenHang1 = new javax.swing.JLabel();
        lblDonVi1 = new javax.swing.JLabel();
        cbDonVi2 = new javax.swing.JComboBox<>();
        txtNhaSx = new javax.swing.JTextField();
        txtTenHang = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        pnlBottom = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLuu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbltongtien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nhập Hàng");

        lblNhaSanXuat1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNhaSanXuat1.setText("Nhà sản xuất");

        lblNgaySanXuat1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNgaySanXuat1.setText("Ngày sản xuất");

        lblHanSuDung1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHanSuDung1.setText("Hạn sử dụng");

        lblGia1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGia1.setText("Đơn giá");

        lblSoLuong1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoLuong1.setText("Số lượng");

        lblMaHang1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaHang1.setText("Mã hàng");

        txtMaHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaHangActionPerformed(evt);
            }
        });

        lblTenHang1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenHang1.setText("Tên hàng");

        lblDonVi1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDonVi1.setText("Đơn vị");

        cbDonVi2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbDonVi2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "Hộp", "Cái" }));

        txtNhaSx.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnlTopLayout = new javax.swing.GroupLayout(pnlTop);
        pnlTop.setLayout(pnlTopLayout);
        pnlTopLayout.setHorizontalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addComponent(lblNgaySanXuat1)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNhaSanXuat1)
                            .addComponent(lblDonVi1))
                        .addGap(27, 27, 27)
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTopLayout.createSequentialGroup()
                                .addComponent(cbDonVi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNhaSx, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))
                .addGap(36, 36, 36)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHanSuDung1)
                    .addComponent(lblGia1))
                .addGap(18, 18, 18)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDonGia)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(52, 52, 52))
            .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTopLayout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblTenHang1)
                        .addComponent(lblMaHang1)
                        .addComponent(lblSoLuong1))
                    .addGap(49, 49, 49)
                    .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtMaHang, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(660, Short.MAX_VALUE)))
        );
        pnlTopLayout.setVerticalGroup(
            pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTopLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNhaSanXuat1)
                    .addComponent(txtNhaSx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGia1)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlTopLayout.createSequentialGroup()
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblNgaySanXuat1)
                                .addComponent(lblHanSuDung1))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDonVi1)
                            .addComponent(cbDonVi2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlTopLayout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(lblMaHang1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMaHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(15, 15, 15)
                    .addComponent(lblTenHang1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(pnlTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(lblSoLuong1)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");

        btnLuu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLuu.setText("Lưu");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "mã hàng", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel1.setText("Tổng tiền:");

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(btnSua, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)))
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnLuu, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(lbltongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBottomLayout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(27, 27, 27)
                        .addComponent(btnXoa)
                        .addGap(31, 31, 31)
                        .addComponent(btnLuu)))
                .addGap(18, 18, 18)
                .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbltongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlBottom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
inserthanghoa();
       ThemHang();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtMaHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaHangActionPerformed

    }//GEN-LAST:event_txtMaHangActionPerformed
   public void inserthanghoa(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      
        String goidate = dateFormat.format(jDateChooser1.getDate());
        String goidate2 = dateFormat.format(jDateChooser2.getDate());
    int sl=   (int) jSpinner2.getValue();
        
       ThemHang tm=new ThemHang(txtMaHang.getText(), txtTenHang.getText(), (String) cbDonVi2.getSelectedItem(), goidate,txtNhaSx.getText() , goidate2, sl+"", txtDonGia.getText());
   }
    public void addhang() {
         String sql = "Select * from chitietHDn  where mahdn=?";

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, maHd + "");
            rs = stm.executeQuery();

//đéo hiểu sao query ra 2 cái giống nhau :3 
            while (rs.next()) {

                ChiTietHDN cthdx = new ChiTietHDN(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                data.add(cthdx.getMahanghoa());
                data.add(cthdx.getMahdn());
                data.add(cthdx.getSuongluonghang());
                data.add(cthdx.getGiatien());
                data.add(cthdx.getThanhtien());
                head1.add(data);
            }

          jTable1.setModel(new DefaultTableModel(head1, head));
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
//        }
//data.add(txtMaHang.getText());
//data.add(maHd);
//data.add(jSpinner2.getValue());
//data.add(txtDonGia.getText());
//String gia=txtDonGia.getText();
//int gja=Integer.parseInt(gia);
//int gja1=(int) jSpinner2.getValue();
//int c=gja*gja1;
//data.add(c);
//head1.add(data);
// jTable1.setModel(new DefaultTableModel(head1, head));
        }}

    public void getDataGioHang() {
        String sql = "Select * from chitietHDn  where mahdn=?";

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, maHd + "");
            rs = stm.executeQuery();

//đéo hiểu sao query ra 2 cái giống nhau :3 
            while (rs.next()) {

                ChiTietHDN cthdx = new ChiTietHDN(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                data.add(cthdx.getMahanghoa());
                data.add(cthdx.getMahdn());
                data.add(cthdx.getSuongluonghang());
                data.add(cthdx.getGiatien());
                data.add(cthdx.getThanhtien());
                head1.add(data);
            }

          jTable1.setModel(new DefaultTableModel(head1, head));
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sql1 = "select thanhtien from chitiethdn where mahdn=" + maHd + "";
        int tien = 0;

        int b = 0;
        Vector a = new Vector();
        Vector c = new Vector();
        int i = jTable1.getRowCount();

        try {
            stm = cnn.prepareStatement(sql1);
            rs = stm.executeQuery();
            while (rs.next()) {
                a.add(rs.getInt(1));

                System.out.println("a" + a);
                // tien+=tien;
            }
            for (int k = 0; k < i; k++) {
                System.out.println("for :" + a.elementAt(k));
                tien = (int) a.elementAt(k);
                b = tien + b;
                System.out.println(b);
            }
            lbltongtien.setText(b + "");

        } catch (SQLException ex) {
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void ThemHang() {
        lbl.setText(maHd + "");
        int g = Integer.parseInt(txtDonGia.getText());
        int s = (int) jSpinner2.getValue();
        HoaDonNhap hm = new HoaDonNhap();
        hm.themhang(txtMaHang.getText(), lbl.getText(), jSpinner2.getValue() + "", txtDonGia.getText(), g * s + "");
  String sql1 = "select thanhtien from chitiethdn where mahdn=" + maHd + "";
        int tien = 0;

        int b = 0;
        Vector a = new Vector();
        Vector c = new Vector();
        int i = 10;

        try {
            stm = cnn.prepareStatement(sql1);
            rs = stm.executeQuery();
            while (rs.next()) {
                a.add(rs.getInt(1));

                System.out.println("a" + a);
                // tien+=tien;
            }
            for (int k = 1; k < 10; k++) {
                System.out.println("for :" + a.elementAt(k));
                tien = (int) a.elementAt(k);
                b = tien + b;
                System.out.println(b);
            }
            lbltongtien.setText(b + "");

        } catch (SQLException ex) {
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
      String sql2="update hoadonnhap set gia="+b+" where mahdn="+maHd+"";
        try {
            stm=cnn.prepareStatement(sql2);
            
        } catch (Exception e) {
        }
    }


    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbDonVi2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblDonVi1;
    private javax.swing.JLabel lblGia1;
    private javax.swing.JLabel lblHanSuDung1;
    private javax.swing.JLabel lblMaHang1;
    private javax.swing.JLabel lblNgaySanXuat1;
    private javax.swing.JLabel lblNhaSanXuat1;
    private javax.swing.JLabel lblSoLuong1;
    private javax.swing.JLabel lblTenHang1;
    private javax.swing.JLabel lbltongtien;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaHang;
    private javax.swing.JTextField txtNhaSx;
    private javax.swing.JTextField txtTenHang;
    // End of variables declaration//GEN-END:variables
}
