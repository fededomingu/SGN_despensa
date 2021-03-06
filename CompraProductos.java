/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanegocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author feded
 */
public class CompraProductos extends javax.swing.JInternalFrame {

    /**
     * Creates new form CompraProductos
     */
    int cant2, cant;
    
    Connection conc;
    public CompraProductos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLcompras = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLccodigo = new javax.swing.JLabel();
        jLcmarca = new javax.swing.JLabel();
        jLcdetalle = new javax.swing.JLabel();
        jLccantidad = new javax.swing.JLabel();
        jTFccodigo = new javax.swing.JTextField();
        jTFcmarca = new javax.swing.JTextField();
        jTFcdetalle = new javax.swing.JTextField();
        jBcbuscar = new javax.swing.JButton();
        jBcguardar = new javax.swing.JButton();
        jSccantidad = new javax.swing.JSpinner();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLcompras.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLcompras.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLcompras.setText("Ingreso de Mercarderia");
        jLcompras.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLccodigo.setText("CODIGO");

        jLcmarca.setText("MARCA");

        jLcdetalle.setText("DETALLE");

        jLccantidad.setText("CANTIDAD");

        jTFcmarca.setEnabled(false);
        jTFcmarca.setFocusable(false);
        jTFcmarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFcmarcaActionPerformed(evt);
            }
        });

        jTFcdetalle.setEnabled(false);
        jTFcdetalle.setFocusable(false);

        jBcbuscar.setText("BUSCAR");
        jBcbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcbuscarActionPerformed(evt);
            }
        });

        jBcguardar.setText("GURADAR");
        jBcguardar.setFocusable(false);
        jBcguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBcguardarActionPerformed(evt);
            }
        });

        jSccantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLccantidad)
                    .addComponent(jLcdetalle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLcmarca, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLccodigo, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTFcmarca, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(jTFcdetalle)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBcbuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSccantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBcguardar)
                        .addGap(40, 40, 40)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(jLcompras, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLcompras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLccodigo)
                    .addComponent(jTFccodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcbuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFcmarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcmarca))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFcdetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLcdetalle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLccantidad)
                    .addComponent(jSccantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBcguardar))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFcmarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFcmarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFcmarcaActionPerformed

    private void jBcbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcbuscarActionPerformed
            try {
            Connection conc = DriverManager.getConnection("jdbc:mysql://localhost/sistemanegocio","root","");
            Statement stl = conc.createStatement();
            ResultSet lp = stl.executeQuery("SELECT * FROM listado WHERE codigo="+jTFccodigo.getText());
            
                while (lp.next()) {
                String addcod = lp.getString("codigo");
                jTFccodigo.setText(addcod);
                String addmar = lp.getString("marca");
                jTFcmarca.setText(addmar);
                String adddet = lp.getString("detalle");
                jTFcdetalle.setText(adddet);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ListaPrecios.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_jBcbuscarActionPerformed

    private void jBcguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBcguardarActionPerformed
        
        try {
                conc = DriverManager.getConnection("jdbc:mysql://localhost/sistemanegocio","root","");
                Statement stmt = conc.createStatement();
                ResultSet stock2 = stmt.executeQuery("SELECT (cantidad) FROM listado WHERE codigo="+jTFccodigo.getText());
                    stock2.first();
                    cant = (int) stock2.getInt(1);
                    String  b = jTFccodigo.getText();
                    cant2 = (int)jSccantidad.getValue();
                    cant = cant + cant2;
                
                String table = "UPDATE listado SET cantidad =?  WHERE codigo =?";
                PreparedStatement pt = conc.prepareStatement(table);
                pt.setInt(1, cant);
                pt.setString(2, b);
                pt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Producto registrado");
                conc.close();
            } catch (SQLException ex) {
                Logger.getLogger(NuevoP.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "No se puede conectar a la base de datos");
               
            }
    }//GEN-LAST:event_jBcguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBcbuscar;
    private javax.swing.JButton jBcguardar;
    private javax.swing.JLabel jLccantidad;
    private javax.swing.JLabel jLccodigo;
    private javax.swing.JLabel jLcdetalle;
    private javax.swing.JLabel jLcmarca;
    private javax.swing.JLabel jLcompras;
    private javax.swing.JSpinner jSccantidad;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFccodigo;
    private javax.swing.JTextField jTFcdetalle;
    private javax.swing.JTextField jTFcmarca;
    // End of variables declaration//GEN-END:variables

    
}
