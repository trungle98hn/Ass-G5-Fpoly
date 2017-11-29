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
public class hanghoa {
    int mahanghoa;
    String tenhanghoa,donvi;
    Date nsx;
    String nhasanxuat;
    Date hansudung;
    int soluong;
    int gia;

    public hanghoa(int mahanghoa, String tenhanghoa, String donvi, Date nsx, String nhasanxuat, Date hansudung, int soluong, int gia) {
        this.mahanghoa = mahanghoa;
        this.tenhanghoa = tenhanghoa;
        this.donvi = donvi;
        this.nsx = nsx;
        this.nhasanxuat = nhasanxuat;
        this.hansudung = hansudung;
        this.soluong = soluong;
        this.gia = gia;
    }

    public int getMahanghoa() {
        return mahanghoa;
    }

    public void setMahanghoa(int mahanghoa) {
        this.mahanghoa = mahanghoa;
    }

    public String getTenhanghoa() {
        return tenhanghoa;
    }

    public void setTenhanghoa(String tenhanghoa) {
        this.tenhanghoa = tenhanghoa;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public Date getNsx() {
        return nsx;
    }

    public void setNsx(Date nsx) {
        this.nsx = nsx;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public Date getHansudung() {
        return hansudung;
    }

    public void setHansudung(Date hansudung) {
        this.hansudung = hansudung;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
    
    
}
