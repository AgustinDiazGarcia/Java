package com.company;

import java.util.Arrays;

public class Directivo extends Empleado implements Comparable {

    private String categoria;



    public Directivo(String nombre, int edad, int sueldoBruto, String categoria) {
        super(nombre, edad, sueldoBruto);
        this.categoria = categoria;

    }

    @Override
    public int compareTo(Object o) {
        Directivo directivo = (Directivo)o;
        return this.getEdad() - directivo.getEdad();

    }

    @Override
    public String toString() {
        return "Directivo{" +
                "categoria='" + categoria + '\'' +
                 super.toString() + '\'' +
                '}';
    }
}
