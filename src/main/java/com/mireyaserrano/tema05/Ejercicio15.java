package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio15 {

    public static String filas(int ancho, char caracter){
        String fila = "";
        for (int i = 1; i <= ancho; i++){
            fila += caracter;
        }
        return fila;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el ancho del rectángulo");
        int ancho = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa el alto del rectángulo");
        int alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingresa el caracter del que está hecho el rectángulo");
        String crater = scanner.nextLine();
        char caracter = crater.charAt(0);
        for (int c = 32; c < 128; c++) {
            char simbolo = (char) c;
            if (caracter == c){
                caracter = (char) c;
            }
        }
        for (int i = 1; i <= alto; i++){
            System.out.println(filas(ancho, caracter));
        }
    }
}
