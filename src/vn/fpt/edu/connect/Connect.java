/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.connect;

/**
 *
 * @author Admin
 **/

import java.awt.HeadlessException;
import java.sql.*;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class Connect extends JFrame{
    DefaultTableModel tbn=new DefaultTableModel();
    Connection cnn=null;

    public Connect() throws HeadlessException {
   //laydulieu();
    }
   
       
    public Connection getConnect(){
        try {
            String url="jdbc:sqlserver://127.0.0.1:1433;databaseName=QLST";
            String user="sa";
            String pass="123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnn=DriverManager.getConnection(url, user, pass);
          
        } catch (Exception e) {
            System.out.println("lỗi connection ở : " +e);
        }
    return cnn;
    
    }
    public ResultSet getData() throws SQLException{
    ResultSet kq=null;
    Statement stm=this.cnn.createStatement();
    String sql="SELECT * FROM Users";
    kq=stm.executeQuery(sql);
    return kq;
    }
  
}
