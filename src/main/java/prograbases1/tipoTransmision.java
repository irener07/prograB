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
public class tipoTransmision {
    
    
    public int idTipoTransmision;
    public String tipoTransmision;

    public tipoTransmision(int idTipoTransmision, String tipoTransmision) {
        this.idTipoTransmision = idTipoTransmision;
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    

    public int getIdTipoTransmision() {
        return idTipoTransmision;
    }

    public void setIdTipoTransmision(int idTipoTransmision) {
        this.idTipoTransmision = idTipoTransmision;
    }
    
}
