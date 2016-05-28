/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavendas;

/**
 *
 * @author 31563716
 */
public class Usuario {
    
    private String nome;
    private String senha;
    private String login;
    private int nivelAcesso;

    public Usuario(){
        
    }
    
    public Usuario(String nome, String senha, String login, int nivelAcesso) {
        this.nome = nome;
        this.senha = senha;
        this.login = login;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    } 
}
