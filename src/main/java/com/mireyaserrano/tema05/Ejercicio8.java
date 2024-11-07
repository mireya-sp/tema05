package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();
        String [] palabras = frase.split("\\s+");
        for (int i = 0; i < palabras.length; i++){
            System.out.printf("%s %7d caracteres\n", palabras[i], palabras[i].length());
        }
    }
}
