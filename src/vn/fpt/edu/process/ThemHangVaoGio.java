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
public class ThemHangVaoGio {
 PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();
    public ThemHangVaoGio(int maHd,String giatien, String soLuong,String mahang,String thanhtien) {
         String sql = "insert into ChitietHDX values(?,?,?,?,?)";
         try {
            stm=cnn.prepareStatement(sql);
            stm.setInt(1, maHd);
            stm.setString(2, giatien);
            stm.setString(3, soLuong);
            stm.setString(4, mahang);
            stm.setString(5, thanhtien);
            stm.executeUpdate();
            
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, "chưa chọn hàng");
        }
    }
    
}
