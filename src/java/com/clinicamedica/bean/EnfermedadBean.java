package com.clinicamedica.bean;

import com.clinicamedica.dao.EnfermedadDAO;
import com.clinicamedica.modelos.Enfermedad;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class EnfermedadBean {

    private Enfermedad enfermedad = new Enfermedad();
    private List<Enfermedad> lstEnfermedad;

    public EnfermedadBean() {
    }

    public Enfermedad getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(Enfermedad enfermedad) {
        this.enfermedad = enfermedad;
    }

    public List<Enfermedad> getLstEnfermedad() {
        return lstEnfermedad;
    }

    public void setLstEnfermedad(List<Enfermedad> lstEnfermedad) {
        this.lstEnfermedad = lstEnfermedad;
    }

    public void listarEnfermedad() {
        EnfermedadDAO dao;
        try {
            dao = new EnfermedadDAO();
            lstEnfermedad = dao.listar();
        } catch (Exception e) {
            System.out.println("No se desplego informacion en EnfermedadBean " + e);
        }
    }

}
