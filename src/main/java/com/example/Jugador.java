package com.example;

import java.util.Date;

class Jugador {
    public String Nombre_camiseta;
    public Date Fecha_nacimiento;
    public String Pais_origen;
    public Posicion Posicion_jugador;
    public int dorsal;
    public Traspaso Traspaso_jugador;

    /**
     * Creacion del constructor
     * 
     * @param nommbre_camiseta
     * @param fecha_nacimientio
     * @param pais_origen
     * @param posicion_jugador
     * @param dorsal
     * @param traspaso_jugador
     */

    
    public Jugador(String nommbre_camiseta, Date fecha_nacimientio, String pais_origen, Posicion posicion_jugador,
            int dorsal, Traspaso traspaso_jugador) {
        Nommbre_camiseta = nommbre_camiseta;
        Fecha_nacimientio = fecha_nacimientio;
        Pais_origen = pais_origen;
        Posicion_jugador = posicion_jugador;
        this.dorsal = dorsal;
        Traspaso_jugador = traspaso_jugador;
    }

    public Traspaso getTraspaso_jugador() {
        return Traspaso_jugador;
    }

    public void setTraspaso_jugador(Traspaso traspaso_jugador) {
        Traspaso_jugador = traspaso_jugador;
    }

    public Posicion getPosicion_jugador() {
        return Posicion_jugador;
    }

    public void setPosicion_jugador(Posicion posicion_jugador) {
        Posicion_jugador = posicion_jugador;
    }

    public String getNommbre_camiseta() {
        return Nommbre_camiseta;
    }

    public void setNommbre_camiseta(String nommbre_camiseta) {
        Nommbre_camiseta = nommbre_camiseta;
    }

    public Date getFecha_nacimientio() {
        return Fecha_nacimientio;
    }

    public void setFecha_nacimientio(Date fecha_nacimientio) {
        Fecha_nacimientio = fecha_nacimientio;
    }

    public String getPais_origen() {
        return Pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        Pais_origen = pais_origen;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

}