
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class girisYonetimi {
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean login(String kadi,String sifre) throws SQLException{
        VeriTabaniYoneticisi vby=new VeriTabaniYoneticisi();
        vby.baglan();
        
        String sorgu="Select sifre from personel_bilgi where kullaniciAdi= ?";
        ps=vby.con.prepareStatement(sorgu);
        ps.setString(1, kadi);
        rs=ps.executeQuery();
        while(rs.next()){
        String pw=rs.getString("sifre");
        if(pw.equals(sifre)){
            return true;
     
        }
        else{
                return false;
                }
    }
    return false; 
   } public boolean loginY(String kadi,String sifre) throws SQLException{
        VeriTabaniYoneticisi vby=new VeriTabaniYoneticisi();
        vby.baglan();
        
        String sorgu="Select y_sifre from yonetici_bilgi where y_kad= ?";
        ps=vby.con.prepareStatement(sorgu);
        ps.setString(1, kadi);
        rs=ps.executeQuery();
        while(rs.next()){
        String pw=rs.getString("y_sifre");
        if(pw.equals(sifre)){
            return true;
     
        }
        else{
                return false;
                }
    }
    return false; 
   }
}
