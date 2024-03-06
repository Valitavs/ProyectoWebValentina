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
public class ConexionBD {
    
        
        private static String usuario = "root";
        private static String password = "";
        private static String url = "jdbc:mysql://localhost:3306/inicio_sesion";
        
//        private static Statement statement;
//        private static ResultSet rs;
//        private static Connection conexion;
        
        public static Connection conectar(){
            Connection conexion = null;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                conexion = DriverManager.getConnection(url,usuario,password);
            } catch (SQLException ex) {
                Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            }
            return conexion;
        }
        
//        public static void main(String [] args){
//            try {
//                conexion = conectar();
//                String consulta = "INSERT INTO usuarios (nombreuser,correouser,telefonouser,contrasenauser) VALUES ('Valentina','ntina@gmail,com','7151536','12345')";
//                statement = conexion.createStatement();
//                statement.executeUpdate(consulta);
//                
//                rs = statement.executeQuery("SELECT * FROM usuarios");
//                rs.next();
//                do{
//                    System.out.println(rs.getInt("iduser") + rs.getString("nombreuser"));
//                }while(rs.next());
//            } catch (SQLException e) {
//                
//            }
//        }
        

}

