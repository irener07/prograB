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
public class servicioMantenimiento {
    public int idServicio;
    public int montoPago;
    public Date fechaInicio;
    public Date fechaFin;
    public String detalle;
    public int idTipoServicio;
    public int placaVehiculo;
    public int cedulaJuridica;

    public servicioMantenimiento(int idServicio, int montoPago, Date fechaInicio, Date fechaFin, String detalle, int idTipoServicio, int placaVehiculo, int cedulaJuridica) {
        this.idServicio = idServicio;
        this.montoPago = montoPago;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.detalle = detalle;
        this.idTipoServicio = idTipoServicio;
        this.placaVehiculo = placaVehiculo;
        this.cedulaJuridica = cedulaJuridica;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(int montoPago) {
        this.montoPago = montoPago;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getIdTipoServicio() {
        return idTipoServicio;
    }

    public void setIdTipoServicio(int idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }

    public int getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(int placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    @Override
    public String toString() {
        return "servicioMantenimiento{" + "idServicio=" + idServicio + ", montoPago=" + montoPago + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", detalle=" + detalle + ", idTipoServicio=" + idTipoServicio + ", placaVehiculo=" + placaVehiculo + ", cedulaJuridica=" + cedulaJuridica + '}';
    }
    
    
}
