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
public class repartidor {
    int id_repar;
    String nom_repar;
    String doc_repar;
    String tel_repar;

    public repartidor() {
    }

    public repartidor(int id_repar, String nom_repar, String doc_repar, String tel_repar) {
        this.id_repar = id_repar;
        this.nom_repar = nom_repar;
        this.doc_repar = doc_repar;
        this.tel_repar = tel_repar;
    }

    public int getId_repar() {
        return id_repar;
    }

    public void setId_repar(int id_repar) {
        this.id_repar = id_repar;
    }

    public String getNom_repar() {
        return nom_repar;
    }

    public void setNom_repar(String nom_repar) {
        this.nom_repar = nom_repar;
    }

    public String getDoc_repar() {
        return doc_repar;
    }

    public void setDoc_repar(String doc_repar) {
        this.doc_repar = doc_repar;
    }

    public String getTel_repar() {
        return tel_repar;
    }

    public void setTel_repar(String tel_repar) {
        this.tel_repar = tel_repar;
    }

   
    
}
