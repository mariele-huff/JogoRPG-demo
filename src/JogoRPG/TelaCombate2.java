/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JogoRPG;

import Ferramentas.Arquivo;
import Ferramentas.Globais;

/**
 *
 * @author mari
 */
public class TelaCombate2 extends javax.swing.JFrame {
Arquivo objArquivo;
Personagens objPersonagem;
String linha;
Personagens objVilao;
    /**
     * Creates new form TelaCombate1
     */
    public TelaCombate2() {
       
       
        //PERSONAGEM
            try{
        objArquivo = new Arquivo("Personagem.txt");
        objArquivo.abrirLeitura();
        linha = objArquivo.lerLinha();
        if (linha != null && linha.equals("Marie Curie")) {
            objPersonagem = new Personagens("Marie Curie", "Radiação", 70, 30);
            lblNHeroi.setText("Marie Curie");
        } else if (linha != null && linha.equals("Nikola Tesla")) {
            lblNHeroi.setText("Nikola Tesla");
            objPersonagem = new Personagens("Nikola Tesla", "Eletricidade", 90, 20);
             Globais.ajustarImagem(getClass().getResource("/imagens/NT.png"), lblHeroi);
             Globais.ajustarImagem(getClass().getResource("/imagens/NikolaTesla.png"), lblFotoHeroi);
        } else if (linha != null && linha.equals("Charles Darwin")) {
            lblNHeroi.setText("Charles Darwin");
            Globais.ajustarImagem(getClass().getResource("/imagens/CD.png"), lblHeroi);
           Globais.ajustarImagem(getClass().getResource("/imagens/CharlesDarwin.png"), lblFotoHeroi);
            objPersonagem = new Personagens("Charles Darwin", "Transformação", 100, 10);
        } else if (linha != null && linha.equals("Albert Einstein")) {
            lblNHeroi.setText("Albert Einstein");
            Globais.ajustarImagem(getClass().getResource("/imagens/AE.png"), lblHeroi);
            Globais.ajustarImagem(getClass().getResource("/imagens/AlbertEinstein.png"), lblFotoHeroi);
            objPersonagem = new Personagens("Albert Einstein", "Relatividade", 80, 30);
        } else if (linha != null && linha.equals("Ada Lovelace")) {
            lblNHeroi.setText("Ada Lovelace");
            Globais.ajustarImagem(getClass().getResource("/imagens/Ada.png"), lblHeroi);
           Globais.ajustarImagem(getClass().getResource("/imagens/AdaLovelace.png"), lblFotoHeroi);
            objPersonagem = new Personagens("Ada Lovelace", "Lógica", 90, 20);

        } else if (linha != null && linha.equals("Sigmund Freud")) {
            lblNHeroi.setText("Sigmund Freud");
            Globais.ajustarImagem(getClass().getResource("/imagens/freudsf.png"), lblHeroi);
            Globais.ajustarImagem(getClass().getResource("/imagens/freud.png"), lblFotoHeroi);
            objPersonagem = new Personagens("Sigmund Freud", "Controle da mente", 80, 30);

        }
        objArquivo.fecharArquivo();
            }catch(Exception ex){
                System.out.println("Erro personagem: " +ex.getMessage());
            }
            
            
            //VILÃO
            try{
       objArquivo = new Arquivo("nivel.txt");
        objArquivo.abrirLeitura();
        linha = objArquivo.lerLinha();
        if(linha != null && linha.equals("")){
            objVilao = new Personagens("vilao1","", 100,20 );
        }else if (linha != null && linha.equals("Nivel2")){
            objVilao = new Personagens("vilao2","", 100, 30 );
        }else if (linha != null && linha.equals("Nivel3")){
            objVilao = new Personagens("vilao3","", 100, 40 );
        }else if (linha != null && linha.equals("Nivel4")){
            objVilao = new Personagens("vilao4","", 100, 50 );
       
        } else if (linha != null && linha.equals("Nivel5")){
            objVilao = new Personagens("vilao5","", 100, 60 );
        }
        objArquivo.fecharArquivo();
            }catch(Exception ex){
                System.out.println("Erro vilão: " + ex.getMessage());
            }
        
            //CENÁRIO
        try{
       Globais.ajustarImagem(getClass().getResource("/imagens/cenarioB1.png"), lblLy);
        Globais.ajustarImagem(getClass().getResource("/imagens/Vilao1.png"), lblInimigo);
        Globais.ajustarImagem(getClass().getResource("/imagens/Nazista1.png"), lblFotoInimigo1);
        lblInimigo.setVisible(false);
        lblHeroi.setVisible(false);
        btnAtaque.setVisible(false);
        btnAvancar.setVisible(false);
        pbHeroi.setValue(objPersonagem.getVida());
        }catch(Exception ex){
            System.out.println("Erro cenario: " + ex.getMessage());
        }
        
        
        // AJUSTE ATAQUE
        try{
        objArquivo = new Arquivo("vida.txt");
        objArquivo.abrirLeitura();
        linha = objArquivo.lerLinha();
        
        if (linha.equals("T")) {
            objPersonagem.setAtaque(objPersonagem.getAtaque()+10);
             
           
            
            
        } else if (linha.equals("F")) {
            pbHeroi.setValue(pbHeroi.getValue() - 10);
        
        
        }
        objArquivo.fecharArquivo();
        
    }catch(Exception ex){
            System.out.println("Erro ajuste ataque: " + ex.getMessage());
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

        lblHeroi = new javax.swing.JLabel();
        lblInimigo = new javax.swing.JLabel();
        pbHeroi = new javax.swing.JProgressBar();
        pbVilao = new javax.swing.JProgressBar();
        lblFotoHeroi = new javax.swing.JLabel();
        lblFotoInimigo1 = new javax.swing.JLabel();
        pnFala = new javax.swing.JPanel();
        lblFala = new javax.swing.JLabel();
        btnComecar = new javax.swing.JButton();
        lblNVilao = new javax.swing.JLabel();
        lblNHeroi = new javax.swing.JLabel();
        btnAtaque = new javax.swing.JButton();
        btnAvancar = new javax.swing.JButton();
        lblLy = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeroi.setText("jLabel1");
        getContentPane().add(lblHeroi, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 80, 180));

        lblInimigo.setText("jLabel1");
        getContentPane().add(lblInimigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 80, 180));

