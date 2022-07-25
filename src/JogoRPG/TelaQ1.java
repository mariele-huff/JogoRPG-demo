/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JogoRPG;

import Ferramentas.Arquivo;
import Ferramentas.Globais;
import modelos.Questionario;

/**
 *
 * @author mari
 */
public class TelaQ1 extends javax.swing.JFrame {

    Questionario questao1;
    int cont = -1;
    Arquivo objArquivo;
   
    String linha;
    Questionario[] vetorquestao = new Questionario[9];

    /**
     * Creates new form TelaQ1
     */
    public TelaQ1() {
        initComponents();
        Globais.ajustarImagem(getClass().getResource("/imagens/questoes.png"), lblLy);

        Questionario questao1 = new Questionario();
        questao1.setPergunta("<html>O que desencadeou a Segunda Guerra Mundial?</html>");
        questao1.setRespostaA("<html>A ascensão de Nikita Kruchev na URSS e a invasão da Hungria pelos soviéticos.</html>");
        questao1.setRespostaB("O expansionismo territorial germânico.");
        questao1.setRespostaC("Os conflitos da Coréia e do Vietnã.");
        questao1.setRespostaCorreta('b');

        Questionario questao2 = new Questionario();
        questao2.setPergunta("<html>Em que periodo ocorreu a segunda guerra mundial?</html>");
        questao2.setRespostaA("1939-1945");
        questao2.setRespostaB("1914-1919");
        questao2.setRespostaC("1925-1939");
        questao2.setRespostaCorreta('a');

        Questionario questao3 = new Questionario();
        questao3.setPergunta("<html>Quem foi Winston Churchill ?</html>");
        questao3.setRespostaA("Foi o primeiro ministro do Reino Unido.");
        questao3.setRespostaB("<html>Foi o Capitão das forças armadas dos Estados Unidos.</html>");
        questao3.setRespostaC("Espião da Russia.");
        questao3.setRespostaCorreta('a');

        Questionario questao4 = new Questionario();
        questao4.setPergunta("<html>Nome do grupo de pessoas mais perseguida pelos nazistas?</html>");
        questao4.setRespostaA("Alemães");
        questao4.setRespostaB("Judeus ");
        questao4.setRespostaC("Italianos ");
        questao4.setRespostaCorreta('b');

        Questionario questao5 = new Questionario();
        questao5.setPergunta("<html>Quais elementos foram descobertos por Marie Curie?</html>");
        questao5.setRespostaA("Potassio e Titânio. ");
        questao5.setRespostaB("Polonio e Rádio. ");
        questao5.setRespostaC("Radônio e Mercúrio. ");
        questao5.setRespostaCorreta('b');

        Questionario questao6 = new Questionario();
        questao6.setPergunta("<html>Qual foi a primeira teoria publicada por Albert Einstein?</html>");
        questao6.setRespostaA("Teoria da gravidade. ");
        questao6.setRespostaB("Teoria da relatividade.");
        questao6.setRespostaC("teoria do Big Bang ");
        questao6.setRespostaCorreta('b');

        Questionario questao7 = new Questionario();
        questao7.setPergunta("Charles Darwin acreditava na:");
        questao7.setRespostaA("teoria da evolução. ");
        questao7.setRespostaB("teoria da relatividade.");
        questao7.setRespostaC("teoria quântica. ");
        questao7.setRespostaCorreta('a');

        Questionario questao8 = new Questionario();
        questao8.setPergunta("Ada Lovelace foi a primeira...");
        questao8.setRespostaA("ministra de estado. ");
        questao8.setRespostaB("mulher na guerra. ");
        questao8.setRespostaC("matemática, programadora. ");
        questao8.setRespostaCorreta('c');

        Questionario questao9 = new Questionario();
        questao9.setPergunta("<html>Qual foi o grande feito que deu sucesso a Nikola Tesla?</html>");
        questao9.setRespostaA("bobina com corrente alternada. ");
        questao9.setRespostaB("motor de carro eletrico.");
        questao9.setRespostaC("invensão da lâmpada. ");
        questao9.setRespostaCorreta('a');

        vetorquestao[0] = questao1;
        vetorquestao[1] = questao2;
        vetorquestao[2] = questao3;
        vetorquestao[3] = questao4;
        vetorquestao[4] = questao5;
        vetorquestao[5] = questao6;
        vetorquestao[6] = questao7;
        vetorquestao[7] = questao8;
        vetorquestao[8] = questao9;
        fazerPergunta();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        lblPergunta = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rbtnA = new javax.swing.JRadioButton();
        rbtnB = new javax.swing.JRadioButton();
        rbtnC = new javax.swing.JRadioButton();
        bntAvancar = new javax.swing.JButton();
        lblLy = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPergunta.setFont(new java.awt.Font("Laksaman", 1, 15)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setText("jLabel1");
        getContentPane().add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 74));

