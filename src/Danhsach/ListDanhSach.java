/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Danhsach;

/**
 *
 * @author 1102l
 */
public class ListDanhSach {
    private int id;
    private String hoten,namsinh,sdt,gioitinh,maphong;

    public ListDanhSach(int id, String hoten, String namsinh, String sdt, String gioitinh, String maphong) {
        this.id = id;
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.sdt = sdt;
        this.gioitinh = gioitinh;
        this.maphong = maphong;
    }

    public ListDanhSach() {
         }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }



    
}
