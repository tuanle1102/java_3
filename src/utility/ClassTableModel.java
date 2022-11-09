/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import HoaDon.HoaDon;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ClassTableModel {
    public DefaultTableModel setTableHoaDon(List<HoaDon> listItem, String[] listColumn){
        DefaultTableModel dtm = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }    

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 6 ? Boolean.class : String.class;
            }
            
        };
        dtm.setColumnIdentifiers(listColumn);
        int columns = listColumn.length;
        Object[] obj = null;
        int rows = listItem.size();
        if (rows>0) {
            for (int i = 0; i < rows; i++) {
                HoaDon hoadon = listItem.get(i);
                obj = new Object[columns];
                obj[0] = (i+1);
                obj[1] = hoadon.getMaHD();
                obj[2] = hoadon.getHotenchuho();
                obj[3] = hoadon.getCanho();
                obj[4] = hoadon.getTime();
                obj[5] =hoadon.getTrangthai();
                dtm.addRow(obj);
            }
        }
        return dtm;
    }
}
