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
import javax.swing.JOptionPane;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.*;
import javax.swing.*;
import vn.fpt.edu.beans.users;

/**
 *
 * @author Admin
 */
public class Check {

    Connect cnn = new Connect();
    Vector id = null, pass = null;
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    int idd;

    public int check(String user, String pass) {
        String sql = "select taikhoan,matkhau,chucvu from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, user);

            ResultSet rs = stm.executeQuery();
            while (rs.next()) {

                if (rs.getString(1).equals(user) && rs.getString(2
                ).equals(pass) && rs.getString(3).equals("Quản lý")) {
                    JOptionPane.showMessageDialog(null, "Login sucess");
                    FormDangNhap k = new FormDangNhap();
                    k.setVisible(false);
                    k.dispose();

                    Menu t = new Menu() {
                    };
                    t.setVisible(true);
                    t.setSize(900, 500);
                    t.setLocationRelativeTo(null);
                    idd = rs.getInt(1);
                    
                } else if (rs.getString(1).equals(user) && rs.getString(2
                ).equals(pass) && rs.getString(3).equals("Nhân viên")) {
                    FormDangNhap k = new FormDangNhap();
//      k.close();
                    k.setVisible(false);
                    FormBanHang m = new FormBanHang();
                    m.setVisible(true);
                    m.setLocationRelativeTo(null);

                    m.setSize(900, 500);
                    idd = rs.getInt(1);
                    users u = new users();
                    u.setMauser(idd);

                } else {
                    JOptionPane.showMessageDialog(null, "sai tk/mk");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "lỗi ở " + ex);

        }
return idd;
    }

    public void info() {
        String sql = "select * from users";
    }
}
