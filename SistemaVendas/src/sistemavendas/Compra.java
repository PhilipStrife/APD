/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemavendas;

import java.util.Date;

/**
 *
 * @author 31515762
 */
public class Compra {
    
    private long codigoCompra;
    private double total;
    private Date horaCompra;

    public Compra() {
    }

    public Compra(long codigoCompra, double total, Date horaCompra) {
        this.codigoCompra = codigoCompra;
        this.total = total;
        this.horaCompra = horaCompra;
    }
    
    public long getCodigoCompra() {
        return codigoCompra;
    }

    public void setCodigoCompra(long codigoCompra) {
        this.codigoCompra = codigoCompra;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getHoraCompra() {
        return horaCompra;
    }

    public void setHoraCompra(Date horaCompra) {
        this.horaCompra = horaCompra;
    }

    @Override
    public String toString() {
        return "Compra{" + "codigoCompra=" + codigoCompra + ", total=" + total + ", horaCompra=" + horaCompra + '}';
    }
}
