/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.fpt.edu.beans;

/**
 *
 * @author Admin
 */
public class ChiTietHDN {
   private int mahanghoa,mahdn,suongluonghang,giatien,thanhtien;

    public ChiTietHDN(int mahanghoa, int mahdn, int suongluonghang, int giatien, int thanhtien) {
        this.mahanghoa = mahanghoa;
        this.mahdn = mahdn;
        this.suongluonghang = suongluonghang;
        this.giatien = giatien;
        this.thanhtien = thanhtien;
    }

    public int getMahanghoa() {
        return mahanghoa;
    }

    public void setMahanghoa(int mahanghoa) {
        this.mahanghoa = mahanghoa;
    }

    public int getMahdn() {
        return mahdn;
    }

    public void setMahdn(int mahdn) {
        this.mahdn = mahdn;
    }

    public int getSuongluonghang() {
        return suongluonghang;
    }

    public void setSuongluonghang(int suongluonghang) {
        this.suongluonghang = suongluonghang;
    }

    public int getGiatien() {
        return giatien;
    }

    public void setGiatien(int giatien) {
        this.giatien = giatien;
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }
    
}
