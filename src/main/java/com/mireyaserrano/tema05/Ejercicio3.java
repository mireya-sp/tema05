package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio3 {
    /**
     * divide una frase en palabras
     * @param frase la frase que hay que dividir
     * @return el numero de palabras que hay
     */
    public static int contarPalabras(String frase){
        String[] palabras = frase.split("\\s+");
        return palabras.length;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Itroduce una frase y te digo el número de palabras que contiene:");
        String frase = scanner.nextLine();
        scanner.close();
        System.out.printf("Hay %d palabras", contarPalabras(frase));
    }
}
