package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class Domicilio {

    private int idDomicilio;
    private int idMunicipio;
    private String detalleAreaVivienda;
    private String descripcion;
    private int idArea;

    public Domicilio() {
        this.idDomicilio = 0;
        this.idMunicipio = 0;
        this.detalleAreaVivienda = "";
        this.descripcion = "";
        this.idArea = 0;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public String getDetalleAreaVivienda() {
        return detalleAreaVivienda;
    }

    public void setDetalleAreaVivienda(String detalleAreaVivienda) {
        this.detalleAreaVivienda = detalleAreaVivienda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdArea() {
        return idArea;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
}
