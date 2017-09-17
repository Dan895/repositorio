package com.clinicamedica.dao;

import com.clinicamedica.modelos.DocumentoIdentificacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class DocumentoIdentificacionDAO extends DAO{
     public List<DocumentoIdentificacion> listar() throws SQLException {
        List<DocumentoIdentificacion> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM documentoidentificacion";
            PreparedStatement st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                DocumentoIdentificacion documentos = new DocumentoIdentificacion();
                documentos.setIdDocumento(rs.getInt("IdDocumento"));
                documentos.setTipo(rs.getString("Nombre"));
                lista.add(documentos);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en DocumentoIdentificacionDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
