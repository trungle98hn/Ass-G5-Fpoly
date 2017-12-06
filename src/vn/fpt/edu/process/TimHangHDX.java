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
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormBanHang;

/**
 *
 * @author Admin
 */
public class TimHangHDX {

    Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;

    public TimHangHDX(String mahang) {
        String sql = "Select * from hanghoa where mahanghoa=?";
        try {
            FormBanHang bh = new FormBanHang();

            stm = cn.prepareStatement(sql);
            stm.setString(1, mahang);
            rs = stm.executeQuery();
            while (rs.next()) {
              //  bh.Tim(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));

            }
            stm.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(TimHangHDX.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }

    }

}
