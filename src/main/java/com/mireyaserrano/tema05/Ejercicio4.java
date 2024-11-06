package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase y te digo las mayusculas y minusculas que hay en cada palabra");
        String frase = scanner.nextLine();
        String palabra;
        int mayusculas = 0;
        int minusculas = 0;
        scanner.close();
        String [] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++){
            palabra = palabras[i];
            mayusculas = 0;
            minusculas = 0;
            for (int j = 0; j < palabra.length(); j++){
                char letra = frase.charAt(j);
                String letraStr = String.valueOf(letra);
                if (letraStr.equals(" ")) {
                    System.out.print("");
                }else if (letraStr.equals(letraStr.toUpperCase())){
                    mayusculas += 1;
                }else {
                    minusculas += 1;
                }
            }
            System.out.printf("La palabra %d, tiene %d mayusculas y %d minusculas\n", i+1, mayusculas, minusculas );
        }
    }
}
