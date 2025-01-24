package main.java.com.example;

class Jugador {
    public String Nommbre_camiseta;
    public Date Fecha_nacimientio;
    public String Pais_origen;
    public Posicion p;
    public int dorsal;
    public Traspaso t;

    // public Jugador(String nommbre_camiseta, Date fecha_nacimientio, String
    // pais_origen, Enum , int dorsal,
    // Enum traspaso) {
    // Nommbre_camiseta = nommbre_camiseta;
    // Fecha_nacimientio = fecha_nacimientio;
    // Pais_origen = pais_origen;
    // Posicion = posicion;
    // this.dorsal = dorsal;
    // Traspaso = traspaso;
    // }

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

    public Enum getTraspaso() {
        return Traspaso;
    }

    public void setTraspaso(Enum traspaso) {
        Traspaso = traspaso;
    };

}