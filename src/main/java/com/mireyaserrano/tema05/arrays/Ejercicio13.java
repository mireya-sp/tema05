package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.MetodosArrays;

public class Ejercicio13 {

    public static int cuantosPares(int[] arrayV){
        int contador = 0;
        for (int i = 0; i < arrayV.length; i++){
            if (arrayV[i] % 2 == 0){
                contador += 1;
            }
        }
        return contador;
    }

    public static int[] llernarP(int[] arrayV, int contador){
        int j = 0;
        int[] arrayP = new int[cuantosPares(arrayV)];
        for (int i = 0; i < arrayV.length; i++){
            if (arrayV[i] % 2 == 0){
                arrayP[j] = arrayV[i];
                j++;
            }
        }
        return arrayP;
    }

    public static void main(String args[]) {
        final int TAMANYO_ARRAY = 50;
        int[] arrayV = new int[TAMANYO_ARRAY];
        MetodosArrays.rellenarArray(arrayV, 0, 100);
        if (cuantosPares(arrayV) <= 0){
            System.err.println("NO HAY PARES EN EL ARRAY ALEATORIO");
        }else {
            int[] arrayP = new int[cuantosPares(arrayV)];
            arrayP = llernarP(arrayV, cuantosPares(arrayV));
            System.out.printf("Array V: %s\n", MetodosArrays.arrayToString(arrayV));
            System.out.printf("Array P: %s", MetodosArrays.arrayToString(arrayP));
        }
    }
}
