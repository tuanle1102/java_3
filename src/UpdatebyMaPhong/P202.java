/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UpdatebyMaPhong;

import Danhsach.ListDanhSach;
import java.awt.Color;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/**
 *
 * @author 1102l
 */
public class P202 extends javax.swing.JFrame {
    
     String gender;
    String filename = null;
    byte[] person_image = null;
    DefaultTableModel dm;
    /**
     * Creates new form P102
     */
    public P202() {
        initComponents();
         setDefaultCloseOperation(HIDE_ON_CLOSE);
        show_user();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblthanhtoan = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtHoten = new javax.swing.JTextField();
        txtNamsinh = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        saveBtn = new javax.swing.JButton();
        txtMaPhong = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnImage = new javax.swing.JButton();
        lbl_image = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1_List = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.orange);

        jPanel3.setBackground(java.awt.Color.orange);

        jPanel2.setBackground(java.awt.Color.orange);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Thanh toán", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        lblthanhtoan.setBackground(new java.awt.Color(255, 255, 255));
        lblthanhtoan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblthanhtoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblthanhtoan.setText("Tình trạng");
        lblthanhtoan.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblthanhtoanMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblthanhtoan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblthanhtoan)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.setBackground(java.awt.Color.orange);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(255, 255, 255), null, null), "Mã phòng", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("P101");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        rdMale.setBackground(java.awt.Color.orange);
        rdMale.setText("Nam");

        rdFemale.setBackground(java.awt.Color.orange);
        rdFemale.setText("Nữ");
        rdFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdFemaleActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(0, 0, 0));
        saveBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        saveBtn.setForeground(java.awt.Color.orange);
        saveBtn.setText("Lưu");
        saveBtn.setBorder(null);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(java.awt.Color.orange);
        jButton2.setText("Sửa");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(java.awt.Color.orange);
        jButton3.setText("Xóa");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnImage.setBackground(new java.awt.Color(0, 0, 0));
        btnImage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnImage.setForeground(java.awt.Color.orange);
        btnImage.setText("Choose");
        btnImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImageActionPerformed(evt);
            }
        });

        lbl_image.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_image.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        jTable1_List.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "Năm sinh", "Số điện thoại", "Giới tính", "Mã phòng"
            }
        ));
        jTable1_List.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable1_List.setColumnSelectionAllowed(true);
        jTable1_List.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable1_List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1_ListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1_List);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("3LH");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.orange);
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("APARTMENT");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Họ tên");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Năm sinh");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Số điện thoại");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Giới tính");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Mã phòng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rdMale)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdFemale))
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnImage))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lbl_image, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(275, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHoten, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNamsinh, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rdFemale)
                                    .addComponent(rdMale)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtMaPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)))
                            .addComponent(lbl_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnImage, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Bạn đã chắc chắn xóa ?","Delete",JOptionPane.YES_NO_OPTION);
        if(opt ==0){

            try {
                String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
                String username = "saa";
                String password = "12345";

                Connection con = DriverManager.getConnection(url,username,password);
                int row = jTable1_List.getSelectedRow();
                String value = (jTable1_List.getModel().getValueAt(row, 0).toString());
                String query = "Delete From listds where id =" + value;
                PreparedStatement ps = con.prepareStatement(query);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Delete Successfully");
                DefaultTableModel model = (DefaultTableModel)jTable1_List.getModel();
                model.setRowCount(0);
                show_user();

            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
            + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";

            Connection con = DriverManager.getConnection(url,username,password);
            int row = jTable1_List.getSelectedRow();
            String value = (jTable1_List.getModel().getValueAt(row, 0).toString());
            String query = "Update listds SET hoten = ? , namsinh = ? , sdt = ? , gioitinh = ? , maphong = ? ,hinh = ? where id =" + value;
            PreparedStatement ps = con.prepareStatement(query);

            ps.setString(1, txtHoten.getText());
            ps.setString(2, txtNamsinh.getText());
            ps.setString(3, txtSdt.getText());
            if (rdMale.isSelected()) {
                gender = "Nam";
            } else {
                gender = "Nu";
            }
            ps.setString(4, gender);
            ps.setString(5, txtMaPhong.getText());
            ps.setBytes(6, person_image);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successfully");
            DefaultTableModel model = (DefaultTableModel)jTable1_List.getModel();
            model.setRowCount(0);
            show_user();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed

        try {

            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
            + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";

            Connection con = DriverManager.getConnection(url,username,password);
            String query = "INSERT INTO listds(hoten,namsinh,sdt,gioitinh,maphong,hinh)VALUES(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, txtHoten.getText());
            ps.setString(2, txtNamsinh.getText());
            ps.setString(3, txtSdt.getText());
            if (rdMale.isSelected()) {
                gender = "Nam";
            } else {
                gender = "Nu";
            }
            ps.setString(4, gender);
            ps.setString(5, txtMaPhong.getText());
            ps.setBytes(6, person_image);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Insert Successfully");
            DefaultTableModel model = (DefaultTableModel) jTable1_List.getModel();
            model.setRowCount(0);
            show_user();
        } catch (Exception e) {
            e.printStackTrace();
        }

        }

        public ArrayList<ListDanhSach> userList() {
            ArrayList<ListDanhSach> userList = new ArrayList<>();

            try {
                String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
                String username = "saa";
                String password = "12345";

                Connection con = DriverManager.getConnection(url,username,password);
                String query1 = "SELECT * FROM listds where maphong = '2';";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query1);
                ListDanhSach lids;
                while (rs.next()) {

                    lids = new ListDanhSach(rs.getInt("id"), rs.getString("hoten"), rs.getString("namsinh"), rs.getString("sdt"), rs.getString("gioitinh"), rs.getString("maphong"),rs.getBytes("hinh"));
                    userList.add(lids);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return userList;

        }

        public void show_user() {
            ArrayList<ListDanhSach> list = userList();
            DefaultTableModel model = (DefaultTableModel) jTable1_List.getModel();
            Object[] row = new Object[6];
            for (int i = 0; i < list.size(); i++) {
                row[0] = list.get(i).getId();
                row[1] = list.get(i).getHoten();
                row[2] = list.get(i).getNamsinh();
                row[3] = list.get(i).getSdt();
                row[4] = list.get(i).getGioitinh();
                row[5] = list.get(i).getMaphong();

                model.addRow(row);
            }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void rdFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdFemaleActionPerformed

    }//GEN-LAST:event_rdFemaleActionPerformed

    private void btnImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_image.getWidth() ,lbl_image.getHeight(), Image.SCALE_SMOOTH));
        lbl_image.setIcon(imageIcon);
        try {
            File image = new File(filename);
            FileInputStream fis = new FileInputStream(image);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            for(int readNum;(readNum=fis.read(buf))!=-1;){
                bos.write(buf,0,readNum);
            }
            person_image=bos.toByteArray();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnImageActionPerformed

    private void jTable1_ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1_ListMouseClicked
        int i = jTable1_List.getSelectedRow();
        TableModel model = jTable1_List.getModel();
        txtHoten.setText(model.getValueAt(i, 1).toString());
        txtNamsinh.setText(model.getValueAt(i, 2).toString());
        txtSdt.setText(model.getValueAt(i,3).toString());
        gender = model.getValueAt(i, 4).toString();
        if (gender.equals("Female")) {
            rdFemale.setSelected(true);
        } else {
            rdMale.setSelected(true);
        }
        txtMaPhong.setText(model.getValueAt(i, 5).toString());
        byte[] img = (userList().get(i).getHinh());
        ImageIcon imageIcon = new ImageIcon(new ImageIcon(img).getImage().getScaledInstance(lbl_image.getWidth() ,lbl_image.getHeight(), Image.SCALE_SMOOTH));
        lbl_image.setIcon(imageIcon);
    }//GEN-LAST:event_jTable1_ListMouseClicked

    private void lblthanhtoanMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblthanhtoanMouseMoved
        String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
        + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
        String username = "saa";
        String password = "12345";

        try {
            Connection con = DriverManager.getConnection(url,username,password);

            String query1 ="select trangthai from HoaDon where maphong = 'P202';";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            while (rs.next()) {
                String tinhtrang= rs.getString("trangthai");
                lblthanhtoan.setText(tinhtrang);
                lblthanhtoan.setForeground(Color.RED);
            }

        } catch (Exception e) {
            //JOptionPane.showMessageDialog(null, "Không có phong nào được thue");
        }
    }//GEN-LAST:event_lblthanhtoanMouseMoved

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(P202.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(P202.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(P202.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(P202.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new P202().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImage;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1_List;
    private javax.swing.JLabel lbl_image;
    private javax.swing.JLabel lblthanhtoan;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtHoten;
    private javax.swing.JTextField txtMaPhong;
    private javax.swing.JTextField txtNamsinh;
    private javax.swing.JTextField txtSdt;
    // End of variables declaration//GEN-END:variables
}