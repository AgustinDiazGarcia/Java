package com.company;

public abstract class Cuenta {
    private Cliente titular;
    protected Double saldo;

    public Cuenta(Cliente titular, Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public abstract void extraerEfectivo(Integer monto);

    public Double informarSaldo(){
        return this.saldo;
    }

    public void depositar(Double monto){
        Double montoNuevo = (this.saldo =+ monto);
        System.out.println(montoNuevo);
    }



}
