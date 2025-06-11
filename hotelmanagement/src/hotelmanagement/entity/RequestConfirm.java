/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagement.entity;

/**
 *
 * @author 84352
 */
public class RequestConfirm {
    public String mapd, makh, ngaybd, ngaykt, yeucau, typeofService, nameofService;
    public int slsd, songuoidung;

    public RequestConfirm() {
    }

    public RequestConfirm(String mapd, String makh, String ngaybd, String ngaykt, String yeucau, int slsd, int songuoidung, String type, String name) {
        this.mapd = mapd;
        this.makh = makh;
        this.ngaybd = ngaybd;
        this.ngaykt = ngaykt;
        this.yeucau = yeucau;
        this.slsd = slsd;
        this.songuoidung = songuoidung;
        this.typeofService = type;
        this.nameofService = name;
    }
    
    public void setMapd(String pd){
        mapd = pd;
    }
    public void setMakh(String kh){
        makh = kh;
    }
    public void setNgayBd(String bd){
        ngaybd = bd;
    }
    public void setNgaykt(String kt){
        ngaykt = kt;
    }
    public void setSlsd(int sd){
        slsd = sd;
    }
    public void setSonguoi(int nguoi){
        songuoidung = nguoi;
    }
    public void setYeucau(String y){
        yeucau = y;
    }
    public void setType(String t){
        typeofService = t;
    }
    public void setName(String n){
        nameofService = n;
    }
}
