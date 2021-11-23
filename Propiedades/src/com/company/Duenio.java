package com.company;

public class Duenio {

    private String nombre;
    private String apellido;
    private int cuil;

    public Duenio(String nombre, String apellido, int cuil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Duenio{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cuil=" + cuil +
                '}';
    }
}
