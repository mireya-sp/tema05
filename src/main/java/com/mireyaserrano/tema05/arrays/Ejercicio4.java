package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.MetodosArrays;

public class Ejercicio4 {
    public static void main(String args[]){
        final int TAMANYO_ARRAY = 30;
        double[] numeros = new double[TAMANYO_ARRAY];
        MetodosArrays.rellenarArray(numeros, 0, 10);
        System.out.println("La media de los números mayores o iguales a 5 es de " + MetodosArrays.mediaArrayCondicion(numeros, 5));
        System.out.println("La media total es de " + MetodosArrays.mediaArray(numeros));
    }
}
