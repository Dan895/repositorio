package com.clinicamedica.dao;

import com.clinicamedica.modelos.Enfermedad;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class EnfermedadDAO extends DAO{
    public List<Enfermedad> listar() throws SQLException {
        List<Enfermedad> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM enfermedad";
            PreparedStatement st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Enfermedad enfer = new Enfermedad();
                enfer.setIdEnfermedad(rs.getInt("IdEnfermedad"));
                enfer.setNombre(rs.getString("Nombre"));
                enfer.setIdCategoriaEnfermedad(rs.getInt("CategoriaEnfermedad_IdCategoriaE"));
                lista.add(enfer);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en EnfermedadDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
