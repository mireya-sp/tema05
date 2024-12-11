package com.mireyaserrano.tema05.matrices;

import com.mireyaserrano.tema05.lib.Escaner;
import com.mireyaserrano.tema05.lib.Matrices;

public class Ejercicio4 {

    public static int[][] matrizTraspuesta(int[][] matriz){
        int[][] matrizT = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matrizT[j][i] = matriz[i][j];
            }
        }
        return matrizT;
    }

    public static String[][] matrizPorFilaSuma(int[][] matriz){
        String[][] matrizFilasSumadas = new String[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                //matrizFilasSumadas[i][j] =
            }
        }
        return matrizFilasSumadas;
    }

    public static int[] valoresMaxYMin(int[][] matriz){
        int valorMax = 0;
        int valorMin = 101;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (matriz[i][j] < valorMin){
                    valorMin = matriz[i][j];
                }
                if (matriz[i][j] > valorMax){
                    valorMax = matriz[i][j];
                }
            }
        }
        int[] valoresMaxMin = new int[2];
        valoresMaxMin[0] = valorMin;
        valoresMaxMin[1] = valorMax;
        return valoresMaxMin;
    }

    public static double mediaMatriz(int[][] matriz){
        int sumaMatriz = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                sumaMatriz += matriz[i][j];
            }
        }
        double media = (double) sumaMatriz / (matriz.length + matriz[0].length);
        return media;
    }

    public static int[][] columna8GuardaAnteriores(int[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            int sumaFila = 0;
            for (int j = 0; j < matriz[i].length; j++){
                if (j == matriz[i].length - 1){
                    matriz[i][j] = sumaFila;
                }else {
                    sumaFila += matriz[i][j];
                }
            }
        }
        return matriz;
    }

    public static void main(String args[]){
        final int TAMANYO_FILAS = 4;
        final int TAMANYO_COLUMNAS = 8;
        int[][] matriz = Matrices.crearMatrizAleatoria(TAMANYO_FILAS, TAMANYO_COLUMNAS, 0, 100);

        System.out.printf("Matriz aleatoria: \n%s\n", Matrices.matrizToString(matriz,5));
        System.out.printf("Matriz traspuesta: \n%s\n", Matrices.matrizToString(matrizTraspuesta(matriz), 5));
        System.out.printf("Matriz por filas indicando la suma total de cada fila:\n%s\n", Matrices.matrizToStringSumaFilas(matriz, 5));
        int[] valoresMinMAx = valoresMaxYMin(matriz);
        System.out.printf("Valor mínimo en la matriz: %d\nValor máximo en la matriz: %d\n", valoresMinMAx[0], valoresMinMAx[1]);
        System.out.printf("Media de toda la matriz = %f\n", mediaMatriz(matriz));
        System.out.println("Dime una fila:");
        int fila = Integer.parseInt(Escaner.lector.nextLine());
        System.out.println("Dime una columna:");
        int columna = Integer.parseInt(Escaner.lector.nextLine());
        System.out.printf("El valor de la fila %d y columna %d, es %d\n", fila, columna, matriz[fila][columna]);
        System.out.println("Indícame una fila:");
        fila = Integer.parseInt(Escaner.lector.nextLine());
        System.out.printf("La fila eleguida:\n%s\n", Matrices.filaMatrizToString(matriz, 5, fila));
        System.out.println("Indícame una columna");
        columna = Integer.parseInt(Escaner.lector.nextLine());
        System.out.printf("La columna eleguida:\n%s\n", Matrices.columnaMatrizToString(matriz, 5, columna));
        System.out.printf("Guarda en la columna 8 el total de todas las anteriores:\n%s\n", Matrices.matrizToString(columna8GuardaAnteriores(matriz), 5));
        Escaner.lector.close();
    }
}
