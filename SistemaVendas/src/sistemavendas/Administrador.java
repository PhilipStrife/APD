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
public class Administrador extends Usuario {

    private int codigoAcesso;

    public Administrador() {
    }

    public Administrador(String nome, String senha, String login, int nivelAcesso) {
        super(nome, senha, login, nivelAcesso);
    }

    public int getCodigoAcesso() {
        return codigoAcesso;
    }

    public void setCodigoAcesso(int codigoAcesso) {
        this.codigoAcesso = codigoAcesso;
    }
}
