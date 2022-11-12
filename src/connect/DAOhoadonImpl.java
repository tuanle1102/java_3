/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import HoaDon.HoaDon;
import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ASUS
 */
public class DAOhoadonImpl implements DAOhoadon {

    @Override
    public List<HoaDon> getList() {
        try {
            Connection cons = DBconnect.getConnection();
            String sql = "select * from HoaDon";
            List<HoaDon> list = new ArrayList<>();
            PreparedStatement ps = cons.prepareCall(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDon hoadon = new HoaDon();
                hoadon.setMaHD(rs.getString("maHD"));
                hoadon.setHotenchuho(rs.getString("hotenchuho"));
                hoadon.setCanho(rs.getString("canho"));
                hoadon.setTime(rs.getDate("time"));
                hoadon.setTrangthai(rs.getString("trangthai"));
                list.add(hoadon);
            }
            ps.close();
            //rs.close();
            cons.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public int createOrUpdate(HoaDon hoadon) {
        try {
            Connection cons = DBconnect.getConnection();
            String sql = "INSERT INTO HoaDon(maHD, hotenchuho, canho, time, trangthai) VALUES(?, ?, ?, ?, ?)ON DUPLICATE KEY UPDATE hotenchuho = VALUES(hotenchuho)";
            PreparedStatement ps = cons.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, hoadon.getMaHD());
            ps.setString(2, hoadon.getHotenchuho());
            ps.setString(3, hoadon.getCanho());
            ps.setDate(4, new Date(hoadon.getTime().getTime()));
            ps.setString(5, hoadon.getTrangthai());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            int generatedKey = 0;
            if (rs.next()) {
                generatedKey = rs.getInt(1);
            }
            ps.close();
            cons.close();
            return generatedKey;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return 0;
    }

    public static void main(String[] args) {
        DAOhoadon hoadon = new DAOhoadonImpl();
        System.out.println(hoadon.getList());
    }
}
