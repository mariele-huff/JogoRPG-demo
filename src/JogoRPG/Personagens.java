/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoRPG;

import javax.management.relation.Role;

/**
 *
 * @author mari
 */
public class Personagens {
    private String nome;
    private String poder;
    private int vida;
    private int ataque;

    public Personagens() {
    
}
    public Personagens(String nome, String poder, int vida, int ataque) {
        this.nome = nome;
        this.poder = poder;
        this.vida = vida;
        this.ataque = ataque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
@Override
    public String toString() {
        
        return ("<html> Vida: " + vida + "<br>"+ "<br>" + "Poder: " + poder + " <br>" + "<br>" 
                + "Ataque: " + ataque + "</html>");
    }
    

    
  
    
}
