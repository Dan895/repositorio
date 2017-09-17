package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class Ocupacion {

    private int idOcupacion;
    private String nombre;

    public Ocupacion() {
        this.idOcupacion = 0;
        this.nombre = "";
    }

    public int getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(int idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
