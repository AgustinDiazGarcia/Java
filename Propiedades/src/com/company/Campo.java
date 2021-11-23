package com.company;

public class Campo extends Propiedad{

    private boolean casco;
    private Double hectareas;

    public Campo(String fechaAdquisicion, Double precio, String direccion, boolean hipoteca, boolean casco, Double hectareas) {
        super(fechaAdquisicion, precio, direccion, hipoteca);
        this.casco = casco;
        this.hectareas = hectareas;
    }

    public Double getHectareas() {
        return hectareas;
    }

    public void setHectareas(Double hectareas) {
        this.hectareas = hectareas;
    }

    public boolean habilitadoCultivo(){
        if (this.hectareas>10){
            return true;
        }else{
            return false;
        }

    }
}
