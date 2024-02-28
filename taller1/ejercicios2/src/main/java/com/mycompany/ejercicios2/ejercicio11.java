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
public class ejercicio11 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el número de alumnos que participarán en el viaje: ");
        int numAlumnos = scanner.nextInt();
        
        double costoPorAlumno = determinarCostoPorAlumno(numAlumnos);
        double costoTotal = calcularCostoTotal(numAlumnos, costoPorAlumno);
        
        System.out.println("El costo por alumno es de: " + costoPorAlumno + " euros.");
        System.out.println("El costo total para la compañía de autobuses es de: " + costoTotal + " euros.");
        
        scanner.close();
    }
    
    public static double determinarCostoPorAlumno(int numAlumnos) {
        if (numAlumnos >= 100) {
            return 65.0; 
        } else if (numAlumnos >= 50 && numAlumnos <= 99) {
            return 70.0; 
        } else if (numAlumnos >= 30 && numAlumnos <= 49) {
            return 95.0; 
        } else {
            return 4000.0 / numAlumnos; 
        }
    }
    
    public static double calcularCostoTotal(int numAlumnos, double costoPorAlumno) {
        return numAlumnos * costoPorAlumno;
    }
}
    

