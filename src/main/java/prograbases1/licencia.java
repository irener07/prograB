/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prograbases1;

import java.awt.Image;
import java.sql.Date;

/**
 *
 * @author win8
 */
public class licencia {
    public int numeroLicencia;
    public String tipoLicencia;
    public Date fechaEmision;
    public Date fechaExpiracion;
    public Image foto;
    public int cedulaCliente;

    public licencia(int numeroLicencia, String tipoLicencia, Date fechaEmision, Date fechaExpiracion, Image foto, int cedulaCliente) {
        this.numeroLicencia = numeroLicencia;
        this.tipoLicencia = tipoLicencia;
        this.fechaEmision = fechaEmision;
        this.fechaExpiracion = fechaExpiracion;
        this.foto = foto;
        this.cedulaCliente = cedulaCliente;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    @Override
    public String toString() {
        return "licencia{" + "numeroLicencia=" + numeroLicencia + ", tipoLicencia=" + tipoLicencia + ", fechaEmision=" + fechaEmision + ", fechaExpiracion=" + fechaExpiracion + ", foto=" + foto + ", cedulaCliente=" + cedulaCliente + '}';
    }
    
}
