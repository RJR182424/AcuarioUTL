package edu.utl.dsm501.acuario.control;

import edu.utl.dsm501.acuario.modelo.peces;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ControlPeces {

    public ArrayList selectAll() {
        String query = "SELECT * FROM acuarioutl.peces";
        Conexion con = new Conexion();
        ArrayList<peces> peces = new ArrayList<peces>();
        try {
            con.abrir();
            Connection c = con.getConexion();
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                peces p = new peces();
                p.setIdPeces(rs.getInt("idPeces"));
                p.setNombre(rs.getString("nombre"));
                p.setEspecie(rs.getString("especie"));
                p.setPrecio(rs.getFloat("precio"));
                p.setCalificacion(rs.getFloat("calif"));
                p.setFoto(rs.getString("foto"));
                peces.add(p);
            }
            rs.close();
            stmt.close();
            c.close();
            con.cerrar();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return peces;
    }
}
