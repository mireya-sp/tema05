package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.Escaner;
import java.util.Random;

public class linealNoOrdenado {

    public static char[] llenarArray(char[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            char letra = (char) random.nextInt(65, 91);
            array[i] = letra;
        }
        return array;
    }

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
            System.out.println("La letra introducida no se ha encntrado en el array aleatorio.");
        }else {
            System.out.printf("La letra introducida se ha encontrado por primera vez en la posición %d del array aleatorio.", buscarLetra(array, letraABuscar));
        }

    }
}
