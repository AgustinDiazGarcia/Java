package com.company;

public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje;
    private Integer nivel;

    public UsuarioJuego(String nombre, String clave) {
        this.nombre = nombre;
        this.clave = clave;
        this.puntaje = 0.0;
        this.nivel = 0;
    }

    public void  aumentarPuntaje (){
        this.puntaje ++;
    }

    public void  subirNivel (){
        this.nivel ++;

    }

    public void bonus (Integer valor){
        this.puntaje += valor;
    }
}
