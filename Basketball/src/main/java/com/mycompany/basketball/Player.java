/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basketball;

/**
 *
 * @author iancl
 */
public class Player {
    double altura;
    String nombre;
    String posicion;
    int nivel = (int)(Math.random() * 101); // agregar numero de mas por que Math.random() no incluye 1.0 (de 0 al 9)
    

    public Player(double altura, String nombre, String posicion) {
        this.altura = altura;
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosition(String posicion) {
        this.posicion = posicion;
    }
    
    
    
    
    
    boolean encestar(Balon balon){
        if (Math.random() < 0.5){               // Era para hacer la probabilidad de 50%
            System.out.println("Choff");
            return true;
        } else {
            System.out.println("Fallaste...");
            return false;
        }
    }
    
    
    boolean taponar(Balon balon){
        if (Math.random() < 0.5){               // Era para hacer la probabilidad de 50%
            System.out.println("TAPOOOON");
            return true;
        } else {
            System.out.println("Casi");
            return false;
        }
    }

    
    
    
    
    
    
    
    
}
