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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import vn.fpt.edu.beans.ChiTietHDX;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormBanHang;

/**
 *
 * @author Admin
 */
public class getDataHDX {
 PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();
Vector data=new Vector();
Vector head1=new Vector();
    public Vector getDataHDX(int maHd) {
     String sql = "Select * from chitietHDX  where mahdx=?";
      try {
            stm = cnn.prepareStatement(sql);
            stm.setString(1, maHd + "");
            rs = stm.executeQuery();

            while (rs.next()) {

                ChiTietHDX cthdx = new ChiTietHDX(rs.getInt(1), rs.getInt(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));
                data.add(cthdx.getMaHDX());
                data.add(cthdx.getGiatien());
                data.add(cthdx.getSoluonghang());
                data.add(cthdx.getMahanghoa());
                data.add(cthdx.getThanhtien());
                head1.add(data);
            }

           // jTable1.setModel(new DefaultTableModel(head1, head));
        } catch (SQLException ex) {
            System.out.println(ex);
            Logger.getLogger(FormBanHang.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "chưa có hàng để thêm");
        }
    return head1;
    }
    
}
