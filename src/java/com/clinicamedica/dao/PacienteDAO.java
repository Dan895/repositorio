package com.clinicamedica.dao;

import com.clinicamedica.modelos.Paciente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class PacienteDAO extends DAO {

    private PreparedStatement st;

    public void registrar(Paciente pac) throws SQLException {
        try {
            this.Conectar();
            String sql = "INSERT INTO paciente(IdPaciente, Domicilio_IdDomicilio, Persona_IdPersona, contactoEmergencia, telefonoContacto, ocupacion_idOcupacion)"
                    + " value(?,?,?,?,?,?)";
            this.st = this.getCn().prepareStatement(sql);
            st.setInt(1, pac.getIdPaciente());
            st.setInt(2, pac.getIdDomicilio());
            st.setInt(3, pac.getIdPersona());
            st.setString(4, pac.getContactoPersona());
            st.setInt(5, pac.getTelefonoContacto());
            st.setInt(6, pac.getIdOcupacion());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Revisa pacienteDAO");
            System.out.println("No se pudo Insertar en PacienteDAO" + e);
        } finally {
            this.Cerrar();
        }
    }

    public List<Paciente> listar() throws SQLException {
        List<Paciente> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM paciente";
            st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Paciente pac = new Paciente();
                pac.setIdPaciente(rs.getInt("IdPaciente"));
                pac.setIdDomicilio(rs.getInt("Domicilio_IdDomicilio"));
                pac.setIdPersona(rs.getInt("Persona_IdPersona"));
                pac.setContactoPersona(rs.getString("contactoEmergencia"));
                pac.setTelefonoContacto(rs.getInt("telefonoContacto"));
                pac.setIdOcupacion(rs.getInt("ocupacion_idOcupacion"));
                lista.add(pac);
            }
        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en PacienteDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
