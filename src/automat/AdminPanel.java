/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automat;

import java.awt.Color;

/**
 *
 * @author john
 */
public class AdminPanel extends javax.swing.JPanel {

    private Billetautomatv2 ba;
    
    /**
     * Creates new form AdminPanel
     */
    void setLogik(Billetautomatv2 automat) {
        ba = automat;
    }
    
    void loginLogik(boolean login){
        jPanel1_AdminDesk.setVisible(login);
        if (login == true){ //opdater værdier i AdminDesk'en:
            jTextField_BiletterSolgt0.setText(""+ ba.getAntalBilletterSolgt(0));
            jTextField_BiletterSolgt1.setText(""+ ba.getAntalBilletterSolgt(1));
            jTextField_BiletterSolgt2.setText(""+ ba.getAntalBilletterSolgt(2));
            jTextField_BiletterSolgt3.setText(""+ ba.getAntalBilletterSolgt(3));
            jTextField_BiletterSolgt4.setText(""+ ba.getAntalBilletterSolgt(4));
            jTextField_TotalInd.setText(ba.getTotal()+ " kr.");
        }
    }
    
    public AdminPanel() {
        initComponents();
        jPanel1_AdminDesk.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_MontørLogin = new javax.swing.JLabel();
        jPasswordField_Login = new javax.swing.JPasswordField();
        jLabel_Montør_status = new javax.swing.JLabel();
        jButton_Login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1_AdminDesk = new javax.swing.JPanel();
        jLabel_BilletterSolgt = new javax.swing.JLabel();
        jLabel_TotalInd = new javax.swing.JLabel();
        jTextField_BiletterSolgt0 = new javax.swing.JTextField();
        jTextField_TotalInd = new javax.swing.JTextField();
        jButton_setBilletterSolgt0 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField_BiletterSolgt1 = new javax.swing.JTextField();
        jButton_setBilletterSolgt1 = new javax.swing.JButton();
        jTextField_BiletterSolgt2 = new javax.swing.JTextField();
        jButton_setBilletterSolgt2 = new javax.swing.JButton();
        jTextField_BiletterSolgt3 = new javax.swing.JTextField();
        jButton_setBilletterSolgt3 = new javax.swing.JButton();
        jTextField_BiletterSolgt4 = new javax.swing.JTextField();
        jButton_setBilletterSolgt4 = new javax.swing.JButton();

        jLabel_MontørLogin.setText("Montør Login");

        jPasswordField_Login.setText("1234");
        jPasswordField_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_LoginActionPerformed(evt);
            }
        });

        jLabel_Montør_status.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Montør_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Montør_status.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_Montør_status.setText("Logget ud");

        jButton_Login.setText("Login");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jLabel_BilletterSolgt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel_BilletterSolgt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_BilletterSolgt.setText("Antal billetter solgt: ");

        jLabel_TotalInd.setText("Total indtjening: ");

        jTextField_BiletterSolgt0.setText("0");
        jTextField_BiletterSolgt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BiletterSolgt0ActionPerformed(evt);
            }
        });

        jTextField_TotalInd.setText("0");

        jButton_setBilletterSolgt0.setText("Set");
        jButton_setBilletterSolgt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_setBilletterSolgt0ActionPerformed(evt);
            }
        });

        jLabel1.setText("Voksen biletter:");

        jLabel2.setText("Ungdoms biletter:");

        jLabel3.setText("Børne biletter:");

        jLabel4.setText("Studenter biletter:");

        jLabel5.setText("Cykel biletter:");

        jTextField_BiletterSolgt1.setText("0");
        jTextField_BiletterSolgt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BiletterSolgt1ActionPerformed(evt);
            }
        });

        jButton_setBilletterSolgt1.setText("Set");
        jButton_setBilletterSolgt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_setBilletterSolgt1ActionPerformed(evt);
            }
        });

        jTextField_BiletterSolgt2.setText("0");
        jTextField_BiletterSolgt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BiletterSolgt2ActionPerformed(evt);
            }
        });

        jButton_setBilletterSolgt2.setText("Set");
        jButton_setBilletterSolgt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_setBilletterSolgt2ActionPerformed(evt);
            }
        });

        jTextField_BiletterSolgt3.setText("0");
        jTextField_BiletterSolgt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BiletterSolgt3ActionPerformed(evt);
            }
        });

        jButton_setBilletterSolgt3.setText("Set");
        jButton_setBilletterSolgt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_setBilletterSolgt3ActionPerformed(evt);
            }
        });

        jTextField_BiletterSolgt4.setText("0");
        jTextField_BiletterSolgt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BiletterSolgt4ActionPerformed(evt);
            }
        });

        jButton_setBilletterSolgt4.setText("Set");
        jButton_setBilletterSolgt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_setBilletterSolgt4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_AdminDeskLayout = new javax.swing.GroupLayout(jPanel1_AdminDesk);
        jPanel1_AdminDesk.setLayout(jPanel1_AdminDeskLayout);
        jPanel1_AdminDeskLayout.setHorizontalGroup(
            jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                        .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                                .addComponent(jTextField_BiletterSolgt0, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_setBilletterSolgt0))
                            .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                                .addComponent(jTextField_BiletterSolgt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton_setBilletterSolgt1))))
                    .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                            .addComponent(jLabel_TotalInd)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField_TotalInd, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11))
                        .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                            .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3))
                            .addGap(8, 8, 8)
                            .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                                    .addComponent(jTextField_BiletterSolgt3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_setBilletterSolgt3))
                                .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                                    .addComponent(jTextField_BiletterSolgt2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_setBilletterSolgt2))
                                .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                                    .addComponent(jTextField_BiletterSolgt4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton_setBilletterSolgt4)))))
                    .addComponent(jLabel_BilletterSolgt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(320, Short.MAX_VALUE))
        );
        jPanel1_AdminDeskLayout.setVerticalGroup(
            jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_AdminDeskLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_BilletterSolgt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_BiletterSolgt0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_setBilletterSolgt0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_BiletterSolgt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_setBilletterSolgt1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_BiletterSolgt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_setBilletterSolgt2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_BiletterSolgt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_setBilletterSolgt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_BiletterSolgt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_setBilletterSolgt4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1_AdminDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_TotalInd)
                    .addComponent(jTextField_TotalInd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1_AdminDesk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_MontørLogin)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPasswordField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel_Montør_status)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton_Login)
                        .addGap(0, 292, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_MontørLogin)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Montør_status)
                    .addComponent(jButton_Login))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1_AdminDesk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jPasswordField_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField_LoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField_LoginActionPerformed

    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        // TODO add your handling code here:
        if(ba.erMontoer()){
            ba.montoerLogin("0000");
        }else{
            ba.montoerLogin(jPasswordField_Login.getText());
        }

        if(ba.erMontoer()){
            jLabel_Montør_status.setForeground(Color.GREEN);
            jLabel_Montør_status.setText("Logget ind");
            jButton_Login.setText("Log ud");
            loginLogik(true);
        }else{
            jLabel_Montør_status.setForeground(Color.RED);
            jLabel_Montør_status.setText("Logget ud");
            jButton_Login.setText("Login");
            loginLogik(false);
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jTextField_BiletterSolgt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BiletterSolgt0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BiletterSolgt0ActionPerformed

    private void jButton_setBilletterSolgt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_setBilletterSolgt0ActionPerformed
        // TODO add your handling code here:
        try {
            ba.setAntalBilletterSolgt(0, Integer.parseInt(jTextField_BiletterSolgt0.getText()) );
        } catch (Exception e){
            //Popup here comming
        }
    }//GEN-LAST:event_jButton_setBilletterSolgt0ActionPerformed

    private void jTextField_BiletterSolgt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BiletterSolgt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BiletterSolgt1ActionPerformed

    private void jButton_setBilletterSolgt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_setBilletterSolgt1ActionPerformed
        // TODO add your handling code here:
        try {
            ba.setAntalBilletterSolgt(1, Integer.parseInt(jTextField_BiletterSolgt1.getText()) );
        } catch (Exception e){
            //Popup here comming
        }
    }//GEN-LAST:event_jButton_setBilletterSolgt1ActionPerformed

    private void jTextField_BiletterSolgt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BiletterSolgt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BiletterSolgt2ActionPerformed

    private void jButton_setBilletterSolgt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_setBilletterSolgt2ActionPerformed
        // TODO add your handling code here:
        try {
            ba.setAntalBilletterSolgt(2, Integer.parseInt(jTextField_BiletterSolgt2.getText()) );
        } catch (Exception e){
            //Popup here comming
        }
    }//GEN-LAST:event_jButton_setBilletterSolgt2ActionPerformed

    private void jTextField_BiletterSolgt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BiletterSolgt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BiletterSolgt3ActionPerformed

    private void jButton_setBilletterSolgt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_setBilletterSolgt3ActionPerformed
        // TODO add your handling code here:
        try {
            ba.setAntalBilletterSolgt(3, Integer.parseInt(jTextField_BiletterSolgt3.getText()) );
        } catch (Exception e){
            //Popup here comming
        }
    }//GEN-LAST:event_jButton_setBilletterSolgt3ActionPerformed

    private void jTextField_BiletterSolgt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BiletterSolgt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BiletterSolgt4ActionPerformed

    private void jButton_setBilletterSolgt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_setBilletterSolgt4ActionPerformed
        // TODO add your handling code here:
        try {
            ba.setAntalBilletterSolgt(4, Integer.parseInt(jTextField_BiletterSolgt4.getText()) );
        } catch (Exception e){
            //Popup here comming
        }
    }//GEN-LAST:event_jButton_setBilletterSolgt4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_setBilletterSolgt0;
    private javax.swing.JButton jButton_setBilletterSolgt1;
    private javax.swing.JButton jButton_setBilletterSolgt2;
    private javax.swing.JButton jButton_setBilletterSolgt3;
    private javax.swing.JButton jButton_setBilletterSolgt4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_BilletterSolgt;
    private javax.swing.JLabel jLabel_MontørLogin;
    private javax.swing.JLabel jLabel_Montør_status;
    private javax.swing.JLabel jLabel_TotalInd;
    private javax.swing.JPanel jPanel1_AdminDesk;
    private javax.swing.JPasswordField jPasswordField_Login;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField_BiletterSolgt0;
    private javax.swing.JTextField jTextField_BiletterSolgt1;
    private javax.swing.JTextField jTextField_BiletterSolgt2;
    private javax.swing.JTextField jTextField_BiletterSolgt3;
    private javax.swing.JTextField jTextField_BiletterSolgt4;
    private javax.swing.JTextField jTextField_TotalInd;
    // End of variables declaration//GEN-END:variables
}