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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormThemNhanVien;

/**
 *
 * @author Admin
 */
public class ThemNhanVien {
 int mauser;
    String ten,sdt,email;
    Date ngaysinh;
    String chucvu,matkhau,taikhoan,gioitinh;
    public ThemNhanVien(String mauser, String ten, String sdt, String email, String ngaysinh, String chucvu, String matkhau, String taikhoan, String gioitinh) {
        Connect cnn=new Connect();
    Connection cn=cnn.getConnect();
    PreparedStatement stm=null;
    ResultSet rs=null;
     String sql="insert into users values(?,?,?,?,?,?,?,?,?)";
     try {
         stm=cn.prepareStatement(sql);
         stm.setString(1, mauser);
         stm.setString(2, ten);
         stm.setString(3, sdt);
         stm.setString(4, email);
         stm.setString(5, ngaysinh);
         stm.setString(6, chucvu);
         stm.setString(7, matkhau);
         stm.setString(8, taikhoan);
         stm.setString(9, gioitinh);
         stm.executeUpdate();
         JOptionPane.showMessageDialog(null,  "đã thêm,nhân viên :"+ten+" có mã:"+mauser,"thông báo", 0);
     } catch (SQLException ex) {
         Logger.getLogger(ThemNhanVien.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    
        
        
}
