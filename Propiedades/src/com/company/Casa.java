package com.company;

public class Casa extends Propiedad implements java.lang.Comparable {

    private int cantidadAmbientes;
    private Double cantidadMetrosCuadrados;

    public Casa(String fechaAdquisicion, Double precio, String direccion, boolean hipoteca, int cantidadAmbientes, Double cantidadMetrosCuadrados) {
        super(fechaAdquisicion, precio, direccion, hipoteca);
        this.cantidadAmbientes = cantidadAmbientes;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    public int getCantidadAmbientes() {
        return cantidadAmbientes;
    }

    @Override
    public int compareTo(Object o) {
        return this.cantidadAmbientes - ((Casa)o).getCantidadAmbientes();
    }
}
