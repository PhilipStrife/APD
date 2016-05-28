/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavendas;

import java.util.List;

/**
 *
 * @author 31515762
 */
public class Carrinho {
    
    private double totalCarrinho;
    private List<ItemCompra> listaCompra;

    public Carrinho() {
    }

    public Carrinho(double totalCarrinho, List<ItemCompra> listaCompra) {
        this.totalCarrinho = totalCarrinho;
        this.listaCompra = listaCompra;
    }

    public double getTotalCarrinho() {
        return totalCarrinho;
    }

    public void setTotalCarrinho(double totalCarrinho) {
        this.totalCarrinho = totalCarrinho;
    }

    public List<ItemCompra> getListaCompra() {
        return listaCompra;
    }

    public void setListaCompra(List<ItemCompra> listaCompra) {
        this.listaCompra = listaCompra;
    }
    
    public void adicionarItem(ItemCompra item) {
        
    }
    
    public void removerItem() {
        
    }
    
    public double calculaTotalCarrinho() {
        return 0;
    }
}
