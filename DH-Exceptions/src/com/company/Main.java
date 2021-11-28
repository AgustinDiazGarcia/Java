package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, division;
    try{
        System.out.println("Primer numero, debe ser un valor entero");
        num1 = scanner.nextInt();
        System.out.println("Divisor, un valor entero");
        num2 = scanner.nextInt();
        division = num1 / num2;
        System.out.println(division);
        } catch (ArithmeticException exception) {
            System.err.println("Se intento dividir por cero");
        } catch (InputMismatchException exception){
            System.err.println("Se ingreso un tipo de dato incorrecto");
        } finally {
        System.out.println("Ha finalizado el ejemplo");
    }

    }
}
