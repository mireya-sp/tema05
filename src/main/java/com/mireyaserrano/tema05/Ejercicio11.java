package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce tu primer apellido");
        String apellido1 = scanner.nextLine();
        System.out.println("Introduce tu segundo apellido");
        String apellido2 = scanner.nextLine();
        scanner.close();

        int caracterFinal = 0;
        System.out.println("a)");
        StringBuilder sb = new StringBuilder();
        String nombreCompleto = sb.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2).toString();
        System.out.printf("%s\n", nombreCompleto.toLowerCase());
        System.out.printf("%s\n", nombreCompleto.toUpperCase());
        System.out.printf("El número de caracteres de el nombre completo: %d\n", nombreCompleto.length());

        if (nombreCompleto.length() >= 5){
            System.out.print("b) ");
            System.out.println(nombreCompleto.substring(0, 5));
        }

        if (nombreCompleto.length() >= 2){
            System.out.print("c) ");
            System.out.println(nombreCompleto.substring(nombreCompleto.length()-2, nombreCompleto.length()));
        }

        for (int i = 0; i <= nombreCompleto.length()-1; i++){
            if (nombreCompleto.charAt(i) == nombreCompleto.charAt(nombreCompleto.length()-1)){
                caracterFinal += 1;
            }
        }
        System.out.printf("d) %d\n", caracterFinal);


        System.out.printf("e) %s.%s.%s\n", nombre.charAt(0), apellido1.charAt(0), apellido2.charAt(0));

        System.out.printf("f) ***%s***\n", nombreCompleto);

        System.out.println("g) " + sb.append(nombre).append(" ").append(apellido1).append(" ").append(apellido2).reverse());
    }
}
