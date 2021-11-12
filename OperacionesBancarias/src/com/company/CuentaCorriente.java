package com.company;

import java.util.Date;

public class CuentaCorriente extends Cuenta{
    private Double montoDescubierto;

    public CuentaCorriente(Cliente titular, Double saldo, Double montoDescubierto) {
        super(titular, saldo);
        this.montoDescubierto = montoDescubierto;
    }

    @Override
    public void extraerEfectivo(Integer monto) {
        if ((this.saldo + montoDescubierto) >= monto ){
            this.saldo -= monto;
        }
    }

    public void depositarCheque(Double monto){
        Double montoNuevo = (this.saldo =+ monto);
        System.out.println(montoNuevo);
    }


}
