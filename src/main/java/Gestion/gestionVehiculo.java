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
import interfaz.interfazIngresarVehiculo;
import java.awt.Image;
import java.util.LinkedList;
import prograbases1.vehiculo;
import interfaz.PrograBases1;
import java.awt.HeadlessException;
import java.io.File;
import javax.swing.JOptionPane;


public class gestionVehiculo {
    
    
    public void ingresarVehiculo(int copiaPlaca, int copiaMaletas, int copiaAño, int copiaPuertas, int copiaMPG, int copiaCosto, String copiaVIN, int copiaKilometraje, int copiaCantidad, int copiaTransmision, File foto, int copiaColor, int copiaMarca, int copiaEstado, int copiaEstilo, int copiaSede){
        try{
            
            //Falta imagen 
            vehiculo nuevo = new vehiculo(copiaPlaca, copiaMaletas, copiaAño, copiaPuertas, copiaMPG, copiaCosto, copiaVIN, copiaKilometraje, copiaCantidad, copiaTransmision, foto, copiaColor, copiaMarca, copiaEstado, copiaEstilo, copiaSede);
            PrograBases1.vehiculos.create(nuevo);
            
            
        }
        catch(HeadlessException e){
               JOptionPane.showMessageDialog(null,"No se ha podido ingresar el cliente","Error", JOptionPane.PLAIN_MESSAGE);
               
           }     
    }
    
}
