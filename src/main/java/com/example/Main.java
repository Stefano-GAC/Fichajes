package com.example;
import java.util.ArrayList;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        /** Creacion de objetos de la clase Presidente */
        Presidente presidente1= new Presidente("123456789A", "Carlos Martinez");
        Presidente presidente2 = new Presidente("123456789B", "Camila Gonzalez");
        Presidente presidente3 = new Presidente("123456789C", "Jose Rpdriguez");
    }
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




    }