package com.clinicamedica.dao;

import com.clinicamedica.modelos.HistorialClinico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class HistorialClinicoDAO extends DAO {

    private PreparedStatement st;

    public void registrar(HistorialClinico histo) throws SQLException {
        try {
            this.Conectar();
            String sql = "INSERT INTO historialclinico(idHistorialClinico, Descripcion, Paciente_idPacientee, IdReferenciaClinica, Enfermedad_idEnfermedadd)"
                    + " value(?,?,?,?,?)";
            this.st = this.getCn().prepareStatement(sql);
            st.setInt(1, histo.getIdHistorialClinico());
            st.setString(2, histo.getDescripcion());
            st.setInt(3, histo.getIdPaciente());
            st.setInt(4, histo.getIdReferenciaClinica());
            st.setInt(5, histo.getIdEnfermedad());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Revisa HistorialClinicoDAO");
            System.out.println("No se pudo Insertar en HistorialClinicoDAO" + e);
        } finally {
            this.Cerrar();
        }
    }

    public List<HistorialClinico> listar() throws SQLException {
        List<HistorialClinico> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM historialclinico";
            st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                HistorialClinico histo = new HistorialClinico();
                histo.setIdHistorialClinico(rs.getInt("idHistorialClinico"));
                histo.setDescripcion(rs.getString("Descripcion"));
                histo.setIdPaciente(rs.getInt("Paciente_idPacientee"));
                histo.setIdReferenciaClinica(rs.getInt("IdReferenciaClinica"));
                histo.setIdEnfermedad(rs.getInt("Enfermedad_idEnfermedadd"));
                lista.add(histo);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en HistorialClinicoDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
