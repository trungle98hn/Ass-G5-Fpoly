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
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import vn.fpt.edu.beans.hanghoa;
import vn.fpt.edu.connect.Connect;
import vn.fpt.edu.view.SearchHang;

/**
 *
 * @author Admin
 */
public class SearchHangPro {
 Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;
    public SearchHangPro(String mahang) throws ParseException {
        String sql="Select * from hanghoa where mahanghoa="+mahang+" ";
        SearchHang sh=new SearchHang();
         try {
             stm=cn.prepareStatement(sql);
             rs=stm.executeQuery();
             while(rs.next()){
                 hanghoa hh=new hanghoa(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                         rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
            sh.data(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
                         rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
             }
         } catch (SQLException ex) {
             Logger.getLogger(SuaHangHoa.class.getName()).log(Level.SEVERE, null, ex);
         }
        sh.setVisible(true);
        sh.setSize(400, 430);
    }
    
}
