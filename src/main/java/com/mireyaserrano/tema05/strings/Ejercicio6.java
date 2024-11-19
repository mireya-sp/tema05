package com.mireyaserrano.tema05.strings;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String args[]){
        String fraseRepetida = "";
        int factorMultiplicacion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();
        do{
            System.out.println("Introduce un factor de multiplicacion");
            factorMultiplicacion = Integer.parseInt(scanner.nextLine());
            if (factorMultiplicacion < 0){
                System.err.println("ERROR, Introduce un numero valido");
            }
        }while (factorMultiplicacion < 0);
        scanner.close();
        for (int i = 0; i <= factorMultiplicacion; i++){
            switch (i){
                case 0 -> fraseRepetida = "";
                case 1 -> fraseRepetida = frase;
                default -> fraseRepetida = fraseRepetida.concat(frase);
            }
        }
        System.out.println(fraseRepetida);
    }
}
