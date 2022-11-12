/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import HoaDon.HoaDon;
import connect.DAOhoadon;
import connect.DAOhoadonImpl;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonServiceImpl implements HoaDonService{
    
    private DAOhoadon daohoadon = null;

    public HoaDonServiceImpl() {
        daohoadon = new DAOhoadonImpl();
    }
       
    @Override
    public List<HoaDon> getList() {
        return daohoadon.getList();
    }

    @Override
    public int createOrUpdate(HoaDon hoadon) {
        return daohoadon.createOrUpdate(hoadon);
    }
    
}
