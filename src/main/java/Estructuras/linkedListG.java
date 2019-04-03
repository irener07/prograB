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
public class linkedListG<X> implements StructureBehavior<X> {
    public nodo<X> head,current, tail;
    public int size, position;


    public nodo<X> getHead() {
        return head;
    }

    public void setHead(nodo<X> head) {
        this.head = head; 
    }

    public nodo<X> getTail() {
        return tail;
    }

    public void setTail(nodo<X> tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public nodo<X> getCurrent() {
        return current;
    }

    public void setCurrent(nodo<X> current) {
        this.current = current;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    

    @Override
    public void create(X element) {
        if (isEmpty()) {
            head = new nodo<>(element);
            tail = head;
            size++;
        } else {
            tail.setNextNode(new nodo<>(element));
            tail = tail.getNextNode();
            size++;
        }
    }

    private void DeleteWherever(X element) {
        nodo<X> tempNode, tempPrevios, tempNext;
        tempNode = head;
        for (int i = 0; i < size; i++) {
            if (tempNode.getNextNode().getElement().equals(element)) {
                tempPrevios = tempNode;
                tempNode = tempNode.getNextNode();
                tempNext = tempNode.getNextNode();
                tempPrevios.setNextNode(tempNext);
                tempNode.setNextNode(null);
            } else {
                tempNode = tempNode.getNextNode();
            }
        }
        size--;
    }

    public void Delete(X element) {
        if (!isEmpty()) {
            if (tail.getElement().equals(element)) {
                nodo<X> temp = head;
                for (int i = 0; i < size; i++) {
                    if (temp.getNextNode() == tail) {
                        tail = temp;
                        tail.setNextNode(null);
                    } else {
                        temp.getNextNode();
                    }
                }
                size--;
            } else if (head.getElement().equals(element)) {
                nodo temp = head;
                head = head.getNextNode();
                temp.setNextNode(null);
                size--;
            } else if (size == 1) {
                head = null;
                tail = head;
                size--;
            } else if (size >= 2) {
                DeleteWherever(element);
            }
        }
    }

    @Override
    public void clear() {
        this.head = this.tail = null;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    public X consult(X elemento) {
        nodo<X> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.getElement().equals(elemento)) {
                break;
            } else {
                temp = temp.getNextNode();
            }
        }
        return temp.getElement();
    }

    @Override
    public String toString() {
        String message = "";
        nodo<X> temp = head;
        for (int i = 0; i < size; i++) {
            message += temp.toString();
            temp = temp.getNextNode();
        }
        return message;
    }
//estos metodos no se usan con esas caracteristicas en especifico, al ser utilizadas con una interface, no se usan las mismas caracterisiticas en todas
    @Override
    public X consult(int position) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(X t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
