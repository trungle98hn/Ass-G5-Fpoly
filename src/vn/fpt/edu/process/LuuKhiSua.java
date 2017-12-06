/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Admin
 */
public class LuuKhiSua {
     Connect kn = new Connect();
    Connection cn = kn.getConnect();
    PreparedStatement stm = null;
    Statement st = null;
    ResultSet rs = null;

     public void LuuKhiSua(int mahanghoa, String tenhanghoa, String donvi, String nsx,
        String nhasanxuat, String hansudung, int soluong, int gia){
        String sql="Update hanghoa set tenhanghoa="+tenhanghoa+",donvi=N'"+donvi+"',nsx='"+nsx+"',nhasanxuat="+nhasanxuat+",hansudung='"+hansudung
                +"',soluong="+soluong+", gia="+gia+" where mahanghoa="+mahanghoa+"";
        try {
            stm=cn.prepareStatement(sql);
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "đã sửa");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
