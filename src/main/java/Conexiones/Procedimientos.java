/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexiones;

import java.sql.CallableStatement;
import java.sql.SQLException;

public class Procedimientos {
    public static void ingresoCliente(String a,String b,String c,String d,String e,String f,String g,String h, String i, String j)throws SQLException{
        CallableStatement ingreso = Conexion.getConexion().prepareCall("{call ingresoCliente(?,?,?,?,?,?,?,?,?,?)}");
        ingreso.setString(1, a);
        ingreso.setString(2, b);
        ingreso.setString(3, c);
        ingreso.setString(4, d);
        ingreso.setString(5, e);
        ingreso.setString(6, f);
        ingreso.setString(7, g);
        ingreso.setString(8, h);
        ingreso.setString(9, i);
        ingreso.setString(10, j);
        ingreso.execute();

    }
    
    public static void ingresoEmpresa(String a,String b,String c,String d,String e,String f,String g)throws SQLException{
        CallableStatement empresa = Conexion.getConexion().prepareCall("{call ingresoEmpresa(?,?,?,?,?,?,?)}");
        empresa.setString(1, a);
        empresa.setString(2, b);
        empresa.setString(3, c);
        empresa.setString(4, d);
        empresa.setString(5, e);
        empresa.setString(6, f);
        empresa.setString(7, g);
        empresa.execute();
    }
    
    public static void ingresoMantenimiento(String a,String b,String c,String d,String e,String f,String g,String h)throws SQLException{
        CallableStatement manten = Conexion.getConexion().prepareCall("{call ingresoMantenimiento(?,?,?,?,?,?,?,?)}");
        manten.setString(1, a);
        manten.setString(2, b);
        manten.setString(3, c);
        manten.setString(4, d);
        manten.setString(5, e);
        manten.setString(6, f);
        manten.setString(7, g);
        manten.setString(8, h);
        manten.execute();
    }
    
    public static void ingresoVehiculo(String a,String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p)throws SQLException{
       CallableStatement vehiculo = Conexion.getConexion().prepareCall("{call ingresarVehiculo(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
       vehiculo.setString(1, a);
       vehiculo.setString(2, b);
       vehiculo.setString(3, c);
       vehiculo.setString(4, d);
       vehiculo.setString(5, e);
       vehiculo.setString(6, f);
       vehiculo.setString(7, g);
       vehiculo.setString(8, h);
       vehiculo.setString(9, i);
       vehiculo.setString(10, j);
       vehiculo.setString(11, k);
       vehiculo.setString(12, l);
       vehiculo.setString(13, m);
       vehiculo.setString(14, n);
       vehiculo.setString(15, o);
       vehiculo.setString(16, p);
       vehiculo.execute();
    }
}
