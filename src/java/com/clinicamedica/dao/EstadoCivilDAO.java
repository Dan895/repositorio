package com.clinicamedica.dao;

import com.clinicamedica.modelos.EstadoCivil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class EstadoCivilDAO extends DAO {

    public List<EstadoCivil> listar() throws SQLException {
        List<EstadoCivil> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM estadocivil";
            PreparedStatement st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                EstadoCivil estcil = new EstadoCivil();
                estcil.setIdEstadoCivil(rs.getInt("idEstCivil"));
                estcil.setNombre(rs.getString("nombre"));
                lista.add(estcil);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en EstadoCivilDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }

}
