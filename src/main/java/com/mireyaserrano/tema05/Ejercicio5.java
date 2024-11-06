package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String args[]){
        String palabraLarga = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Itroduce una frase y te digo cual es la palabra con más letras");
        String frase = scanner.nextLine();
        String [] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++){
            if (palabras[i].length() > palabraLarga.length()){
                palabraLarga = palabras[i];
            }
        }
        System.out.printf("La palabra más larga es [%s].", palabraLarga);
    }
}
