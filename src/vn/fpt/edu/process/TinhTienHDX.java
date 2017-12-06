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
import javax.swing.JLabel;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormBanHang;

/**
 *
 * @author Admin
 */
public class TinhTienHDX {
 JLabel lblmaHd = new JLabel();
    PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();
    public int TinhTienHDX(int maHd,int i) {
         String sql1 = "select thanhthien from chitiethdx where mahdx=" + maHd + "";
        int tien = 0;

        int b = 0;
        Vector a = new Vector();
        Vector c = new Vector();
       
        try {
            stm = cnn.prepareStatement(sql1);
            rs = stm.executeQuery();
            while (rs.next()) {
                a.add(rs.getInt(1));

                System.out.println("a" + a);
                // tien+=tien;
            }
            for (int k = 0; k < i; k++) {
                System.out.println("for :" + a.elementAt(k));
                tien = (int) a.elementAt(k);
                b = tien + b;
                System.out.println(b);
            }
           

        } catch (SQLException ex) {
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    
    //
    public void ThanhToan(int maHd,int i){
        TinhTienHDX tt=new TinhTienHDX();
  int a=  tt.TinhTienHDX(maHd, i);
  String b=Integer.toString(a);
    
        String sql2 = "update hoadonxuat set gia=" + b + " where mahdx=" + maHd + "";
        try {
            stm = cnn.prepareStatement(sql2);

        } catch (SQLException ex) {
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        FormBanHang t = new FormBanHang();
        //t.close();
        t.setVisible(true);
        t.setSize(1000, 700);
        t.setLocationRelativeTo(null);

    }
}
