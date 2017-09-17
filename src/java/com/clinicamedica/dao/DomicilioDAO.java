package com.clinicamedica.dao;

import com.clinicamedica.modelos.Domicilio;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class DomicilioDAO extends DAO {

    private PreparedStatement st;
    public List<Domicilio> listar() throws SQLException {
        List<Domicilio> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM domicilio";
            this.st = this.getCn().prepareCall(sql);
            rs = this.st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Domicilio dom = new Domicilio();
                dom.setIdDomicilio(rs.getInt("IdDomicilio"));
                dom.setIdMunicipio(rs.getInt("Municipio_IdMunicipioo"));
                dom.setDetalleAreaVivienda(rs.getString("DetalleAreaViviendaa"));
                dom.setDescripcion(rs.getString("Descripcion"));
                dom.setIdArea(rs.getInt("idArea"));
                lista.add(dom);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en DomicilioDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
