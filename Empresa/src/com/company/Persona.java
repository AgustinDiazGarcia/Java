package com.company;

public abstract class Persona {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "" +
                " nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
