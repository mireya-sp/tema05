package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;
import com.mireyaserrano.tema05.lib.MetodosArrays;
import java.util.Arrays;

public class linealOrdenado {

    public static int buscarNumero(int[] array, int numABuscar){
        for (int i = 0; i < array.length; i++){
            if (array[i] == numABuscar){
                return i;
            } else if (array[i] > numABuscar) {
                return -1;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println("Introduce el tamaño del array: ");
        final int TAMANYO_ARRAY = Integer.parseInt(Escaner.lector.nextLine());

        System.out.println("Introduce el número que quieres buscar en el array aleatorio: ");
        int numABuscar = Integer.parseInt(Escaner.lector.nextLine());

        int[] array = new int[TAMANYO_ARRAY];
        MetodosArrays.rellenarArray(array, 0, 200);
        Arrays.sort(array);

        if (buscarNumero(array, numABuscar) == -1){
            System.out.printf("El numero %d no se ha encontrado en el array aleatorio.", numABuscar);
        }else {
            System.out.printf("El número %d se ha encontrado en la posición %d del array aleatorio.", numABuscar, buscarNumero(array, numABuscar));
        }
    }
}
