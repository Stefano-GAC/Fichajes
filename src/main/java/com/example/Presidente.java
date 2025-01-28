package com.example;

public class Presidente {
    public String Dni;
    public String Nombre;

    public Presidente(String dni, String nombre) {
        Dni = dni;
        Nombre = nombre;
    }

    public String getDni() {
        return Dni;
    }

    public void setDni(String dni) {
        Dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
}
