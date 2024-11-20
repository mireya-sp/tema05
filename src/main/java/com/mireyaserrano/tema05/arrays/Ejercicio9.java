package com.mireyaserrano.tema05.arrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio9 {
    /**
     * rellena el array con números aleatorios del 0 al 50
     * @param array array que se rellena
     */
    public static void crearArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(0, 51);
        }
    }

    /**
     * visualiza todo el contenido del array
     * @param array array que se visualiza
     */
    public static void visualizarArray(int[] array){
        if (array == null){
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ",";
        String formato = "%d";
        for (int i = 0; i < array.length; i++){
            if (i == array.length-1){
                coma = "";
            }
            sb.append(espacio).append(String.format(formato, array[i])).append(coma);
            if (i == 0){
                espacio = " ";
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    /**
     * muestra la posición y el contenido de los elementos con valor par
     * @param array array donde buscar elementos pares
     */
    public static void visualizarPares(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                System.out.println("El número par " + array[i] + " está en la posición " + i);
            }
        }
    }

    /**
     * muestra la posición y el contenido de los elementos que son múltiplos de 3
     * @param array array donde se buscan múltiplos de 3
     */
    public static void visualizarMultiplos3(int[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i] % 3 == 0){
                System.out.println("El número múltiplo de tres " + array[i] + " está en la posición " + i);
            }
        }
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        final int TAMANYO_ARRAY = 10;
        int[] array = new int[TAMANYO_ARRAY];
        int menu;
        do {
            System.out.println("MENÚ PRINCIPAL\n==============\n1.-Rellenar array.\n2.-Visualizar contenido del array\n3.-Visualizar contenido par.\n4.-Visualizar contenido múltiplo de 3\n0.-Salir del menú.\nSelecciona una opción:");
            menu = Integer.parseInt(scanner.nextLine());
            switch (menu){
                case 1 -> crearArray(array);
                case 2 -> visualizarArray(array);
                case 3 -> visualizarPares(array);
                case 4 -> visualizarMultiplos3(array);
                case 0 -> System.out.println("Saliendo del menú...");
                default -> System.err.println("ERROR. Selecciona una opcion valida");
            }
        }while (menu != 0);
    }
}
