package com.clinicamedica.dao;

import com.clinicamedica.modelos.Genero;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class GeneroDAO extends DAO{
    public List<Genero> listar() throws SQLException {
        List<Genero> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM genero";
            PreparedStatement st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Genero ger = new Genero();
                ger.setIdSexo(rs.getInt("idSexo"));
                ger.setNombre(rs.getString("nombre"));
                lista.add(ger);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en GeneroDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
