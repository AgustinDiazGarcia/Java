package com.company;

public class ExamenFinal extends Examen implements Comparable {

    private int notaOral;
    private String descripcionTema;

    public ExamenFinal(String titulo, String enunciado, Double nota, Alumno alumno, int notaOral, String descripcionTema) {
        super(titulo, enunciado, nota, alumno);
        this.notaOral = notaOral;
        this.descripcionTema = descripcionTema;
    }

    @Override
    public int compareTo(Object o) {
        ExamenFinal examen = (ExamenFinal) o;
        Double promedioExamenFinal1 = this.calcularPromedio();
        Double promedioExamenFinal2 = examen.calcularPromedio();

        return (int) (promedioExamenFinal1 - promedioExamenFinal2);

    }

    private Double calcularPromedio(){
        return (notaOral + getNota())/2;
    }
}

