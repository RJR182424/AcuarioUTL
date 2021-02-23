/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utl.dsm501.acuario.control;

import edu.utl.dsm501.acuario.modelo.*;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Pruebas {

    public static void main(String[] args) throws Exception {
        Conexion objC = new Conexion();
        try {

            objC.abrir();
            System.out.println("Si se conecto bro UwU");
        } catch (Exception e) {
            System.out.println("No se conecto bro UnU " + e.toString());
        } finally {
            objC.cerrar();
        }
//        //call insetar_prestamo(@var_idPrestamo,1,'01/05/2020 09:10:03','08/05/2020 09:10:03','Este libro fue prestado a la srta. Paula López');
//        ControlPrestamo cp = new ControlPrestamo();
//        Prestamo p = new Prestamo();
//        Afiliado a = new Afiliado();
//        a.setIdAfiliado(1);
//        p.setAfiliado(a);
//        p.setFechaHoraIniAsString("01/05/2020 09:10:03");
//        p.setFechaHoraFinAsString("08/05/2020 09:10:03");
//        p.setObservaciones("ROBERTO ES PUTOOOOO");
//        cp.insert(p);
//        Prestamo p = new Prestamo();
//        a.setIdAfiliado(idAfiliado);
//        p.setFechaHoraIniAsString(fechaIni);
//        p.setFechaHoraFinAsString(fechaFin);
//        p.setObservaciones(Observaciones);
//        cp.insert(p);
//        ArrayList<Prestamo> l = cp.selectAll();
//
//        for (int i = 0; i < l.size(); i++) {
//            System.out.println(l.get(i).toString());
//
//        }
    }
}
