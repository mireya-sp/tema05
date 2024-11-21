package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.MetodosArrays;

public class Ejercicio3 {
    public static void main(String args[]) {
        final int TAMANYO_ARRAY = 20;
        double[] array = new double[TAMANYO_ARRAY];
        MetodosArrays.rellenarArray(array, 100, 1000);
        System.out.println(MetodosArrays.arrayToString(array, 4, 4));
    }
}
