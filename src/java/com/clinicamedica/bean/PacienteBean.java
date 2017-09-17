package com.clinicamedica.bean;

import com.clinicamedica.dao.PacienteDAO;
import com.clinicamedica.modelos.Paciente;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class PacienteBean {

    private Paciente paciente = new Paciente();
    private List<Paciente> lstPaciente;

    public PacienteBean() {

    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Paciente> getLstPaciente() {
        return lstPaciente;
    }

    public void setLstPaciente(List<Paciente> lstPaciente) {
        this.lstPaciente = lstPaciente;
    }

    public void registrar() {
        PacienteDAO dao;

        try {
            dao = new PacienteDAO();
            dao.registrar(paciente);
        } catch (Exception e) {
            System.out.println("No se registro en PacienteBean" + e);
        }
    }

    public void listarPaciente() {
        PacienteDAO dao;

        try {
            dao = new PacienteDAO();
            lstPaciente = dao.listar();
        } catch (Exception e) {
            System.out.println("No de desplego informacion en PacienteBean" + e);
        }
    }

}
