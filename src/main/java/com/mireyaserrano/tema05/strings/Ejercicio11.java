package com.mireyaserrano.tema05.strings;

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


        String e = nombreCompleto.toString();
        String letra = "" + e.charAt(0);
        letra = letra.toLowerCase();
        char primeraLetra = letra.charAt(0);
        e = e.replace(e.charAt(0), primeraLetra);
        letra = letra.toUpperCase();
        primeraLetra = letra.charAt(0);
        e = e.replace(e.charAt(0), primeraLetra);
        System.out.printf("e) %s\n", e);

        System.out.printf("f) ***%s***\n", nombreCompleto);

        System.out.printf("g) %s\n", sb.reverse());
    }
}
