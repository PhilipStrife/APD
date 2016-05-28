/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavendas;

/**
 *
 * @author 31515762
 */
public class Produto {
    
    private long codigoProduto;
    private double preco;
    private int quantidadeEstoque;

    public Produto() {
    }

    public Produto(long codigoProduto, double preco, int quantidadeEstoque) {
        this.codigoProduto = codigoProduto;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(long codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigoProduto=" + codigoProduto + ", preco=" + preco + ", quantidadeEstoque=" + quantidadeEstoque + '}';
    }
    
}
