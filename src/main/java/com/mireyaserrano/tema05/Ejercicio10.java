package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio10 {

    public static boolean palindroma(String palabra){
        StringBuilder sb = new StringBuilder();
        sb.append(palabra);
        String palabraInversa = sb.reverse().toString();
        return palabraInversa.equals(palabra);
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra = scanner.nextLine();
        scanner.close();
        if (palindroma(palabra)){
            System.out.printf("La palabra %s es políndroma", palabra);
        }else {
            System.out.printf("La palabra %s NO es políndroma", palabra);
        }
    }
}
