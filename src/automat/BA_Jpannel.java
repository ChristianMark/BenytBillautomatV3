package automat;

import java.awt.Color;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chris
 */
public class BA_Jpannel extends javax.swing.JPanel {

    private static Billetautomatv2 ba;
    private static Montoer_tilstand_vindue montor_vindue;
    public static boolean montør_tilstand = false;

    /**
     * Creates new form NewJPanel
     */
    public BA_Jpannel() {
        initComponents();
    }


    void setLogik(Billetautomatv2 automat, Montoer_tilstand_vindue montor_vindue_par) {
        ba = automat;      
        jTextField_Balancen.setText(""+ba.getBalance()+" kr.");
        montor_vindue = montor_vindue_par;
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jSeparator2 = new javax.swing.JSeparator();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jLabelTitel = new javax.swing.JLabel();
        jLabel_IndbetalPenge = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Amount_money = new javax.swing.JTextField();
        jButtonInsert = new javax.swing.JButton();
        jPasswordField_Login = new javax.swing.JPasswordField();
        jLabel_MontørLogin = new javax.swing.JLabel();
        jButton_Login = new javax.swing.JButton();
        jLabel_titel = new javax.swing.JLabel();
        jTextField_Balancen = new javax.swing.JTextField();
        jLabel_Montør_status = new javax.swing.JLabel();
        jButton_udbetal_returpenge = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        jLabelTitel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelTitel.setText("Velkommen til EB billetautomat.");

        jLabel_IndbetalPenge.setText("Indbetal penge");

        Amount_money.setText("0");
        Amount_money.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Amount_moneyActionPerformed(evt);
            }
        });

        jButtonInsert.setText("Indsæt");
        jButtonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertActionPerformed(evt);
            }
        });

        jPasswordField_Login.setText("1234");
        jPasswordField_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField_LoginActionPerformed(evt);
            }
        });

        jLabel_MontørLogin.setText("Montør Login");

        jButton_Login.setText("Login");
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jLabel_titel.setText("Balancen er: ");

        jTextField_Balancen.setText("0");
        jTextField_Balancen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_BalancenActionPerformed(evt);
            }
        });

        jLabel_Montør_status.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_Montør_status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_Montør_status.setForeground(new java.awt.Color(250, 0, 0));
        jLabel_Montør_status.setText("Logget ud");

        jButton_udbetal_returpenge.setText("Udbetal byttepenge");
        jButton_udbetal_returpenge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_udbetal_returpengeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_MontørLogin)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel_IndbetalPenge)
                                            .addComponent(Amount_money, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonInsert))
                                        .addGap(56, 56, 56)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Balancen, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel_titel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButton_udbetal_returpenge))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(88, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Login, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jPasswordField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jLabel_Montør_status)))
                        .addContainerGap(265, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_IndbetalPenge)
                    .addComponent(jLabel_titel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount_money, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Balancen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonInsert)
                    .addComponent(jButton_udbetal_returpenge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_MontørLogin)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField_Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Montør_status))
                .addGap(11, 11, 11)
                .addComponent(jButton_Login)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Amount_moneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Amount_moneyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Amount_moneyActionPerformed

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
            montør_tilstand = true;
            jButton_Login.setText("Log ud");
            montor_vindue.setVisible(true);// Vis montør vinduet
        }else{
            jLabel_Montør_status.setForeground(Color.RED);
            jLabel_Montør_status.setText("Logget ud");
            jButton_Login.setText("Login");
            montor_vindue.setVisible(false);// Vis montør vinduet
            montør_tilstand = false;
        }
    }//GEN-LAST:event_jButton_LoginActionPerformed

    private void jTextField_BalancenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_BalancenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_BalancenActionPerformed

    private void jButtonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertActionPerformed
        // TODO add your handling code here:
        try {
            ba.indsaetPenge(Double.parseDouble(Amount_money.getText()));
            jTextField_Balancen.setText(""+ba.getBalance()+" kr.");
            Amount_money.setText("0");
        } catch (Exception e) {
            
        }
        
        
    }//GEN-LAST:event_jButtonInsertActionPerformed

    private void jButton_udbetal_returpengeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_udbetal_returpengeActionPerformed
        // TODO add your handling code here:
        double retur_penge = ba.returpenge();
        JOptionPane.showMessageDialog(null, "Du har fået udbetalt "+retur_penge+" kr.");
        System.out.println(retur_penge+" kr. blev udbetalt");
        jTextField_Balancen.setText(""+ba.getBalance()+" kr.");
        
        
    }//GEN-LAST:event_jButton_udbetal_returpengeActionPerformed

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        jTextField_Balancen.setText(""+ba.getBalance()+" kr.");
        
        if(!montør_tilstand){
            jLabel_Montør_status.setForeground(Color.RED);
            jLabel_Montør_status.setText("Logget ud");
            jButton_Login.setText("Login");           
        }
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        jTextField_Balancen.setText(""+ba.getBalance()+" kr.");
    }//GEN-LAST:event_formMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Amount_money;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButtonInsert;
    private javax.swing.JButton jButton_Login;
    private javax.swing.JButton jButton_udbetal_returpenge;
    private javax.swing.JLabel jLabelTitel;
    private javax.swing.JLabel jLabel_IndbetalPenge;
    private javax.swing.JLabel jLabel_MontørLogin;
    private javax.swing.JLabel jLabel_Montør_status;
    private javax.swing.JLabel jLabel_titel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPasswordField jPasswordField_Login;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField_Balancen;
    // End of variables declaration//GEN-END:variables
}
