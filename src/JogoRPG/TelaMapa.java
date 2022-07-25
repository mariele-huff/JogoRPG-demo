/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JogoRPG;

import Ferramentas.Arquivo;
import Ferramentas.Globais;
import java.awt.Color;

/**
 *
 * @author mari
 */
public class TelaMapa extends javax.swing.JFrame {

    Arquivo objArquivo;
    String linha;

    public TelaMapa() {
        initComponents();

        Globais.ajustarImagem(getClass().getResource("/imagens/Mapa.png"), lblLy);
        acessoPxNivel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblN1 = new javax.swing.JLabel();
        lblN2 = new javax.swing.JLabel();
        lblN4 = new javax.swing.JLabel();
        lblN3 = new javax.swing.JLabel();
        lblNF = new javax.swing.JLabel();
        btnN1 = new javax.swing.JButton();
        btnN2 = new javax.swing.JButton();
        btnN3 = new javax.swing.JButton();
        btnN4 = new javax.swing.JButton();
        btnNF = new javax.swing.JButton();
        lblLy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblN1.setForeground(new java.awt.Color(255, 255, 255));
        lblN1.setText("Nível 1");
        getContentPane().add(lblN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 67, 29));

        lblN2.setBackground(new java.awt.Color(255, 255, 255));
        lblN2.setForeground(new java.awt.Color(255, 255, 255));
        lblN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/padlock.png"))); // NOI18N
        lblN2.setText("Nível 2");
        getContentPane().add(lblN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        lblN4.setForeground(new java.awt.Color(255, 255, 255));
        lblN4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/padlock.png"))); // NOI18N
        lblN4.setText("Nível 4");
        getContentPane().add(lblN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));

        lblN3.setForeground(new java.awt.Color(255, 255, 255));
        lblN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/padlock.png"))); // NOI18N
        lblN3.setText("Nível 3");
        getContentPane().add(lblN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        lblNF.setForeground(new java.awt.Color(255, 255, 255));
        lblNF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/padlock.png"))); // NOI18N
        lblNF.setText("Nivel Final");
        getContentPane().add(lblNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        btnN1.setBackground(new java.awt.Color(51, 204, 0));
        btnN1.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        btnN1.setForeground(new java.awt.Color(255, 255, 255));
        btnN1.setText("Iníciar");
        btnN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 120, -1));

        btnN2.setBackground(new java.awt.Color(0, 153, 153));
        btnN2.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        btnN2.setForeground(new java.awt.Color(255, 255, 255));
        btnN2.setText("Bloqueado");
        btnN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnN2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, 120, -1));

        btnN3.setBackground(new java.awt.Color(0, 153, 153));
        btnN3.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        btnN3.setForeground(new java.awt.Color(255, 255, 255));
        btnN3.setText("Bloqueado");
        btnN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnN3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 120, -1));

        btnN4.setBackground(new java.awt.Color(0, 153, 153));
        btnN4.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        btnN4.setForeground(new java.awt.Color(255, 255, 255));
        btnN4.setText("Bloqueado");
        getContentPane().add(btnN4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, 120, -1));

        btnNF.setBackground(new java.awt.Color(255, 0, 51));
        btnNF.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        btnNF.setForeground(new java.awt.Color(255, 255, 255));
        btnNF.setText("Bloqueado");
        getContentPane().add(btnNF, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 120, 40));

        lblLy.setText("jLabel1");
        getContentPane().add(lblLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 604, 471));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN1ActionPerformed
        TelaQ1 tela7 = new TelaQ1();
        tela7.setVisible(true);
        dispose();


    }//GEN-LAST:event_btnN1ActionPerformed

    private void btnN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN2ActionPerformed
       /* if (btnN2.getBackground().equals(Color.green)) {
            TelaQ1 tela9 = new TelaQ1();
            tela9.setVisible(true);
            dispose();*/
        
    }//GEN-LAST:event_btnN2ActionPerformed

    private void btnN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN3ActionPerformed
        /* if (btnN3.getBackground().equals(Color.green)) {
            TelaQ1 tela10 = new TelaQ1();
            tela10.setVisible(true);
            dispose();
        }*/
                            
    }//GEN-LAST:event_btnN3ActionPerformed

    private void acessoPxNivel() {
        try{
        objArquivo = new Arquivo("nivel.txt");
        objArquivo.abrirLeitura();
        linha = objArquivo.lerLinha();
       if (linha.equals("")) {
            btnN1.setText("Iniciar");
            btnN1.setBackground(Color.green);

       }else if (linha.equals("Nivel2")) {
            btnN2.setText("Iniciar");
            btnN2.setBackground(Color.green);

            if (btnN2.getText().equals("Iniciar")) {
                btnN1.setText("Concluido");
                btnN1.setBackground(Color.red);

            } else if (linha.equals("Nivel3")) {
                btnN3.setText("Iniciar");
                btnN3.setBackground(Color.green);

                if (btnN3.getText().equals("Iniciar")) {
                    btnN2.setText("Concluido");
                    btnN2.setBackground(Color.red);

                } else if (linha.equals("Nivel4")) {
                    btnN4.setText("Iniciar");
                    btnN4.setBackground(Color.green);

                    if (btnN4.getText().equals("Iniciar")) {
                        btnN3.setText("Concluido");
                        btnN3.setBackground(Color.red);
                    }
                } else if (linha.equals("Nivel Final")) {
                    btnNF.setText("Iniciar");
                    btnNF.setBackground(Color.green);

                    if (btnNF.getText().equals("Iniciar")) {
                        btnN4.setText("Concluido");
                        btnN4.setBackground(Color.red);
                    }
                }
            }
        }
        }catch(Exception ex ){
            System.out.println("Erro acessoNivel: " +ex.getMessage());
        }
    }

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
            java.util.logging.Logger.getLogger(TelaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMapa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnN1;
    private javax.swing.JButton btnN2;
    private javax.swing.JButton btnN3;
    private javax.swing.JButton btnN4;
    private javax.swing.JButton btnNF;
    private javax.swing.JLabel lblLy;
    private javax.swing.JLabel lblN1;
    private javax.swing.JLabel lblN2;
    private javax.swing.JLabel lblN3;
    private javax.swing.JLabel lblN4;
    private javax.swing.JLabel lblNF;
    // End of variables declaration//GEN-END:variables
}
