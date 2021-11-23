package com.company;

public class Empleado extends Persona{

    private int sueldoBruto;

    public Empleado(String nombre, int edad, int sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String toString() {
        return "" +
                " sueldoBruto=" + sueldoBruto +
                 super.toString() +
                '}';
    }
}
