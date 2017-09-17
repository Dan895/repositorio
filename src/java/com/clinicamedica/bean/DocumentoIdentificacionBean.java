package com.clinicamedica.bean;

import com.clinicamedica.dao.DocumentoIdentificacionDAO;
import com.clinicamedica.modelos.DocumentoIdentificacion;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 * @author Harvey
 */
@ManagedBean
@ViewScoped
public class DocumentoIdentificacionBean {

    private DocumentoIdentificacion documentos = new DocumentoIdentificacion();
    private List<DocumentoIdentificacion> lstDocumentos;

    public DocumentoIdentificacionBean() {

    }

    public DocumentoIdentificacion getDocumentos() {
        return documentos;
    }

    public void setDocumentos(DocumentoIdentificacion documentos) {
        this.documentos = documentos;
    }

    public List<DocumentoIdentificacion> getLstDocumentos() {
        return lstDocumentos;
    }

    public void setLstDocumentos(List<DocumentoIdentificacion> lstDocumentos) {
        this.lstDocumentos = lstDocumentos;
    }

    public void listarDocumentos() {
        DocumentoIdentificacionDAO dao;
        try {
            dao = new DocumentoIdentificacionDAO();
            lstDocumentos = dao.listar();
        } catch (Exception e) {
            System.out.println("No se desplego informacion en DocumentoIdentificacionBean " + e);
        }
    }
}
