/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package testHD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


/**
 *
 * @author 1102l
 */
public class countHD extends javax.swing.JFrame {

    /**
     * Creates new form countHD
     */
    public countHD() {
        initComponents();
        show_user();
    }
    
    public ArrayList<listHD> userList(){
        ArrayList<listHD> userList = new ArrayList<>();
        
        try {
           
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            Connection con = DriverManager.getConnection(url,username,password);
            String query1 = "Select * from tongtien";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            listHD lhd;
            while (rs.next()) {
            lhd = new listHD(rs.getInt("id"),rs.getInt("tienphong"),rs.getInt("tiendien"),rs.getInt("tiennuoc"));
            userList.add(lhd);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userList;
        
    }
    public void show_user(){
        ArrayList<listHD> list = userList();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        Object[] row =new Object[5];
        for (int i = 0; i <list.size(); i++) {
       row[0] = list.get(i).getId();
       row[1] = list.get(i).getTienPhong();
       row[2] = list.get(i).getTienDien();
       row[3] = list.get(i).getTienNuoc();
       model.addRow(row);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtDien = new javax.swing.JTextField();
        txtNuoc = new javax.swing.JTextField();
        txtPhong = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tongtien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Phong", "Dien", "Nuoc"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tongtienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 728, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDien, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPhong)
                    .addComponent(txtNuoc)
                    .addComponent(tongtien, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(txtPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNuoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(tongtien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "saa";
            String password = "12345";
            
            try {
            Connection con = DriverManager.getConnection(url,username,password);
            String rtn = null;
             int row = jTable1.getSelectedRow();
            String value = (jTable1.getModel().getValueAt(row, 0).toString());
             String query1 ="select SUM(tienphong + tiennuoc + tiendien) as tongtien from tongtien where id = " + value;
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
                while (rs.next()) {
                    int count = rs.getInt("tongtien");
                    tongtien.setText(String.valueOf(count));
                  
                }
                            
        } catch (Exception e) {
                
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      int i = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        
        txtPhong.setText(model.getValueAt(i, 1).toString());
        txtDien.setText(model.getValueAt(i, 2).toString());
        txtNuoc.setText(model.getValueAt(i, 3).toString());  
    }//GEN-LAST:event_jTable1MouseClicked

    private void tongtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tongtienActionPerformed
        
    }//GEN-LAST:event_tongtienActionPerformed

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
            java.util.logging.Logger.getLogger(countHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(countHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(countHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(countHD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new countHD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField tongtien;
    private javax.swing.JTextField txtDien;
    private javax.swing.JTextField txtNuoc;
    private javax.swing.JTextField txtPhong;
    // End of variables declaration//GEN-END:variables
}
