package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;

public class Ejercicio2 {
    public static void main(String args[]){
        char[] elementos = new char[10];
        for (int i = 0; i < elementos.length; i++){
            System.out.println("Introduce el elemento char " + (i+1));
            char caracter = Escaner.lector.nextLine().charAt(0);
            elementos[i] = caracter;
        }
        System.out.print("Los elementos en posición par son: ");
        for (int j = 0; j < elementos.length; j += 2){
            System.out.print(elementos[j] + ", ");
        }
        System.out.print("\nLos elementos en posición impar son: ");
        for (int k = 1; k < elementos.length; k += 2){
            System.out.print(elementos[k] + ", ");
        }
    }
}
