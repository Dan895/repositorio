package com.clinicamedica.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Harvey
 */
public class DAO {

    private String server;
    private String user;
    private String pass;
    private Connection cn;
    
    public DAO() {
        server = "jdbc:mysql://localhost/clinicamedica";
        user = "root";
        pass = "";
    }

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public void Conectar() throws SQLException  {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(server,user,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se conecto a la base de datos en el DAO" + ex);
        }
    }

    public void Cerrar() throws SQLException {
        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (Exception e) {
            System.out.println("No se desconecto de la base de datos en el DAO");
        }
    }
}
