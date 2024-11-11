package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio9 {

    public static String fraseImpares(String frase){
        StringBuilder impares = new StringBuilder();
        for (int i = 1; i < frase.length(); i+=2){
            impares.append((frase.charAt(i)));
        }
        return impares.toString().trim();
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();
        scanner.close();
        System.out.println(fraseImpares(frase));
    }
}
