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
public class ejercicio6 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la nota: ");
        double nota = scanner.nextDouble();
        
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        
        System.out.print("Ingrese el sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        
        String resultado = calcularAceptacion(nota, edad, sexo);
        
        System.out.println("El resultado de la solicitud es: " + resultado);
        
        scanner.close();
    }
    
    public static String calcularAceptacion(double nota, int edad, char sexo) {
        if (nota >= 5 && edad >= 18) {
            if (sexo == 'M') {
                return "POSIBLE";
            } else if (sexo == 'F') {
                return "ACEPTADA";
            }
        }
        return "NO ACEPTADA";
    }
}
    

