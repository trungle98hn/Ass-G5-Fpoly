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
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormBanHang;
import vn.fpt.edu.view.FormQuanLy;

/**
 *
 * @author Admin
 */
public class TimHangHDX {
 PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();

    public TimHangHDX(String mahang) {
//        String ten = null,soluong = null,trongluong = null,donvi = null,ngaysx = null,hsd = null,donggia;
     String sql = "select * from hanghoa where mahanghoa=?";
        try {
            
            stm = cnn.prepareStatement(sql);
            stm.setString(1, mahang);
            rs = stm.executeQuery();
            FormBanHang bh=new FormBanHang();
          //String mahang, String ten, String soluong, String trongluong, String donvi, String ngaysx, String hsx, String hsd, String dongia
            while (rs.next()) {
           bh.Tim(mahang, rs.getString(2), rs.getInt(7), rs.getString(3), rs.getString(4)
                        , rs.getString(5), rs.getString(6), rs.getString(8));
                
        }} catch (SQLException ex) {
            Logger.getLogger(FormQuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}