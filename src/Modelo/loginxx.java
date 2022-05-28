/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.vista1;
import Vista.vista8;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class loginxx {
//    Asigne la conexicion
     Connection con;  
    Conexion cn = new Conexion();
//    llame a la clase login
    login log=new login();
//    llame al forulario de vista1
        vista1 v1= new vista1();
        
//    Cree la clase validar acceso
    public void validarAcceso(String usuario, String pass){
//    Asigne a los setters con valores 
    log.setUsuario(usuario);
    log.setContraseña(pass);
//    Use los getters
     String usuario1=log.getUsuario();
       String pass1=log.getContraseña();
    try {

      
                           

//       Hice el estring del sql
       String sql="SELECT * FROM login where usuario='"+usuario1+"' and contraseña='"+pass1+"'";
        con = cn.Conectar();
        
//        El statement se encarga de enviar las sentencias SQL al driver es el Statement
        Statement st=con.createStatement();
//        Un ResultSet contiene todas las filas que satisfacen las condiciones de una sentencia SQL y proporciona el acceso a los datos
        ResultSet rs=st.executeQuery(sql);

//        desplaza el cursor a la siguiente fila del conjunto de resultados de la base de datos y devuelve true si hay alguna fila, de lo contrario false .
        if (rs.next()){

            
                JOptionPane.showMessageDialog(null, "Bienvenido");

                vista1 form=new vista1();
                form.setVisible(true);
                v1.dispose();
                
            
        } else {
                            JOptionPane.showMessageDialog(null, "Error en el Acceso, Vuelva a intentarlo");

        } 
    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Error en el Accesoooooo, Vuelva a intentarlo");

    }
    }
}
