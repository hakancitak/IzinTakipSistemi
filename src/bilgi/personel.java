/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilgi;

import arayüz.KayitEkleme;
import javax.swing.JTextField;
import controller.EklemeYoneticisi; 

/**
 *
 * @author Lenovo
 */
public class personel {

    private String tc;
    private int sicilNo;
    private String ad;
    private String soyad;
    private String cinsiyet;
    private String dogumTarihi;
    private String sehir;
    private int birim;
    private String kad;
    private String sifre;
public personel(){


}
public void personelOlustur(String tc,int sicilNo,String soyad,String cinsiyet,String dogum,String sehir,int birim,String ad,String kad,String sifre){
    this.tc=tc;
    this.sicilNo=sicilNo;
    this.soyad=soyad;
    this.cinsiyet=cinsiyet;
    this.dogumTarihi=dogum;
    this.sehir=sehir;
    this.birim=birim;
    this.ad=ad;
    this.kad=kad;
    this.sifre=sifre;

    

}


    
    
    /**
     * @return the tc
     */
    public String getTc() {
        return tc;
    }

    /**
     * @param tc the tc to set
     */
    public void setTc(String tc) {
        this.tc = tc;
    }

    /**
     * @return the sicilNo
     */
    public int getSicilNo() {
        return sicilNo;
    }

    /**
     * @param sicilNo the sicilNo to set
     */
    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    /**
     * @return the ad
     */
    public String getAd() {
        return ad;
    }

    /**
     * @param ad the ad to set
     */
    public void setAd(String ad) {
        this.ad = ad;
    }

    /**
     * @return the soyad
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * @param soyad the soyad to set
     */
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    /**
     * @return the cinsiyet
     */
    public String getCinsiyet() {
        return cinsiyet;
    }

    /**
     * @param cinsiyet the cinsiyet to set
     */
    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    /**
     * @return the dogumTarihi
     */
    public String getDogumTarihi() {
        return dogumTarihi;
    }

    /**
     * @param dogumTarihi the dogumTarihi to set
     */
    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    /**
     * @return the sehir
     */
    public String getSehir() {
        return sehir;
    }

    /**
     * @param sehir the sehir to set
     */
    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    /**
     * @return the birim
     */
    public int getBirim() {
        return birim;
    }

    /**
     * @param birim the birim to set
     */
    public void setBirim(int birim) {
        this.birim = birim;
    }

    /**
     * @return the kad
     */
    public String getKad() {
        return kad;
    }

    /**
     * @param kad the kad to set
     */
    public void setKad(String kad) {
        this.kad = kad;
    }

    /**
     * @return the sifre
     */
    public String getSifre() {
        return sifre;
    }

    /**
     * @param sifre the sifre to set
     */
    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
     
}
