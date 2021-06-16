/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import controlMySql.MySqlConn;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author osba_
 */
public class Registro extends javax.swing.JFrame {
MySqlConn conn;
    /**
     * Creates new form Registro
     */
    public Registro() {
        conn=new MySqlConn();
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
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonRegistroCuentas = new javax.swing.JButton();
        jButtonLimpiarRegistro = new javax.swing.JButton();
        jButtonLoginRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Cuentas");

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel2.setText("Cuenta:");

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jLabel3.setText("Contraseña:");

        jTextField1.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N

        jPasswordField1.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N

        jButtonRegistroCuentas.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButtonRegistroCuentas.setText("Registro");
        jButtonRegistroCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistroCuentasActionPerformed(evt);
            }
        });

        jButtonLimpiarRegistro.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButtonLimpiarRegistro.setText("Limpiar");
        jButtonLimpiarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarRegistroActionPerformed(evt);
            }
        });

        jButtonLoginRegistro.setFont(new java.awt.Font("Kristen ITC", 0, 14)); // NOI18N
        jButtonLoginRegistro.setText("Login");
        jButtonLoginRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(jPasswordField1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRegistroCuentas)
                        .addGap(52, 52, 52)
                        .addComponent(jButtonLimpiarRegistro)
                        .addGap(54, 54, 54)
                        .addComponent(jButtonLoginRegistro)))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButtonLimpiarRegistro, jButtonLoginRegistro, jButtonRegistroCuentas});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegistroCuentas)
                    .addComponent(jButtonLimpiarRegistro)
                    .addComponent(jButtonLoginRegistro))
                .addGap(73, 73, 73))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButtonLimpiarRegistro, jButtonLoginRegistro, jButtonRegistroCuentas});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginRegistroActionPerformed
        Login log=new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonLoginRegistroActionPerformed

    private void jButtonLimpiarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarRegistroActionPerformed
        this.jPasswordField1.setText("");
        this.jTextField1.setText("");
    }//GEN-LAST:event_jButtonLimpiarRegistroActionPerformed

    private void jButtonRegistroCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistroCuentasActionPerformed
        String cuenta,contraseña,parte1,parte2,query;
        cuenta=this.jTextField1.getText().trim();
        char [] passw=this.jPasswordField1.getPassword();
        
        contraseña=new String(passw);
        parte1= "insert into cuentas values (";
        parte2= "'" + cuenta + "'," + " MD5('" + contraseña + "'))";
        query=parte1+parte2;
        System.out.println(query);
        int j=this.conn.Update(query);
        if(j>0){
            JOptionPane.showMessageDialog(this, "Cuenta registrada ...");
            System.out.println("Cuenta registrada ...");
        }else{
            System.out.println("fallo");
        }
    }//GEN-LAST:event_jButtonRegistroCuentasActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLimpiarRegistro;
    private javax.swing.JButton jButtonLoginRegistro;
    private javax.swing.JButton jButtonRegistroCuentas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
