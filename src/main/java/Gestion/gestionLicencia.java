/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import interfaz.PrograBases1;
import java.awt.HeadlessException;
import java.io.File;
import java.sql.Date;
import javax.swing.JOptionPane;
import prograbases1.empresa;
import prograbases1.licencia;

/**
 *
 * @author win8
 */
public class gestionLicencia {
    public void ingresarLicencia(int copiaNumeroLicencia, String copiaTipoLicencia, Date copiaFechaEmi, Date copiaFechaExp, File foto, int copiaCedula){
        try{
            licencia nuevo = new licencia(copiaNumeroLicencia, copiaTipoLicencia, copiaFechaEmi, copiaFechaExp, foto, copiaCedula);
            PrograBases1.licencias.create(nuevo);
            
            
        }
        catch(HeadlessException e){
               JOptionPane.showMessageDialog(null,"No se ha podido ingresar la licencia","Error", JOptionPane.PLAIN_MESSAGE);
               
           }
    
    }
}
