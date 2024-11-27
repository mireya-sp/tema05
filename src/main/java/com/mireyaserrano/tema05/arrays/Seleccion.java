package com.mireyaserrano.tema05.arrays;

public class Seleccion {


    public static void ordenacionSeleccion(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    ordenacion.intercambio(array, j, i);
                }
            }
        }
    }


}
