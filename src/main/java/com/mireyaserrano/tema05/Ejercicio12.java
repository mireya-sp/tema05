package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();
        scanner.close();

        frase = frase.replace("es", "no por");
        frase = frase.replaceAll("\\d", "*");
        System.out.println(frase);
    }
}
