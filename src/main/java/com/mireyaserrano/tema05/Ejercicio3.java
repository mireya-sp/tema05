package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Itroduce una frase y te digo el número de palabras que contiene:");
        String frase = scanner.nextLine();
        scanner.close();
        int espacios = 1;
        int charsFrase = frase.length();
        for (int i = 0; i < charsFrase; i++){
            char letra = frase.charAt(i);
            String letraStr = String.valueOf(letra);
            if (letraStr.equals(" ")) {
                espacios += 1;
            }
        }
        System.out.printf("La frase tiene %d palabras", espacios);
    }
}
