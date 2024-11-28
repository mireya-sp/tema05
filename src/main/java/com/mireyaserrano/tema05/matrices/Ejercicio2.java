package com.mireyaserrano.tema05.matrices;

import com.mireyaserrano.tema05.lib.Matrices;
import com.mireyaserrano.tema05.lib.MetodosArrays;

public class Ejercicio2 {
    public static void main(String args[]){
        final int TAMANYO_ARRAY_V = 50;
        final int TAMANYO_ARRAY_P = 20;
        int[] arrayV = new int[TAMANYO_ARRAY_V];
        int[] arrayP = new int[TAMANYO_ARRAY_P];
        MetodosArrays.rellenarArray(arrayV, 1, 10);
        MetodosArrays.rellenarArray(arrayP, 1, 10);
        double[][] matriz = new double[TAMANYO_ARRAY_V][TAMANYO_ARRAY_P];
        for (int i = 0; i < arrayV.length; i++){
            for (int j = 0; j < arrayP.length; j++){
                matriz[i][j] = arrayV[i] * arrayP[j];
            }
        }
        Matrices.matrizToString(matriz, 0, 5);
    }
}
