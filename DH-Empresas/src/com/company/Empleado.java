package com.company;

import java.util.*;


public class Empleado {

    private String nombre;

    private Date fechaIncorporacion;


    public int calcularAntiguedad() {

        Date fechaActual = new Date();

        return fechaActual.getYear() - fechaIncorporacion.getYear();

    }


    public void setFechaIncorporacion(Date fechaIncorporacion) {

        this.fechaIncorporacion = fechaIncorporacion;

    }


    public String getNombre() {

        return nombre;

    }


    public void setNombre(String nombre) {

        this.nombre = nombre;
    }
}
