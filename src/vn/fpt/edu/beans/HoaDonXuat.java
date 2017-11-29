/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.beans;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class HoaDonXuat {
    int mahdx;
    Date ngayxuat;
    int mauser,gia;

    public HoaDonXuat(int mahdx, Date ngayxuat, int mauser, int gia) {
        this.mahdx = mahdx;
        this.ngayxuat = ngayxuat;
        this.mauser = mauser;
        this.gia = gia;
    }

    public int getMahdx() {
        return mahdx;
    }

    public void setMahdx(int mahdx) {
        this.mahdx = mahdx;
    }

    public Date getNgayxuat() {
        return ngayxuat;
    }

    public void setNgayxuat(Date ngayxuat) {
        this.ngayxuat = ngayxuat;
    }

    public int getMauser() {
        return mauser;
    }

    public void setMauser(int mauser) {
        this.mauser = mauser;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
}
