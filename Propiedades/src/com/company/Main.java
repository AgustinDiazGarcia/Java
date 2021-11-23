package com.company;

public class Main {

    public static void main(String[] args) {

        Duenio duenio1 = new Duenio("Agustin", "Diaz", 12345);

        Campo campo1 = new Campo ("10-2-2010",2000.0, "San Fernando s/n", false, true, 20.0);

        System.out.println(campo1.habilitadoCultivo());

        Casa casa1 = new Casa("25-2-2020", 5000.5,"Santa Rosa 2300",false,5, 45.3);
        Casa casa2 = new Casa("30-3-2019", 4000.5,"Santa Cruz 3900", false, 6, 50.0);

        System.out.println(casa1.compareTo(casa2));

        System.out.println(campo1.puedeVender() && casa1.puedeVender());


    }
}
