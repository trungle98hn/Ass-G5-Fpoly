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
public class XoaNhanVien {
 Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;
    public XoaNhanVien(String mauser) {
        String sql = "delete from users where mauser=?";
        
        try {
            stm = cn.prepareStatement(sql);

            stm.setString(1, mauser);
            stm.executeUpdate();
            stm.close();
            
            JOptionPane.showMessageDialog(null, "đã xóa");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
