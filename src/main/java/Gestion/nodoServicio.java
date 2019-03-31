/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import prograbases1.servicioMantenimiento;

/**
 *
 * @author win8
 */
public class nodoServicio {
    servicioMantenimiento element;
//    lista_historial historial;
    nodoServicio next;
    
    //Constructores
    public nodoServicio(){
    }
    public nodoServicio(servicioMantenimiento element){
        this.element = element;
        this.next = null;
    }
    public nodoServicio(servicioMantenimiento element,nodoServicio next){
        this.element = element;
        this.next = next;
    }
    //Metodos de la clase
    public servicioMantenimiento getElement() {
        return this.element;
    }

    public void setElement(servicioMantenimiento element) {
        this.element = element;
    }

    public nodoServicio getNext() {
        return this.next;
    }

    public void setNext(nodoServicio next) {
        this.next = next;
    }
}
