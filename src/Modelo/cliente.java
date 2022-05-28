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
public class cliente {
    
    int id_clien;
    String nom;
    String direc;
    String telefono;
    String email;
    
    public cliente(){}

    public cliente(int id_clien, String nom, String direc, String telefono, String email) {
        this.id_clien = id_clien;
        this.nom = nom;
        this.direc = direc;
        this.telefono = telefono;
        this.email = email;
    }

    public int getId_clien() {
        return id_clien;
    }

    public void setId_clien(int id_clien) {
        this.id_clien = id_clien;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
}
