/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bilgi;

import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Lenovo
 */
public class izin_bilgi {
    
    private String izin_bas;
    private String izin_bit;
    private int izinTürID;
    private int izin_sure;
    private int kalan_izin;
    private int kayitNo;
    private int sicilNo;
    private String izin_onay;
    
    public void kullanici_izin_olustur(String izin_bas,String izin_bit,int izin_sure,int izinTürID,int sicilNo){
        this.izin_bas=izin_bas;
        this.izin_bit=izin_bit;
        this.izin_sure=izin_sure;
        this.sicilNo=sicilNo;
        this.setIzinTürID(izinTürID);
    }
    
    
    
    
    
    
    
    

    /**
     * @return the izin_bas
     */
    public String getIzin_bas() {
        return izin_bas;
    }

    /**
     * @param izin_bas the izin_bas to set
     */
    public void setIzin_bas(String izin_bas) {
        this.izin_bas = izin_bas;
    }

    /**
     * @return the izin_bit
     */
    public String getIzin_bit() {
        return izin_bit;
    }

    /**
     * @param izin_bit the izin_bit to set
     */
    public void setIzin_bit(String izin_bit) {
        this.izin_bit = izin_bit;
    }

    /**
     * @return the izin_sure
     */
    public int getIzin_sure() {
        return izin_sure;
    }

    /**
     * @param izin_sure the izin_sure to set
     */
    public void setIzin_sure(int izin_sure) {
        this.izin_sure = izin_sure;
    }

    /**
     * @return the kalan_izin
     */
    public int getKalan_izin() {
        return kalan_izin;
    }

    /**
     * @param kalan_izin the kalan_izin to set
     */
    public void setKalan_izin(int kalan_izin) {
        this.kalan_izin = kalan_izin;
    }

    /**
     * @return the kayitNo
     */
    public int getKayitNo() {
        return kayitNo;
    }

    /**
     * @param kayitNo the kayitNo to set
     */
    public void setKayitNo(int kayitNo) {
        this.kayitNo = kayitNo;
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
     * @return the izinTürID
     */
    public int getIzinTürID() {
        return izinTürID;
    }

    /**
     * @param izinTürID the izinTürID to set
     */
    public void setIzinTürID(int izinTürID) {
        this.izinTürID = izinTürID;
    }

   
    
    
}
