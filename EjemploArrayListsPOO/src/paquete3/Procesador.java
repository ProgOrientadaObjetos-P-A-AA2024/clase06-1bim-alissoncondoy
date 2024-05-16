/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Procesador {
    private String marca;
    private double costo;
    
    public Procesador(String m, double c){
        marca = m;
        costo =c;   
    }
    
    public void establecerMarca(String x){
        marca = x;
    }
    
    public void establecerCosto(double x){
        costo = x;
    }
    
    public String obtenerMarca(){
        return marca;
    }
    
    public double obtenerCosto(){
        return costo;
    }
}
