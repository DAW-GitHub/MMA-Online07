/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import estructuraDatos.Enumerados.Categoria;

/**
 * Clase para los productos de parafarmacia
 * @author Ana
 * @version 1.0
 */
public class ParaFarmacia extends Producto{
    
    private Enumerados.Categoria categoria;
    private int dosisUnidades;
    private float descuento;
    
   
    /**
     * Constructor de la clase ParaFarmacia
     * @param codigo codigo del producto
     * @param nombre nombre del producto
     * @param descripcion descripción del producto
     * @param precio precio del producto
     * @param unidades unidades del producto
     * @param categoria categoria del producto
     * @param dosisUnidad dosis por unidad del producto
     * @param descuento  descuento aplicado
     */
    public ParaFarmacia(String codigo, String nombre, String descripcion, float precio,int unidades, Enumerados.Categoria categoria, int dosisUnidad, float descuento){
        
        super(codigo, nombre, descripcion, precio, unidades);
        
        this.descuento = descuento;
        
        this.dosisUnidades = dosisUnidades;
        
        this.categoria = categoria;
        
    }
    
    /**
     * Método para clonar productos de parafarmacia
     * @param a objeto de ParaFarmacia
     */
    public ParaFarmacia(ParaFarmacia a){
        
        super(a.getCodigo(), a.getNombre(), a.getDescripcion(), a.getPrecio(), a.getUnidades());
        
        this.descuento = a.getDescuento();
        
        this.dosisUnidades = a.getDosisUnidades();
        
        this.categoria = a.getCategoria();
    }
    
    /**
     * Método para obtener la caegoria del producto
     * @return categoría
     */
    public Categoria getCategoria(){
        return categoria;
    }
    
    /**
     * Método para cambiar/añadir la caegoria del producto
     * @param categoria categoría
     */
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;   
    }
    
    /**
     * Método para obtener las dosis por unidad
     * @return dosis por unidad
     */
    public int getDosisUnidades(){
  
        return dosisUnidades;
    }
    
    /**
     * Método para cambiar/añadir dosis por unidad
     * @param dosisUnidades dosis por unidad
     */
    public void setDosisUnidades(int dosisUnidades){
        this.dosisUnidades = dosisUnidades;
    }
    
    /**
     * Método para obtener el descuento
     * @return descuento (%)
     */
    public float getDescuento(){
        return descuento;
    }
    
    /**
     * Método para añadir/cambiar descuento
     * @param descuento descuento (%)
     */
    public void setDescuento(float descuento){
        this.descuento = descuento;
    }
    
    @Override
    public String toString(){
    
        return super.toString() + "\nCategoría:   " + categoria + "\nDosis por unidad:      " + dosisUnidades + "\nDescuento:  " + descuento + "%.";
        
    }
    
}
