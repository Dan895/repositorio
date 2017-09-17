package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class EstadoCivil {
    private int idEstadoCivil;
    private String nombre;
    
    public EstadoCivil() {
        this.idEstadoCivil = 0;
        this.nombre = "";
    }

    public int getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(int idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
