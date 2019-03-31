
package prograbases1;

import java.awt.Image;

/**
 *
 * @author win8
 */
public class vehiculo {
    public int placa;
    public int cantidadMaletas;
    public int año;
    public int numeroPuertas;
    public int mpg;
    public int costoDia;
    public String numeroVin;
    public int kilometraje;
    public int cantidadPersonas;
    public int idTransmision;
    public Image foto;
    public int idColor;
    public int idMarca;
    public int isEstado;
    public int idEstilo;
    public int idSede;

    public vehiculo(int placa, int cantidadMaletas, int año, int numeroPuertas, int mpg, int costoDia, String numeroVin, int kilometraje, int cantidadPersonas, int idTransmision, Image foto, int idColor, int idMarca, int isEstado, int idEstilo, int idSede) {
        this.placa = placa;
        this.cantidadMaletas = cantidadMaletas;
        this.año = año;
        this.numeroPuertas = numeroPuertas;
        this.mpg = mpg;
        this.costoDia = costoDia;
        this.numeroVin = numeroVin;
        this.kilometraje = kilometraje;
        this.cantidadPersonas = cantidadPersonas;
        this.idTransmision = idTransmision;
        this.foto = foto;
        this.idColor = idColor;
        this.idMarca = idMarca;
        this.isEstado = isEstado;
        this.idEstilo = idEstilo;
        this.idSede = idSede;
    }
    
    

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getCantidadMaletas() {
        return cantidadMaletas;
    }

    public void setCantidadMaletas(int cantidadMaletas) {
        this.cantidadMaletas = cantidadMaletas;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public int getCostoDia() {
        return costoDia;
    }

    public void setCostoDia(int costoDia) {
        this.costoDia = costoDia;
    }

    public String getNumeroVin() {
        return numeroVin;
    }

    public void setNumeroVin(String numeroVin) {
        this.numeroVin = numeroVin;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getIdTransmision() {
        return idTransmision;
    }

    public void setIdTransmision(int idTransmision) {
        this.idTransmision = idTransmision;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getIsEstado() {
        return isEstado;
    }

    public void setIsEstado(int isEstado) {
        this.isEstado = isEstado;
    }

    public int getIdEstilo() {
        return idEstilo;
    }

    public void setIdEstilo(int idEstilo) {
        this.idEstilo = idEstilo;
    }

    public int getIdSede() {
        return idSede;
    }

    public void setIdSede(int idSede) {
        this.idSede = idSede;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "placa=" + placa + ", cantidadMaletas=" + cantidadMaletas + ", a\u00f1o=" + año + ", numeroPuertas=" + numeroPuertas + ", mpg=" + mpg + ", costoDia=" + costoDia + ", numeroVin=" + numeroVin + ", kilometraje=" + kilometraje + ", cantidadPersonas=" + cantidadPersonas + ", idTransmision=" + idTransmision + ", foto=" + foto + ", idColor=" + idColor + ", idMarca=" + idMarca + ", isEstado=" + isEstado + ", idEstilo=" + idEstilo + ", idSede=" + idSede + '}';
    }
    
    
}
