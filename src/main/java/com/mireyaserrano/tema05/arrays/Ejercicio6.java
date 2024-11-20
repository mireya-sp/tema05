package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;
import com.mireyaserrano.tema05.lib.IO;

public class Ejercicio6 {
    /**
     * suma de dos arrays
     * @param suma el array donde se guarda la suma de cada elemento de los dos arrays
     * @param array1 uno de los array de los que se suman los elementos
     * @param array2 el otro array de el que se suman los elementos
     */
    public static void sumaArrays(double[] suma, int[] array1, int[] array2){
        for (int i = 0; i < suma.length; i++){
            suma[i] = array1[i] + array2[i];
        }
    }

    /**
     * division de dos arrays
     * @param division el array dende se guarda la division de cada elemento de los dos arrays
     * @param array1 uno de los arrays de los que se dividen los elementos
     * @param array2 el otro array del que se dividen los elementos
     */
    public static void divisionArrays(double[] division, int[] array1, int[] array2){
        for (int i = 0; i < division.length; i++){
            division[i] = (double) array1[i] / array2[i];
        }
    }

    public static void main(String args[]){
        final int TAMANYO_ARRAY = 10;
        int[] array1 = new int[TAMANYO_ARRAY];
        int[] array2 = new int[TAMANYO_ARRAY];
        double[] suma = new double[TAMANYO_ARRAY];
        double[] division = new double[TAMANYO_ARRAY];
        IO.rellenarArray(array1, 1, 10);
        IO.rellenarArray(array2, 1, 10);
        sumaArrays(suma, array1, array2);
        divisionArrays(division, array1, array2);
        System.out.println(IO.arrayToString(suma, 0));
        System.out.println(IO.arrayToString(division, 2));
    }
}
