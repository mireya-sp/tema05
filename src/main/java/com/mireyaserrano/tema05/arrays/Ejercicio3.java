package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;

public class Ejercicio3 {
    public static void main(String args[]) {
        int[] numeros = new int[20];
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Introduce el elemento numérico %d: ", (i+1));
            int num = Escaner.lector.nextInt();
            numeros[i] = num;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%-5d", numeros[i]);
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
