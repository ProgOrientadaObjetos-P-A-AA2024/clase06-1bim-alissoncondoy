/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author utpl
 */
public class Ejecutor {
<<<<<<< HEAD
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         
        
=======

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Computador> computador = new ArrayList<>();

        System.out.println("Cuantas computadoras desea comprar: ");
        int compra = entrada.nextInt();

        for (int i = 0; i < compra; i++) {
            System.out.println("Ingrese la marca del computador: ");
            String marcaC = entrada.next(); 
            System.out.println("Ingrese la marca del procesador: ");
            String marcaProcesador = entrada.next();
            System.out.println("Ingrese el costo del procesador: ");
            double costoPro = entrada.nextDouble();
            System.out.println("Ingrese la marca de la memoria: ");
            String marcaMemoria = entrada.next();
            System.out.println("Ingrese el costo de la memoria: ");
            double costoMem = entrada.nextDouble();
            
            Memoria mem = new Memoria(marcaMemoria, costoMem); 
            Procesador pro1 = new Procesador(marcaProcesador, costoPro); 
            Computador lapto = new Computador(marcaC, pro1, mem); 
            lapto.calcularCostoComputador();

            computador.add(lapto);
        }
        
        Venta ventas = new Venta();
        ventas.establecerComputadoras(computador); 
        ventas.calcularValorVenta(); 
        
        System.out.printf("%s\n", ventas);
>>>>>>> 91663d1debb5ef895f624c07c16bf9f17254def7
        
    }
}