/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package panamericanassas;



/**
 *
 * @author prueba 1
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import panamericanassas.model.*;
import panamericanassas.dao.*;

public class PanamericanasSAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        UsuariosDAO usuarioDao = new UsuariosDAO();
        /*Usuarios nuevoUsuario = new Usuarios(24567891,"nose");
        try {
            usuarioDao.insertarUsuario(nuevoUsuario);
            System.out.println("Cliente insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        
       /* try {
        // Buscamos el cliente con ID 1
        Usuarios usuario = usuarioDao.obtenerUsuarios(1);
        if (usuario != null) {
            System.out.println("Usuario encontrado: id: " + usuario.getIdUsuario()+" usuario: "+ usuario.getUsuario()+" contraseña: "+ usuario.getContraseña());
        } else {
            System.out.println("Cliente no encontrado.");
        }
        } catch (SQLException e) {
        e.printStackTrace();
        }*/
        
        /*Usuarios usuarioActualizado = new Usuarios(1, 268101214, "contraseñanueva");

        try {
            usuarioDao.actualizarUsuarios(usuarioActualizado);  
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
        try {
            usuarioDao.eliminarUsuario(5);  // Elimina el cliente con ID 1
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
