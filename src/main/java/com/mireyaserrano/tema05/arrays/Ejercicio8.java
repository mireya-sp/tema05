package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.IO;

import java.util.Scanner;

public class Ejercicio8 {
    /**
     * busca si un número está en un array
     * @param array el array dado donde buscar el número
     * @param num el número a buscar en el array
     * @return en caso de que no esté devuelve un -1, y si lo encuentra devuelve la posición del array donde se encuentra el número
     */
    public static int indexOf(double[] array, double num){
        boolean valido = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == num){
                return i;
            }
        }
        return -1;
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
        if (indexOf(array, num) == -1){
            System.out.println("No se ha encontrado el número");
        }else {
            System.out.printf("Se ha encontrado el número en la posición %d del array", indexOf(array, num));
        }
    }
}
