/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class ToplamMiktar extends AbstractTableModel{
    private int satirSayisi;
    private int sutunSayisi;
    private ResultSet rs;

    private ArrayList veriler = new ArrayList();

    public ToplamMiktar(ResultSet rs) throws SQLException {
        
        this.rs = rs;
        
        ResultSetMetaData rsmd = rs.getMetaData();
        
        satirSayisi = 0;
        
        sutunSayisi = rsmd.getColumnCount();
        
        while(rs.next()) {
            
            Object[] satirBilgi = new Object[sutunSayisi];
            
            for(int i = 0; i < sutunSayisi; i++) {
                satirBilgi[i] = rs.getObject(i + 1);
            }
            
            veriler.add(satirBilgi);
            
            satirSayisi++;
        }
    }
    
    @Override
    public int getRowCount() {
        return satirSayisi;
    }

    @Override
    public int getColumnCount() {
        return sutunSayisi;
    }

    //Bu metod tablo üzerinde tıklanan veriyi geri döndürür.
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //Verileri arraylist içerisinde satır satır kaydettiğimiz için.s
        Object[] satirBilgi = (Object[]) veriler.get(rowIndex);
        
        // Sutun index seçerekte satırBilgi üzerinden veriye ulaştık.
        return satirBilgi[columnIndex];
    }
    
    public String[] sutunIsimleri = {"Ad", "Soyad", "Kullanılan İzin Toplamı","Kalan Miktar"};
    @Override
    public String getColumnName(int sutunIndex) {
        
        return sutunIsimleri[sutunIndex];
    }
}
