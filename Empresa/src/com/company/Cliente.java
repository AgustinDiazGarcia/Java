package com.company;

public class Cliente extends Persona {

    private int telefono;

    public Cliente(String nombre, int edad, int telefono) {
        super(nombre, edad);
        this.telefono = telefono;
    }


}
