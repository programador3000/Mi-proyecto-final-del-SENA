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
public class detalleventa {
    int id_venta_dll ;
    int id_venta;
    int id_producto;
    int cantidad;
    double precio;
    double descuento;
    
    public detalleventa(){}

    public detalleventa(int id_venta_dll, int id_venta, int id_producto, int cantidad, double precio, double descuento) {
        this.id_venta_dll = id_venta_dll;
        this.id_venta = id_venta;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.descuento = descuento;
    }

    public int getId_venta_dll() {
        return id_venta_dll;
    }

    public void setId_venta_dll(int id_venta_dll) {
        this.id_venta_dll = id_venta_dll;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    
    
}
