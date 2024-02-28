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
public class ejercicio19 {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese caracteres. Presione espacio para salir.");

            while (true) {
                System.out.print("Ingrese un caracter: ");
                char caracter = scanner.next().charAt(0);

                if (caracter == ' ') {
                    break;
                }

                if (esVocal(caracter)) {
                    System.out.println("VOCAL");
                } else {
                    System.out.println("NO VOCAL");
                }
            }
        }
    }

    public static boolean esVocal(char caracter) {
        caracter = Character.toUpperCase(caracter); // Convertir a mayúscula para simplificar la comparación

        return caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U';
    }
}
    

