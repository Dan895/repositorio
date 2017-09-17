package com.clinicamedica.bean;

import com.clinicamedica.dao.PersonaDAO;
import com.clinicamedica.modelos.Persona;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class PersonaBean {

    private Persona persona = new Persona();
    private List<Persona> lstPersona;

    public PersonaBean() {

    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getLstPersona() {
        return lstPersona;
    }

    public void setLstPersona(List<Persona> lstPersona) {
        this.lstPersona = lstPersona;
    }

    public void registrar() {
        PersonaDAO dao;

        try {
            dao = new PersonaDAO();
            dao.registrar(persona);
        } catch (Exception e) {
            System.out.println("No se registro en PersonaBean" + e);
        }
    }

    public void listarPersona() {
        PersonaDAO dao;

        try {
            dao = new PersonaDAO();
            lstPersona = dao.listar();
        } catch (Exception e) {
            System.out.println("No de desplego informacion en PersonaBean" + e);
        }
    }
}
