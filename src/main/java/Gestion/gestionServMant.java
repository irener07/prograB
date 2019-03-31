/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import java.sql.Date;
import prograbases1.servicioMantenimiento;
import interfaz.PrograBases1;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author win8
 */
public class gestionServMant {
    public void ingresarServicio(int copiaIdS, int copiaMonto, Date copiaFechaI, Date copiaFechaF, String copiaDetalle, int copiaIdTS, int copiaPlacas, int copiaCedulaJ){
        try{
            servicioMantenimiento nuevo = new servicioMantenimiento (copiaIdS, copiaMonto, copiaFechaI, copiaFechaF, copiaDetalle, copiaIdTS, copiaPlacas, copiaCedulaJ);
            PrograBases1.serviciosM.add(nuevo);
            
            
        }
        catch(HeadlessException e){
               JOptionPane.showMessageDialog(null,"No se ha podido ingresar el cliente","Error", JOptionPane.PLAIN_MESSAGE);
               
           }
        
    }
}
