package controller;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class GuncellemeYoneticisi {
    PreparedStatement ps;
    ResultSet rs;
    VeriTabaniYoneticisi vb=new VeriTabaniYoneticisi();
 public void kullaniciGüncelle(String kad,String sifre,String kimlikNo,int sicilNo,String ad,String soyad,String dogumT,String sehir) throws SQLException{
    
        vb.baglan();
    String sorgu="UPDATE personel_bilgi SET "
            + "tcKimlik=?,sicilNo=?,ad=?,soyad=?,dogumTarihi=?,sehir=?,kullaniciAdi=?,sifre=? "
            + "Where sicilNo="+sicilNo;
    ps=vb.con.prepareStatement(sorgu);

    ps.setString(1, kimlikNo);
     ps.setInt(2, sicilNo);
      ps.setString(3, ad);
     ps.setString(4, soyad);       
     ps.setString(5, dogumT);
     ps.setString(6, sehir);
     ps.setString(7, kad);
     ps.setString(8, sifre);
    int sonuc=ps.executeUpdate();
     if(sonuc==1){
         JOptionPane.showMessageDialog(null, "Kayıt Güncellendi");
   
     }else{
     JOptionPane.showMessageDialog(null, "Kayıt Güncellenemedi");
     
     }
     ps.close();
    
    }

 public void izinGüncelle(int kalan_miktar,int onay,String kayitNo) throws SQLException{
    
        vb.baglan();
    String sorgu="UPDATE izin_bilgi SET kalan_izin=? ,onayId=? Where kayitNo="+kayitNo;
    ps=vb.con.prepareStatement(sorgu);

    ps.setInt(1, kalan_miktar);
     ps.setInt(2, onay);
    

          int sonuc=ps.executeUpdate();
     if(sonuc==1){
         JOptionPane.showMessageDialog(null, "İslem Tamamlandı");
   
     }else{
     JOptionPane.showMessageDialog(null, "İslem Tamamlanamadı");
     
     }
     ps.close();
    
    }


    
}
