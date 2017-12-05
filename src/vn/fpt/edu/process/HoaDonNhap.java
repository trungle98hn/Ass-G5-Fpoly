/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vn.fpt.edu.beans.ChiTietHDX;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormBanHang;

/**
 *
 * @author Admin
 */
public class HoaDonNhap {

    PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();
    int maHd = rand(0, 999999);
    JLabel lblmaHd = new JLabel();

    public int getMhd() {
        System.out.println(maHd);
        return maHd;
    }

    public HoaDonNhap() {
    }
    
public void themhang(String mahang,String maHd,String soLuong,String giatien, String thanhtien){
         String sql = "insert into ChitietHDN values(?,?,?,?,?)";
         System.out.println(this.maHd+"");
         try {
            stm=cnn.prepareStatement(sql);
            stm.setString(1, mahang);
            stm.setString(2, maHd);
            stm.setString(3, soLuong);
            stm.setString(4, giatien);
            stm.setString(5, thanhtien);
            stm.executeUpdate();
             System.out.println("ok");
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
             System.out.println(e);
        }
    }
    /**
     *
     */
    public void HoaDonnhap() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String goidate = dateFormat.format(date);

        String sql = "insert into hoadonnhap values(" + this.maHd + ",?,123,null)";
        System.out.println(goidate);

        JOptionPane.showMessageDialog(null, this.maHd);
        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, goidate);
            stm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(HoaDonXuat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static int rand(int min, int max) {
        try {
            Random rn = new Random();
            int range = max - min + 1;
            int randomNum = min + rn.nextInt(range);
            return randomNum;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    public Vector getData() {
        String sql = "Select * from chitietHDn  where mahdn=?";

        Vector head1 = new Vector();
        Vector data = new Vector();

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, this.maHd + "");
            rs = stm.executeQuery();

            while (rs.next()) {

                ChiTietHDX cthdx = new ChiTietHDX(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                data.add(cthdx.getMaHDX());
                data.add(cthdx.getGiatien());
                data.add(cthdx.getSoluonghang());
                data.add(cthdx.getMahanghoa());
                data.add(cthdx.getThanhtien());
                head1.add(data);
            }

            //jTable1.setModel(new DefaultTableModel(head1, head));
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("getdata:" + ex);
        }
        return head1;
    }
}
