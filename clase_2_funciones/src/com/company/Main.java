package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(esPrimo(5));
    }
    //ejercicio 1
    public static boolean esPrimo (int numero) {
        if (numero == 0 || numero == 1){
            return  false;
        }else {

            for (int i = 1; i < numero / 2; i++) {
                if (numero % 1 == 0) {
                    return false;
                }
            }
        }
        return true;
    }

}
