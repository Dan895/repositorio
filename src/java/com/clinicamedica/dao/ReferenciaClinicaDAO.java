package com.clinicamedica.dao;

import com.clinicamedica.modelos.ReferenciaClinica;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class ReferenciaClinicaDAO extends DAO {

    private PreparedStatement st;

    public List<ReferenciaClinica> listar() throws SQLException {
        List<ReferenciaClinica> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM referenciaclinica";
            st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                ReferenciaClinica ref = new ReferenciaClinica();
                ref.setIdReferenciaClinica(rs.getInt("IdReferenciaClinica"));
                ref.setNombre(rs.getString("Nombre"));
                lista.add(ref);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en ReferenciaClinicaDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
