
package prograbases1;

/**
 *
 * @author win8
 */
public class cliente {
    public int cedula;
    public String primerNombre;
    public String primerApellido;
    public String segundoApellido;
    public String correo;
    public int telefono;
    public int idProvincia;
    public int idCanton;
    public int idDistrito;
    public String señas;
    public int idLicencia;

    public cliente(int cedula, String primerNombre, String primerApellido, String segundoApellido, String correo, int telefono, int idProvincia, int idCanton, int idDistrito, String señas, int idLicencia) {
        this.cedula = cedula;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.telefono = telefono;
        this.idProvincia = idProvincia;
        this.idCanton = idCanton;
        this.idDistrito = idDistrito;
        this.señas = señas;
        this.idLicencia = idLicencia;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
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

    public int getIdLicencia() {
        return idLicencia;
    }

    public void setIdLicencia(int idLicencia) {
        this.idLicencia = idLicencia;
    }

    @Override
    public String toString() {
        return "cliente{" + "cedula=" + cedula + ", primerNombre=" + primerNombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", correo=" + correo + ", telefono=" + telefono + ", idProvincia=" + idProvincia + ", idCanton=" + idCanton + ", idDistrito=" + idDistrito + ", se\u00f1as=" + señas + ", idLicencia=" + idLicencia + '}';
    }
    

    
    
}
