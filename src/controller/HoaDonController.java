/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import HoaDon.HoaDon;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import service.HoaDonService;
import service.HoaDonServiceImpl;
import utility.ClassTableModel;
import view.addHoaDon;

/**
 *
 * @author ASUS
 */
public class HoaDonController {

    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;

    private HoaDonService hoadonService = null;
    private String[] listColumn = {"STT", "Mã hóa đơn", "Họ tên chủ hộ", "Căn hộ", "Thời gian", "Trạng thái"};

    private TableRowSorter<TableModel> rowSorter = null;

    public HoaDonController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch) {
        this.jpnView = jpnView;
        this.btnAdd = btnAdd;
        this.jtfSearch = jtfSearch;

        this.hoadonService = new HoaDonServiceImpl();
    }

    public void setDateToTable() {
        List<HoaDon> listItem = hoadonService.getList();

        DefaultTableModel model = new ClassTableModel().setTableHoaDon(listItem, listColumn);
        JTable table = new JTable(model);

        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);

        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = jtfSearch.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        table.getColumnModel().getColumn(0).setMinWidth(80);
        table.getColumnModel().getColumn(0).setMaxWidth(80);
        table.getColumnModel().getColumn(0).setPreferredWidth(80);
        
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2 && table.getSelectedRow() !=-1){
                    DefaultTableModel model = (DefaultTableModel) table.getModel();
                    int selectedRowIndex = table.getSelectedRow();
                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);           
                    
                    HoaDon hoadon = new HoaDon();
                    hoadon.setMaHD(model.getValueAt(selectedRowIndex, 1).toString());
                    hoadon.setHotenchuho(model.getValueAt(selectedRowIndex, 2).toString());
                    hoadon.setCanho(model.getValueAt(selectedRowIndex, 3).toString());
                    hoadon.setTime((Date) model.getValueAt(selectedRowIndex, 4));
                    hoadon.setTrangthai(model.getValueAt(selectedRowIndex, 5).toString());
                                        
                    addHoaDon frame = new addHoaDon(hoadon);
                    frame.setTitle("Thông tin hóa đơn");
                    frame.setResizable(false);
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                }
            }         
        });

        table.getTableHeader().setFont(new Font("Arrial", Font.BOLD, 14));
        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table.setRowHeight(50);
        table.validate();
        table.repaint();

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.getViewport().add(table);
        scrollPane.setPreferredSize(new Dimension(1300, 400));

        jpnView.removeAll();
        jpnView.setLayout(new BorderLayout());
        jpnView.add(scrollPane);
        jpnView.validate();
        jpnView.repaint();
    }
    
    public void setEvent(){
        btnAdd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addHoaDon frame=new addHoaDon(new HoaDon());
                frame.setTitle("Thêm hóa đơn");
                frame.setLocationRelativeTo(null);
                frame.setResizable(false);
                frame.setVisible(true);            
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               btnAdd.setBackground(new Color(0, 200, 83));
            }

            @Override
            public void mouseExited(MouseEvent e) {
               btnAdd.setBackground(new Color(100, 221, 23));
            }
        });
    }
}
