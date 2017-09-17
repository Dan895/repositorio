package com.clinicamedica.bean;

import com.clinicamedica.dao.DomicilioDAO;
import com.clinicamedica.modelos.Domicilio;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class DomicilioBean {

    private Domicilio domicilio = new Domicilio();
    private List<Domicilio> lstDomicilio;

    public DomicilioBean() {

    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }

    public List<Domicilio> getLstDomicilio() {
        return lstDomicilio;
    }

    public void setLstDomicilio(List<Domicilio> lstDomicilio) {
        this.lstDomicilio = lstDomicilio;
    }

    public void listarDomicilio() {
        DomicilioDAO dao;

        try {
            dao = new DomicilioDAO();
            lstDomicilio = dao.listar();
        } catch (Exception e) {
            System.out.println("No de desplego informacion en DomicilioBean" + e);
        }
    }
}
