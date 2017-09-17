package com.clinicamedica.bean;

import com.clinicamedica.dao.OcupacionDAO;
import com.clinicamedica.modelos.Ocupacion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class OcupacionBean {

    private Ocupacion ocupacion = new Ocupacion();
    private List<Ocupacion> lstOcupacion;

    public OcupacionBean() {
    }

    public Ocupacion getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(Ocupacion ocupacion) {
        this.ocupacion = ocupacion;
    }

    public List<Ocupacion> getLstOcupacion() {
        return lstOcupacion;
    }

    public void setLstOcupacion(List<Ocupacion> lstOcupacion) {
        this.lstOcupacion = lstOcupacion;
    }

    public void listarOcupacion() {
        OcupacionDAO dao;
        try {
            dao = new OcupacionDAO();
            lstOcupacion = dao.listar();
        } catch (Exception e) {
            System.out.println("No se desplego informacion en OcupacionBean " + e);
        }
    }
}
