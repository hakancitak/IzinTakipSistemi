
package arayüz;

public class AnaForm extends javax.swing.JFrame {

    public AnaForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        yoneticiGBtn = new javax.swing.JButton();
        klncGBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        yoneticiGBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/yoneticigirisi.jpg"))); // NOI18N
        yoneticiGBtn.setText("Yönetici Giriş");
        yoneticiGBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        yoneticiGBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        yoneticiGBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yoneticiGBtnActionPerformed(evt);
            }
        });

        klncGBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resim/uyegiris2i.jpg"))); // NOI18N
        klncGBtn.setText("Kullanıcı Giriş");
        klncGBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        klncGBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        klncGBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klncGBtnActionPerformed(evt);
            }
        });

        jMenu1.setText("Çıkış");
        jMenu1.setActionCommand("");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(yoneticiGBtn)
                .addGap(41, 41, 41)
                .addComponent(klncGBtn)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(klncGBtn)
                    .addComponent(yoneticiGBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void klncGBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klncGBtnActionPerformed
        KullaniciGiris k=new KullaniciGiris();
        k.show();
        hide();
    
    }//GEN-LAST:event_klncGBtnActionPerformed

    private void yoneticiGBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yoneticiGBtnActionPerformed
       YoneticiGiris yg=new YoneticiGiris();
       yg.show();
       this.hide();
   
    
    }//GEN-LAST:event_yoneticiGBtnActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
     
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
   System.exit(0);
    }//GEN-LAST:event_jMenu1MouseClicked

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
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton klncGBtn;
    private javax.swing.JButton yoneticiGBtn;
    // End of variables declaration//GEN-END:variables
}
