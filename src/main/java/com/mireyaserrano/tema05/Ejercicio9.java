package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio9 {

    public static String fraseImpares(String frase){
        for (int i = 0; i < frase.length(); i++){
            if (i % 2 != 0){
                frase = frase.replace(frase.charAt(i), ' ');
            }
        }
        return frase;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();
        scanner.close();
        System.out.println(fraseImpares(frase));
    }
}
