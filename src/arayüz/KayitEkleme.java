
package arayüz;


import bilgi.personel;
import controller.EklemeYoneticisi;
import controller.ListelemeYoneticisi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class KayitEkleme extends javax.swing.JFrame {

    private String cinsiyet;
    public KayitEkleme() {
        initComponents();
         this.setLocationRelativeTo(null);
        ListelemeYoneticisi ls=new ListelemeYoneticisi();
        try {
            ls.birimListele(birim);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ComBo Hata :"+ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Kaydet = new javax.swing.JPanel();
        sifre = new javax.swing.JTextField();
        kad = new javax.swing.JTextField();
        sehir = new javax.swing.JTextField();
        s_no = new javax.swing.JTextField();
        tc_no = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adi = new javax.swing.JTextField();
        soyad = new javax.swing.JTextField();
        kaydet = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        dogum = new javax.swing.JTextField();
        erkek = new javax.swing.JRadioButton();
        kadin = new javax.swing.JRadioButton();
        birim = new javax.swing.JComboBox<>();
        k_giris = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Kaydet.setBorder(javax.swing.BorderFactory.createTitledBorder("Kayıt Ekleme"));

        s_no.setToolTipText("");

        jLabel1.setText("TC Kimlik No");

        jLabel2.setText("Sicil No");

        jLabel3.setText("Ad");

        jLabel4.setText("Soyad");

        jLabel5.setText("Cinsiyet");

        jLabel6.setText("Sehir");

        jLabel7.setText("Birim");

        jLabel8.setText("Kullanici Adi");

        jLabel9.setText("Sifre");

        kaydet.setText("Kaydet");
        kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaydetActionPerformed(evt);
            }
        });

        jLabel10.setText("DogumT");

        dogum.setText("yyyy.aa.gg");

        buttonGroup1.add(erkek);
        erkek.setText("Erkek");
        erkek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                erkekActionPerformed(evt);
            }
        });

        buttonGroup1.add(kadin);
        kadin.setText("Kadin");
        kadin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kadinActionPerformed(evt);
            }
        });

        birim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BirimSeciniz" }));

        k_giris.setText("Kullanıcı Giris");
        k_giris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                k_girisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KaydetLayout = new javax.swing.GroupLayout(Kaydet);
        Kaydet.setLayout(KaydetLayout);
        KaydetLayout.setHorizontalGroup(
            KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KaydetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(KaydetLayout.createSequentialGroup()
                        .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KaydetLayout.createSequentialGroup()
                                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(KaydetLayout.createSequentialGroup()
                                        .addComponent(kad, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(KaydetLayout.createSequentialGroup()
                                        .addComponent(dogum, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                        .addGap(190, 190, 190)))
                                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(KaydetLayout.createSequentialGroup()
                                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sifre)
                                    .addComponent(tc_no)
                                    .addComponent(s_no, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(27, 27, 27)
                        .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sehir, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(soyad, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                                    .addComponent(adi)))
                            .addGroup(KaydetLayout.createSequentialGroup()
                                .addComponent(erkek)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(kadin))
                            .addComponent(birim, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(KaydetLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(k_giris)))
                .addGap(14, 14, 14))
        );
        KaydetLayout.setVerticalGroup(
            KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KaydetLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel3)
                    .addComponent(adi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tc_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(s_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(birim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(dogum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(erkek)
                    .addComponent(kadin))
                .addGap(18, 18, 18)
                .addGroup(KaydetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kaydet)
                    .addComponent(k_giris))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(Kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    private void kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaydetActionPerformed

              
      personel p=new personel();
           p.personelOlustur(tc_no.getText(),Integer.parseInt(s_no.getText()),soyad.getText(),cinsiyet,dogum.getText()
      ,sehir.getText(),birim.getSelectedIndex(),adi.getText(),kad.getText(), sifre.getText());
  
       
        try {
            EklemeYoneticisi ekle=new EklemeYoneticisi();         
          ekle.ekleme(p);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
      
    }//GEN-LAST:event_kaydetActionPerformed

    private void erkekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_erkekActionPerformed
       cinsiyet="Erkek";
    }//GEN-LAST:event_erkekActionPerformed

    private void kadinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kadinActionPerformed
        cinsiyet="Kadin";
    }//GEN-LAST:event_kadinActionPerformed

    private void k_girisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_k_girisActionPerformed
        KullaniciGiris kg=new KullaniciGiris();
        kg.show();
        this.hide();
    }//GEN-LAST:event_k_girisActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KayitEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KayitEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KayitEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KayitEkleme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KayitEkleme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Kaydet;
    private javax.swing.JTextField adi;
    private javax.swing.JComboBox<String> birim;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField dogum;
    private javax.swing.JRadioButton erkek;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton k_giris;
    private javax.swing.JTextField kad;
    private javax.swing.JRadioButton kadin;
    private javax.swing.JButton kaydet;
    private javax.swing.JTextField s_no;
    private javax.swing.JTextField sehir;
    private javax.swing.JTextField sifre;
    private javax.swing.JTextField soyad;
    private javax.swing.JTextField tc_no;
    // End of variables declaration//GEN-END:variables
}
