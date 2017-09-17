package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class Religion {

    private int idReligion;
    private String nombre;

    public Religion() {
        this.idReligion = 0;
        this.nombre = "";
    }

    public int getIdReligion() {
        return idReligion;
    }

    public void setIdReligion(int idReligion) {
        this.idReligion = idReligion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
