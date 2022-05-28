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
public class categoria {
//    En esra case hice los contructores y los getters ans setters 
    int id;
    String nom;
    String desc;
    String estado;
    
   public categoria(){  
    }    

//   En este espacio cree el contructor
    public categoria(int id, String nom, String desc, String estado) {
        this.id = id;
        this.nom = nom;
        this.desc = desc;
        this.estado = estado;
    }

//    En este espacio cree los getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


   
   
}
