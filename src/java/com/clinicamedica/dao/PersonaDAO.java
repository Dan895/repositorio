package com.clinicamedica.dao;

import com.clinicamedica.modelos.Persona;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Harvey
 */
public class PersonaDAO extends DAO {

    private PreparedStatement st;
    
    public void registrar(Persona per) throws SQLException {
        try {
            this.Conectar();
            String sql = "INSERT INTO persona(idPersona, Nombre, Apellido, FechaNac, Telefono, CorreoElectronico,"
                    + " Genero_idSexo, EstadoCivil_idEstCivil, IdDocumentoPaciente, NoDocumento,"
                    + " Religion_IdReligion) value(?,?,?,?,?,?,?,?,?,?,?)";
            this.st = this.getCn().prepareStatement(sql);
            st.setInt(1, per.getIdPersona());
            st.setString(2, per.getNombre());
            st.setString(3, per.getApellido());
            st.setString(4, per.getFechaNacimiento());
            st.setString(5, per.getTelefono());
            st.setString(6, per.getCorreoElectronico());
            st.setInt(7, per.getIdGenero());
            st.setInt(8, per.getIdEstadoCivil());
            st.setInt(9, per.getIdDocumentoPaciente());
            st.setString(10, per.getNoDocumento());
            st.setInt(11, per.getIdReligion());
            st.executeUpdate();
        } catch (Exception e) {
            System.out.println("Revisa personaDAO");
            System.out.println("No se pudo Insertar en PersonaDAO" + e);
        } finally {
            this.Cerrar();
        }
    }

    public List<Persona> listar() throws SQLException {
        List<Persona> lista = null;
        ResultSet rs;

        try {
            this.Conectar();
            String sql = "SELECT * FROM persona";
            st = this.getCn().prepareCall(sql);
            rs = st.executeQuery();
            lista = new ArrayList();
            while (rs.next()) {
                Persona per = new Persona();
                per.setIdPersona(rs.getInt("idPersona"));
                per.setNombre(rs.getString("Nombre"));
                per.setApellido(rs.getString("Apellido"));
                per.setFechaNacimiento(rs.getString("FechaNac"));
                per.setCorreoElectronico(rs.getString("CorreoElectronico"));
                per.setIdGenero(rs.getInt("Genero_idSexo"));
                per.setIdEstadoCivil(rs.getInt("EstadoCivil_idEstCivil"));
                per.setIdDocumentoPaciente(rs.getInt("IdDocumentoPaciente"));
                per.setNoDocumento(rs.getString("NoDocumento"));
                per.setIdReligion(rs.getInt("Religion_IdReligion"));
                lista.add(per);
            }

        } catch (Exception e) {
            System.out.println("Error al desplegar informacion en PersonaDAO Listar" + e);
        } finally {
            this.Cerrar();
        }
        return lista;
    }
}
