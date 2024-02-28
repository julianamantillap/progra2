/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicios2;
 import java.util.Scanner;
/**
 *
 * @author julianamantilla
 */
public class ejercicio10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Tipos de uva: A o B");
        System.out.print("Ingrese el tipo de uva: ");
        char tipo = scanner.next().charAt(0);
        
        System.out.println("Tamaños de uva: 1 o 2");
        System.out.print("Ingrese el tamaño de uva: ");
        int tamaño = scanner.nextInt();
        
        double precioInicial = determinarPrecioInicial(tipo);
        double precioFinal = calcularPrecioFinal(precioInicial, tamaño, tipo);
        
        System.out.println("El precio final por kilo de uva es: " + precioFinal + " euros.");
        
        scanner.close();
    }
    
    public static double determinarPrecioInicial(char tipo) {
        if (tipo == 'A') {
            return 0.80; 
        } else if (tipo == 'B') {
            return 0.70; 
        } else {
            System.out.println("Tipo de uva no válido. Se asume tipo A.");
            return 0.80; 
        }
    }
    
    public static double calcularPrecioFinal(double precioInicial, int tamaño, char tipo) {
        if (tipo == 'A') {
            if (tamaño == 1) {
                return precioInicial + 0.20; 
            } else if (tamaño == 2) {
                return precioInicial + 0.30; 
            }
        } else if (tipo == 'B') {
            if (tamaño == 1) {
                return precioInicial - 0.30; 
            } else if (tamaño == 2) {
                return precioInicial - 0.50; 
            }
        }
        
        
        return precioInicial;
    }
}
        
    

