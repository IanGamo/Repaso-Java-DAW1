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

        Equipos();
        resultados();
        probarTapon();
        
    }

    public static void Equipos() {
        // CREACION JUGADORES
        Player jug1 = new Player(175.00, "Gorka", "Alero");
        Player jug2 = new Player(180.00, "Ian", "Ala-Pivot");
        Player jug3 = new Player(190.00, "Ignacio", "Pivot");
        Player jug4 = new Player(172.00, "Iker", "Escolta");
        Player jug5 = new Player(170.00, "Paul", "Base");
        Player jug6 = new Player(171.00, "Grefuso", "Base");
        Player jug7 = new Player(168.00, "Adrian", "Escolta");
        Player jug8 = new Player(175.50, "Pol", "Alero");
        Player jug9 = new Player(187.00, "Pep", "Ala-Pivot");
        Player jug10 = new Player(201.00, "Joan", "Pivot");

        // CREACION BALONES
        Balon balon = new Balon(6, "Spalding");
        Balon balon1 = new Balon(7, "Molten");

        // CREACION EQUIPOS
        Equipo equipo1 = new Equipo();
        Equipo equipo2 = new Equipo();

        // METER JUGADORES DENTRO DE CADA EQUIPO
        equipo1.jugadores.add(jug1);
        equipo1.jugadores.add(jug2);
        equipo1.jugadores.add(jug3);
        equipo1.jugadores.add(jug4);
        equipo1.jugadores.add(jug5);

        equipo2.jugadores.add(jug6);
        equipo2.jugadores.add(jug7);
        equipo2.jugadores.add(jug8);
        equipo2.jugadores.add(jug9);
        equipo2.jugadores.add(jug10);

        // COMPROBAR ALTOS
        int altosEquipo1 = equipo1.comprobarAltos();
        int altosEquipo2 = equipo2.comprobarAltos();

        // PRINTARLOS        
        System.out.println("JUGADORES ALTOS TOTAL CADA EQUIPO");
        System.out.println("Equipo 1");
        System.out.println(altosEquipo1);
        System.out.println("Equipo 2");
        System.out.println(altosEquipo2);
        
        // pintar stats
        mostrarStats(equipo1);
        mostrarStats(equipo2);
        
        
        
    }
    
    public static void mostrarStats(Equipo equipo){
        
        int altos = equipo.comprobarAltos();
        
        System.out.println(altos);
        
    }
    
    
    
    

    // resultado del juego
    public static boolean resultados() {

        Player jug1 = new Player(175.00, "Gorka", "Alero");
        Player jug2 = new Player(180.00, "Ian", "Ala-Pivot");

        Balon balon = new Balon(6, "Spalding");
        Balon balon1 = new Balon(7, "Molten");

        System.out.println("Jugador 1 tira");
        boolean resultado1 = jug1.encestar(balon);
        System.out.println("Jugador 2 tira");
        boolean resultado2 = jug2.encestar(balon1);

        System.out.println("Quien gana?");
        if (resultado1 == true && resultado2 == false) {
            System.out.println("Jugador 1 gana");
        } else if (resultado2 == true && resultado1 == false) {
            System.out.println("Jugador 2 gana");
        } else {
            System.out.println("Empate");
        }
        return true;
    }

    // tapones
    public static boolean probarTapon() {

        Balon balon = new Balon(6, "Spalding");
        Balon balon1 = new Balon(7, "Molten");

        Player jug3 = new Player(190.00, "Ignacio", "Pivot");
        Player jug4 = new Player(172.00, "Iker", "Escolta");

        System.out.println("Jugador 3 salta a taponar");
        boolean tapon = jug3.taponar(balon);
        System.out.println("Jugador 4 salta a taponar");
        boolean tapon1 = jug4.taponar(balon1);

        System.out.println("Quien tapona?");
        if (tapon == true && tapon1 == false) {
            System.out.println("Ignacio tapona");
        } else if (tapon1 == true && tapon == false) {
            System.out.println("Iker tapona");
        } else {
            System.out.println("Empate");
        }
        return true;

    }

}
