/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios1;
import java.util.Scanner;
/**
 *
 * @author julianamantilla
 */
public class eje11 {
    
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int num1;
        int num2;
        int distacia;
        
        System.out.println("ingresa el numero 1:");
        num1 = i.nextInt();
        System.out.println("ingresa el numero 2:");
        num2 = i.nextInt();
        
        distacia=   Math.abs(num1-num2);
        
        System.out.println("la distancia entre ambos es:"+distacia);
        
        
    }
}
    

