/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Update;

/**
 *
 * @author ASUS
 */
public class Frame_Terapi extends javax.swing.JFrame {

    /**
     * Creates new form Frame_Terapi
     */
    public Frame_Terapi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        d_terapi = new javax.swing.JTextField();
        k_terapi = new javax.swing.JTextField();
        n_terapi = new javax.swing.JTextField();
        k_dokter = new javax.swing.JTextField();
        k_pasien = new javax.swing.JTextField();
        b_submit = new javax.swing.JButton();
        b_delete = new javax.swing.JButton();
        b_home = new javax.swing.JButton();
        b_next = new javax.swing.JButton();
        j_terapi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(36, 64));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Kode Terapi");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 90, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nama Terapi");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 100, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Deskripsi");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Kode Pasien");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Kode Dokter");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 110, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Terapi");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 120, 40));

        d_terapi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_terapiActionPerformed(evt);
            }
        });
        getContentPane().add(d_terapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 580, 100));
        getContentPane().add(k_terapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 80, 570, -1));
        getContentPane().add(n_terapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 120, 575, -1));
        getContentPane().add(k_dokter, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 288, 580, -1));
        getContentPane().add(k_pasien, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 328, 580, -1));

        b_submit.setBackground(new java.awt.Color(51, 255, 255));
        b_submit.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b_submit.setText("Submit");
        b_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submitActionPerformed(evt);
            }
        });
        getContentPane().add(b_submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 110, -1));

        b_delete.setBackground(new java.awt.Color(255, 102, 102));
        b_delete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b_delete.setText("Delete");
        b_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(b_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(695, 430, 110, -1));

        b_home.setBackground(new java.awt.Color(153, 153, 0));
        b_home.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b_home.setText("Home");
        b_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_homeActionPerformed(evt);
            }
        });
        getContentPane().add(b_home, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, 100, -1));

        b_next.setBackground(new java.awt.Color(0, 255, 255));
        b_next.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        b_next.setText("Next");
        b_next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_nextMouseClicked(evt);
            }
        });
        getContentPane().add(b_next, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 90, -1));

        j_terapi.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        j_terapi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Terapi Kimia", "Terapi Psikologis", " " }));
        getContentPane().add(j_terapi, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 140, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Jenis Terapi");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 99, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 836, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 840, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void d_terapiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_terapiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_terapiActionPerformed

    private void b_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_submitActionPerformed

    private void b_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_deleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_deleteActionPerformed

    private void b_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_homeActionPerformed

    private void b_nextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_nextMouseClicked
        // TODO add your handling code here:
       String a = (String) j_terapi.getSelectedItem();
        if(a == "Terapi Kimia"){
           Frame_Terapi_Kimia jF = new Frame_Terapi_Kimia();
           jF.setVisible(true);
       } else {
           Frame_Terapi_Psikologis jF_1 = new Frame_Terapi_Psikologis();
           jF_1.setVisible(true);
        }
    }//GEN-LAST:event_b_nextMouseClicked

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
            java.util.logging.Logger.getLogger(Frame_Terapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame_Terapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame_Terapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame_Terapi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame_Terapi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_delete;
    private javax.swing.JButton b_home;
    private javax.swing.JButton b_next;
    private javax.swing.JButton b_submit;
    private javax.swing.JTextField d_terapi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> j_terapi;
    private javax.swing.JTextField k_dokter;
    private javax.swing.JTextField k_pasien;
    private javax.swing.JTextField k_terapi;
    private javax.swing.JTextField n_terapi;
    // End of variables declaration//GEN-END:variables
}
