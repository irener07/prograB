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


public class gestionVehiculo {
    
    
    public void ingresarVehiculo(int copiaPlaca, int copiaMaletas, int copiaAño, int copiaPuertas, int copiaMPG, int copiaCosto, String copiaVIN, int copiaKilometraje, int copiaCantidad, int copiaTransmision, Image foto, int copiaColor, int copiaMarca, int copiaEstado, int copiaEstilo, int copiaSede){
        try{
            
            //Falta imagen 
            vehiculo nuevo = new vehiculo(int placa, int cantidadMaletas, int año, int numeroPuertas, int mpg, int costoDia, String numeroVin, int kilometraje, int cantidadPersonas, int idTransmision, Image foto, int idColor, int idMarca, int isEstado, int idEstilo, int idSede);
            nuevo.placa = copiaPlaca;
            
            
            
        }
    }
}
