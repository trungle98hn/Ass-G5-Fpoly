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

/**
 *
 * @author Admin
 */
public class TimNv {
        Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;
    public void Timnv(String manv){
    String sql="Select * from users where mauser=?";
            try {
                stm=cn.prepareStatement(sql);
                 stm.setString(1, manv);
                 
            } catch (SQLException ex) {
                Logger.getLogger(TimNv.class.getName()).log(Level.SEVERE, null, ex);
            }
   
    
    }
}