        pbHeroi.setStringPainted(true);
        getContentPane().add(pbHeroi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, -1, 30));

        pbVilao.setStringPainted(true);
        getContentPane().add(pbVilao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, 30));

        lblFotoHeroi.setText("jLabel1");
        getContentPane().add(lblFotoHeroi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 50));

        lblFotoInimigo1.setText("jLabel1");
        getContentPane().add(lblFotoInimigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 50, 60));

        pnFala.setBackground(new java.awt.Color(51, 51, 0));
        pnFala.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHURCHILL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Laksaman", 0, 15), new java.awt.Color(255, 255, 255))); // NOI18N

        lblFala.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        lblFala.setForeground(new java.awt.Color(255, 255, 255));
        lblFala.setText("jLabel1");

        javax.swing.GroupLayout pnFalaLayout = new javax.swing.GroupLayout(pnFala);
        pnFala.setLayout(pnFalaLayout);
        pnFalaLayout.setHorizontalGroup(
            pnFalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFalaLayout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(lblFala, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        pnFalaLayout.setVerticalGroup(
            pnFalaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFalaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblFala, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(pnFala, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 490, -1));

        btnComecar.setBackground(new java.awt.Color(102, 102, 0));
        btnComecar.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        btnComecar.setForeground(new java.awt.Color(255, 255, 255));
        btnComecar.setText("Começar");
        btnComecar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnComecarMouseClicked(evt);
            }
        });
        getContentPane().add(btnComecar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        lblNVilao.setFont(new java.awt.Font("Laksaman", 1, 15)); // NOI18N
        lblNVilao.setForeground(new java.awt.Color(255, 255, 255));
        lblNVilao.setText("Nazista");
        getContentPane().add(lblNVilao, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 110, -1));

        lblNHeroi.setFont(new java.awt.Font("Laksaman", 1, 15)); // NOI18N
        lblNHeroi.setForeground(new java.awt.Color(255, 255, 255));
        lblNHeroi.setText("jLabel2");
        getContentPane().add(lblNHeroi, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 110, -1));

        btnAtaque.setText("Atacar");
        btnAtaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtaqueActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtaque, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 80, 20));

        btnAvancar.setBackground(new java.awt.Color(102, 102, 0));
        btnAvancar.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        btnAvancar.setForeground(new java.awt.Color(255, 255, 255));
        btnAvancar.setText("Avançar");
        getContentPane().add(btnAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, -1));

        lblLy.setText("jLabel1");
        getContentPane().add(lblLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnComecarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnComecarMouseClicked
       btnComecar.setVisible(false);
        lblHeroi.setVisible(true);
        lblFala.setVisible(false);
        pnFala.setVisible(false);
         lblInimigo.setVisible(true);
         
    }//GEN-LAST:event_btnComecarMouseClicked

    private void btnAtaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtaqueActionPerformed
         pbVilao.setValue(objVilao.getVida() - Globais.gerarNumero(objPersonagem.getAtaque()));
        
        
        pbHeroi.setValue(objPersonagem.getVida() - Globais.gerarNumero(objVilao.getAtaque()));

        if (pbVilao.getValue() == 0) {
            btnAvancar.setVisible(true);
            Globais.exibirMensagem("Uhuuul! Parabens você venceu!!!");
            btnAtaque.setVisible(false);

        } else if (pbHeroi.getValue() == 0) {
            btnAvancar.setVisible(true);
            Globais.exibirMensagem("<html>Você perdeu, volte as questões, fique mais forte e tente novamente</html>");
            btnAtaque.setVisible(false);
        } else {
            btnAvancar.setVisible(false);
        }
    }//GEN-LAST:event_btnAtaqueActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCombate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCombate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCombate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCombate2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCombate2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtaque;
    private javax.swing.JButton btnAvancar;
    private javax.swing.JButton btnComecar;
    private javax.swing.JLabel lblFala;
    private javax.swing.JLabel lblFotoHeroi;
    private javax.swing.JLabel lblFotoInimigo1;
    private javax.swing.JLabel lblHeroi;
    private javax.swing.JLabel lblInimigo;
    private javax.swing.JLabel lblLy;
    private javax.swing.JLabel lblNHeroi;
    private javax.swing.JLabel lblNVilao;
    private javax.swing.JProgressBar pbHeroi;
    private javax.swing.JProgressBar pbVilao;
    private javax.swing.JPanel pnFala;
    // End of variables declaration//GEN-END:variables
}
