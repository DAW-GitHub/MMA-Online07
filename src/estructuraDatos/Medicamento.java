/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuraDatos;

import estructuraDatos.Enumerados.*;

/**
 * Clase para la creación de productos medicamentos
 * @author Ana
 * @version 1.0
 */
public final class Medicamento extends Producto {
    
    private Enumerados.TipoMedicamento medicamento;
    
    private String comoTomar;
    
    private String efectosAdversos;
    
    /**
     * Constructor de la clase Medicamento.
     * @param codigo código del producto
     * @param nombre nombre del producto
     * @param descripcion descripción del producto
     * @param precio precio del producto
     * @param unidades unidades del producto
     * @param medicamento tipo de medicamento
     * @param comoTomar como tomar el medicamento
     * @param efectosAdversos  efectos adversos.
     */
    public Medicamento(String codigo, String nombre, String descripcion, float precio, int unidades, Enumerados.TipoMedicamento medicamento, String comoTomar, String efectosAdversos){
        
        super(codigo, nombre, descripcion, precio, unidades);
        
        this.medicamento = medicamento;
        
        this.comoTomar = comoTomar;
           
        this.efectosAdversos = efectosAdversos;
        
        
    }
    
    /**
     * Metodo para clonar objetos
     * @param a objeto de tipo Medicamento
     */
    public Medicamento(Medicamento a){
        
        super(a.getCodigo(), a.getNombre(), a.getDescripcion(), a.getPrecio(), a.getUnidades());
        
        medicamento = a.getMedicamento();  
        comoTomar = a.getComoTomar();
        efectosAdversos = a.getEfectosAdversos();
        
    }
    
    /**
     * Método para obtener el tipo de medicamento
     * @return tipo de medicamento
     */
    public TipoMedicamento getMedicamento(){

        return this.medicamento;
    }
    
    /**
     * Método para añadir/cambiar el tipo de medicamento
     * @param medicamento tipo de medicamento
     */
    public void setMedicamento(TipoMedicamento medicamento){
        
        this.medicamento = medicamento;
        
    }
    
    /**
     * Método para obtener como tomar el medicamente
     * @return  String con las indicaciones
     */
    public String getComoTomar(){
        return this.comoTomar;
    }
    
    /**
     * Método para añadir/cambiar las instrucciones de uso
     * @param comoTomar instrucciones nuevas
     */
    public void setComoTomar(String comoTomar){
        
        this.comoTomar = comoTomar;
        
    }
    
    /**
     * Método para obtener los efectos adversos
     * @return  efectos adversos
     */
    public String getEfectosAdversos(){
        return this.efectosAdversos;
    }
    
    /**
     * Método para añadir/cambiar efectos adversos
     * @param efectosAdversos efectos adversos nuevos
     */
    public void setEfectosAdversos(String efectosAdversos){
        this.efectosAdversos = efectosAdversos;
    }
    
    /**
     * Método toString del Medicamento
     * @return datos del medicamento
     */
    @Override
    public String toString(){
        return super.toString() + "\nTipo:         " + medicamento + "\nComo tomar:     " + comoTomar + "\nEfectos adversos:" + efectosAdversos + ".";
        
    }
    
}
