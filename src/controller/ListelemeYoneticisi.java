
package controller;


import bilgi.personel;
import static java.lang.String.valueOf;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class ListelemeYoneticisi {
        private PreparedStatement ps;
        private ResultSet rs;
        private Statement ss;
    
         VeriTabaniYoneticisi vb=new VeriTabaniYoneticisi();     
    public void birimListele(JComboBox combo) throws SQLException{
        vb.baglan();
        String sorgu="Select * from birimler ";
        ps=vb.con.prepareStatement(sorgu);
        rs=ps.executeQuery();
        while (rs.next()) {
           combo.addItem(rs.getString("birimAdi")); 
        }
    }
    public void kullaniciListele(String kadi,String sifre,JTextField kimlikNo,JLabel sicilNo,JTextField ad,JTextField soyad,JLabel rdi,JTextField dogumT,JTextField sehir,JTextField birim,JTextField kad,JTextField sif) throws SQLException{

        vb.baglan();
        ss= vb.con.createStatement();
        rs = ss.executeQuery("select * from personel_bilgi");  
            while (rs.next()) {
               if(kadi.equals(rs.getString("kullaniciAdi")) && sifre.equals(rs.getString("sifre")))
                 {
                 if(true)
                   {
                    kimlikNo.setText(rs.getString("tcKimlik"));
                    sicilNo.setText(rs.getString("sicilNo"));
                    ad.setText(rs.getString("ad"));
                    soyad.setText(rs.getString("soyad"));
                    rdi.setText(rs.getString("cinsiyet"));
                    dogumT.setText(rs.getString("dogumTarihi"));
                    sehir.setText(rs.getString("sehir"));
                    birim.setText(rs.getString("birimID"));
                    kad.setText(kadi);
                    sif.setText(sifre);
                    }
              }
          }
    }
      public void yoneticiListele(String kadi,String sifre,JTextField kimlikNo,JTextField ad,JTextField soyad,JLabel radi,JTextField dogumT,JTextField sehir,JTextField kad,JTextField sif) throws SQLException{

        vb.baglan();
        ss= vb.con.createStatement();
        rs = ss.executeQuery("select * from yonetici_bilgi");  
            while (rs.next()) {
               if(kadi.equals(rs.getString("y_kad")) && sifre.equals(rs.getString("y_sifre")))
                 {
                 if(true)
                   {
                    kimlikNo.setText(rs.getString("y_tcKimlik"));
                    ad.setText(rs.getString("y_ad"));
                    soyad.setText(rs.getString("y_soyad"));
                    radi.setText(rs.getString("y_cinsiyet"));
                    dogumT.setText(rs.getString("y_dogumT"));
                    sehir.setText(rs.getString("sehir"));
                    kad.setText(kadi);
                    sif.setText(sifre);
                    }
              }
          }
 }
   public ArrayList<personel> personelBilgisiCek(){    
             ArrayList<personel> personelBilgileri=new ArrayList<personel>();
             try { 
                    vb.baglan();
                            String sorgu="select * from personel_bilgi";
                    
                    ps=vb.con.prepareStatement(sorgu);
                    rs=ps.executeQuery();
                    
                    while (rs.next()) {
                        personel p=new personel();
                   
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
                    
                    personelBilgileri.add(p);                    
                    }              
                    ps.close();
                    rs.close(); 
             } catch (Exception e) {
                    e.printStackTrace();
             }           
                    return personelBilgileri; 
       }
    
public void tabloyuDoldur(JTable tabo)
       {
             ArrayList<personel> personelListem=new ArrayList<personel>();
             personelListem=personelBilgisiCek();
             String dizim[][]=new String[ personelListem.size()][];
          
             for (int i = 0; i < personelListem.size(); i++) {     
                     dizim[i]=new String[]{                                   
                     valueOf(personelListem.get(i).getTc()),
                     valueOf(personelListem.get(i).getSicilNo()),
                     valueOf(personelListem.get(i).getAd()),
                     valueOf(personelListem.get(i).getSoyad()),  
                      valueOf(personelListem.get(i).getCinsiyet()),
                   valueOf(personelListem.get(i).getDogumTarihi()),   
                     valueOf(personelListem.get(i).getSehir()),  
                     valueOf(personelListem.get(i).getBirim()),
                     valueOf(personelListem.get(i).getKad()),
                     valueOf(personelListem.get(i).getSifre()),
                     };                                
          }
             TableModel tabloModeli=new DefaultTableModel(
             dizim,
             new String[] {"Tc Kimlik", "Sicil No", "Ad", "Soyad","Cinsiyet","DogumTarihi","sehir","birimID","kullaniciAdi","sifre"}                                                 
                           );
             tabo.setModel(tabloModeli);
    }
  public void izinTur(JComboBox combo) throws SQLException{
        vb.baglan();
        String sorgu="Select * from izin_tür ";
        ps=vb.con.prepareStatement(sorgu);
        rs=ps.executeQuery();
        while (rs.next()) {
           combo.addItem(rs.getString("izin_Türü"));        
        }
    }
     public void personelSicilNo(JComboBox jcom) throws SQLException {
     
       vb.baglan();
        String sorgu="Select sicilNo, ad from personel_bilgi ";
        ps=vb.con.prepareStatement(sorgu);
        rs=ps.executeQuery();
        while (rs.next()) {
           jcom.addItem(rs.getString("sicilNo")+"  "+rs.getString("ad"));
          
        }
    }
    public void TaplomIzinMiktarıTablosunuGoster(JTable toplamIzinMiktar) {
            vb.baglan();
        try {
  String sql = "SELECT pb.ad, pb.soyad, sum(i.izin_sure),i.kalan_izin "
                    + "FROM personel_bilgi pb INNER JOIN izin_bilgi i ON pb.sicilNo "
                    + "= i.sicilNo GROUP BY pb.ad";
        ps=vb.con.prepareStatement(sql);
        rs=ps.executeQuery();
            ToplamMiktar model = new ToplamMiktar(rs);
            toplamIzinMiktar.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Personel Toplam İzin Miktarını Gösterirken Hata Oluştu!!!\n" + e);
        }
    }
        public void KullaniciToplamIzin(JTable toplamIzinMiktar,String sicilNo) {
            vb.baglan();
        try {
  String sql = "SELECT pb.ad, pb.soyad, sum(i.izin_sure),i.kalan_izin "
                    + "FROM personel_bilgi pb INNER JOIN izin_bilgi i ON pb.sicilNo "
                    + "= i.sicilNo where i.sicilNo=? GROUP BY pb.ad";
        ps=vb.con.prepareStatement(sql);
        ps.setString(1, sicilNo);
        rs=ps.executeQuery();
            ToplamMiktar model = new ToplamMiktar(rs);
            toplamIzinMiktar.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Personel Toplam İzin Miktarını Gösterirken Hata Oluştu!!!\n" + e);
        }
    }
    
         
         
         
 }
    


    

