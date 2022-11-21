/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testHD;

/**
 *
 * @author 1102l
 */
public class listHD {

    private int id;
    private int tienPhong;
    private int tienDien;
    private int tienNuoc;

    public listHD(int id, int tienPhong, int tienDien, int tienNuoc) {
        this.id = id;
        this.tienPhong = tienPhong;
        this.tienDien = tienDien;
        this.tienNuoc = tienNuoc;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTienPhong() {
        return tienPhong;
    }

    public void setTienPhong(int tienPhong) {
        this.tienPhong = tienPhong;
    }

    public int getTienDien() {
        return tienDien;
    }

    public void setTienDien(int tienDien) {
        this.tienDien = tienDien;
    }

    public int getTienNuoc() {
        return tienNuoc;
    }

    public void setTienNuoc(int tienNuoc) {
        this.tienNuoc = tienNuoc;
    }

}
