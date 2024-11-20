package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.IO;

import java.util.Scanner;

public class Ejercicio8 {

    public static boolean buscarNum(double[] array, double num){
        boolean valido = false;
        for (int i = 0; i < array.length; i++){
            valido = (array[i] == num);
        }
        return valido;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de elmentos que va a meter en el array:(del 0 al 100) ");
        final int TAMANYO_ARRAY = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca qué número hay que buscar en el array aleatorio: ");
        double num = Double.parseDouble(scanner.nextLine());
        scanner.close();

        double[] array = new double[TAMANYO_ARRAY];
        IO.rellenarArray(array, 0, 100);
        if (!buscarNum(array, num)){
            System.out.println("No se ha encontrado el número");
        }else {
            System.out.println("Se ha encontrado el número");
        }
    }
}
