/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Admin
 */
public class getDataHangHoa {
Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement st = null;
    ResultSet rs = null;

    public Vector getDataHangHoa() {
      String sql = "Select * FROM HANGHOA";
      Vector data=new Vector();
        try {
            st=cn.prepareStatement(sql);
            
            rs=st.executeQuery();
            int i = 1;
            while (rs.next()) {
                Vector data1 = new Vector();

                data1.add(i);
                data1.add(rs.getString(1));
                data1.add(rs.getString(2));
                data1.add(rs.getString(3));
                data1.add(rs.getString(4));
                data1.add(rs.getString(5));
                data1.add(rs.getString(6));
                data1.add(rs.getString(7));
                data1.add(rs.getString(8));
               
                data.add(data1);
               
                i++;

            }

        } catch (Exception e) {
        }
        return data;
    }
    
}
