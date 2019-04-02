/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

/**
 *
 * @author win8
 */
import interfaz.interfazClientes;
import java.util.LinkedList;
import interfaz.PrograBases1;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import prograbases1.cliente;



public class gestionClientes {
    
    /**
     *
     * @param copiaCedula
     * @param copiaNom
     * @param copiaApellido1
     * @param copiaApellido2
     * @param copiaCorreo
     * @param copiaTelef
     * @param copiaIdP
     * @param copiaIdC
     * @param copiaIdD
     * @param copiaSeñas 
     * @param copiaIdLicencia 
     */
    
    public void ingresarClientes(int copiaCedula, String copiaNom, String copiaApellido1, String copiaApellido2, String copiaCorreo, int copiaTelef, int copiaIdP, int copiaIdC, int copiaIdD, String copiaSeñas, int copiaIdLicencia){
        try{
            cliente nuevo = new cliente(copiaCedula, copiaNom, copiaApellido1, copiaApellido2, copiaCorreo, copiaTelef, copiaIdP, copiaIdC, copiaIdD, copiaSeñas, copiaIdLicencia);
            PrograBases1.clientes.create(nuevo);
            
            
        }
        catch(HeadlessException e){
               JOptionPane.showMessageDialog(null,"No se ha podido ingresar el cliente","Error", JOptionPane.PLAIN_MESSAGE);
               
           }
        
    
    }

    
}
