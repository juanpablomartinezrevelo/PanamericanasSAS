/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panamericanassas.model;

/**
 *
 * @author prueba 1
 */
public class Usuarios {
  private int  idUsuario;
  private int usuario;
  private String contraseña;
  
  public Usuarios (){}
  
  public Usuarios(int idUsuario, int usuario, String contraseña){
      this.idUsuario = idUsuario;
      this.usuario = usuario;
      this.contraseña = contraseña;
      
  }
  
  public int getIdUsuario(){
      return idUsuario;
  }
  public void setIdUsuario(int idUsuario){
      this.idUsuario = idUsuario;
  }
  
  public int getUsuario(){
      return usuario;
  }

    public void setUsuario(int usuario){
      this.usuario = usuario;
  }
    
  public String getContraseña(){
      return contraseña;
  }
  public void setContraseña(String contraseña){
      this.contraseña = contraseña;
  }
    
}


