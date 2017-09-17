package com.clinicamedica.bean;

import com.clinicamedica.dao.ReligionDAO;
import com.clinicamedica.modelos.Religion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class ReligionBean {

    private Religion religion = new Religion();
    private List<Religion> lstReligion;

    public ReligionBean() {

    }

    public Religion getReligion() {
        return religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }

    public List<Religion> getLstReligion() {
        return lstReligion;
    }

    public void setLstReligion(List<Religion> lstReligion) {
        this.lstReligion = lstReligion;
    }

    public void listarReligion() {
        ReligionDAO dao;
        try {
            dao = new ReligionDAO();
            lstReligion = dao.listar();
        } catch (Exception e) {
            System.out.println("No se desplego informacion en ReligionBean " + e);
        }
    }
}
