package com.mireyaserrano.tema05.arrays;

public class Seleccion {


    public static void ordenacionSeleccion(int[] array){
        for (int i = 0; i < array.length; i++){
            int min = array[i];
            int posicion = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    min = array[j];
                    posicion = j;
                }
            }
            if (min < array[i]){
                ordenacion.intercambio(array, i, posicion);
            }
        }
    }


}
