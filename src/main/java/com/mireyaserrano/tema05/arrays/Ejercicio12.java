package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.IO;
import com.mireyaserrano.tema05.lib.MetodosArrays;

public class Ejercicio12 {

    public static int llenarArrayP(int[] arrayP, int[] arrayV){
        for (int i = 0; i < arrayP.length; i++){
            if (i == 0){
                arrayP[i] = arrayV[i];
            }else{
                arrayP[i] = arrayV[i] + (llenarArrayP(arrayP, arrayV));
            }
        }

    }

    public static void main(String args[]){
        final int TAMANYO_ARRAY = 50;
        int[] arrayV = new int[TAMANYO_ARRAY];
        int[] arrayP = new int[TAMANYO_ARRAY];
        MetodosArrays.rellenarArray(arrayV, 0, 100);

    }
}
