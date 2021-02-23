/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utl.dsm501.acuario.control;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class Conexion {
    String userName;
    String password;
    String url;
    Connection conexion;

    public Conexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            userName = "root";
            password = "root"; /*NO OLVIDEN PONER root SI ES QUE TU MySQL TIENE PASSWORD*/
            url = "jdbc:mysql://localhost:3306/acuarioutl";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Connection abrir() throws Exception {
        conexion = DriverManager.getConnection(url, userName, password);
        return conexion;
    }

    public void cerrar() throws Exception {
        try {
            if (conexion != null) {
                conexion.close();
                conexion = null;
            }

        } catch (Exception e) {
        }
    }

    public Connection getConexion(){
        return conexion;
    }
}
