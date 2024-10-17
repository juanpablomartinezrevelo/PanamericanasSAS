/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panamericanassas.dao;

/**
 *
 * @author prueba 1
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import panamericanassas.model.Usuarios;
public class UsuariosDAO {
    //metodo para conseguir la conexión con la base de datos
    private Connection getConnection() throws SQLException{
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/panamericanas_sas";

        Connection conexion;
        Statement statement;
        ResultSet rs;
        
        return
        conexion = DriverManager.getConnection(url,usuario,password);
    }

    //metodo para insertar un nuevo cliente 
    public void insertarUsuario(Usuarios usuario) throws SQLException{
        
        String query = "INSERT INTO usuarios (idusuario,usuario,contraseña) VALUES (?,?,?)";
        try (Connection con = getConnection();
               PreparedStatement statement = con.prepareStatement(query)){
                statement.setInt(1, usuario.getIdUsuario());
                statement.setInt(2, usuario.getUsuario());
                statement.setString(3, usuario.getContraseña());
                statement.executeUpdate();
        }
    }
    
    // Método para obtener todos los Usuarios
     public Usuarios obtenerUsuarios(int idUsuario) throws SQLException {
        String query = "SELECT * FROM usuarios WHERE idUsuario = ?";
        Usuarios usuario = null; 
        
        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(query)){
            
            statement.setInt(1,idUsuario);
            
            try (ResultSet rs = statement.executeQuery()) {
                if(rs.next()) {
                    usuario = new Usuarios();
                    usuario.setIdUsuario(rs.getInt("idUsuario"));
                    usuario.setUsuario(rs.getInt("usuario"));
                    usuario.setContraseña(rs.getString("contraseña"));
                }
            }    
        }
        return usuario;
    }
     
    // Método para actualizar usuarios
    public void actualizarUsuarios(Usuarios usuario) throws SQLException {
        String query = "UPDATE usuarios SET usuario = ?, contraseña = ? WHERE idusuario = ?";
        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(query)) {
            statement.setInt(1, usuario.getUsuario());
            statement.setString(2, usuario.getContraseña());
            statement.setInt(3, usuario.getIdUsuario());
            
            int filasActualizadas = statement.executeUpdate();
            
            if (filasActualizadas > 0) {
            System.out.println("Cliente actualizado exitosamente.");
            } else {
            System.out.println("No se encontró el cliente para actualizar.");
            }
        }
    }
    
    // Método para eliminar un usuario por su id
    public void eliminarUsuario(int idusuario) throws SQLException {
        String query = "DELETE FROM usuarios WHERE idusuario = ?";
        try (Connection con = getConnection();
             PreparedStatement statement = con.prepareStatement(query)) {
            statement.setInt(1, idusuario);
            
            int filasEliminadas = statement.executeUpdate();
            if (filasEliminadas > 0) {
                System.out.println("Cliente eliminado exitosamente.");
            } else {
                System.out.println("No se encontró el cliente para eliminar.");
        }
        }
    }
                        
}
