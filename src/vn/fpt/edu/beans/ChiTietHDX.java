/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.beans;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class ChiTietHDX implements Serializable{
  
    private int soluonghang,thanhtien,giatien,maHDX,mahanghoa;

    public ChiTietHDX(int maHDX,int giatien, int soluonghang,  int mahanghoa, int thanhtien) {
        this.soluonghang = soluonghang;
        this.thanhtien = thanhtien;
        this.giatien = giatien;
        this.maHDX = maHDX;
        this.mahanghoa = mahanghoa;
    }

    public int getSoluonghang() {
        return soluonghang;
    }

    public void setSoluonghang(int soluonghang) {
        this.soluonghang = soluonghang;
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public int getMaHDX() {
        return maHDX;
    }

    public void setMaHDX(int maHDX) {
        this.maHDX = maHDX;
    }

    public int getMahanghoa() {
        return mahanghoa;
    }

    public void setMahanghoa(int mahanghoa) {
        this.mahanghoa = mahanghoa;
    }

   
    
}
