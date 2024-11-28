package com.mireyaserrano.tema05.matrices;

import com.mireyaserrano.tema05.lib.Escaner;
import com.mireyaserrano.tema05.lib.Matrices;

public class Ejercicio1 {
    public static void main(String args[]){
        System.out.println("Introduce el número de filas que debe tener la matriz: ");
        int filas = Integer.parseInt(Escaner.lector.nextLine());
        System.out.println("Introduce el número de columnas que debe tener la matriz: ");
        int columnas = Integer.parseInt(Escaner.lector.nextLine());

        double[][]  matriz = new double[filas][columnas];
        Matrices.solicitarDatosMatrices(matriz);
        Matrices.matrizToString(matriz, 4, 5);

    }
}
