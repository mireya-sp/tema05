package com.mireyaserrano.tema05.strings;

import java.util.Scanner;
import static com.mireyaserrano.tema05.lib.IO.solicitarInt;

public class Ejercicio13 {
    /**
     * Imprime el menu principal
     */
    public static void mostrarMenu(){
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("==============");
        System.out.println("1. Palabra más larga.");
        System.out.println("2. Palabra más corta.");
        System.out.println("3. Número de vocales.");
        System.out.println("------------------------------------");
        System.out.println("0. Salir.");
    }

    /**
     * Calcula la ocion1
     */
    public static void opcion1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("OPCIÓN 1:");
        System.out.println("Introduce una palabra");
        String palabra1 = scanner.nextLine();
        System.out.println("Introduce otra palabra");
        String palabra2 = scanner.nextLine();
        System.out.println("Introduce la ultima palabra");
        String palabra3 = scanner.nextLine();
        
        String palabras = palabra1 + " " + palabra2 + " " + palabra3;
        System.out.printf("La palabra más larga es [%s]\n", Ejercicio5.palabraLarga(palabras));
    }

    /**
     * Calcula la opcion2
     */
    public static void opcion2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("OPCIÓN 2:");
        System.out.println("Introduce una palabra");
        String word1 = scanner.nextLine();
        System.out.println("Introduce otra palabra");
        String word2 = scanner.nextLine();
        System.out.println("Introduce la ultima palabra");
        String word3 = scanner.nextLine();
        
        String total = word1 + " " + word2 + " " + word3;
        String palabraCorta = " ";
        String [] words = total.split("\\s+");
        for (int i = 0; i < words.length; i++){
            if (i == 0){
                palabraCorta = words [i];
            }
            if (words[i].length() < palabraCorta.length()){
                palabraCorta = words[i];
            }
        }
        System.out.printf("La palabra más corta es [%s]\n", palabraCorta);
    }

    /**
     * Calcula la opcion3
     */
    public static void opcion3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("Introduce una palabra");
        String palabra = scanner.nextLine();
        System.out.printf("La palabra [%s] tiene %d vocales\n", palabra, Ejercicio2.contarVocal(palabra));
    }

    public static void main(String args[]){
        int menu;
        do {
            mostrarMenu();

            menu = solicitarInt("Introduce un número del menú anterior", 0, 3);
            switch (menu) {
                case 0 -> System.out.println();
                case 1 -> opcion1();
                case 2 -> opcion2();
                case 3 -> opcion3();
                default -> System.err.println("ERROR. Introduce una opción de menú válida.");
            }
        }while (menu != 0);
    }
}
