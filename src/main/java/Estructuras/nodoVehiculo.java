/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import prograbases1.vehiculo;

/**
 *
 * @author win8
 */
public class nodoVehiculo {
    //Declaracion de variables
    vehiculo element;
//    lista_historial historial;
    nodoVehiculo next;
    
    //Constructores
    public nodoVehiculo(){
    }
    public nodoVehiculo(vehiculo element){
        this.element = element;
        this.next = null;
    }
    public nodoVehiculo(vehiculo element,nodoVehiculo next){
        this.element = element;
        this.next = next;
    }
    //Metodos de la clase
    public vehiculo getElement() {
        return this.element;
    }

    public void setElement(vehiculo element) {
        this.element = element;
    }

    public nodoVehiculo getNext() {
        return this.next;
    }

    public void setNext(nodoVehiculo next) {
        this.next = next;
    }
}
