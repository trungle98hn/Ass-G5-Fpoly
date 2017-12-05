/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Admin
 */
public class XoaHangTrongGio {
     PreparedStatement stm = null;
    ResultSet rs = null;
    Connect cn = new Connect();
    Connection cnn = cn.getConnect();

    public XoaHangTrongGio(int mahanghoa, int maHd) {
        if(JOptionPane.showConfirmDialog(null, "bạn muốn xóa?", "xóa", JOptionPane.YES_NO_OPTION)==1){
    String sql="delete chitiethdx where mahanghoa="+mahanghoa+" and mahoadon="+maHd+"";
    try{
    stm=cnn.prepareStatement(sql);
    stm.executeUpdate();
    }
    catch(Exception e){}
    }
    }}
    
