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
public class ejercicio20 {
    
     public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();
            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            System.out.println("Números pares entre " + numero1 + " y " + numero2 + ":");

            for (int i = numero1; i <= numero2; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
    

