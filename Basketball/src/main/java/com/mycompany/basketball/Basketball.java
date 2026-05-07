/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.basketball;

import java.util.ArrayList;

/**
 *
 * @author iancl
 */
public class Basketball {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // CREACION JUGADORES
        Player jug1 = new Player(175.00, "Gorka", "Alero");
        Player jug2 = new Player(180.00, "Ian", "Ala-Pivot");
        Player jug3 = new Player(190.00, "Ignacio", "Pivot");
        Player jug4 = new Player(172.00, "Iker", "Escolta");
        Player jug5 = new Player(170.00, "Paul", "Base");
        Player jug6 = new Player(171.00, "Grefuso", "Base");
        Player jug7 = new Player(168.00, "Adrian", "Escolta");
        Player jug8 = new Player(175.50, "Pau", "Alero");
        Player jug9 = new Player(187.00, "Pep", "Ala-Pivot");
        Player jug10 = new Player(201.00, "Joan", "Pivot");

        // CREACION BALONES
        Balon balon = new Balon(6, "Spalding");
        Balon balon1 = new Balon(7, "Molten");

        // AMBOS JUGADORES TIRAN
        boolean resultado1 = jug1.encestar(balon);
        boolean resultado2 = jug2.encestar(balon1);

        // AMBOS INTENTAN TAPONAR
        boolean tapon = jug3.taponar(balon);
        boolean tapon1 = jug4.taponar(balon1);

        // CREACION EQUIPOS
        Equipo Equipo1 = new Equipo();
        Equipo Equipo2 = new Equipo();

        // METER JUGADORES DENTRO DE CADA EQUIPO
        Equipo1.jugadores.add(jug1);
        Equipo1.jugadores.add(jug2);
        Equipo1.jugadores.add(jug3);
        Equipo1.jugadores.add(jug4);
        Equipo1.jugadores.add(jug5);

        Equipo2.jugadores.add(jug6);
        Equipo2.jugadores.add(jug7);
        Equipo2.jugadores.add(jug8);
        Equipo2.jugadores.add(jug9);
        Equipo2.jugadores.add(jug10);

        int altosEquipo1 = Equipo1.comprobarAltos();
        int altosEquipo2 = Equipo2.comprobarAltos();

        // resultado del juego
        if (resultado1 == true && resultado2 == false) {
            System.out.println("Jugador 1 gana");
        } else if (resultado2 == true && resultado1 == false) {
            System.out.println("Jugador 2 gana");
        } else {
            System.out.println("Empate");
        }

        // tapones
        if (tapon == true && tapon1 == false) {
            System.out.println("Ignacio tapona");
        } else if (tapon1 == true && tapon == false) {
            System.out.println("Iker tapona");
        } else {
            System.out.println("Empate");
        }

    }
}
