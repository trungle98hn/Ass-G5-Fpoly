/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import vn.fpt.edu.process.SearchHangPro;
import vn.fpt.edu.view.*;

/**
 *
 * @author Admin
 */
public class SearchHang extends javax.swing.JFrame {

    /**
     * Creates new form SearchHang
     */
    public SearchHang() {
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

        lblMaHang = new javax.swing.JLabel();
        lblTenHang = new javax.swing.JLabel();
        lblDonVi = new javax.swing.JLabel();
        lblNhaSanXuat = new javax.swing.JLabel();
        lblNgaySanXuat = new javax.swing.JLabel();
        lblHanSuDung = new javax.swing.JLabel();
        lblGia = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        txtTenHang = new javax.swing.JTextField();
        txtGia = new javax.swing.JTextField();
        txtNhaSanxuat = new javax.swing.JTextField();
        txtSoluong = new javax.swing.JTextField();
        cbbDv = new javax.swing.JComboBox<>();
        btnQuayLai = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblMaHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMaHang.setText("Mã hàng");

        lblTenHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTenHang.setText("Tên hàng");

        lblDonVi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDonVi.setText("Đơn vị");

        lblNhaSanXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNhaSanXuat.setText("Nhà sản xuất");

        lblNgaySanXuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblNgaySanXuat.setText("Ngày sản xuất");

        lblHanSuDung.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblHanSuDung.setText("Hạn sử dụng");

        lblGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblGia.setText("Giá");

        lblSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSoLuong.setText("Số lượng");

        txtma.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtTenHang.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtGia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtNhaSanxuat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtSoluong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoluong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSoluongActionPerformed(evt);
            }
        });

        cbbDv.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbbDv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kg", "hộp", "cái" }));

        btnQuayLai.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTenHang)
                    .addComponent(lblDonVi)
                    .addComponent(lblNhaSanXuat)
                    .addComponent(lblNgaySanXuat)
                    .addComponent(lblHanSuDung))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNhaSanxuat, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(cbbDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(73, 73, 73))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblMaHang)
                            .addGap(55, 55, 55)
                            .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblGia)
                            .addGap(89, 89, 89)
                            .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSoLuong)
                            .addGap(52, 52, 52)
                            .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(107, 107, 107)
                            .addComponent(btnQuayLai)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTenHang)
                    .addComponent(txtTenHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDonVi)
                    .addComponent(cbbDv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNhaSanXuat)
                    .addComponent(txtNhaSanxuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgaySanXuat)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHanSuDung)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lblMaHang))
                        .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(226, 226, 226)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lblGia))
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(6, 6, 6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(lblSoLuong))
                        .addComponent(txtSoluong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(btnQuayLai)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSoluongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSoluongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSoluongActionPerformed

    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        // TODO add your handling code here:
        close();
    }//GEN-LAST:event_btnQuayLaiActionPerformed
public void close(){
this.dispose();
}
public void data(int mahanghoa, String tenhanghoa, String donvi, String nsx,
        String nhasanxuat, String hansudung, int soluong, int gia) throws ParseException {
txtma.setText(mahanghoa+"");
txtSoluong.setText(soluong+"");
if(donvi.equalsIgnoreCase("kg")){
cbbDv.setSelectedIndex(0);
}
if(donvi.equalsIgnoreCase("Hộp")){
cbbDv.setSelectedIndex(1);
}
else{
cbbDv.setSelectedIndex(2);
}
Date date = new SimpleDateFormat("yyyy-mm-dd").parse(nsx);
Date date1 = new SimpleDateFormat("yyyy-mm-dd").parse(hansudung);
jDateChooser1.setDate(date);
jDateChooser2.setDate(date1);
txtNhaSanxuat.setText(nhasanxuat);

txtGia.setText(gia+"");
txtTenHang.setText(tenhanghoa);
}


    /**
     * @param args the command line arguments
     **/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JComboBox<String> cbbDv;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel lblDonVi;
    private javax.swing.JLabel lblGia;
    private javax.swing.JLabel lblHanSuDung;
    private javax.swing.JLabel lblMaHang;
    private javax.swing.JLabel lblNgaySanXuat;
    private javax.swing.JLabel lblNhaSanXuat;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenHang;
    private javax.swing.JTextField txtGia;
    private javax.swing.JTextField txtNhaSanxuat;
    private javax.swing.JTextField txtSoluong;
    private javax.swing.JTextField txtTenHang;
    private javax.swing.JTextField txtma;
    // End of variables declaration//GEN-END:variables
}
