package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class Persona {

    private int idPersona;
    private String nombre, apellido, fechaNacimiento, telefono, correoElectronico, noDocumento;
    private int idGenero, idEstadoCivil, idDocumentoPaciente, idReligion;

    public Persona() {
        this.idPersona = 0;
        this.nombre = "";
        this.apellido = "";
        this.fechaNacimiento = "";
        this.telefono = "";
        this.correoElectronico = "";
        this.idGenero = 0;
        this.idEstadoCivil = 0;
        this.idDocumentoPaciente = 0;
        this.noDocumento = "";
        this.idReligion = 0;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNoDocumento() {
        return noDocumento;
    }

    public void setNoDocumento(String noDocumento) {
        this.noDocumento = noDocumento;
    }

    public int getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    public int getIdEstadoCivil() {
        return idEstadoCivil;
    }

    public void setIdEstadoCivil(int idEstadoCivil) {
        this.idEstadoCivil = idEstadoCivil;
    }

    public int getIdDocumentoPaciente() {
        return idDocumentoPaciente;
    }

    public void setIdDocumentoPaciente(int idDocumentoPaciente) {
        this.idDocumentoPaciente = idDocumentoPaciente;
    }

    public int getIdReligion() {
        return idReligion;
    }

    public void setIdReligion(int idReligion) {
        this.idReligion = idReligion;
    }
}
