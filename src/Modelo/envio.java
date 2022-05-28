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
public class envio {
    int id_envio;
    int id_venta;
    int id_repar;
    String fecha;

    public envio() {
    }

    public envio(int id_envio, int id_venta, int id_repar, String fecha) {
        this.id_envio = id_envio;
        this.id_venta = id_venta;
        this.id_repar = id_repar;
        this.fecha = fecha;
    }

    public int getId_envio() {
        return id_envio;
    }

    public void setId_envio(int id_envio) {
        this.id_envio = id_envio;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_repar() {
        return id_repar;
    }

    public void setId_repar(int id_repar) {
        this.id_repar = id_repar;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
