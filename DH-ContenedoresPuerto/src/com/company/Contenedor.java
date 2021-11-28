package com.company;

public class Contenedor implements Comparable<Contenedor>{
    private Integer numero;
    private String paisProcedencia;
    private boolean transportePeligroso;

    public Contenedor(Integer numero, String paisProcedencia, boolean transportePeligroso) {
        this.numero = numero;
        this.paisProcedencia = paisProcedencia;
        this.transportePeligroso = transportePeligroso;
    }

    public boolean isTransportePeligroso() {
        return transportePeligroso;
    }

    public String getPaisProcedencia() {
        return paisProcedencia;
    }

    public Integer getNumero() {
        return numero;
    }



    @Override
    public int compareTo(Contenedor o) {
        return this.numero - o.getNumero();
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "Nro. " + this.numero + " " +
                "Procedencia: " + this.paisProcedencia + " " +
                "Tranporte peligroso: " + this.transportePeligroso + " " +
                "}";
    }
}
