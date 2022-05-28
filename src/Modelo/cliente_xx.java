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
public class cliente_xx implements CRUD {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<cliente> lista = new ArrayList<>();
        String sql="select * from cliente";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                cliente c=new cliente();
                
                c.setId_clien(rs.getInt(1));
                c.setNom(rs.getString(2));
                c.setDirec(rs.getString(3));
                c.setTelefono(rs.getString(4));
                c.setEmail(rs.getString(5));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql= "insert into cliente(nom_clien,direcci_clien,tel_clien,email_clien) values(?,?,?,?);";
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
    public int actualizar(Object[] o) {
        int r=0;
        String sql="Update cliente set nom_clien=?, direcci_clien=?,tel_clien=?,email_clien=? where id_clien=?";
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
    public void eliminar(int id) {
        String sql="Delete From cliente where id_clien=?";
        try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        
            
               
        } catch (Exception e) {
        }
        
    
    }
    
    
}