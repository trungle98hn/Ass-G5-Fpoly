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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Admin
 */
public class ThemHang {

    Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;

    public ThemHang(String mahanghoa, String tenhanghoa, String donvi, String nsx, String nhasanxuat, String hansudung, String soluong, String gia) {
        if (mahanghoa.isEmpty() || tenhanghoa.isEmpty() || donvi.isEmpty() || nsx.isEmpty() || nhasanxuat.isEmpty() || hansudung.isEmpty() || soluong.isEmpty() || gia.isEmpty()) {
            JOptionPane.showMessageDialog(null, "ko được bỏ trống bất cứ trường nào!!");
        }
        
        else {

            String sql = "insert into hanghoa values(?,?,?,?,?,?,?,?)";
            try {
                PreparedStatement stm = cn.prepareStatement(sql);

                stm.setString(1, mahanghoa);
                stm.setString(2, tenhanghoa);
                stm.setString(3, donvi);
                stm.setString(4, nsx);
                stm.setString(5, nhasanxuat);
                stm.setString(6, hansudung);
                stm.setString(7, soluong);
                stm.setString(8, gia);

                stm.executeUpdate();
                JOptionPane.showMessageDialog(null, "đã lưu");
            } catch (Exception e) {

            }
        }

    }
    public void ktra(){
        String sql="Select soluong from hanghoa where tenhanghoa=?";
        try {
            stm=cn.prepareStatement(sql);
            rs=stm.executeQuery();
            while(rs.next()){
                
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ThemHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

}
