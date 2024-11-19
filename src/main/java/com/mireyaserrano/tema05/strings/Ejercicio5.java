package com.mireyaserrano.tema05.strings;

import java.util.Scanner;

public class Ejercicio5 {

    public static String palabraLarga(String frase){
        String palabraLarga = "";
        String [] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].length() > palabraLarga.length()){
                palabraLarga = palabras[i];
            }
        }
        return palabraLarga;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Itroduce una frase y te digo cual es la palabra con más letras");
        String frase = scanner.nextLine();
        scanner.close();
        System.out.printf("La palabra más larga es [%s] y contiene %d caracteres.", palabraLarga(frase), palabraLarga(frase).length() );
    }
}