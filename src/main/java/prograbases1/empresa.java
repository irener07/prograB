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
public class empresa {
    public int cedulaJuridica;
    public String razonSocial;
    public int telefono;
    public int idProvincia;
    public int idCanton;
    public int idDistrito;
    public String señas;

    public empresa(int cedulaJuridica, String razonSocial, int telefono, int idProvincia, int idCanton, int idDistrito, String señas) {
        this.cedulaJuridica = cedulaJuridica;
        this.razonSocial = razonSocial;
        this.telefono = telefono;
        this.idProvincia = idProvincia;
        this.idCanton = idCanton;
        this.idDistrito = idDistrito;
        this.señas = señas;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(int cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public int getIdCanton() {
        return idCanton;
    }

    public void setIdCanton(int idCanton) {
        this.idCanton = idCanton;
    }

    public int getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(int idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getSeñas() {
        return señas;
    }

    public void setSeñas(String señas) {
        this.señas = señas;
    }

    @Override
    public String toString() {
        return "empresa{" + "cedulaJuridica=" + cedulaJuridica + ", razonSocial=" + razonSocial + ", telefono=" + telefono + ", idProvincia=" + idProvincia + ", idCanton=" + idCanton + ", idDistrito=" + idDistrito + ", se\u00f1as=" + señas + '}';
    }
    
    
}
