/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JogoRPG;

import Ferramentas.Arquivo;
import Ferramentas.Globais;



import controladores.JogoController;
import java.awt.event.KeyEvent;

/**
 *
 * @author mari
 */
public class TelaJogoLogin extends javax.swing.JFrame {
Arquivo objArquivo;
String linha;
String linha2;
    JogoController controller;
    public TelaJogoLogin() {
        initComponents();
        
        objArquivo = new Arquivo("nivel.txt");
        objArquivo.abrirEscrita();
        linha = "";
        objArquivo.escreverLinha(linha);
        objArquivo.fecharArquivo();
        objArquivo = new Arquivo("vida.txt");
        objArquivo.abrirEscrita();
        linha = "";
        objArquivo.escreverLinha(linha2);
        
        objArquivo.fecharArquivo();
      Globais.ajustarImagem(getClass().getResource("/imagens/LugarAbandonado.png"), lblTy);
        
        
        
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bntEntrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblCriarConta = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        lblTy = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 436, 496, 61));

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));
        jPanel1.setToolTipText("");
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bntEntrar.setBackground(new java.awt.Color(0, 153, 153));
        bntEntrar.setFont(new java.awt.Font("Laksaman", 1, 15)); // NOI18N
        bntEntrar.setForeground(new java.awt.Color(255, 255, 255));
        bntEntrar.setText("Entrar");
        bntEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEntrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Laksaman", 1, 15)); // NOI18N
        jLabel3.setText("Senha");

        jLabel2.setFont(new java.awt.Font("Laksaman", 1, 15)); // NOI18N
        jLabel2.setText("Usuário");

        txtUsuario.setBackground(new java.awt.Color(102, 102, 0));
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblCriarConta.setBackground(new java.awt.Color(51, 51, 51));
        lblCriarConta.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        lblCriarConta.setForeground(new java.awt.Color(204, 204, 204));
        lblCriarConta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCriarConta.setText("Registre-se");
        lblCriarConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCriarContaMouseClicked(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(102, 102, 0));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(bntEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)))
                .addComponent(bntEntrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCriarConta)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, -1, -1));
        getContentPane().add(lblTy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEntrarActionPerformed
       validar();
    }//GEN-LAST:event_bntEntrarActionPerformed

    private void lblCriarContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCriarContaMouseClicked
        TelaCad tela3 = new TelaCad();
        tela3.setVisible(true);
        dispose();
       
    }//GEN-LAST:event_lblCriarContaMouseClicked

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            validar();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

     private void validar (){
          controller= new JogoController();
        if(controller.login(txtUsuario.getText(), txtSenha.getText())){
            TelaMenu telaM = new TelaMenu();
            telaM.setVisible(true);
            dispose();
           
        }else{
         Globais.exibirMensagem("Usuario ou senha incorreta");
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
            java.util.logging.Logger.getLogger(TelaJogoLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaJogoLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaJogoLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaJogoLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaJogoLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCriarConta;
    private javax.swing.JLabel lblTy;
    private javax.swing.JPasswordField txtSenha;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
