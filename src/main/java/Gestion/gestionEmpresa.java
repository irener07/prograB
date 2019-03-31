/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import prograbases1.empresa;
import interfaz.PrograBases1;

/**
 *
 * @author win8
 */
public class gestionEmpresa {
    public void ingresarEmpresa(int copiaCJ, String copiaRS, int copiaTelefono, int copiaProvincia, int copiaCanton, int copiaDistrito, String copiaSeñas){
        try{
            empresa nuevo = new empresa(copiaCJ, copiaRS, copiaTelefono, copiaProvincia, copiaCanton, copiaDistrito, copiaSeñas);
            PrograBases1.empresas.add(nuevo);
            
            
        }
        catch(HeadlessException e){
               JOptionPane.showMessageDialog(null,"No se ha podido ingresar la empresa","Error", JOptionPane.PLAIN_MESSAGE);
               
           }
    
    }
}
