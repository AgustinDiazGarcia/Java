package com.company;

import java.util.Date;

public class impresora {

    private String modelo;
    private String tipoConexion;
    private Date fechaFabricacion;
    private int hojasDisponibles;

    public impresora(String modelo, String tipoConexion) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
    }

    private boolean tienePapel (){
        return this.hojasDisponibles > 0;
    }

}
