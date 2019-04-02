/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author win8
 */
import Estructuras.linkedListG;
import Estructuras.nodo;
import Estructuras.nodoClientes;
import java.util.LinkedList;
import prograbases1.cliente;
import prograbases1.empresa;
import prograbases1.licencia;
import prograbases1.servicioMantenimiento;
import prograbases1.usuario;
import prograbases1.vehiculo;
public class PrograBases1 {
    //Se crean las listas al inicio del programa
    public static linkedListG<vehiculo> vehiculos = new linkedListG<vehiculo>();
    public static linkedListG<usuario> usuarios = new linkedListG<usuario>();
    public static linkedListG<cliente> clientes = new linkedListG<cliente>();
    public static linkedListG<empresa> empresas = new linkedListG<empresa>();
    public static linkedListG<servicioMantenimiento> serviciosM = new linkedListG<servicioMantenimiento>();
    public static linkedListG<licencia> licencias = new linkedListG<licencia>();
    public static linkedListG reservas = new linkedListG<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Menú menuI = new Menú();
        menuI.setVisible(true);
        menuI.setLocationRelativeTo(null);
        menuI.setDefaultCloseOperation(Menú.HIDE_ON_CLOSE);
    }
    
}
