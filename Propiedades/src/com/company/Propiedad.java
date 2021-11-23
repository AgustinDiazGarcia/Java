package com.company;

public abstract class Propiedad {

    private String fechaAdquisicion;
    private Double precio;
    private String direccion;
    private boolean hipoteca;

    public Propiedad(String fechaAdquisicion, Double precio, String direccion, boolean hipoteca) {
        this.fechaAdquisicion = fechaAdquisicion;
        this.precio = precio;
        this.direccion = direccion;
        this.hipoteca = hipoteca;
    }

    public boolean puedeVender(){
        return !this.hipoteca;
        }
    }

