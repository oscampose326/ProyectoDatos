/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoconsultoriom;

import java.util.Date;

/**
 *
 * @author ulacit
 */
public class Citas {
    private int id;
    private Date fecha;
    private String hora;
    private String motivo;

    public Citas(Date fecha, String hora, String motivo) {
        //this.id = id;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
    
    
}
