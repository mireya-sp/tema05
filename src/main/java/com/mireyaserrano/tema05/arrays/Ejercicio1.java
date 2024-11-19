package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;

public class Ejercicio1 {
    public static void main(String args[]){
        int[] numeros = new int[10];
        float media = 0;
        for (int i = 0; i < numeros.length; i++){
            System.out.println("Introduce el elemento núemerico " + (i+1));
            int num = Escaner.lector.nextInt();
            numeros[i] = num;
        }
        for (int j = 0; j < numeros.length; j++){
            media += numeros[j];
            System.out.print(numeros[j] + ", ");
        }
        media = media/numeros.length;
        System.out.println("\nLa media de los números introducidos es de " + media);
    }
}
