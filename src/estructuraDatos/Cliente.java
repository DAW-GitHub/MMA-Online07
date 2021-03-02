/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import utilidades.Color;
import utilidades.IO_ES;
import utilidades.ValidarDatos;

/**
 * Clase para la gestion de clientes
 * @author Ana
 * @version 1.0
 */
public class Cliente {
    
    //ATRIBUTOS
    
    private String id;
    
    private String nombre;
    
    private String direccion;
    
    private String telefono;
    
    private boolean baja;
    
    /**
     * Constructor de la clase Cliente
     * @param id dni
     * @param nombre nombre
     * @param direccion direccion
     * @param telefono  teléfono
     */
    public Cliente(String id, String nombre, String direccion, String telefono){
        
    this.id = id;
            
    this.nombre = nombre;
            
    this.direccion = direccion;
            
    this.telefono = telefono;
            
    this.baja = false;
            
  
    }
    
    //MÉTODOS GETTERS
    
    /**
     * Método para la obtención del NIF del cliente. 
     * @return String NIFdel cliente.
     */
    public String getId( ){
        
    return this.id;
    
    }// fin del método getId().
    
    /**
     * Método para la obtención del nombre del cliente.
     * @return String nombre del cliente.
     */
    public String getNombre( ){
        
    return this.nombre;
    
    }// fin del método getNombre().
    
    /**
     * Método para la obtención dela direccióndel cliente.
     * @return String dirección del cliente.
     */
    public String getDireccion( ){
        
    return this.direccion;
    
    }// fin del método getDireccion().
    
    /**
     * Método para la obtención del telefono del cliente.
     * @return String teléfono del cliente.
     */
    public String getTelefono( ){
        
    return this.telefono;
    
    }// fin del método getTelefono().
    
    /**
     * Método para la obtención del estado del cliente..
     * @return boolean baja del cliente.
     */
    public boolean getBaja(){
        return this.baja;
    }// fin del método getBaja().
    
    //MÉTODOS SETTERS
    
    /**
     *  Método para cambiar el valor del NIF del cliente
     * @param id NIF nuevo del cliente
     */
    public void setId(String id){

            this.id = id;
        
    }// fin del método setId().
    
    /**
     * Método para cambiar el valor del nombre del cliente
     * @param nombre nombre nuevo del cliente
     */
    public void setNombre(String nombre){
  
    this.nombre = nombre;
    
    }// fin del método setNombre().
    
    /**
     * Método para cambiar el valor de la dirección del cliente
     * @param direccion direccion nuevo del cliente
     */
    public void setDireccion(String direccion){

    this.direccion = direccion;

    }// fin del método setDireccion().
    
    /**
     * Método para cambiar el valor del teléfono del cliente
     * @param telefono teléfono nuevo del cliente
     */
    public void setTelefono(String telefono){
    
            this.nombre = nombre;
  
    }// fin del método setTelefono().
    
    /**
     * Método para cambiar el valor del NIF del cliente
     * @param baja estado de baja nuevo del cliente
     */
    public void setBaja(boolean baja){
        
        this.baja = baja;
    }// fin del método setBaja(boolean baja).
    
    /**
     *
     */
    @Override
    public String toString(){

        return "Identificador: " + id + "\nNombre:        " + nombre + "\nDirección:     " + direccion + "\nTeléfono:      " + telefono;
        
        
        
    } //fin del método toString()
}
