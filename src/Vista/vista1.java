/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.categoria_xx;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Modelo.categoria;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Usuario
 */
public class vista1 extends javax.swing.JFrame {
    public int id ;
    /**
     * Creates new form categoria
     */
//    llamamos todas las clases que vamos a usar y las variables
    categoria cat = new categoria();
    categoria_xx catxx = new categoria_xx();
    DefaultTableModel modelo = new DefaultTableModel();
    FondoPanel fondo=new FondoPanel();
    public vista1() {
        this.setContentPane(fondo);
        initComponents();
        mostrar();
        
    }

//    Esta funcion sirve para mostrar los datos en la tabla 
    void mostrar() {
        List<categoria> lista = catxx.listar();
        modelo = (DefaultTableModel) tabla.getModel();
        Object[] data = new Object[4];
        for (int i = 0; i < lista.size(); i++) {
            data[0] = lista.get(i).getId();
            data[1] = lista.get(i).getNom();
            data[2] = lista.get(i).getDesc();
            data[3] = lista.get(i).getEstado();

            modelo.addRow(data);
        }
        
        tabla.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new FondoPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtdesc = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnSiguiente = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre");

        jLabel3.setText("Descricion");

        jLabel4.setText("Estado");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        txtdesc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescKeyTyped(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "nombre", "Descripcion", "Estado"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla);

        btnSiguiente.setText("Siguiente");
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Datos Categoria");
        jLabel5.setPreferredSize(new java.awt.Dimension(80, 15));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSiguiente)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtestado)
                        .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                        .addComponent(txtdesc, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiguiente)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        int contador=modelo.getRowCount();

//        Funcion que sirve para guardar los datos
    public void guardar(){
        if (txtnombre.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debes ingresar el nombre");
        }else{
        String nom = txtnombre.getText();
        String desc = txtdesc.getText();
        String estado = txtestado.getText();
        Object[] guardar = new Object[3];
        guardar[0]=nom;
        guardar[1]=desc;
        guardar[2]=estado;
        
            try {
                        catxx.add(guardar);
                                            JOptionPane.showMessageDialog(null, "Accion realizada con exito");

            } catch (Exception e) {

            }
        }
       
    }
            
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        guardar();
        LimpiarTabla();
        mostrar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed
//    Funcion para eliminar datos
    public void eliminar(){
       int fila = tabla.getSelectedRow();
       id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
      try {
       catxx.eliminar(id);
                                            JOptionPane.showMessageDialog(null, "Accion realizada con exito");

            } catch (Exception e) {

            }
    }
//    Funcion para limpiar tablas
    void LimpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;

        }

    }
//    Estos son los botones los cuales tienen distintas funciones que se realizan cuando se oprimen
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminar();
        LimpiarTabla();
        mostrar();
    }//GEN-LAST:event_btnEliminarActionPerformed

//   Esta es un evento de la tabla que retorna en las cajas de texto los valores que contienen en la fila para poder modificarlos
    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
       int fila = tabla.getSelectedRow() ;
       id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
       String nom= tabla.getValueAt(fila, 1).toString();
       String desc= tabla.getValueAt(fila, 2).toString();
       String estado= tabla.getValueAt(fila, 3).toString();
       
       txtnombre.setText(nom);
       txtdesc.setText(desc);
       txtestado.setText(estado);
       
    }//GEN-LAST:event_tablaMouseClicked
    
//    Funcion de modificar
    void modificar(){
        
        String nom = txtnombre.getText();
        String desc = txtdesc.getText();
        String estado = txtestado.getText();
        Object[] mod= new Object[4];
        mod[0]=nom;
        mod[1]=desc;
        mod[2]=estado;
        mod[3]=id;
    
        if (nom.equals("")){}else{
         try {
         catxx.actualizar(mod);
                                            JOptionPane.showMessageDialog(null, "Accion realizada con exito");

            } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "adios");

            }
        }
    }
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modificar();
        LimpiarTabla();
        mostrar();
    }//GEN-LAST:event_btnModificarActionPerformed

//    Boton y funcion para salir del aplicativo
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
           System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed
//    Boton para ir a la siguiente pestaña
    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // TODO add your handling code here:
        
        vista2 v2=new vista2();
        v2.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarcategoria categoria=new buscarcategoria();
        categoria.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed
//    Funcion para solo aceptar datos de tipo letra
    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
        char validar=evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();
            
            evt.consume();
            
            JOptionPane.showMessageDialog(rootPane, "ingresar solo letras");
        }
        
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtdescKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtdescKeyTyped

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista1().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtdesc;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables

//    Clase para ponerle fondo al panel
    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g)
        {
            imagen=new ImageIcon(getClass().getResource("/imagenes/azul.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),this);
            setOpaque(false);
            super.paint(g);
        }
    }

}
