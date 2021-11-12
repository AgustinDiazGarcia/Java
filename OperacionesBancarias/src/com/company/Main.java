package com.company;

public class Main {

    public static void main(String[] args) {

        Cuenta pruebaCuenta = new CajaAhorro(new Cliente("Martinez", 123, 1251415, 275683), 1000.2, 0.2 );

        pruebaCuenta.extraerEfectivo(100);
        System.out.println(pruebaCuenta.saldo);

        pruebaCuenta = new CuentaCorriente(new Cliente("Martinez", 123, 1251415, 275683), 1000.0, 1000.0);
        pruebaCuenta.extraerEfectivo(1500);
        System.out.println(pruebaCuenta.saldo);

    }
}
