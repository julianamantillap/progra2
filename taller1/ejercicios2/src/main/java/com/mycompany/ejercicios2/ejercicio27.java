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
public class ejercicio27 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];

            // Leer números
            for (int i = 0; i < 10; i++) {
                System.out.print("Ingrese el número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            // Mostrar en orden inverso
            System.out.println("Números en orden inverso:");
            for (int i = 9; i >= 0; i--) {
                System.out.print(numeros[i] + " ");
            }
        }
    }
}
    

