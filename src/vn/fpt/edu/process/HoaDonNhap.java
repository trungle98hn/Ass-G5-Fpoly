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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Admin
 */
public class HoaDonNhap {
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
    public void HoaDonXuat1() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        String goidate = dateFormat.format(date);

        String sql = "insert into hoadonnhap values(" + this.maHd + ",?,1,null)";
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
}
