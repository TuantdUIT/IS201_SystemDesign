/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement.entity;

/**
 *
 * @author dell
 */
public class CTHD {
    private String maCTHD;
    private String maHD;
    private String loaiDV;
    private String maDV;
    private String ngayBD;
    private String ngayKT;
    
    public CTHD(){}

    public CTHD(String maCTHD, String maHD, String loaiDV, String maDV, String ngayBD, String ngayKT) {
        this.maCTHD = maCTHD;
        this.maHD = maHD;
        this.loaiDV = loaiDV;
        this.maDV = maDV;
        this.ngayBD = ngayBD;
        this.ngayKT = ngayKT;
    }

    public String getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(String maCTHD) {
        this.maCTHD = maCTHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getLoaiDV() {
        return loaiDV;
    }

    public void setLoaiDV(String loaiDV) {
        this.loaiDV = loaiDV;
    }

    public String getMaDV() {
        return maDV;
    }

    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    public String getNgayBD() {
        return ngayBD;
    }

    public void setNgayBD(String ngayBD) {
        this.ngayBD = ngayBD;
    }

    public String getNgayKT() {
        return ngayKT;
    }

    public void setNgayKT(String ngayKT) {
        this.ngayKT = ngayKT;
    }
    
}
