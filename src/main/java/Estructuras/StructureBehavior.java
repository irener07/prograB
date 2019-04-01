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

    public interface StructureBehavior<X> extends Comparable<X> {
	public void create(X element);
	public void remove();
        @Override
	public String toString();
	public void clear();
	public boolean isEmpty();
	public int getSize();
	public X consult(int position);
}
