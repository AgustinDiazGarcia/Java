package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
	 String texto1 = "Hola, como estas?";
     String texto2 = "Hola, como estas?";

     Integer n1 = 5;
     Integer n2 = 10;


     /*if (Objects.equals(texto1,texto2)) {
         System.out.println("son iguales");
     }else{
         System.out.println("no son iguales");
     }*/

     if (n1.equals(n2)){
         System.out.println("son iguales");
     }else{
         if (n1<n2){
             System.out.println("n1 es menor a n2");
         }else{
             System.out.println("n1 es mayor a n2");
         }

     }

    }

}
