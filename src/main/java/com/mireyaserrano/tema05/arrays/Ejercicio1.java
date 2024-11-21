package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.MetodosArrays;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String args[]){
        final int TAMANYO_ARRAY = 10;
        double[] numeros = new double[10];
        MetodosArrays.rellenarArray(numeros, 0, 10);
        System.out.println(MetodosArrays.arrayToString(numeros, 8));
        System.out.println(Arrays.toString(numeros));
        System.out.printf("La media del array es %.2f\n", MetodosArrays.mediaArray(numeros));
    }
}
