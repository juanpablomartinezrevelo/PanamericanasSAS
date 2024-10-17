/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package panamericanassas.model;

/**
 *
 * @author prueba 1
 */
public class Empleado {
    private int idEmpleado;
    private int cedula;
    private String nombre;
    private String apellido;
    private String cargo;
    private Usuarios usuario;
    private Usuarios contraseña;
    
    public Empleado(){};
    
    public Empleado (int idEmpleado, int cedula, String nombre, String apellido, String cargo){
       this.idEmpleado = idEmpleado;
       this.cedula = cedula;
       this.nombre = nombre;
       this.apellido = apellido;
       this.cargo = cargo;
    }
    
    public int getIdEmpleado(){
        return idEmpleado;
    }
    
    public void setIdEmpleado(int idEmpleado){
        this.idEmpleado = idEmpleado;
    }
    
    public int getCedula(){
        return cedula;
    }
    
    public void setCedula(int cedula){
        this.cedula = cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    
    public Usuarios getUsuario(){
        return usuario;
    }
    
    public void setUsuario(Usuarios usuario){
        this.usuario = usuario;
    }
    
    public Usuarios getContraseña(){
        return contraseña;
    }
    
    public void setContraseña(Usuarios contraseña){
        this.contraseña = contraseña;
    }
}
