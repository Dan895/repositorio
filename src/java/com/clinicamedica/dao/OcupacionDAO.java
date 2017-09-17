package com.clinicamedica.dao;

import com.clinicamedica.modelos.Ocupacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class OcupacionDAO extends DAO {

    public List<Ocupacion> listar() throws SQLException {
        List<Ocupacion> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM ocupacion";
            PreparedStatement st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Ocupacion ocu = new Ocupacion();
                ocu.setIdOcupacion(rs.getInt("IdOcupacion"));
                ocu.setNombre(rs.getString("Nombre"));
                lista.add(ocu);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en OcupacionDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
