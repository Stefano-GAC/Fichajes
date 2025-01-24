package com.example;

class Entrenador {
    public String nombreEntrenador;

    public enum formacion {
        Formacion532, Formacion451, Formacion442, Formacion433, Formacion343, Formacion424, Formacion4141, Formacion352
    };

    /**
     * Constructor de Jugador
     * 
     * @param nombreEntrenador
     */
    public Entrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }
}