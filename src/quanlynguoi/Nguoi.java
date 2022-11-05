/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlynguoi;


/**
 *
 * @author Admin
 */
public class Nguoi {
    private String hoVaTen;
    private String namSinh;
    private int soDT;
    private String canHo;
    private String hoTenChuHo;
    private int soDTchuHO;

    public Nguoi() {
    }

    public Nguoi(String hoVaTen, String namSinh, int soDT, String canHo, String hoTenChuHo, int soDTchuHO) {
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
        this.soDT = soDT;
        this.canHo = canHo;
        this.hoTenChuHo = hoTenChuHo;
        this.soDTchuHO = soDTchuHO;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getCanHo() {
        return canHo;
    }

    public void setCanHo(String canHo) {
        this.canHo = canHo;
    }

    public String getHoTenChuHo() {
        return hoTenChuHo;
    }

    public void setHoTenChuHo(String hoTenChuHo) {
        this.hoTenChuHo = hoTenChuHo;
    }

    public int getSoDTchuHO() {
        return soDTchuHO;
    }

    public void setSoDTchuHO(int soDTchuHO) {
        this.soDTchuHO = soDTchuHO;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoVaTen=" + hoVaTen + ", namSinh=" + namSinh + ", soDT=" + soDT + ", canHo=" + canHo + ", hoTenChuHo=" + hoTenChuHo + ", soDTchuHO=" + soDTchuHO + '}';
    }
    
    
}
