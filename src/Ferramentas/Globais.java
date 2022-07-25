/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ferramentas;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author mari
 */import java.util.Random;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Globais {
  public static int gerarNumero(int max) {
        try {

            Random rand = new Random(); //instance of random class
            int upperbound = max;
            //generate random values from 0-max
            int int_random = rand.nextInt(upperbound);
            
            return int_random + 1;

        } catch (Exception ex) {
            return 0;
        }
    } public static void exibirMensagem (String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public static String gerarMD5(String texto){
    try {
        String retorno = "";
        if(!texto.equals("")){
            MessageDigest m;

            m = MessageDigest.getInstance("MD5");
            m.update(texto.getBytes(),0, texto.length());
            retorno = new BigInteger(1,m.digest()).toString(16);
        }
        return retorno;
        
        } catch (NoSuchAlgorithmException ex) {
        System.out.println("Erro ao gerar MD5");
        return "";
    }
}

public static void ajustarImagem(URL caminho, JLabel label){
    try{
           
                ImageIcon imageIcon = new ImageIcon(caminho);
        Image img = imageIcon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledimageIcon = new ImageIcon(imgScale);
        label.setIcon(scaledimageIcon);
       
    }catch(Exception ex){
       
    }
    }

public static void tocarSom(String soundFile) throws UnsupportedAudioFileException, MalformedURLException {
        AudioInputStream audioIn = null;
        try {
            File f = new File("src/som/" + soundFile);
            audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();

        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException ex) {
            System.out.println("Erro ao tocar som: " + ex.getMessage());
        }
    }
        
    

}

