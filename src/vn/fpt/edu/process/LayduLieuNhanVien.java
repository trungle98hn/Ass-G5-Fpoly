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

    public void getdatanv(String manv) {
        String sql = "Select * from users where manv=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {

            }
        } catch (Exception e) {
        }
    }

    public String getten(String manv) {
        String getten = null;
        String sql = "select ten from users where mauser=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getsdt(String manv) {
        String getten = null;
        String sql = "select sdt from users where mauser=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getemail(String manv) {
        String getten = null;
        String sql = "select email from users where mauser=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getngaysinh(String manv) {
        String getten = null;
        String sql = "select ngaysinh from users where mauser=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getchucvu(String manv) {
        String getten = null;
        String sql = "select chucvu from users where mauser=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getmatkhau(String manv) {
        String getten = null;
        String sql = "select matkhau from users where mauser=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String gettaikhoan(String manv) {
        String getten = null;
        String sql = "select taikhoan from users where mauser=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getgioitinh(String manv) {
        String getten = null;
        String sql = "select gioitinh from users where mauser=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, manv);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String gettenn(String taikhoan) {
        String getten = null;
        String sql = "select ten from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, taikhoan);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getsdtt(String taikhoan) {
        String getten = null;
        String sql = "select sdt from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, taikhoan);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getemaill(String taikhoan) {
        String getten = null;
        String sql = "select email from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, taikhoan);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getngaysinhh(String taikhoan) {
        String getten = null;
        String sql = "select ngaysinh from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, taikhoan);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getchucvuu(String taikhoan) {
        String getten = null;
        String sql = "select chucvu from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, taikhoan);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getmauserr(String taikhoan) {
        String getten = null;
        String sql = "select mauser from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, taikhoan);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String gettaikhoann(String taikhoan) {
        String getten = null;
        String sql = "select taikhoan from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, taikhoan);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

    public String getgioitinhh(String taikhoan) {
        String getten = null;
        String sql = "select gioitinh from users where taikhoan=?";
        try {
            stm = cn.prepareStatement(sql);
            stm.setString(1, taikhoan);
            rs = stm.executeQuery();
            while (rs.next()) {
                getten = rs.getString(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(LayduLieuNhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }

        return getten;
    }

}
