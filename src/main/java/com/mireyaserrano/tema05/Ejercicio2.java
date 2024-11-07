package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio2 {

    public static boolean esVocales(char c){
        c = Character.toLowerCase(c);
        String vocales = "aáàeéèiíoóòuú";
        return vocales.indexOf(c) >= 0;
    }

    public static boolean esConsonantes(char c){
        return Character.isLetter(c) && !esVocales(c);
    }

    public static int contarVocal(String texto){
        int vocales = 0;
        for (int i = 0; i < texto.length(); i++){
            if (esVocales(texto.charAt(i))){
                vocales++;
            }
        }
        return vocales;
    }

    public static int contarConsonantes(String texto){
        int consonantes = 0;
        for (int i = 0; i < texto.length(); i++){
            if (esConsonantes(texto.charAt(i))){
                consonantes++;
            }
        }
        return consonantes;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();
        scanner.close();
        System.out.printf("Hay %d vocales y %d consonantes en la frase introducida", contarVocal(frase), contarConsonantes(frase));
    }
}