/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlycanho;

/**
 *
 * @author Admin
 */
public class Canho {
    private String camHo;
    private String hoTenChuHo;
    private int soDT;
    private int soNguoi;

    public Canho() {
    }

    public Canho(String camHo, String hoTenChuHo, int soDT, int soNguoi) {
        this.camHo = camHo;
        this.hoTenChuHo = hoTenChuHo;
        this.soDT = soDT;
        this.soNguoi = soNguoi;
    }

    public String getCamHo() {
        return camHo;
    }

    public void setCamHo(String camHo) {
        this.camHo = camHo;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public int getSoNguoi() {
        return soNguoi;
    }

    public void setSoNguoi(int soNguoi) {
        this.soNguoi = soNguoi;
    }

    @Override
    public String toString() {
        return "Canho{" + "camHo=" + camHo + ", hoTenChuHo=" + hoTenChuHo + ", soDT=" + soDT + ", soNguoi=" + soNguoi + '}';
    }
    
    
}
