/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class productos_xx implements CRUD {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    @Override
    public List listar() {
        List<productos> lista = new ArrayList<>();
        String sql="select * from producto";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                productos c=new productos();
                
                c.setId_producto(rs.getInt(1));
                c.setId_catego_fk(rs.getInt(2));
                c.setNom(rs.getString(3));
                c.setDesc(rs.getString(4));
                c.setPrecio(rs.getDouble(5));
                c.setPeso(rs.getString(6));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql= "insert into producto(id_catego_fk,nombre_produ,descripcion,precio_venta,uni_medi) values(?,?,?,?,?);";
        try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            
            
            r = ps.executeUpdate();
            
               
        } catch (Exception e) {
        }
        
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="Update producto set id_catego_fk= ?, nombre_produ=?, descripcion=?,precio_venta=?,uni_medi=? where id_produ=?";
       try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            ps.setObject(5,o[4]);
            ps.setObject(6,o[5]);
            
            
            r = ps.executeUpdate();
            
               
        } catch (Exception e) {
        }
        
        return r;
        
        
    }

    @Override
    public void eliminar(int id) {
        String sql="Delete From producto where id_produ=?";
        try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        
            
               
        } catch (Exception e) {
        }
        
    
    }
        ResultSet resultado = null;
        Statement sentencia = null;
    public List listar2() {
       
        List<String> lista1 = new ArrayList<>();
        String sql="select * from proyecto.categoria  ";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String c=new String();
               lista1.add("ID:" + rs.getString("id_catego")+" "+ "Categoria:"+ rs.getString("nom_catego"));
               
            }
        } catch (Exception e) {
        }
        
        return lista1;
    
    }
    
    
}       

    

