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

        /**Creacion de objeto de la clase jugador */
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
}