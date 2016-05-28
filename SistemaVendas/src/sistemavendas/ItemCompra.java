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
public class ItemCompra{
    private int quantidade;
    private double totalItem;
    private Produto produto;

    public ItemCompra() {
    }

    public ItemCompra(int quantidade, double totalItem) {
        this.quantidade = quantidade;
        this.totalItem = totalItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(double totalItem) {
        this.totalItem = totalItem;
    }
    
    public double calcularTotalItem(Produto produto){
        return (produto.getPreco()*quantidade);
    }
}
