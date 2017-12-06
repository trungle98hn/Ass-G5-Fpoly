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
    String nsx;
    String nhasanxuat;
    String hansudung;
    int soluong;
    int gia;

    public hanghoa(int mahanghoa, String tenhanghoa, String donvi, String nsx, String nhasanxuat, String hansudung, int soluong, int gia) {
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

    public String getNsx() {
        return nsx;
    }

    public void setNsx(String nsx) {
        this.nsx = nsx;
    }

    public String getNhasanxuat() {
        return nhasanxuat;
    }

    public void setNhasanxuat(String nhasanxuat) {
        this.nhasanxuat = nhasanxuat;
    }

    public String getHansudung() {
        return hansudung;
    }

    public void setHansudung(String hansudung) {
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
