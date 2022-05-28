/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario
 */
public class venta {
    int id_venta;
    int id_cliente_fk;
    double valor;
    
    public venta(){}

    public venta(int id_venta, int id_cliente_fk, double valor) {
        this.id_venta = id_venta;
        this.id_cliente_fk = id_cliente_fk;
        this.valor = valor;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente_fk() {
        return id_cliente_fk;
    }

    public void setId_cliente_fk(int id_cliente_fk) {
        this.id_cliente_fk = id_cliente_fk;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
    
}
