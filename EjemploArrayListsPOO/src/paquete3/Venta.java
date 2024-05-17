/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {

    private double valorVenta;
    private ArrayList<Computador> computadoras;

    public void calcularValorVenta() {
        valorVenta = 0; 
        for (int i = 0; i < computadoras.size(); i++) {
            valorVenta += computadoras.get(i).obtenerCostoComputador();
        }
    }

    public void establecerComputadoras(ArrayList<Computador> a) {
        computadoras = a;
    }
    
    public double obtenerValorVenta(){
        return valorVenta;
    }
    
    public ArrayList<Computador> obtenerComputadoras(){
        return computadoras;
    }
    
    public String toString(){
        String cadena = "\nREPORTE DE COMPRA\n";
            for (int i = 0; i < computadoras.size(); i++) {
                cadena = String.format("%s\nComputadora\n"
                    + "Marca de la computadora: %s\n"
                    + "Marca del procesador: %s\n"
                    + "Costo del procesador: %.2f\n"
                    + "Marca de la memoria: %s\n"
                    + "Costo de la memoria: %.2f\n"
                    + "Costo de la computadora: %.2f\n", 
                    cadena, 
                    computadoras.get(i).obtenerMarca(),
                    computadoras.get(i).obtenerProcesador().obtenerMarca(),
                    computadoras.get(i).obtenerProcesador().obtenerCosto(),
                    computadoras.get(i).obtenerMemoria().obtenerMarca(),
                    computadoras.get(i).obtenerMemoria().obtenerCosto(),
                    computadoras.get(i).obtenerCostoComputador());     
            }
            cadena = String.format("%s\nCosto de la venta total: %.2f\n",
                    cadena, 
                    obtenerValorVenta());
        return cadena;
    }
}
