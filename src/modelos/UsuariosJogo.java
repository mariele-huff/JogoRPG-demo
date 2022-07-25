/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author mari
 */
public class UsuariosJogo {
    private int id;
    private String usuario;
    private String senha;

   
    public UsuariosJogo(int id, String usuario, String senha) {
        this.id= id;
        this.usuario = usuario;
        this.senha = senha;
    } 

    public UsuariosJogo() {
        
    }
    
   
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
