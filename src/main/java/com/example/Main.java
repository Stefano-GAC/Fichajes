package com.example;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /** Creacion de objetos de la clase Presidente */
        Presidente presidente1= new Presidente("123456789A", "Carlos Martinez");
        Presidente presidente2 = new Presidente("123456789B", "Camila Gonzalez");
        Presidente presidente3 = new Presidente("123456789C", "Jose Rpdriguez");
    
        /**Creacion de la lista de presidentes */
        ArrayList<Presidente> presidentes = new ArrayList<>();
        presidentes.add(presidente1);
        presidentes.add(presidente2);
        presidentes.add(presidente3);

        /**Creacion de objeto de la clase Posicion y Traspaso*/
        Posicion posicionPortero = Posicion.Portero;
        Posicion posicionDefensa = Posicion.Defensa;
        Posicion posicionMedioCampista = Posicion.Medio_Campista;
        Posicion posicionDelantero = Posicion.Delantero;
        Posicion posicionAguatero = Posicion.Aguatero;

        Traspaso traspasoSinSolicitar = Traspaso.SIN_SOLICITAR;
        Traspaso traspasoSolicitado = Traspaso.SOLICITADO;
        Traspaso traspasoAprobadoEntrenador = Traspaso.APROBADO_POR_ENTRENADOR;
        Traspaso traspasoAprobadoPresidente = Traspaso.RECHAZADO_POR_PRESIDENTE;
        Traspaso traspasoRechazadoEntrenador = Traspaso.RECHAZADO_POR_ENTRENADOR;
        Traspaso traspasoRechazadoPresidente = Traspaso.RECHAZADO_POR_PRESIDENTE;

        /** Creacion de objetos de la clase Jugador  */
        Jugador jugador1 = new Jugador("Luis Suárez", new Date(1987, 1, 24), "Uruguay", posicionDelantero, 9, traspasoAprobadoPresidente);
        Jugador jugador2 = new Jugador("Gerard Piqué", new Date(1987, 2, 2), "España", posicionDefensa, 3, traspasoSolicitado);
        Jugador jugador3 = new Jugador("Thibaut Courtois", new Date(1992, 5, 11), "Bélgica", posicionPortero, 1, traspasoRechazadoEntrenador);
        Jugador jugador4 = new Jugador("Leonel Messi", new Date (1984, 5, 26),"Argentina" , posicionMedioCampista, 10, traspasoAprobadoPresidente);
        Jugador jugador5 = new Jugador("Stefano Alderete", new Date(2000, 8, 21), "Peru", posicionAguatero, 0, traspasoRechazadoPresidente);
        Jugador jugador6 = new Jugador("Vini Jr", new Date(2000,6,21), "Brasil", posicionDelantero, 9, traspasoSolicitado)
        Jugador jugador7 = new Jugador("Van Dijk", new Date(1998, 6,11), "Paises Bajos", posicionDefensa, 6666, traspasoSinSolicitar)
        Jugador jugador8 = new Jugador("Lamine Yamal", new Date(2006, 9,25), "España", posicionDelantero, 11, traspasoAprobadoEntrenador)
        Jugador jugador9 = new Jugador("Andres Iniesta", new Date(1889, 7, 1), "España", posicionMedioCampista, 8, traspasoRechazadoPresidente)
        Jugador jugador10 = new Jugador("Oblak", new Date(1990, 12,30), "Eslovenia", posicionPortero, 4, traspasoSinSolicitar)

        /**Creacion de la lista jugadores */
        ArrayList<Jugador> jugadores = new ArrayList<>();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3) ;
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        jugadores.add(jugador6);
        jugadores.add(jugador7);
        jugadores.add(jugador8) ;
        jugadores.add(jugador9);
        jugadores.add(jugador10);

        /** Creacion de objetos de la clase Equipo  */
        Equipo equipo1 = new Equipo("FC Barcelona", "FCB");
        Equipo equipo2 = new Equipo("Atletico Madrid", "ATM");
        Equipo equipo3 = new Equipo("Real Madrid", "RMD");
        Equipo equipo4 = new Equipo("Liverpool", "LIV");
        Equipo equipo5 = new Equipo("Inter de Miami", "IMA");
        Equipo equipo6 = new Equipo("Peru FC", "PFC");

        /**Creacion de la lista Equipo */
        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(equipo1);
        equipos.add(equipo2);
        equipos.add(equipo3);
        equipos.add(equipo4);
        equipos.add(equipo5);
        equipos.add(equipo6);

    }

}