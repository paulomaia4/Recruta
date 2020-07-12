/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recrutamento.Controle;

import java.sql.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Paulo
 */
public class ChamaRelatorios {
    
    
    public void relatoriovagasGeral()    {
       ConectaBanco cb = new ConectaBanco();
        Connection con = cb.conectaPostgreSql("recruta");
            
        String src = "src\\Relatorios\\Vagas1.jasper";
        
        JasperPrint jaspertPrint = null;
        
        try {
            
            jaspertPrint = JasperFillManager.fillReport(src, null, con);
            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        
        JasperViewer view = new JasperViewer(jaspertPrint,false);
        
        view.setVisible(true);
        
        } 
    
}
