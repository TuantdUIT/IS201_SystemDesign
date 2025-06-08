
package hotelmanagement.entity;

import java.util.ArrayList;


public class Invoice {
    
    private String maHD;
    private String maKH;
    private String ngayTao;
    private String ngayThanhToan;
    private String tinhtrangTT;
    private int TongTien;
    private int soTienKhachTra;
    private int tienThoi;
    private String tinhtrangSD;
    private String note;

    public Invoice(){}

    public Invoice(String maHD, String maKH, String ngayTao, String ngayThanhToan, String tinhtrangTT, int TongTien, int soTienKhachTra, int tienThoi, String tinhtrangSD, String note) {
        this.maHD = maHD;
        this.maKH = maKH;
        this.ngayTao = ngayTao;
        this.ngayThanhToan = ngayThanhToan;
        this.tinhtrangTT = tinhtrangTT;
        this.TongTien = TongTien;
        this.soTienKhachTra = soTienKhachTra;
        this.tienThoi = tienThoi;
        this.tinhtrangSD = tinhtrangSD;
        this.note = note;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(String ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getNgayThanhToan() {
        return ngayThanhToan;
    }

    public void setNgayThanhToan(String ngayThanhToan) {
        this.ngayThanhToan = ngayThanhToan;
    }

    public String getTinhtrangTT() {
        return tinhtrangTT;
    }

    public void setTinhtrangTT(String tinhtrangTT) {
        this.tinhtrangTT = tinhtrangTT;
    }

    public int getTongTien() {
        return TongTien;
    }

    public void setTongTien(int TongTien) {
        this.TongTien = TongTien;
    }

    public int getSoTienKhachTra() {
        return soTienKhachTra;
    }

    public void setSoTienKhachTra(int soTienKhachTra) {
        this.soTienKhachTra = soTienKhachTra;
    }

    public int getTienThoi() {
        return tienThoi;
    }

    public void setTienThoi(int tienThoi) {
        this.tienThoi = tienThoi;
    }

    public String getTinhtrangSD() {
        return tinhtrangSD;
    }

    public void setTinhtrangSD(String tinhtrangSD) {
        this.tinhtrangSD = tinhtrangSD;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
    
    
    
    
    
    
    

}  
    