package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio2 {//Escribe un programa que muestre el número de vocales y de consonantes de una frase
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Itroduce una frase y te digo el número de consonantes y de vocales:");//recorrer toda la frase??
        String frase = scanner.nextLine();
        scanner.close();
        int mayusculas = 0;
        int minusculas = 0;
        int espacios = 0;
        int charsFrase = frase.length();
        for (int i = 0; i < charsFrase; i++){
            char letra = frase.charAt(i);
            String letraStr = String.valueOf(letra);
            if (letraStr.equals(" ")) {
                espacios += 1;
            }else if (letraStr.equals(letraStr.toUpperCase())){
                mayusculas += 1;
            }else {
                minusculas += 1;
            }
        }
        System.out.printf("En la frase hay %d mayusculas y %d minusculas", mayusculas, minusculas);
    }
}
