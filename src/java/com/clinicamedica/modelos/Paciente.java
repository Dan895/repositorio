package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class Paciente {

    private int idPaciente;
    private int idDomicilio;
    private int idPersona;
    private String contactoPersona;
    private int telefonoContacto;
    private int idOcupacion;

    public Paciente() {
        this.idPaciente = 0;
        this.idDomicilio = 0;
        this.idPersona = 0;
        this.contactoPersona = "";
        this.telefonoContacto = 0;
        this.idOcupacion = 0;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDomicilio() {
        return idDomicilio;
    }

    public void setIdDomicilio(int idDomicilio) {
        this.idDomicilio = idDomicilio;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getContactoPersona() {
        return contactoPersona;
    }

    public void setContactoPersona(String contactoPersona) {
        this.contactoPersona = contactoPersona;
    }

    public int getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(int telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public int getIdOcupacion() {
        return idOcupacion;
    }

    public void setIdOcupacion(int idOcupacion) {
        this.idOcupacion = idOcupacion;
    }

}
