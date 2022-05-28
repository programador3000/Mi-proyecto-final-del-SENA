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
public class productos {
    int id_producto;
    int id_catego_fk;
    String nom;
    String desc;
    double precio;
    String peso;
    
    public productos(){
    }

    public productos(int id_producto, int id_catego_fk, String nom, String desc, double precio, String peso) {
        this.id_producto = id_producto;
        this.id_catego_fk = id_catego_fk;
        this.nom = nom;
        this.desc = desc;
        this.precio = precio;
        this.peso = peso;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_catego_fk() {
        return id_catego_fk;
    }

    public void setId_catego_fk(int id_catego_fk) {
        this.id_catego_fk = id_catego_fk;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }
    
    
}
