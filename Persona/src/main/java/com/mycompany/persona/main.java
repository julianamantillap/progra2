/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.persona;

/**
 *
 * @author julianamantilla
 */
public class main {

    public static void main(String[] args) {
       
        persona persona1 = new persona("Juliana", 20, 'M', 50, 1.56);
        persona1.generaCedula();

        System.out.println("Información de la persona 1:");
        System.out.println(persona1);
        System.out.println("IMC de la persona 1: " + interpretarIMC(persona1.calcularIMC()));
        System.out.println("Es mayor de edad? " + persona1.esMayorEdad());

        persona persona2 = new persona("Gerardo", 19, 'M');
        persona2.setPeso(70);
        persona2.setAltura(1.89);
        persona2.generaCedula();

        System.out.println("Información de la persona 2:");
        System.out.println(persona2);
        System.out.println("IMC de la persona 2: " + interpretarIMC(persona2.calcularIMC()));
        System.out.println("Es mayor de edad? " + persona2.esMayorEdad());

       
        System.out.println("sexo de la persona 2: " + persona2.getSexo());
        System.out.println("Sexo de la persona 1: " + persona1.getSexo());
    }

    public static String interpretarIMC(int imc) {
        switch (imc) {
            case -1:
                return "Por debajo de su peso ideal.";
            case 0:
                return "En su peso ideal.";
            case 1:
                return "Con sobrepeso.";
            default:
                return "Error al calcular el IMC.";
        }
    }
}
    

