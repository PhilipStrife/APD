/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavendas;

import java.util.Date;

/**
 *
 * @author 31563716
 */
public class Cliente extends Usuario {

    private String cpf;
    private String rg;
    private Date dataNascimento;
    private String endereco;

    public Cliente() {

    }

    public Cliente(String cpf, String rg, Date dataNascimento, String endereco, String nome, String senha, String login, int nivelAcesso) {
        super(nome, senha, login, nivelAcesso);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    

}
