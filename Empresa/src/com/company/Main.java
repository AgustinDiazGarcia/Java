package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente1 = new Cliente("Agustin", 22 , 1234);
        Cliente cliente2 = new Cliente("Ignacion", 20, 5678);

        Empleado empleado1 = new Empleado("Martin", 34, 2000);
        Empleado empleado2 = new Empleado("Nicolas", 19, 3000);

        Directivo directivo1 = new Directivo("Gustavo", 56, 45000, "AA");
        System.out.println(directivo1.toString());
        Directivo directivo2 = new Directivo("Tomas", 25, 2500, "BB");
        System.out.println(directivo2.toString());

        int resultadoComparacion = directivo1.compareTo(directivo2);
        if (resultadoComparacion>0){
            System.out.println("El Directivo 1 es mayor que el Directivo 2");
        }else{
            System.out.println("El Directivo 2 es mayor que el Directivo 1");
        }


    }
}
