package com.mireyaserrano.tema05.lib;

public class Matrices {
    public static void solicitarDatosMatrices(double[][] matriz){
        if (matriz == null){
            return ;
        }
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.printf("Introduce el valor de la fila %d, columna %d de la matriz:\n", i+1, j+1);
                matriz[i][j] = Double.parseDouble(Escaner.lector.nextLine());
            }
        }
    }

    public static void mostrarMatrices(double[][] matriz, int decimales){
        int aux = 0;
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (aux == i){
                    System.out.printf("%10." + decimales + "f", matriz[i][j]);
                } else {
                    System.out.printf("\n%10."+ decimales + "f", matriz[i][j]);
                    aux++;
                }
            }
        }
    }
}
