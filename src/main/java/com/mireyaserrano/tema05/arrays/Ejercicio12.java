package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.MetodosArrays;

public class Ejercicio12 {
    public static void main(String args[]){
        final int TAMANYO_ARRAY = 50;
        int[] arrayV = new int[TAMANYO_ARRAY];
        int[] arrayP = new int[TAMANYO_ARRAY];
        MetodosArrays.rellenarArray(arrayV, 0, 100);
        for (int i = 0; i < arrayV.length;i++){
            arrayP[i] = arrayV[i];
            for (int j = 0; j < i;j++){
                arrayP[i] = arrayP[i] + arrayV[j];
            }
        }
        System.out.printf("Array V: %s\n", MetodosArrays.arrayToString(arrayV));
        System.out.printf("Array P: %s\n", MetodosArrays.arrayToString(arrayP));
    }
}
