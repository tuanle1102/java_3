/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import HoaDon.HoaDon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDonDao {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public List<HoaDon> getAllHoaDon(){
        List<HoaDon> list = new ArrayList<>();
        String query = "select * from HoaDon";
        try {
            con = new kn().getcon();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {                
                list.add(new HoaDon(rs.getString(1), 
                        rs.getString(2), 
                        rs.getString(3), 
                        rs.getDate(4), 
                        rs.getString(5)));
            }
        } catch (Exception e) {
        }
        return list;
    }
    public static void main(String[] args) {
        HoaDonDao dao = new HoaDonDao();
        List<HoaDon> list = dao.getAllHoaDon();
        for (HoaDon o : list) {
            System.out.println(o);
        }
    }
}
