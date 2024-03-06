/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SQL;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author valen
 */
public class MetodosSQL {
    
    private Connection conexion;
    private PreparedStatement statement;
    private ResultSet rs;
    
    public boolean registrarUsuario(String nombreuser, String correouser, String telefonouser, String contrasenauser){
      
        boolean registro = false;
        
        try {
            conexion = ConexionBD.conectar();
            String consulta = "INSERT INTO usuarios (nombreuser,correouser,telefonouser,contrasenauser) VALUES (?,?,?,?)";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, nombreuser);
            statement.setString(2, correouser);
            statement.setString(3, telefonouser);
            statement.setString(4, contrasenauser);
            
            int rs = statement.executeUpdate();
            
            if (rs > 0) {
                registro = true; //El usuario se ha registrado
                System.out.println("Se hizo el alta de usuario");
            } else {
                registro = false; //El usuario se ha registrado
                System.out.println("No se hizo el alta de usuario");
            }
            
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error" + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error" + e);
            }
        }
        
        
        System.out.println("Valor del registro "+ registro);
        
        return registro;
    }
    
    public boolean buscarUsuarioRepetido(String correouser){
        boolean usuarioRepetido = false;
        try {
            conexion = ConexionBD.conectar();
            String consulta = "SELECT correouser FROM usuarios WHERE correouser = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, correouser);
            rs = statement.executeQuery();
            
            if(rs.next()){
                usuarioRepetido = true;
            }else{
                usuarioRepetido = false;
            }
            
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }finally{
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error " + e);
            }
        }
        System.out.println("El valor del usuario repetido en el metodo es: " + usuarioRepetido);
        return usuarioRepetido;
    }
    
    public boolean buscarUsuarioInicioSesion(String correouser, String contrasenauser){
        boolean inicioSesion = false;
        
        try {
            conexion = ConexionBD.conectar();
            String consulta = "SELECT correouser, contrasenauser FROM usuarios WHERE correouser = ? AND contrasenauser = ?";
            statement = conexion.prepareStatement(consulta);
            statement.setString(1, correouser);
            statement.setString(2, contrasenauser);
            rs = statement.executeQuery();
            if(rs.next()){
                inicioSesion = true;//El usuario puede iniciar sesion porque esta registrado en la BD
            }else{
                inicioSesion = false;//El usuario no puede iniciar sesion porque esta registrado en la BD
            }
            conexion.close();
            
        } catch (SQLException e) {
            System.out.println("Error " + e);
        }finally{
            try {
                conexion.close();
            } catch (SQLException e) {
                System.out.println("Error " + e);
            }
        }
        
        System.out.println("El valor de InicioSesion en el metodo es: " + inicioSesion);
        return inicioSesion;
    }
}
