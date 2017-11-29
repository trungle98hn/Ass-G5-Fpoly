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
import javax.swing.table.DefaultTableModel;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.FormQuanLy;

/**
 *
 * @author Admin
 */
public class LayduLieuNhanVien {
Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;
    public Vector LayduLieuNhanVien() {
        Vector data = new Vector();
          String sql = "select * from users";
        try {
            stm = cn.prepareStatement(sql);
            rs = stm.executeQuery();
            
            while (rs.next()) {
                Vector user = new Vector();
                user.addElement(rs.getString(1));
                user.addElement(rs.getString(2));
                user.addElement(rs.getString(3));
                user.addElement(rs.getString(4));
                user.addElement(rs.getString(5));
                user.addElement(rs.getString(6));
                data.add(user);
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(FormQuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
        return data;
    }
    
}
