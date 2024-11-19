package com.mireyaserrano.tema05.strings;

import java.util.Scanner;

public class Ejercicio2 {
    /**
     * compara si la letra introducida es una vocal
     * @param c letra que queremos saber si es vocal
     * @return si es vocal o no
     */
    public static boolean esVocales(char c){
        c = Character.toLowerCase(c);
        String vocales = "aáàeéèiíoóòuú";
        return vocales.indexOf(c) >= 0;
    }

    /**
     * compara si la letra introducida es una consonante
     * @param c la letraa que queremos saber si es consonante
     * @return si es consonante o no comparando que es una letra y no es vocal
     */
    public static boolean esConsonantes(char c){
        return Character.isLetter(c) && !esVocales(c);
    }

    /**
     * cuenta el número de vocales
     * @param texto la frase donde hay que contar las vocales y consonantes
     * @return el número de vocales
     */
    public static int contarVocal(String texto){
        int vocales = 0;
        for (int i = 0; i < texto.length(); i++){
            if (esVocales(texto.charAt(i))){
                vocales++;
            }
        }
        return vocales;
    }

    /**
     * cuenta el número de consonantes
     * @param texto la frase donde hay que contar las vocales y consonantes
     * @return el número de consonantes
     */
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