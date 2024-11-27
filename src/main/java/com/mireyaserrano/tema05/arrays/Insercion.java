package com.mireyaserrano.tema05.arrays;

public class Insercion {

    public static void ordenacionInsercion(int[] array){
        int aux;
        for (int i = 1; i < array.length; i++) {
            int j;
            aux = array[i];
            for (j = i - 1; j >= 0 && array[j] > aux; j--) {
                if (array[j] > aux) {
                    array[j + 1] = array[j];
                } else if (array[j] < aux) {
                    break;
                }
            }
            array[j+1] = aux;
        }
    }

}
