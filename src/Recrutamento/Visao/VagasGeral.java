/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recrutamento.Visao;

import Recrutamento.Modelo.ModeloVagas;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo
 */
public final class VagasGeral extends javax.swing.JFrame {
    
   

    /**
     * Creates new form AbreVaga
     * @throws java.sql.SQLException
     */
    public VagasGeral() throws SQLException {
        initComponents();
        preenchetabela();
      
     //int codfil = Recrutamento.Controle.ControleVagas.getInstancevagas().buscarFilial(Principal.filial);  
        
     
    }

    
    
     
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        JtblPedido = new javax.swing.JTable();

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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Vagas Abertas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JtblPedido.setModel(new javax.swing.table.DefaultTableModel(
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
        JtblPedido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JtblPedidoMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(JtblPedido);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 679, 390));

        setSize(new java.awt.Dimension(715, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JtblPedidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JtblPedidoMouseClicked
        // TODO add your handling code here:
                       
        

            
        
    }//GEN-LAST:event_JtblPedidoMouseClicked

     public void preenchetabela() throws SQLException{
                     
       List<ModeloVagas> Vagas = Recrutamento.Controle.ControleVagas.getInstancevagas().buscarVagas();

            DefaultTableModel modelo = new DefaultTableModel();

            modelo.addColumn("");
            modelo.addColumn("Cod. Vaga");
            modelo.addColumn("Filial");
            modelo.addColumn("Cargo");
            modelo.addColumn("Solicitação");
            modelo.addColumn("Data");
            modelo.addColumn("Situação");
            
           
          
        JtblPedido.setModel(modelo);
        JtblPedido.setAutoResizeMode(JtblPedido.AUTO_RESIZE_OFF);
        JtblPedido.getColumnModel().getColumn(0).setPreferredWidth(20);
        JtblPedido.getColumnModel().getColumn(1).setPreferredWidth(85);
        JtblPedido.getColumnModel().getColumn(2).setPreferredWidth(150);
        JtblPedido.getColumnModel().getColumn(3).setPreferredWidth(150);
        JtblPedido.getColumnModel().getColumn(4).setPreferredWidth(90);
        JtblPedido.getColumnModel().getColumn(5).setPreferredWidth(90);
        JtblPedido.getColumnModel().getColumn(6).setPreferredWidth(90);
      

            int y = 1;
            for (ModeloVagas i : Vagas) {
                modelo.addRow(new Object[]{i.getCor(),i.getCodvaga(),i.getFilial(), i.getCargo(), i.getSolicitacao(), i.getData(),i.getSituacao()});
                //  jpb1.setValue(y);
                y++;
             
           }  
                
            

            JtblPedido.removeAll();  // LIMPA O CONTEUDO DA TABELA
        
            JtblPedido.setModel(modelo);
     
      }
    
     
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
            java.util.logging.Logger.getLogger(VagasGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VagasGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VagasGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VagasGeral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VagasGeral().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(VagasGeral.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtblPedido;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
