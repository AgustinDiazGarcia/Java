package com.company;

public class ExamenParcial extends Examen {

    private int numeroUnidad;
    private int numeroReintentos;

    public ExamenParcial(String titulo, String enunciado, Double nota, Alumno alumno, int numeroUnidad, int numeroReintentos) {
        super(titulo, enunciado, nota, alumno);
        this.numeroUnidad = numeroUnidad;
        this.numeroReintentos = numeroReintentos;
    }


    public  boolean puedeRecuperar(){
        return true;
    }
}



