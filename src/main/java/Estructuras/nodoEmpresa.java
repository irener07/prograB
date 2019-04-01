/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import prograbases1.empresa;

/**
 *
 * @author win8
 */
public class nodoEmpresa {
    //Declaracion de variables
    empresa element;
//    lista_historial historial;
    nodoEmpresa next;
    
    //Constructores
    public nodoEmpresa(){
    }
    public nodoEmpresa(empresa element){
        this.element = element;
        this.next = null;
    }
    public nodoEmpresa(empresa element,nodoEmpresa next){
        this.element = element;
        this.next = next;
    }
    //Metodos de la clase
    public empresa getElement() {
        return this.element;
    }

    public void setElement(empresa element) {
        this.element = element;
    }

    public nodoEmpresa getNext() {
        return this.next;
    }

    public void setNext(nodoEmpresa next) {
        this.next = next;
    }
}
