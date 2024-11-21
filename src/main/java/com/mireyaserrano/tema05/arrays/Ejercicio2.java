package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.MetodosArrays;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String args[]){
        final int TAMANYO_ARRAY = 10;
        double[] array = new double[TAMANYO_ARRAY];
        char[] arrayChar = new char[TAMANYO_ARRAY];
        MetodosArrays.solicitarDatosArray(arrayChar);

        System.out.println(Arrays.toString(arrayChar));
        System.out.println(MetodosArrays.arrayToString(arrayChar, MetodosArrays.Paridad.PAR));
    }
}
