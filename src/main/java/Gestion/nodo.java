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
public class nodo<X> {
   private X element;
   private nodo<X> next;
   private nodo<X> previuos;

    public nodo(X element, nodo<X> next, nodo<X> previuos) {
        this.element = element;
        this.next = next;
        this.previuos = previuos;
    }

    public nodo(X element, nodo<X> next) {
        this.element = element;
        this.next = next;
    }

    public nodo(X element) {
        this.element = element;
    }
    
    
      public nodo() {
    }

    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public nodo<X> getNext() {
        return next;
    }

    public void setNext(nodo<X> next) {
        this.next = next;
    }

    public nodo<X> getPreviuos() {
        return previuos;
    }

    public void setPreviuos(nodo<X> previuos) {
        this.previuos = previuos;
    }

    @Override
    public String toString() {
        return "Nodo{" + "element=" + element + ", next=" + next + ", previuos=" + previuos + '}';
    }
    
}
