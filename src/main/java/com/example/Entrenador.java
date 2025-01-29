package com.example;

public class Entrenador {
    private String nombreEntrenador;
    private Formacion formacionPreferida;

    // Constructor
    public Entrenador(String nombreEntrenador, Formacion formacionPreferida) {
        this.nombreEntrenador = nombreEntrenador;
        this.formacionPreferida = formacionPreferida;
    }

    public String getnombreEntrenador() {
        return nombreEntrenador;
    }

    public void setnombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public Formacion getformacionPreferida() {
        return formacionPreferida;
    }

    public void setformacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }
}