/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Date;
import vn.fpt.edu.connect.Connect;

/**
 *
 * @author Admin
 */
public class users {

    int mauser;
    String ten, sdt, email;
    Date ngaysinh;
    String chucvu, matkhau, taikhoan, gioitinh;
    Connect cnn = new Connect();
    Connection cn = cnn.getConnect();
    PreparedStatement stm = null;
    ResultSet rs = null;
    String sql = "insert into users values(?,?,?,?,?,?,?,?,?)";

    public users(int mauser, String ten, String sdt, String email, Date ngaysinh, String chucvu, String matkhau, String taikhoan, String gioitinh) {
        this.mauser = mauser;
        this.ten = ten;
        this.sdt = sdt;
        this.email = email;
        this.ngaysinh = ngaysinh;
        this.chucvu = chucvu;
        this.matkhau = matkhau;
        this.taikhoan = taikhoan;
        this.gioitinh = gioitinh;
    }
public void ThemNhanVien(int mauser, String ten, String sdt, String email, Date ngaysinh, String chucvu, String matkhau, String taikhoan, String gioitinh){
    
}
    public int getMauser() {
        return mauser;
    }

    public void setMauser(int mauser) {
        this.mauser = mauser;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public String getMatkhau() {
        return matkhau;
    }

    public void setMatkhau(String matkhau) {
        this.matkhau = matkhau;
    }

    public String getTaikhoan() {
        return taikhoan;
    }

    public void setTaikhoan(String taikhoan) {
        this.taikhoan = taikhoan;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

}
