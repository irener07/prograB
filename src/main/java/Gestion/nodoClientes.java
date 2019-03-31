/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import prograbases1.cliente;

/**
 *
 * @author win8
 */
public class nodoClientes {
    //Declaracion de variables
    cliente element;
//    lista_historial historial;
    nodoClientes next;
    
    //Constructores
    public nodoClientes(){
    }
    public nodoClientes(cliente element){
        this.element = element;
        this.next = null;
    }
    public nodoClientes(cliente element,nodoClientes next){
        this.element = element;
        this.next = next;
    }
    //Metodos de la clase
    public cliente getElement() {
        return this.element;
    }

    public void setElement(cliente element) {
        this.element = element;
    }

    public nodoClientes getNext() {
        return this.next;
    }

    public void setNext(nodoClientes next) {
        this.next = next;
    }  
}
