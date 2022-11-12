/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import HoaDon.HoaDon;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import service.HoaDonService;
import service.HoaDonServiceImpl;

/**
 *
 * @author ASUS
 */
public class addHoaDoncontroller {

    private JButton btnSubmit;
    private JTextField jtfMaHoaDon;
    private JTextField jtfHoTen;
    private JTextField jtfCanHo;
    private JDateChooser jdcThoiGian;
    private JTextField jtfTinhTrang;
    private JLabel jlbMsg;

    private HoaDon hoadon = null;

    private HoaDonService hoadonService = null;

    public addHoaDoncontroller(JButton btnSubmit, JTextField jtfMaHoaDon,
            JTextField jtfHoTen, JTextField jtfCanHo,
            JDateChooser jdcThoiGian, JTextField jtfTinhTrang, JLabel jlbMsg) {
        this.btnSubmit = btnSubmit;
        this.jtfMaHoaDon = jtfMaHoaDon;
        this.jtfHoTen = jtfHoTen;
        this.jtfCanHo = jtfCanHo;
        this.jdcThoiGian = jdcThoiGian;
        this.jtfTinhTrang = jtfTinhTrang;

        this.jlbMsg = jlbMsg;
        this.hoadonService = new HoaDonServiceImpl();
    }

    public void setView(HoaDon hoadon) {
        this.hoadon = hoadon;
        jtfMaHoaDon.setText("#" + hoadon.getMaHD());
        jtfHoTen.setText(hoadon.getHotenchuho());
        jtfCanHo.setText(hoadon.getCanho());
        jdcThoiGian.setDate(hoadon.getTime());
        jtfTinhTrang.setText(hoadon.getTrangthai());
    }

    public void setEvent() {
        btnSubmit.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jtfHoTen.getText().length() == 0 || jdcThoiGian.getDate() == null || jtfCanHo.getText().length() == 0) {
                    jlbMsg.setText("Vui lòng nhập đầy đủ dữ liệu !!!");
                } else {
                    hoadon.setMaHD(jtfMaHoaDon.getText());
                    hoadon.setHotenchuho(jtfHoTen.getText());
                    hoadon.setCanho(jtfCanHo.getText());
                    hoadon.setTime(jdcThoiGian.getDate());
                    hoadon.setTrangthai(jtfTinhTrang.getText());
                    hoadonService.createOrUpdate(hoadon);
                    jlbMsg.setText("Cập nhật dữ liệu thành công.");

                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                btnSubmit.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                btnSubmit.setBackground(new Color(100, 221, 23));
            }

        });
    }
}
