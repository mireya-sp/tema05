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

    public static double[][] crearMatrizAleatoria(int filas, int columnas, double valorMinimo, double valorMaximo){
        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; i < matriz[i].length; j++){
                matriz[i][j] = MetodosArrays.aleatorio(valorMinimo, valorMaximo);
            }
        }
        return matriz;
    }

    public static String matrizToString(double[][] matriz, int decimales, int paddding){
        int anchoColumna = determinarLongitudMaxima(matriz, decimales);
        String formatoDecimales = "%" + anchoColumna + "." + decimales + "f";
        String formatoPadding = "%" + (anchoColumna + paddding) + "s";
        StringBuilder sb = new StringBuilder();
        for (double[] fila : matriz){
            for (double valor : fila){
                sb.append(String.format(formatoPadding, String.format(formatoDecimales, valor)));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static int determinarLongitudMaxima(double[][] matriz, int decimales){
        int longitudMaxima = 0;
        for (double[] fila : matriz){
            int longitud = MetodosArrays.determinarLongitudMaxima(fila, decimales);
            if (longitud > longitudMaxima){
                longitudMaxima = longitud;
            }
        }
        return longitudMaxima;
    }


}
