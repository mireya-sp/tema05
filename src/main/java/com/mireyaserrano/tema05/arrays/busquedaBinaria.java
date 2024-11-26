package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;
import com.mireyaserrano.tema05.lib.MetodosArrays;
import java.util.Arrays;

public class busquedaBinaria {

    /**
     * busca un número en un array de forma que si el valor es mayor que el valor de la posicion media del array lo busca por encima.
     * @param array el array donde se busca el número
     * @param numABuscar el número que se busca en el array
     * @param valorMax el valor maximo del trozo donde vamos a estar dividiendo
     * @param valorMin el valor minimo del trozo que hay que dividir
     * @return si encuentra el número devuelve la posición del array donde está, si no devuelve -1
     */
    public static int binarySearch(int[] array, int numABuscar, int valorMax, int valorMin){
        if (valorMax >= valorMin){
            int mitad = valorMin + (valorMax - valorMin) / 2;
            if (array[mitad] == numABuscar){
                return mitad;
            }
            if (array[mitad] > numABuscar){
                return binarySearch(array, numABuscar, mitad-1, valorMin);
            }
            if (array[mitad] < numABuscar){
                return binarySearch(array, numABuscar, valorMax, mitad + 1);
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
        MetodosArrays.rellenarArray(array, 0, 10);
        Arrays.sort(array);
        System.out.println(MetodosArrays.arrayToString(array));

        if (binarySearch(array, numABuscar, array.length-1, 0) == -1){
            System.out.printf("El número %d no se ha encontrado en el array aleatorio.", numABuscar);
        }else {
            System.out.printf("El número %d se ha encontrado en la posición %d del array aleatorio.", numABuscar, binarySearch(array, numABuscar, array.length -1, 0));
        }
    }
}
