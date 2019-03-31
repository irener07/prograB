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
import Gestion.nodo;
import Gestion.nodoClientes;
import java.util.LinkedList;
import prograbases1.cliente;
import prograbases1.empresa;
import prograbases1.servicioMantenimiento;
public class PrograBases1 {
    //Se crean las listas al inicio del programa
    public static LinkedList<nodo> vehiculos = new LinkedList<>();
    public static LinkedList<nodo> usuarios = new LinkedList<>();
    public static LinkedList<cliente> clientes = new LinkedList<>();
    public static LinkedList<empresa> empresas = new LinkedList<>();
    public static LinkedList<servicioMantenimiento> serviciosM = new LinkedList<>();
    public static LinkedList<nodo> reservas = new LinkedList<>();
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
