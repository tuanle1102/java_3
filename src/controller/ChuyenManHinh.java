/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import bean.DanhMucBean;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.event.MouseInputListener;
import view.HoaDonJPN;
import view.ManHinhChinh;
import view.QuanLyCanHo;
import view.listDS;
/**
 *
 * @author Admin
 */
public class ChuyenManHinh {

    private JPanel root;
    private String kindSelected = "";
    
    private List<DanhMucBean> listItem = null;

    public ChuyenManHinh(JPanel root) {
        this.root = root;
    }

    public void setView(JPanel jpnItem, JLabel jlbItem) {
        kindSelected = "ManHinhChinh";
        jpnItem.setBackground(Color.ORANGE);
        jlbItem.setBackground(Color.BLACK);

        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new ManHinhChinh());
        root.validate();
        root.repaint();
    }

    public void setEvent(List<DanhMucBean> listItem) {
        this.listItem = listItem;
        for (DanhMucBean item : listItem) {
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
        }
    }

    class LabelEvent implements MouseInputListener {

        private JPanel node;

        private String kind;
        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "ManHinhChinh":
                    node = new ManHinhChinh();
                    break;
                case "QuanLyCanHo":
                    node = new QuanLyCanHo();
                    break;
                case "Menu":
                    node = new view.Menu();
                    break;
                case "listds":
                    node = new listDS();
                    break;
                case "HoaDon":
                    node = new HoaDonJPN();
                    break;
                default:
                    node = new listDS();
                    break;
            }
            root.removeAll();
            root.setLayout(new BorderLayout());
            root.add(node);
            root.validate();
            root.repaint();
            setChangeBackground(kind);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            kindSelected = kind;
            jpnItem.setBackground(Color.ORANGE);
            jlbItem.setBackground(Color.BLACK);
          
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            jpnItem.setBackground(Color.ORANGE);
            jlbItem.setBackground(Color.BLACK);
           
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(153,0,0));
                jlbItem.setBackground(new Color(153,0,0));
                
            }
        }

        @Override
        public void mouseDragged(MouseEvent e) {
        }

        @Override
        public void mouseMoved(MouseEvent e) {
        }

    }
    
    private void setChangeBackground(String kind){
        for (DanhMucBean item : listItem) {
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(Color.ORANGE);
                item.getJlb().setBackground(Color.BLACK);
                
            }else{
                item.getJpn().setBackground(new Color(153,0,0));
                item.getJlb().setBackground(new Color(153,0,0));
            }
        }
    }
}
