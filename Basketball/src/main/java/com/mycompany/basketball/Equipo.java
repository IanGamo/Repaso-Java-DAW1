/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.basketball;

import java.util.ArrayList;

/**
 *
 * @author iancl
 */
public class Equipo {

    String nombre;
    
    
    static ArrayList<Player> jugadores = new ArrayList<>();

    public int comprobarAltos() {
        int contador = 0;
        for (Player j : jugadores) {
            if (j.altura > 180) {
                contador++;
            }
        }
        return contador;
    }

    double size(ArrayList<Player> jugadores) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
