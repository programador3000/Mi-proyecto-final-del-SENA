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
public class detalleventa_xx implements CRUD {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    @Override
    public List listar() {
        List<detalleventa> lista = new ArrayList<>();
        String sql="select * from detalle_venta";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                detalleventa c=new detalleventa();
                
                c.setId_venta_dll(rs.getInt(1));
                c.setId_venta(rs.getInt(2));
                c.setId_producto(rs.getInt(3));
                c.setCantidad(rs.getInt(4));
                c.setPrecio(rs.getDouble(5));
                c.setDescuento(rs.getDouble(6));
                
                
                lista.add(c);
            }
        } catch (Exception e) {
        }
        
        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r=0;
        String sql= "insert into detalle_venta(id_venta_fk,id_produ_fk,cantidad,precio,descuento) values(?,?,?,?,?);";
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
        String sql="Update detalle_venta set id_venta_fk=?, id_produ_fk=?,cantidad=?,precio=?,descuento=? where id_detalle_venta=?;";
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
        String sql="Delete From detalle_venta where id_detalle_venta=?";
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
        String sql="select * from proyecto.producto  ";
        try {
            con = cn.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                String c=new String();
               lista1.add("ID:" + rs.getString("id_produ")+" "+ "Producto:"+ rs.getString("nombre_produ"));
               
            }
        } catch (Exception e) {
        }
        
        return lista1;
    
    }
}