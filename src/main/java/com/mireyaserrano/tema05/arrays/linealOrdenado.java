package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;
import com.mireyaserrano.tema05.lib.MetodosArrays;
import java.util.Arrays;

public class linealOrdenado {

    /**
     * busca un número en un array aleatorio ordenado
     * @param array el array aleatorio ordenado donde se va a buscar el número
     * @param numABuscar el número a buscar en el array aleatorio ordenado
     * @return si encuentra el número devuelve la posición del array que ocupaba, si el valor se pasa devuelve -1
     */
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
