
package controller;

import bilgi.personel;
import static java.lang.String.valueOf;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AramaYoneticisi {

      private PreparedStatement ps;
    private ResultSet rs;
    private final static String sorgu="Select * From personel_bilgi where ";
    VeriTabaniYoneticisi vb=new VeriTabaniYoneticisi();
  
    public ArrayList<personel> personelGoster(String aranan,String filtre){
        vb.baglan();
    String sorguMetin="";
     if(filtre.equalsIgnoreCase("sicilNo"))
            sorguMetin=sorgu+"sicilNo='"+aranan+"%'";
        else if(filtre.equalsIgnoreCase("ad")){
            sorguMetin=sorgu+"ad like '"+aranan+"%'";
        }
        else if(filtre.equalsIgnoreCase("soyad")){
            sorguMetin=sorgu+"soyad like '"+aranan+"%'";
        }
     ArrayList<personel> ls=new ArrayList<personel>();
             try {
                
                 ps=vb.con.prepareStatement(sorguMetin);
                 rs=ps.executeQuery();
                 
                  personel p;
                      while (rs.next()) {
                   p=new personel();
                    p.setTc(rs.getString("tcKimlik"));
                    p.setSicilNo(rs.getInt("sicilNo"));
                    p.setAd(rs.getString("ad"));
                    p.setSoyad(rs.getString("soyad"));
                    p.setDogumTarihi(rs.getString("dogumTarihi"));
                    p.setCinsiyet(rs.getString("cinsiyet"));
                    p.setSehir(rs.getString("sehir"));
                    p.setBirim(rs.getInt("birimID"));
                    p.setKad(rs.getString("kullaniciAdi"));
                    p.setSifre(rs.getString("sifre"));
                    
                      ls.add(p);
                    }
                 
           
             } catch (Exception e) {
                  System.out.println(e);
             }           
                    return ls;
                    
                   
       }
   public void tabloyuDoldur(JTable personelTablo,String aranan,String filtre)
       {
             ArrayList<personel> personelListem=new ArrayList<personel>();
             personelListem=personelGoster(aranan,filtre);
          DefaultTableModel model=new DefaultTableModel();
           model.setColumnIdentifiers(new Object[]{"Tc Kimlik", "Sicil No", "Ad", "Soyad","Cinsiyet","DogumTarihi","sehir","birimID","kullaniciAdi","sifre"});
 
          Object[] satir=new Object[10];
           for (int i = 0; i < personelListem.size(); i++) {
               satir[0]=personelListem.get(i).getTc();
               satir[1]=personelListem.get(i).getSicilNo();
               satir[2]=personelListem.get(i).getAd();
               satir[3]=personelListem.get(i).getSoyad();
               satir[4]=personelListem.get(i).getCinsiyet();
               satir[5]=personelListem.get(i).getDogumTarihi();
               satir[6]=personelListem.get(i).getSehir();
               satir[7]=personelListem.get(i).getBirim();
               satir[8]=personelListem.get(i).getKad();
               satir[9]=personelListem.get(i).getSifre();
           }  
           
           model.addRow(satir);
           personelTablo.setModel(model);
          
 
    
    
    
    }
      public void izinTablosuArama(int izinTürID,String sicilNo,JTable izin_liste) {
         VeriTabaniYoneticisi vb=new VeriTabaniYoneticisi();
        vb.baglan();
        try {
         String sql = "SELECT * FROM izin_bilgi WHERE " +
                    "izinTürID LIKE '%" + izinTürID+ "%' " +
                    "AND sicilNo LIKE '%" + sicilNo + "%' ";
            
             ps= vb.con.prepareStatement(sql);
              rs = ps.executeQuery();  
          TabloModel model = new TabloModel(rs);
            izin_liste.setModel(model);
            
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tablo Gösterilirken Hata Oluştu!!!\n" + e);
        }
    
    
    }
}
