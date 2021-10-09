/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemanegocio;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author feded
 */
public class ListaPrecios extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaPrecios
     */
    
    
    public ListaPrecios() {
       initComponents();
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ListaPrecios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPrecio = new javax.swing.JTable();
        jBlpbuscar = new javax.swing.JButton();
        jBlpimprimir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Precios");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTPrecio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "MARCA", "DETALLE", "PRECIO"
            }
        ));
        jTPrecio.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTPrecio.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTPrecio);

        jBlpbuscar.setText("BUSCAR");
        jBlpbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlpbuscarActionPerformed(evt);
            }
        });

        jBlpimprimir.setText("IMPRIMIR");
        jBlpimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlpimprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jBlpbuscar)
                        .addGap(135, 135, 135)
                        .addComponent(jBlpimprimir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlpimprimir)
                    .addComponent(jBlpbuscar))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBlpbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlpbuscarActionPerformed
        try {
            DefaultTableModel lista = (DefaultTableModel)jTPrecio.getModel();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/sistemanegocio","root","");
            Statement stmt = con.createStatement();
            ResultSet lp = stmt.executeQuery("SELECT codigo, marca, detalle, precio FROM listado");
            
            lp.first();
            
            do{
                String[] fila = {lp.getString(1),lp.getString(2),lp.getString(3),lp.getString(4)};
                lista.addRow(fila);
                
            }while(lp.next());
        } catch (SQLException ex) {
            Logger.getLogger(ListaPrecios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBlpbuscarActionPerformed

    private void jBlpimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlpimprimirActionPerformed
        try{
            MessageFormat headerFormat = new MessageFormat(" INFORME DE STOCK");
            
        jTPrecio.print(JTable.PrintMode.NORMAL, headerFormat, headerFormat);
        
        } catch (PrinterException ex){
           Logger.getLogger(ListaPrecios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBlpimprimirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBlpbuscar;
    private javax.swing.JButton jBlpimprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTPrecio;
    // End of variables declaration//GEN-END:variables
}