package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Puerto buenosaires = new Puerto("Buenas Aires");

        Contenedor c1 = new Contenedor(123, "Bolivia", false);
        Contenedor c2 = new Contenedor(623, "Desconocida", true);
        Contenedor c3 = new Contenedor(453, "Espania", true);
        Contenedor c4 = new Contenedor(153, "Brasil", false);
        Contenedor c5 = new Contenedor(553, "Desconocida", true);
        Contenedor c6 = new Contenedor(493, "Desconocida", false);

        buenosaires.agregarContenedor(c1);
        buenosaires.agregarContenedor(c2);
        buenosaires.agregarContenedor(c3);
        buenosaires.agregarContenedor(c4);
        buenosaires.agregarContenedor(c5);
        buenosaires.agregarContenedor(c6);

        buenosaires.mostarContedoresOrdenados();

        System.out.println(buenosaires.cantidadContenedoresPeligroso());

    }
}
