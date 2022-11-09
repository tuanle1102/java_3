/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author ASUS
 */
public class kn {
    
    public static void main(String[] args) {
        try {

            String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
            String username = "sa";
            String password = "12345";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            String sql = "Select * from HoaDon";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {

                String mahd = rs.getString("maHD");
                String canho = rs.getString("canho");
                String name = rs.getString("hotenchuho");
                Date time = rs.getDate("time");
                String trangthai = rs.getString("trangthai");

                System.out.println("--->"+mahd+"---"+canho+"---"+name+"---"+time+"---"+trangthai);

            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    String url = "jdbc:sqlserver://localhost:1433;databaseName=QLCC;"
                    + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
    String username = "sa";
    String password = "12345";
    public Connection getcon() throws Exception{
        //throw new UnsupportedOperationException("Not supported yet.");
        return DriverManager.getConnection(url, username, password);
    }
}
