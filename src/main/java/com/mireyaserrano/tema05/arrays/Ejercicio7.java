package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.MetodosArrays;

public class Ejercicio7 {
    /**
     * imprime los multiplos del número que quieras
     * @param array el array donde están los números que quieres saber si son múltiplos de el número
     * @param multiplo el número del que tienen que ser múltiplo los elementos del array
     */
    public static void multiplos(int[] array, int multiplo){
        System.out.println("\nMúltiplos de " + multiplo + ": ");
        for (int i = 0; i < array.length; i++){
            if (array[i] % multiplo == 0 && array[i] != 0){
                System.out.print(array[i] + " ");
            }
        }
    }

    /**
     * imprime los ceros del array
     * @param array el array que va a recorrer buscando ceros
     */
    public static void ceros(int[] array){
        System.out.println("\nCero: ");
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0){
                System.out.print(array[i] + " ");
            }
        }
    }

    public static void main(String args[]){
        final int TAMANYO_ARRAY = 100;
        int[] array = new int[TAMANYO_ARRAY];
        MetodosArrays.rellenarArray(array, 0, 100);
        multiplos(array, 5);
        ceros(array);
        multiplos(array, 10);
    }
}
