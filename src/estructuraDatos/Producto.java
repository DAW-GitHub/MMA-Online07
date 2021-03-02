/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import utilidades.Color;
import utilidades.IO_ES;
import utilidades.ValidarDatos;

/**
 * Clase para los productos
 * @author Ana
 */
public abstract class Producto { 
    
    // ATRIBUTOS
    private String codigo;
    
    private String nombre;
    
    private String descripcion;
    
    private float precio;
    
    private int unidades;
    
    /**
     * Constructor de la clase Productos.
     * @param codigo  código del producto.
     * @param nombre nombre del producto.
     * @param descripcion descripción del producto.
     * @param precio precio del producto.
     * @param unidades stockage del producto.
     */
    public Producto(String codigo, String nombre, String descripcion, float precio, int unidades){
        
        if(comprobarCodigo(codigo)){
            
            this.codigo = codigo;
   
        }else{
            
            this.codigo = "X";
    
        }// fin del if-else
        
        this.nombre = nombre;
            
        this.descripcion = descripcion;
            
        if(precio < 0){
            this.precio = 0;
            
        }else this.precio = precio;
          
        if(unidades < 0){
            
            this.unidades = 0;
            
        } else this.unidades = unidades;
        
    }// fin del constructor Producto(String codigo, String nombre, String descripcion, float precio, int unidades).
    
    
    /**        MÉTODOS GETTERS          */
    
    /**
     * Método de obtención el código del producto.
     * @return codigo String código del producto.
     */
    public String getCodigo( ){
        
    return this.codigo;
    
    }// fin del método getcodigo().
    
    /**
     * Método de obtención del nombre del producto.
     * @return nombre String con nombre del producto.
     */
    public String getNombre( ){
        
    return this.nombre;
    
    }// fin del método getNombre().
    
    /**
     * Método de obtención de la descripcion del producto
     * @return descripción String con la descripción del producto.
     */
    public String getDescripcion( ){
        
    return this.descripcion;
    
    }// fin del método getDescripcion().
    
    /**
     * Método de obtención del precio del producto
     * @return precio String con el precio del producto.
     */
    public float getPrecio( ){
        
    return this.precio;
    
    }// fin del método getPrecio().
    
    /**
     * Método de obtención del stockage del producto
     * @return descripción String con las unidades del producto.
     */
    public int getUnidades( ){
        
    return this.unidades;
    
    }// fin del método getTelefono().
    
    
    /**     MÉTODOS SETTERS      */
     
    /**
     * Método para cambiar el valor del código del producto
     * @param codigo código nuevo del producto
     */
    public void setCodigo(String codigo){
  
     if(comprobarCodigo(codigo)){
      
         this.codigo = codigo;
      
        }else{

            this.codigo = "X";
 
        }// fin del else


    }// fin del método setCodigo().
    
    /**
     * Método para cambiar el valor del nombre del producto
     * @param nombre nombre nuevo del producto
     */
    public void setNombre(String nombre){
         
        this.nombre = nombre;
        
    }// fin del método setNombre().
    
    /**
     * Método para cambiar el valor de la descripción del producto
     * @param descripcion descripción nueva del producto 
     */
    public void setDescripcion(String descripcion){

        this.descripcion = descripcion;

    }// fin del método setDescripcion().
    
    /**
     * Método para cambiar el valor del precio del producto
     * @param precio precio nuevo del producto
     */
    public void setPrecio(float precio){
           
        if(precio > 0) this.precio = precio;
        
    }// fin del método setPrecio(). 
    
    /**
     * Método para cambiar el valor del stockage del producto
     * @param unidades unidades nuevas del producto
     */
    public void setUnidades(int unidades){

        if(precio > 0) this.unidades = unidades;
     
    }// fin del método setUnidades(). 
    

    // **          OTROS MÉTODOS        */
    
    /**
     * Método para comprobar que el código del producto cumple con una estructura
     * @param valor valor del código a comprobar.
     * @return  true | false .
     */
    public static boolean comprobarCodigo(String valor){
        
        boolean verif = false;
        
        String regex = "[0-9]{13}";
        // comprobación del código de barras.
        
	Pattern patron = Pattern.compile(regex);
        
        Matcher codigo = patron.matcher(valor);
        
        if(codigo.find()){
            
            verif = true;
            
        }
        
        
             
        return verif; 
        
        
    }
    
    /**
     * Método que nos permite añadir una cantidad de unidades a las unidades ya almacenadas.
     * @param valor cantidad de unidades a añadir.
     * @return true | false si añade no
     */
    public boolean anadirUnidades(int valor){
        
        boolean correcto = false;
        
        
        if(valor > 0){
            
            unidades = unidades + valor;
            
            correcto = true;
               
        }
        
        return correcto;
    }//fin del método anadirUnidades(int valor)
    
    /**
     * Método que nos permite quitar una cantidad de unidades a las unidades ya almacenadas.
     * @param valor cantidad de unidades a quitar.
     * @return true | false
     */
    public boolean quitarUnidades(int valor){
        
        boolean correcto = false;
        
        if(unidades > valor){
            
            unidades = unidades - valor;
            
            correcto = true;
            
        }
        
        return correcto;
        
    }//fin del método quitarUnidades(int valor)
    
    //MENÚ
    
    /**
     * Método para la creación de una representación mediante un String de un objeto utilizando su contenido.
     * @return String con el contenido del objeto.
     */
    @Override
    public String toString(){
        
        return "Identificador: " + codigo + "\nNombre:         " + nombre + "\nDescripición:   " + descripcion + "\nPrecio:         " + precio + "€\nUnidades:       " + unidades;
        
        
    } //fin del método toString().
    
}//Fin de la clase Producto.
    

