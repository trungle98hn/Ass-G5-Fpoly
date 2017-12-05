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
public class HoaDonNhap_DAO {
    int mahdn;
    Date ngaynhap;
    int mauser,gia;

    public HoaDonNhap_DAO(int mahdn, Date ngaynhap, int mauser, int gia) {
        this.mahdn = mahdn;
        this.ngaynhap = ngaynhap;
        this.mauser = mauser;
        this.gia = gia;
    }

    

    public int getMahdn() {
        return mahdn;
    }

    public void setMahdn(int mahdn) {
        this.mahdn = mahdn;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
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
