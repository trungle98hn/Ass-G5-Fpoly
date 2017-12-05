/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.beans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonXuat_DAO implements Serializable{
    String mahdx;
    String ngayxuat;
    String mauser,gia;

    public HoaDonXuat_DAO(String mahdx, String ngayxuat, String mauser, String gia) {
        this.mahdx = mahdx;
        this.ngayxuat = ngayxuat;
        this.mauser = mauser;
        this.gia = gia;
    }

    public String getMahdx() {
        return mahdx;
    }

    public void setMahdx(String mahdx) {
        this.mahdx = mahdx;
    }

    public String getNgayxuat() {
        return ngayxuat;
    }

    public void setNgayxuat(String ngayxuat) {
        this.ngayxuat = ngayxuat;
    }

    public String getMauser() {
        return mauser;
    }

    public void setMauser(String mauser) {
        this.mauser = mauser;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }
    
}
