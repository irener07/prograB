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
public class serviciosOpcionales {
    
    
    public int idServicioOpcional;
    public String servicioOpcional;
    public double precio;

    public serviciosOpcionales(int idServicioOpcional, String servicioOpcional, double precio) {
        this.idServicioOpcional = idServicioOpcional;
        this.servicioOpcional = servicioOpcional;
        this.precio = precio;
    }

    public String getServicioOpcional() {
        return servicioOpcional;
    }

    public void setServicioOpcional(String servicioOpcional) {
        this.servicioOpcional = servicioOpcional;
    }

    public double getPrecio() {
        return precio;
    }

    public int getIdServicioOpcional() {
        return idServicioOpcional;
    }

    public void setIdServicioOpcional(int idServicioOpcional) {
        this.idServicioOpcional = idServicioOpcional;
    }
    

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
