package com.company;

public class CajaAhorro extends Cuenta{

    private Double tasaInteres;

    public CajaAhorro(Cliente titular, Double saldo, Double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    @Override
    public void extraerEfectivo(Integer monto) {
        if (this.saldo >= monto){
            this.saldo -= monto;
        }
    }
}
