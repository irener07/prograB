/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograbases1;

/**
 *
 * @author win8
 */
public class factura {
    public int numeroFactura;
    public int costoTotal;
    public int cedulaCliente;
    public int placaVehiculo;
    public int idReserva;

    public factura(int numeroFactura, int costoTotal, int cedulaCliente, int placaVehiculo, int idReserva) {
        this.numeroFactura = numeroFactura;
        this.costoTotal = costoTotal;
        this.cedulaCliente = cedulaCliente;
        this.placaVehiculo = placaVehiculo;
        this.idReserva = idReserva;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public int getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(int placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    @Override
    public String toString() {
        return "factura{" + "numeroFactura=" + numeroFactura + ", costoTotal=" + costoTotal + ", cedulaCliente=" + cedulaCliente + ", placaVehiculo=" + placaVehiculo + ", idReserva=" + idReserva + '}';
    }
    
    
}
