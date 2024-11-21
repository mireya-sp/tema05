package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.IO;

public class Ejercicio11 {
    public static void main(String args[]){
        int j = 0;
        final int TAMANYO_ARRAY = 10;
        int[] arrayV = new int[TAMANYO_ARRAY];
        int[] arrayP = new int[TAMANYO_ARRAY];
        IO.rellenarArray(arrayV, 0, 100);
        for (int i = arrayV.length-1; i >= 0; i--){
            arrayP[j] = arrayV[i];
            j++;
        }
        System.out.printf("Array V: %s\n",IO.arrayToString(arrayV));
        System.out.printf("Array P: %s\n",IO.arrayToString(arrayP));
    }
}
