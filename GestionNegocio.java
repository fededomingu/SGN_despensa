/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanegocio;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author feded
 */


public class GestionNegocio extends javax.swing.JFrame {
    NuevoP NuevoP;
    Ventas Ventas;
    EditarP EditarP;
    CompraProductos CompraProductos;
    InformeStock InformeStock;
    ListaPrecios ListaPrecios;
    
    public GestionNegocio() throws SQLException {
        initComponents();
        NuevoP = new NuevoP();
        add (NuevoP);
        Ventas = new Ventas();
        add (Ventas);
        EditarP = new EditarP();
        add (EditarP);
        CompraProductos = new CompraProductos();
        add (CompraProductos);
        InformeStock = new InformeStock();
        add (InformeStock);
        ListaPrecios = new ListaPrecios();
        add (ListaPrecios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMGestion = new javax.swing.JMenuBar();
        jMArchivo = new javax.swing.JMenu();
        jMNuevoP = new javax.swing.JMenuItem();
        jMEditarP = new javax.swing.JMenuItem();
        jMExit = new javax.swing.JMenuItem();
        jMCompras = new javax.swing.JMenu();
        jMMercaderia = new javax.swing.JMenuItem();
        jMVentas = new javax.swing.JMenu();
        jMVentaP = new javax.swing.JMenuItem();
        jMInforme = new javax.swing.JMenu();
        jMStock = new javax.swing.JMenuItem();
        jMPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMArchivo.setText("Archivo");

        jMNuevoP.setText("Nuevo Producto");
        jMNuevoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMNuevoPActionPerformed(evt);
            }
        });
        jMArchivo.add(jMNuevoP);

        jMEditarP.setText("Modificar Producto");
        jMEditarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEditarPActionPerformed(evt);
            }
        });
        jMArchivo.add(jMEditarP);

        jMExit.setText("Salir");
        jMExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMExitActionPerformed(evt);
            }
        });
        jMArchivo.add(jMExit);

        jMGestion.add(jMArchivo);

        jMCompras.setText("Compras");

        jMMercaderia.setText("Ingreso de Mercaderia");
        jMMercaderia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMercaderiaActionPerformed(evt);
            }
        });
        jMCompras.add(jMMercaderia);

        jMGestion.add(jMCompras);

        jMVentas.setText("Verntas");

        jMVentaP.setText("Ventas");
        jMVentaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVentaPActionPerformed(evt);
            }
        });
        jMVentas.add(jMVentaP);

        jMGestion.add(jMVentas);

        jMInforme.setText("Informe");

        jMStock.setText("Stock");
        jMStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMStockActionPerformed(evt);
            }
        });
        jMInforme.add(jMStock);

        jMPrecio.setText("Precios");
        jMPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMPrecioActionPerformed(evt);
            }
        });
        jMInforme.add(jMPrecio);

        jMGestion.add(jMInforme);

        setJMenuBar(jMGestion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMStockActionPerformed
        InformeStock.setVisible(true);
        NuevoP.setVisible(false);
        EditarP.setVisible(false);
        CompraProductos.setVisible(false);
        Ventas.setVisible(false);
        ListaPrecios.setVisible(false);
    }//GEN-LAST:event_jMStockActionPerformed

    private void jMNuevoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMNuevoPActionPerformed
        NuevoP.setVisible(true);
        EditarP.setVisible(false);
        InformeStock.setVisible(false);
        CompraProductos.setVisible(false);
        Ventas.setVisible(false);
        ListaPrecios.setVisible(false);
    }//GEN-LAST:event_jMNuevoPActionPerformed

    private void jMMercaderiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMercaderiaActionPerformed
        CompraProductos.setVisible(true);
        InformeStock.setVisible(false);
        NuevoP.setVisible(false);
        EditarP.setVisible(false);
        Ventas.setVisible(false);
        ListaPrecios.setVisible(false);
    }//GEN-LAST:event_jMMercaderiaActionPerformed

    private void jMVentaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVentaPActionPerformed
        Ventas.setVisible(true);
        InformeStock.setVisible(false);
        NuevoP.setVisible(false);
        EditarP.setVisible(false);
        CompraProductos.setVisible(false);
        ListaPrecios.setVisible(false);
    }//GEN-LAST:event_jMVentaPActionPerformed

    private void jMPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMPrecioActionPerformed
        ListaPrecios.setVisible(true);
        InformeStock.setVisible(false);
        NuevoP.setVisible(false);
        EditarP.setVisible(false);
        CompraProductos.setVisible(false);
        Ventas.setVisible(false);
    }//GEN-LAST:event_jMPrecioActionPerformed

    private void jMEditarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEditarPActionPerformed
       ListaPrecios.setVisible(false);
        InformeStock.setVisible(false);
        NuevoP.setVisible(false);
        EditarP.setVisible(true);
        CompraProductos.setVisible(false);
        Ventas.setVisible(false);
    }//GEN-LAST:event_jMEditarPActionPerformed

    private void jMExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMExitActionPerformed
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jMExitActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionNegocio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                
                try {
                    new GestionNegocio().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(GestionNegocio.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMArchivo;
    private javax.swing.JMenu jMCompras;
    private javax.swing.JMenuItem jMEditarP;
    private javax.swing.JMenuItem jMExit;
    private javax.swing.JMenuBar jMGestion;
    private javax.swing.JMenu jMInforme;
    private javax.swing.JMenuItem jMMercaderia;
    private javax.swing.JMenuItem jMNuevoP;
    private javax.swing.JMenuItem jMPrecio;
    private javax.swing.JMenuItem jMStock;
    private javax.swing.JMenuItem jMVentaP;
    private javax.swing.JMenu jMVentas;
    // End of variables declaration//GEN-END:variables
}