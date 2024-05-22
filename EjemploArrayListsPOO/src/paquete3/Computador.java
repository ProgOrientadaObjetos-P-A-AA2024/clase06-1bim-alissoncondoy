/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;
   
    public Computador(String m, Procesador p, Memoria a){
        marca = m;
        procesador = p;
        memoria = a;
    }
   
   public void establecerMarca(String x){
       marca = x;
    }
   
    public void establecerProcesador(Procesador x){
       procesador = x;
    }
   
    public void establecerMemoria(Memoria x){
       memoria = x;
    }
   
    public void calcularCostoComputador(){
       costoComputador = memoria.obtenerCosto() + procesador.obtenerCosto();
    }
   
    public String obtenerMarca(){
        return marca;
    }
    
    public Procesador obtenerProcesador(){
        return procesador;
    }
    
    public Memoria obtenerMemoria(){
        return memoria;
    }
    
    public double obtenerCostoComputador(){
        return costoComputador;
    }
    
    public String toString(){
        String cadena = String.format("%s\n")
    }
}
