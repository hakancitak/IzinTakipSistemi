/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import bilgi.Yonetici_Bilgi;
import bilgi.izin_bilgi;
import bilgi.personel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class EklemeYoneticisi {
       private PreparedStatement ps;
        private ResultSet rs; 
        VeriTabaniYoneticisi vby=new VeriTabaniYoneticisi();
    public void ekleme(personel p) throws SQLException{

        vby.baglan();
  
  
     ps=vby.con.prepareStatement("insert into personel_bilgi(tcKimlik,sicilNo,ad,soyad,cinsiyet,dogumTarihi,sehir,birimID,kullaniciAdi,sifre) "+
             "  VALUES(?,?,?,?,?,?,?,?,?,?)");
     ps.setString(1, p.getTc());
     ps.setInt(2, p.getSicilNo());
      ps.setString(3, p.getAd());
     ps.setString(4, p.getSoyad());       
     ps.setString(5, p.getCinsiyet());
     ps.setString(6, p.getDogumTarihi());
     ps.setString(7, p.getSehir());
     ps.setInt(8, p.getBirim());
     ps.setString(9, p.getKad());
     ps.setString(10, p.getSifre());
     
  
     int sonuc=ps.executeUpdate();
     if(sonuc==1){
         JOptionPane.showMessageDialog(null, "Kayıt Basarılı");
   
     }else{
     JOptionPane.showMessageDialog(null, "Kayıt Basarısız");
     
     }
     ps.close();
    
    }
    public void yonetici_ekleme(Yonetici_Bilgi yb) throws SQLException{
    
        vby.baglan();
  
  
     ps=vby.con.prepareStatement("insert into yonetici_bilgi(yoneticiID,y_ad,y_soyad,y_tcKimlik,y_dogumT,y_cinsiyet,y_kad,y_sifre,sehir) "+
             "  VALUES(DEFAULT,?,?,?,?,?,?,?,?)");
     ps.setString(1, yb.getyAd());
     ps.setString(2, yb.getySoyad());
      ps.setString(3, yb.getYtcKimlik());
     ps.setString(4, yb.getYdogumT());       
     ps.setString(5, yb.getYcinsiyet());
     ps.setString(6, yb.getYkad());
     ps.setString(7, yb.getYsifre());
     ps.setString(8, yb.getYsehir());
    
     
  
     int sonuc=ps.executeUpdate();
     if(sonuc==1){
         JOptionPane.showMessageDialog(null, "Kayıt Basarılı");
   
     }else{
     JOptionPane.showMessageDialog(null, "Kayıt Basarısız");
     
     }
     ps.close();
    
    }
    
    public void kullanici_izinEkleme(izin_bilgi ib) throws SQLException{
    vby.baglan();
    
     ps=vby.con.prepareStatement("insert into izin_bilgi(kayitNo,sicilNo,izin_bas,izin_bit,izin_sure,izinTürID) "+
             "  VALUES(DEFAULT,?,?,?,?,?)");
     ps.setInt(1, ib.getSicilNo());
     ps.setString(2, ib.getIzin_bas());
      ps.setString(3, ib.getIzin_bit());
     ps.setInt(4, ib.getIzin_sure());       
     ps.setInt(5, ib.getIzinTürID());
     
    
     
  
     int sonuc=ps.executeUpdate();
     if(sonuc==1){
         JOptionPane.showMessageDialog(null, "Kayıt Basarılı");
   
     }else{
     JOptionPane.showMessageDialog(null, "Kayıt Basarısız");
     
     }
     ps.close();
    
    }


    
    
    }

    
