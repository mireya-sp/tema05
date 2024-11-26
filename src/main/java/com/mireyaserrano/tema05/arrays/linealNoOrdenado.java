package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;
import java.util.Random;

public class linealNoOrdenado {

    /**
     * Llena un array con char con letras mayusculas aleatorias
     * @param array el array que hay que llenar
     * @return devuelve el array lleno
     */
    public static char[] llenarArray(char[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            char letra = (char) random.nextInt(65, 91);
            array[i] = letra;
        }
        return array;
    }

    /**
     * Busca una letra en un array
     * @param array array que se va a recorrer buscando una letra
     * @param letraABuscar la letra a buscar en el array aleatorio
     * @return si se encuentra la letra devuelve la posición del array aleatorio que ocupa, si no devuelve -1
     */
    public static int buscarLetra(char[] array, char letraABuscar){
        for (int i = 0; i < array.length; i++){
            if (array[i] == letraABuscar){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        System.out.println("Introduce el tamaño del array: ");
        final int TAMANYO_ARRAY = Integer.parseInt(Escaner.lector.nextLine());

        System.out.println("Introduce la letra MAYUSCULA que quieres buscar: ");
        char letraABuscar = Escaner.lector.nextLine().charAt(0);

        char[] array = new char[TAMANYO_ARRAY];
        array = llenarArray(array);

        if (buscarLetra(array, letraABuscar) < 0){
            System.out.printf("La letra %s no se ha encntrado en el array aleatorio.", letraABuscar);
        }else {
            System.out.printf("La letra %s se ha encontrado por primera vez en la posición %d del array aleatorio.", letraABuscar, buscarLetra(array, letraABuscar));
        }

    }
}
