/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograbases1;

import java.sql.Date;

/**
 *
 * @author win8
 */
public class reserva {
    public int idReserva;
    public Date fechaSolicitud;
    public Date fechaInicio;
    public Date fechaFinal;
    public int sedeEntrega;
    public int sedeRecogido;
    public int idServiciosOpcionales;
    public int cedulaCliente;
    public int placaVehiculo;

    public reserva(int idReserva, Date fechaSolicitud, Date fechaInicio, Date fechaFinal, int sedeEntrega, int sedeRecogido, int idServiciosOpcionales, int cedulaCliente, int placaVehiculo) {
        this.idReserva = idReserva;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.sedeEntrega = sedeEntrega;
        this.sedeRecogido = sedeRecogido;
        this.idServiciosOpcionales = idServiciosOpcionales;
        this.cedulaCliente = cedulaCliente;
        this.placaVehiculo = placaVehiculo;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getSedeEntrega() {
        return sedeEntrega;
    }

    public void setSedeEntrega(int sedeEntrega) {
        this.sedeEntrega = sedeEntrega;
    }

    public int getSedeRecogido() {
        return sedeRecogido;
    }

    public void setSedeRecogido(int sedeRecogido) {
        this.sedeRecogido = sedeRecogido;
    }

    public int getIdServiciosOpcionales() {
        return idServiciosOpcionales;
    }

    public void setIdServiciosOpcionales(int idServiciosOpcionales) {
        this.idServiciosOpcionales = idServiciosOpcionales;
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

    @Override
    public String toString() {
        return "reserva{" + "idReserva=" + idReserva + ", fechaSolicitud=" + fechaSolicitud + ", fechaInicio=" + fechaInicio + ", fechaFinal=" + fechaFinal + ", sedeEntrega=" + sedeEntrega + ", sedeRecogido=" + sedeRecogido + ", idServiciosOpcionales=" + idServiciosOpcionales + ", cedulaCliente=" + cedulaCliente + ", placaVehiculo=" + placaVehiculo + '}';
    }
    
    
}
