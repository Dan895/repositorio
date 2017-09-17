package com.clinicamedica.modelos;

/**
 * @author Harvey
 */
public class DocumentoIdentificacion {
    private int idDocumento;
    private String tipo;

    public DocumentoIdentificacion() {
        this.idDocumento = 0;
        this.tipo = "";
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
