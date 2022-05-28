/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class envio_xx implements CRUD {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<envio> lista = new ArrayList<>();
        String sql="select * from envio";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                envio c=new envio();
                
                c.setId_envio(rs.getInt(1));
                c.setId_venta(rs.getInt(2));
                c.setId_repar(rs.getInt(3));
                c.setFecha(rs.getString(4));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql= "insert into envio(id_venta_fk,id_repar_fk,fecha_envio) values(?,?,?);";
        try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
         
            
            
            r = ps.executeUpdate();
            
               
        } catch (Exception e) {
        }
        
        return r;
    }

    @Override
    public int actualizar(Object[] o) {
        int r=0;
        String sql="Update envio set id_venta_fk=?,id_repar_fk=?,fecha_envio=? where id_envio=?;";
       try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
      
            
            
            
            r = ps.executeUpdate();
            
               
        } catch (Exception e) {
        }
        
        return r;
        
        
    }

    @Override
    public void eliminar(int id) {
        String sql="Delete From envio where id_envio=?";
        try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        
            
               
        } catch (Exception e) {
        }
        
    
    }
    
    public List listar2() {
       
        List<String> lista1 = new ArrayList<>();
        String sql="select * from proyecto.venta  ";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String c=new String();
               lista1.add("ID:" + rs.getString("id_venta")+" "+ "Valor:"+ rs.getString("valor"));
               
            }
        } catch (Exception e) {
        }
        
        return lista1;
    
    }
    public List listar3() {
       
        List<String> lista1 = new ArrayList<>();
        String sql="select * from proyecto.repartidor  ";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String c=new String();
               lista1.add("ID:" + rs.getString("id_repar")+" "+ "Nombre:"+ rs.getString("nom_repar"));
               
            }
        } catch (Exception e) {
        }
        
        return lista1;
    
    }
}