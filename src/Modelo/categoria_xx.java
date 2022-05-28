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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class categoria_xx implements CRUD {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<categoria> lista = new ArrayList<>();
        String sql="select * from categoria";
        try {
            con = cn.Conectar();
//            Las utilizaremos en lugar de una Statement cuando haya que ejecutar varias veces una misma sentencia SQL con distintos parámetros.
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                categoria c=new categoria();
                
                c.setId(rs.getInt(1));
                c.setNom(rs.getString(2));
                c.setDesc(rs.getString(3));
                c.setEstado(rs.getString(4));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql= "insert into categoria(nom_catego,descrip,estado) values(?,?,?);";
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
        String sql="Update categoria set nom_catego = ?, descrip=?, estado=? where id_catego=?";
       try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setObject(1,o[0]);
            ps.setObject(2,o[1]);
            ps.setObject(3,o[2]);
            ps.setObject(4,o[3]);
            r = ps.executeUpdate();
            
               
        } catch (SQLException e ) {
            System.err.println("error:"+e.getMessage());
        }
        
        return r;
        
        
    }

    @Override
    public void eliminar(int id) {
        String sql="Delete From categoria where id_catego=?";
        try {
            con=cn.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        
            
               
        } catch (Exception e) {
        }
        
    
    }
    
    
}
