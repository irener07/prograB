/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;


/**
 *
 * @author win8
 * @param <X>
 */
public class nodo<X> {
   private X element;
    private nodo<X> nextNode;

    

    public X getElement() {
        return element;
    }

    public void setElement(X element) {
        this.element = element;
    }

    public nodo<X> getNextNode() {
        return nextNode;
    }

    public void setNextNode(nodo<X> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "" + element;
    }

    public nodo(X element) {
        this.element = element;
    }

    public nodo(X element, nodo<X> nextNode) {
        this.element = element;
        this.nextNode = nextNode;
    }

    public int compareTo(nodo<X> t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
