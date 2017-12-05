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
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormSuaNhanVien;

/**
 *
 * @author Admin
 */
public class SuaNhanVien {

    Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;

    public SuaNhanVien(String manv, String ten, String sdt, String email, String ngaysinh, String chucvu, String matkhau, String taikhoan, String gioitinh) {
        String sql = "update users set mauser=?,ten=?,sdt=?,email=?,ngaysinh=?,chucvu=?,matkhau=?,taikhoan=?,gioitinh=? where mauser=?";
        try {
            PreparedStatement stm = cn.prepareStatement(sql);

            stm.setString(1, manv);
            stm.setString(2, ten);
            stm.setString(3, sdt);
            stm.setString(4, email);
            stm.setString(5, ngaysinh);
            stm.setString(6, chucvu);
            stm.setString(7, matkhau);
            stm.setString(8, taikhoan);
            stm.setString(9, gioitinh);
            stm.setString(10, manv);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "đã lưu");

        } catch (SQLException ex) {
            Logger.getLogger(FormSuaNhanVien.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }
public String manv(String manv){
    LayduLieuNhanVien dl=new LayduLieuNhanVien();
    dl.getdatanv(manv);
return manv;
}
}
