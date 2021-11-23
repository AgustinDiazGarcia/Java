package com.company;

public abstract class Examen {

    private String titulo;
    private String enunciado;
    private Double nota;
    private Alumno alumno;

    public Examen(String titulo, String enunciado, Double nota, Alumno alumno) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
        this.alumno = alumno;
    }
    public boolean estadoAprobado(){
        if(this.nota>=4){
            return true;
        }
        return false;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }
}
