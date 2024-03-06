/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cine;

/**
 *
 * @author julianamantilla
 */
public class boleto {
    
    
    private funcion funcion;
    private silla silla;

    public boleto() {
    }

    public boleto(funcion funcion, silla silla) {
        this.funcion = funcion;
        this.silla = silla;
    }

    public funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(funcion funcion) {
        this.funcion = funcion;
    }

    public silla getSilla() {
        return silla;
    }

    public void setSilla(silla silla) {
        this.silla = silla;
    }

    @Override
    public String toString() {
        return "boleto{" + "funcion=" + funcion + ", silla=" + silla + '}';
    }
    
    
}