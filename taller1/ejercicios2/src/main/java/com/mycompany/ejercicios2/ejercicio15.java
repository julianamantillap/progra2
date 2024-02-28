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
public class ejercicio15 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce un número entre 1 y 12: ");
            int mes = scanner.nextInt();
            
            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("El mes tiene 31 días.");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("El mes tiene 30 días.");
                    break;
                case 2:
                    System.out.println("El mes tiene 28 o 29 días, dependiendo del año.");
                    break;
                default:
                    System.out.println("Número de mes no válido.");
            }
        }
    }
}
    

