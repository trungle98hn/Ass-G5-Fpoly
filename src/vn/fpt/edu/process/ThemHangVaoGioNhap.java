/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Admin
 */
public class ThemHangVaoGioNhap {
    PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();
    public ThemHangVaoGioNhap(String mahang,int maHd,int soLuong,int giatien, int thanhtien) {
         String sql = "insert into ChitietHDN values(?,?,?,?,?)";
         try {
            stm=cnn.prepareStatement(sql);
            stm.setString(1, mahang);
            stm.setInt(2, maHd);
            stm.setInt(3, soLuong);
            stm.setInt(4, giatien);
            stm.setInt(5, thanhtien=soLuong*giatien);
            stm.executeUpdate();
            
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
