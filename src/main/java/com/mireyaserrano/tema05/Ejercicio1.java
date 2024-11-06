package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio1 {
    /**
     * Cambia la primera letra de minuscula a mayuscula
     * @param frase El string frase que se introduce
     * @return La primera letra en mayuscula concatenada a el resto de la frase separado por un substring
     */
    public static String primeraMyuscula(String frase){
        char primeraLetra = frase.charAt(0);
        String minuscula = String.valueOf(primeraLetra);
        String mayuscula = minuscula.toUpperCase();
        String fraseSinPrimeraLetra = frase.substring(1);
        return mayuscula.concat(fraseSinPrimeraLetra);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();
        scanner.close();

        System.out.println(primeraMyuscula(frase));
    }
}
