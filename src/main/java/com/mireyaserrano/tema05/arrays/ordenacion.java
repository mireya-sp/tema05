package com.mireyaserrano.tema05.arrays;

public class ordenacion {

    public static void intercambio(int[] array, int posicionOrigen, int posicionDestino){
        int aux = array[posicionOrigen];
        array[posicionOrigen] = array[posicionDestino];
        array[posicionDestino] = aux;
    }

    public static void ordenaBurbuja(int[] array){
        boolean hayCambios;
        for (int i = 0; i< array.length; i++){
            hayCambios = false;
            for (int j = 0; j < array.length; j++){
                if (array[j] > array[j+1]){
                    intercambio(array, j, j+1);
                    hayCambios = true;
                }
            }
            if (!hayCambios){
                return;
            }
        }
    }

}
