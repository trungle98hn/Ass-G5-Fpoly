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
import javax.swing.table.DefaultTableModel;
import vn.fpt.edu.beans.*;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormBanHang;
import vn.fpt.edu.view.FormQuanLy;

/**
 *
 * @author Admin
 */
public class HoaDonXuat {

    PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();
    int maHd = rand(0, 999999);
    JLabel lblmaHd = new JLabel();

    public int getMhd() {
        return maHd;
    }

    /**
     *
     */
    public void HoaDonXuat() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String goidate = dateFormat.format(date);

        String sql = "insert into hoadonxuat values(" + this.maHd + ",?,123,null)";
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

    public Vector headerTable() {
        Vector head = new Vector();
        head.add("mã HDX");
        head.add("Đơn giá");
        head.add("Số lượng");
        head.add("Mã Hàng");
        head.add("Thành tiền");
        return head;
    }

    public Vector getData() {
        String sql = "Select * from chitietHDX  where mahdx=?";

        Vector head1 = new Vector();
        Vector data = new Vector();

        try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, this.maHd + "");
            rs = stm.executeQuery();

//đéo hiểu sao query ra 2 cái giống nhau :3 
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

    public int TongTien(int row) {
        String sql1 = "select thanhtien from chitiethdx where mahdx=" + maHd + "";
        int tien = 0;

        int b = 0;
        Vector a = new Vector();
        Vector c = new Vector();

        try {
            stm = cnn.prepareStatement(sql1);
            rs = stm.executeQuery();
            while (rs.next()) {
                a.add(rs.getInt(1));

                System.out.println("a" + a);
                // tien+=tien;
            }
            for (int k = 0; k < row; k++) {
                System.out.println("for :" + a.elementAt(k));
                tien = (int) a.elementAt(k);
                b = tien + b;
                System.out.println(b);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
        return b;
    }

    public Vector fullHoaDonXuat(String sql) {

        Vector data = new Vector();

        try {
            stm = cnn.prepareStatement(sql);
            rs = stm.executeQuery();

            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString(1));
                user.addElement(rs.getString(2));
                user.addElement(rs.getString(3));
                user.addElement(rs.getString(4));

                data.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FormQuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;

    }
     public Vector locHoaDonXuat(String sql) {

        Vector data = new Vector();

        try {
            stm = cnn.prepareStatement(sql);
            
            rs = stm.executeQuery();

            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString(1));
                user.addElement(rs.getString(2));
                user.addElement(rs.getString(3));
                user.addElement(rs.getString(4));

                data.add(user);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FormQuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;

    }
}
