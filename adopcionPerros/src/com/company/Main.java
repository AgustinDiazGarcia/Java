package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        perro firulais = new perro();
        firulais.setAdopcion(true);
        firulais.setChip(true);
        firulais.setAnioNacimiento(2019);
        firulais.setPeso(34);
        firulais.setSano(true);
        firulais.setNombre("Firulais");

        System.out.println("Es firulais adoptable: " + firulais.enviarAAdopcion());

        System.out.println("Es firulais factible de perderse: " + firulais.isChip());
    }
}
