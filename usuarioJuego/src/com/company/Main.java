package com.company;

public class Main {

    public static void main(String[] args) {
	/*// write your code here
        UsuaprimerCliente = new Cliente ( numeroCliente 12, nombre: "Agustin");
        primerCliente.incrementarDeuda(valor: 500.0);
        primerCliente.incrementarDeuda(valor: 1000.0);

        System.out.println("¿Cual es la deuda?: " + primerCliente.getDeuda());
    }*/
        UsuarioJuego primerJugador = new UsuarioJuego("Agustin", "12345");
        System.out.println("¿Cual es el nivel?: " + primerJugador.getNivel());
        primerJugador.subirNivel();
        System.out.println("¿Cual es el nivel?: " + primerJugador.getNivel());
        primerJugador.bonusNivel(4);
        System.out.println("¿Cual es el nivel?: " + primerJugador.getNivel());
        System.out.println("¿Cual es el puntaje?: " + primerJugador.getPuntaje());
        primerJugador.aumentarPuntaje();
        System.out.println("¿Cual es el puntaje?: " + primerJugador.getPuntaje());
        primerJugador.bonus(6);
        System.out.println("¿Cual es el puntaje?: " + primerJugador.getPuntaje());

    }
}
