package com.example;

public class Entrenador {
    public String nombreEntrenador;
    public Formacion formacionPreferida;

    // Constructor
    public Entrenador(String nombreEntrenador, Formacion formacionPreferida) {
        nombreEntrenador = nombreEntrenador;
        formacionPreferida = formacionPreferida;
    }

    public String getNombreEntrenador() {
        return nombreEntrenador;
    }

    public void setNombreEntrenador(String nombreEntrenador) {
        this.nombreEntrenador = nombreEntrenador;
    }

    public Formacion getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(Formacion formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }
}