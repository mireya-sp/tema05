package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.IO;

import java.util.Random;

public class Ejercicio10 {

    public static void llenarArrayS(double[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            if (array[i] <= 10){
                array[i] = -1;
            }
        }
    }

    public static void main(String args[]){
        final int TAMANYO_ARRAY = 10;
        double[] arrayP = new double[TAMANYO_ARRAY];
        IO.solicitarDatosArray(arrayP);
        System.out.println(IO.arrayToString(arrayP, 4));
        double[] arrayS = arrayP;
        llenarArrayS(arrayS);
        System.out.println(IO.arrayToString(arrayS, 4));

    }
}