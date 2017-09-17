package com.clinicamedica.bean;

import com.clinicamedica.dao.GeneroDAO;
import com.clinicamedica.modelos.Genero;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class GeneroBean {

    private Genero genero = new Genero();
    private List<Genero> lstGenero;
    
    public GeneroBean(){
    
    }
    
    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Genero> getLstGenero() {
        return lstGenero;
    }

    public void setLstGenero(List<Genero> lstGenero) {
        this.lstGenero = lstGenero;
    }
    
    public void listarGenero() {
        GeneroDAO dao;
        try {
            dao = new GeneroDAO();
            lstGenero = dao.listar();
        } catch (Exception e) {
            System.out.println("No se desplego informacion en GeneroBean " + e);
        }
    }
}
