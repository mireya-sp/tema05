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

    public static double[][] crearMatrizAleatoria(int filas, int columnas, double valorMinimo, double valorMaximo){
        double[][] matriz = new double[filas][columnas];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = MetodosArrays.aleatorio(valorMinimo, valorMaximo);
            }
        }
        return matriz;
    }

    public static int[][] crearMatrizAleatoria(int filas, int columnas, int valorMinimo, int valorMaximo){
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)MetodosArrays.aleatorio(valorMinimo, valorMaximo);
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

    public static String matrizToString(int[][] matriz, int paddding){
        int anchoColumna = determinarLongitudMaxima(matriz);
        String formatoDecimales = "%" + anchoColumna + "d";
        String formatoPadding = "%" + (anchoColumna + paddding) + "s";
        StringBuilder sb = new StringBuilder();
        for (int[] fila : matriz){
            for (int valor : fila){
                sb.append(String.format(formatoPadding, String.format(formatoDecimales, valor)));
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static String matrizToStringSumaFilas(int[][] matriz, int paddding){
        int anchoColumna = determinarLongitudMaxima(matriz);
        String formatoDecimales = "%" + anchoColumna + "d";
        String formatoPadding = "%" + (anchoColumna + paddding) + "s";
        StringBuilder sb = new StringBuilder();
        int sumaFila = 0;
        for (int i = 0; i < matriz.length; i++){
            sumaFila = 0;
            sb.append("Fila " + i + ": ");
            for (int j = 0; j < matriz[i].length; j++){
                sb.append(String.format(formatoPadding, String.format(formatoDecimales, matriz[i][j])));
                sumaFila += matriz[i][j];
            }
            sb.append(" = " + sumaFila + "\n");
        }
        return sb.toString();
    }

    public static String filaMatrizToString(int[][] matriz, int paddding, int fila){
        int anchoColumna = determinarLongitudMaxima(matriz);
        String formatoDecimales = "%" + anchoColumna + "d";
        String formatoPadding = "%" + (anchoColumna + paddding) + "s";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz[0].length; i++){
            sb.append(String.format(formatoPadding, String.format(formatoDecimales, matriz[fila-1][i])));
        }
        return sb.toString();
    }

    public static String columnaMatrizToString(int[][] matriz, int paddding, int columna){
        int anchoColumna = determinarLongitudMaxima(matriz);
        String formatoDecimales = "%" + anchoColumna + "d";
        String formatoPadding = "%" + (anchoColumna + paddding) + "s";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < matriz.length; i++){
            sb.append(String.format(formatoPadding, String.format(formatoDecimales, matriz[i][columna-1]))).append("\n");
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

    public static int determinarLongitudMaxima(int[][] matriz){
        int longitudMaxima = 0;
        for (int[] fila : matriz){
            int longitud = MetodosArrays.determinarLongitudMaxima(fila);
            if (longitud > longitudMaxima){
                longitudMaxima = longitud;
            }
        }
        return longitudMaxima;
    }


}
