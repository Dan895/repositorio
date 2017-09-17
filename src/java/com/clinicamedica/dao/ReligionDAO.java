package com.clinicamedica.dao;

import com.clinicamedica.modelos.Religion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class ReligionDAO extends DAO {

    public List<Religion> listar() throws SQLException {
        List<Religion> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM religion";
            PreparedStatement st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Religion rel = new Religion();
                rel.setIdReligion(rs.getInt("idReligion"));
                rel.setNombre(rs.getString("Nombre"));
                lista.add(rel);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en ReligionDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }

}
