package com.mireyaserrano.tema05.strings;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase y te digo las mayusculas y minusculas que hay en cada palabra");
        String frase = scanner.nextLine();
        frase = frase.toLowerCase();
        String palabra;
        int vocales = 0;
        int consonantes = 0;
        scanner.close();
        String [] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++){
            palabra = palabras[i];
            vocales = 0;
            consonantes = 0;
            for (int j = 0; j < palabra.length(); j++){
                char letra = palabras[i].charAt(j);
                switch (letra){
                    case 'a', 'e', 'i', 'o', 'u' -> vocales +=1;
                    case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z' -> consonantes +=1;
                }
            }
            System.out.printf("La palabra %s tiene: %d vocales y %d consonantes\n", palabra, vocales, consonantes);
        }
    }
}
