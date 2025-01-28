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
     * @param nombre_camiseta
     * @param fecha_nacimiento
     * @param pais_origen
     * @param posicion_jugador
     * @param dorsal
     * @param traspaso_jugador
     */
    public Jugador(String nombre_camiseta, Date fecha_nacimiento, String pais_origen, Posicion posicion_jugador,
            int dorsal, Traspaso traspaso_jugador) {
        Nombre_camiseta = nombre_camiseta;
        Fecha_nacimiento = fecha_nacimiento;
        Pais_origen = pais_origen;
        Posicion_jugador = posicion_jugador;
        this.dorsal = dorsal;
        Traspaso_jugador = traspaso_jugador;
    }
public String getNombre_camiseta() {
    return Nombre_camiseta;
}
public void setNombre_camiseta(String nombre_camiseta) {
    Nombre_camiseta = nombre_camiseta;
}
public Date getFecha_nacimiento() {
    return Fecha_nacimiento;
}
public void setFecha_nacimiento(Date fecha_nacimiento) {
    Fecha_nacimiento = fecha_nacimiento;
}
public String getPais_origen() {
    return Pais_origen;
}
public void setPais_origen(String pais_origen) {
    Pais_origen = pais_origen;
}
public Posicion getPosicion_jugador() {
    return Posicion_jugador;
}
public void setPosicion_jugador(Posicion posicion_jugador) {
    Posicion_jugador = posicion_jugador;
}
public int getDorsal() {
    return dorsal;
}
public void setDorsal(int dorsal) {
    this.dorsal = dorsal;
}
public Traspaso getTraspaso_jugador() {
    return Traspaso_jugador;
}
public void setTraspaso_jugador(Traspaso traspaso_jugador) {
    Traspaso_jugador = traspaso_jugador;
}

}