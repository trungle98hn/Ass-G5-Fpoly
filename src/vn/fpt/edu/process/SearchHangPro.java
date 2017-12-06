/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    public SearchHangPro(String mahang) {
        SearchHang sh=new SearchHang();
        
        String sql="Select * fromhanghoa where mahanghoa=?";
        try {
            stm=cn.prepareStatement(sql);
            stm.setString(1, mahang);
            rs=stm.executeQuery();
            while(rs.next()){
           sh.Search(mahang, rs.getString(2),rs.getString(3) , rs.getString(4)
                   , rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8));
            
            }
           
               // SearchHang sh=new SearchHang();
    
        } catch (Exception e) {
        }

    }
    
}
