package com.mireyaserrano.tema05.arrays;

public class CountingSort {
    public static void ordenaContando(int[] array){
        final int DISTANCIA_MAXIMA = 100000;
        ArraysEstadisticas arraysEstadisticas = new ArraysEstadisticas(array);
        int min = arraysEstadisticas.getMin();
        int max = arraysEstadisticas.getMax();
        if (max - min + 1 > DISTANCIA_MAXIMA){
            System.err.println("Hay demasiada dispersión en los datos");
            return;
        }
        int[] arrayConteo = new int[max + 1];
        for (int i = 0; i < array.length; i++){
            arrayConteo[array[i]]++;
        }
        //Falta array devuelta
    }
}
