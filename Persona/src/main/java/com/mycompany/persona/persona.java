/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persona;

import java.util.Random;

/**
 *
 * @author julianamantilla
 */
public class persona {
    
    private String nombre;
    private int edad;
    private String cedula;
    private char sexo;
    private double peso;
    private double altura;

   
    private static final char sexoDefecto = 'H';
    private static final int pesoBajo = -1;
    private static final int pesoNormal = 0;
    private static final int pesoAlto = 1;

    public persona() {
    }
    

    public persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public persona(String nombre, int edad, String cedula, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    persona(String juan, int i, char c, double d, double d0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int calcularIMC(){
        double imc = peso / Math.pow(altura,2);
        
        if (imc < 20){
            return pesoBajo;
        }else if (imc >= 20 && imc <= 25){
            return pesoNormal;
        }else{
            return pesoAlto;
        }
    }
    
    public boolean esMayorEdad() {
        return edad >= 18;
    }
    
    public char comprobarSexo (char sexo){
        return (sexo == 'H' || sexo == 'M') ? sexo : sexoDefecto;
    }
    
    public void generaCedula(){
        Random rand = new Random();
        StringBuilder cedulaGenerada = new StringBuilder();
        for (int i = 0; i < 10; i++){
        cedulaGenerada.append(rand.nextInt(10));
     }
        cedula = cedulaGenerada.toString();
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
    

