package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class Genero {
    private int idSexo;
    private String nombre;

    public Genero() {
        this.idSexo = 0;
        this.nombre = "";
    }

    public int getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(int idSexo) {
        this.idSexo = idSexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
