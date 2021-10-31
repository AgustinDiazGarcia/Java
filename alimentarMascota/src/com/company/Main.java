package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // pedir el nombre de la mascota
        Scanner scan = new Scanner(System.in);
        System.out.println("ingresar el nombre de la mascota");
        String nombreMascota = scan.nextLine();

        // pedir cuanto come :
        System.out.println("ingrese cuanto come su mascota");
        Double cantidadCome = scan.nextDouble();

        // calcular la cantidad de paquetes
        Integer cantidadPaquetes = cuantosPaquetesNecesito(cantidadCome);

        // Mostrar el resultado, la cantidad de paquetes que necesito para llenar a la mascota
        System.out.printf("la cantidad de paquetes son:" + cantidadPaquetes);
    }

    public static int cuantosPaquetesNecesito(Double cantidadCome) {

        Scanner scan = new Scanner(System.in);
        Double comidaActual = 0.0;
        Integer cantidadPaquetes = 0;

        // la mascota come 4 kilos, ahora pido paquetes de un peso que no se.
        // cuando la cantidad de paquetes pesa mas que lo que come la mascota, entonces determino la cantidad de paquetes

        while (comidaActual < cantidadCome) {
            System.out.println("ingrese el peso del paquete");
            Double pesoPaquete = scan.nextDouble();
            comidaActual += pesoPaquete;
            cantidadPaquetes++;
        }
        return cantidadPaquetes;
    }
}*/