        jPanel1.setBackground(new java.awt.Color(51, 51, 0));

        buttonGroup1.add(rbtnA);
        rbtnA.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        rbtnA.setForeground(new java.awt.Color(255, 255, 255));
        rbtnA.setText("jRadioButton1");

        buttonGroup1.add(rbtnB);
        rbtnB.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        rbtnB.setForeground(new java.awt.Color(255, 255, 255));
        rbtnB.setText("jRadioButton1");

        buttonGroup1.add(rbtnC);
        rbtnC.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        rbtnC.setForeground(new java.awt.Color(255, 255, 255));
        rbtnC.setText("jRadioButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(rbtnA, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rbtnB, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                            .addComponent(rbtnC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(rbtnA)
                .addGap(37, 37, 37)
                .addComponent(rbtnB)
                .addGap(38, 38, 38)
                .addComponent(rbtnC)
                .addGap(96, 96, 96))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 97, 450, 320));

        bntAvancar.setBackground(new java.awt.Color(102, 102, 0));
        bntAvancar.setFont(new java.awt.Font("Laksaman", 0, 15)); // NOI18N
        bntAvancar.setForeground(new java.awt.Color(255, 255, 255));
        bntAvancar.setText("Avançar");
        bntAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAvancarActionPerformed(evt);
            }
        });
        getContentPane().add(bntAvancar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 450, -1, -1));

        lblLy.setText("jLabel2");
        getContentPane().add(lblLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 651, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void acertou(boolean r) {
        if (r) {

            objArquivo = new Arquivo("vida.txt");
            objArquivo.abrirEscrita();
            linha = "T";
            objArquivo.escreverLinha(linha);
            objArquivo.fecharArquivo();

            objArquivo  = new Arquivo("nivel.txt");
            objArquivo.abrirLeitura();
            String linha2 = objArquivo.lerLinha();
            objArquivo.fecharArquivo();
            switch (linha2) {
                case "":
                    new TelaCombate1().setVisible(true);
                    dispose();
                    break;
                case "Nivel2":
                   //ew TelaCombate2().setVisible(true);
                    //dispose();
                   break;
                case "Nivel3":
                    //new TelaCombate3().setVisible(true);
                    //dispose();
                    break;
                case "Nivel4":
                   // new TelaCombate4().setVisible(true);
                    //dispose();
                    break;
                case "Nivel5":
                    //new TelaCombate5().setVisible(true);
                    //dispose();
                    break;
                default:
                    break;
            }

        } else {
            objArquivo = new Arquivo("vida.txt");
            objArquivo.abrirEscrita();
            linha = "F";
            objArquivo.escreverLinha(linha);
            objArquivo.fecharArquivo();

          new TelaTentar().setVisible(true);
          

        }
    }

    private void bntAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvancarActionPerformed

        boolean altA = rbtnA.isSelected();
        boolean altB = rbtnB.isSelected();
        boolean altC = rbtnC.isSelected();

        if (altA || altB || altC) {

            if (altB && vetorquestao[cont].getRespostaCorreta() == 'b') {
                Globais.exibirMensagem("<html> Parabéns você acertou a questão"
                        + " como recompensa você ganha +10 de ataque para derotar"
                        + "o inimigo, boa sorte!</html>");
                acertou(true);

            
        } else if (altA && vetorquestao[cont].getRespostaCorreta() == 'a') {
            Globais.exibirMensagem("<html> Parabéns você acertou a  questão"
                    + " como recompensa você ganha +10 de ataque para derotar"
                    + "o inimigo, boa sorte!</html>");
            acertou(true);

        } else if (altC && vetorquestao[cont].getRespostaCorreta() == 'c') {
            Globais.exibirMensagem("<html> Parabéns você acertou a primeira questão"
                    + " como recompensa você ganha +10 de ataque para derotar"
                    + "o inimigo, boa sorte!</html>");

            acertou(true);
        } else {
            acertou(false);

        
    }

    
        }else {
            Globais.exibirMensagem("Escolha uma alternativa");

    }

    }//GEN-LAST:event_bntAvancarActionPerformed
private void fazerPergunta() {
        buttonGroup1.clearSelection();

        int random = Globais.gerarNumero(8);
        cont = random;
        if (cont < vetorquestao.length) {

            lblPergunta.setText(vetorquestao[cont].getPergunta());
            rbtnA.setText(vetorquestao[cont].getRespostaA());
            rbtnB.setText(vetorquestao[cont].getRespostaB());
            rbtnC.setText(vetorquestao[cont].getRespostaC());
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
            java.util.logging.Logger.getLogger(TelaQ1.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQ1.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQ1.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQ1.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQ1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAvancar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLy;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JRadioButton rbtnA;
    private javax.swing.JRadioButton rbtnB;
    private javax.swing.JRadioButton rbtnC;
    // End of variables declaration//GEN-END:variables
}
