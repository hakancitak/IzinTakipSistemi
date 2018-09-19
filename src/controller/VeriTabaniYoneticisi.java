
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class VeriTabaniYoneticisi {
    private String url="jdbc:mysql://localhost:3307/";
    private String driver="com.mysql.jdbc.Driver";
    private String dbName="vt_personel";
    private String userName="root";
    private String sifre="123456789";
   
    
    public Connection con;
        public void baglan(){
        try {
            Class.forName(driver).newInstance();
            con=DriverManager.getConnection(url+dbName,userName,sifre);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hata  : "+ex);
        }
    }
        
        
        
        
}