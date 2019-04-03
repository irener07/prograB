/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestion;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import prograbases1.Correo;
import prograbases1.Password;

/**
 *
 * @author
 */
public class gestionOperadores {

    private static Connection contacto = null;

    public static Connection getConection() throws SQLException {
        String url = "jdbc:sqlserver://FAMILIA-PICADO\\PROGRA01BD:1433;databaseName=RentaCar";

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            contacto = DriverManager.getConnection(url, "sa", "Abcd1234");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return contacto;
    }

    public static ResultSet consulta(String consulta) throws SQLException {
        Connection con = getConection();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static void ingresoOperador(String correo) throws SQLException {
        CallableStatement ingreso = getConection().prepareCall("{call ingresoOperador(?,?,?)}");
        String contraseña = Password.getPassword();
        String[] parts = correo.split("@");
        String usuario = parts[0];
        ingreso.setString(1, correo);
        ingreso.setString(2, contraseña);
        ingreso.setString(3, usuario);
        ingreso.execute();
        Correo.enviarCorreoOperador(correo, contraseña, usuario);
    }

    public static void verificarUsuarioOperador(String usuario, String contraseña) throws SQLException {
        CallableStatement verifica = getConection().prepareCall("{call verificarUsuarioOperador(?,?)}");
        verifica.setString(1, usuario);
        verifica.setString(2, contraseña);
        verifica.execute();
    }
    
        public static void verificarCorreoOperador(String correo, String contraseña) throws SQLException {
        CallableStatement verifica = getConection().prepareCall("{call verificarCorreoOperador(?,?)}");
        verifica.setString(1, correo);
        verifica.setString(2, contraseña);
        verifica.execute();
    }
}
