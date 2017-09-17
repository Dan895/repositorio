package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class ReferenciaClinica {

    private int idReferenciaClinica;
    private String nombre;

    public ReferenciaClinica() {
        this.idReferenciaClinica = 0;
        this.nombre = "";
    }

    public int getIdReferenciaClinica() {
        return idReferenciaClinica;
    }

    public void setIdReferenciaClinica(int idReferenciaClinica) {
        this.idReferenciaClinica = idReferenciaClinica;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
