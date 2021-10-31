package com.company;

public class SistemaAdopcionCanino {

    public static void main(String [] args){

        perro firulais = new perro();
        firulais.setAdopcion(true);
        firulais.setChip(true);
        firulais.setAnioNacimiento(2019);
        firulais.setPeso(34);
        firulais.setSano(true);
        firulais.setNombre("Firulais");

        System.out.println("Es firulais adoptable: " + firulais.enviarAAdopcion());

        System.out.println("Es firulais factible de perderse:" + firulais.isChip());
    }
}
