package com.clinicamedica.bean;

import com.clinicamedica.dao.HistorialClinicoDAO;
import com.clinicamedica.modelos.HistorialClinico;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class HistorialClinicoBean {

    private HistorialClinico historial = new HistorialClinico();
    private List<HistorialClinico> lsthistorial;

    public HistorialClinicoBean() {
    }

    public HistorialClinico getHistorial() {
        return historial;
    }

    public void setHistorial(HistorialClinico historial) {
        this.historial = historial;
    }

    public List<HistorialClinico> getLsthistorial() {
        return lsthistorial;
    }

    public void setLsthistorial(List<HistorialClinico> lsthistorial) {
        this.lsthistorial = lsthistorial;
    }

    public void registrar() {
        HistorialClinicoDAO dao;

        try {
            dao = new HistorialClinicoDAO();
            dao.registrar(historial);
        } catch (Exception e) {
            System.out.println("No se registro en HistorialClinicoBean" + e);
        }
    }

    public void listarHistorialClinico() {
        HistorialClinicoDAO dao;

        try {
            dao = new HistorialClinicoDAO();
            lsthistorial = dao.listar();
        } catch (Exception e) {
            System.out.println("No de desplego informacion en HistorialClinicoBean" + e);
        }
    }
}
