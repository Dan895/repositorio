package com.clinicamedica.bean;

import com.clinicamedica.dao.EstadoCivilDAO;
import com.clinicamedica.modelos.EstadoCivil;
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
public class EstadoCivilBean {

    private EstadoCivil estadocivil = new EstadoCivil();
    private List<EstadoCivil> lstEstadoCivil;

    public EstadoCivilBean() {

    }

    public EstadoCivil getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(EstadoCivil estadocivil) {
        this.estadocivil = estadocivil;
    }

    public List<EstadoCivil> getLstEstadoCivil() {
        return lstEstadoCivil;
    }

    public void setLstEstadoCivil(List<EstadoCivil> lstEstadoCivil) {
        this.lstEstadoCivil = lstEstadoCivil;
    }

    public void listarReligion() {
        EstadoCivilDAO dao;
        try {
            dao = new EstadoCivilDAO();
            lstEstadoCivil = dao.listar();
        } catch (Exception e) {
            System.out.println("No se desplego informacion en EstadoCivilBean " + e);
        }
    }
}
