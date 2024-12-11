package com.mireyaserrano.tema05.lib;

public class Matrices {
    /**
     * solicita llos datos para rellenar matrices
     * @param matriz matriz que hay que rellenar
     */
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

    /**
     * crea matriz aleatoria
     * @param filas las filas que tiene que tener la matriz
     * @param columnas las columnas que tiene que tener la matriz
     * @param valorMinimo el valor mínimo que puede tener un elemento de la matriz
     * @param valorMaximo el valor máximo que puede tener un elemento de la matriz
     * @return la matriz aleatoriia creada
     */
    public static int[][] crearMatrizAleatoria(int filas, int columnas, int valorMinimo, int valorMaximo){
        int[][] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = (int)MetodosArrays.aleatorio(valorMinimo, valorMaximo);
            }
        }
        return matriz;
    }

    /**
     * double matriz to string
     * @param matriz la matriz que hay que pasarla a String para visualizarla de manera correcta
     * @param decimales la cantidad máxima de decimales con la que vamos a imprimir los elementos ya que son doubles
     * @param paddding la separación entre elemnetos
     * @return la matriz en String
     */
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

    /**
     * int matriz a String para la mejor visualización de los elementos
     * @param matriz la matriz que hay que cambiar a string
     * @param paddding la separación con la que vamos a imprimir los elementos de la matriz
     * @return la matriz en string
     */
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

    /**
     * matriz a string pero con la suma de Filas representadas
     * @param matriz la matriz que vamos a imprimir en string
     * @param paddding la separación entre los elementos de la matriz cuando sean impresos
     * @return la matriz en forma de string lista para ser impresa
     */
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

    /**
     * imprime la fila indicada de una matriz
     * @param matriz la matriz donde se encuentra la fila
     * @param paddding la separacion entre los elementos de la matriz a la hora de imprimir
     * @param fila la fila que se quiere imprimir
     * @return el string que imprime la fila bonita
     */
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

    /**
     * imprime la columna de una matriz
     * @param matriz la matriz de la que vamos a imprimir la columna
     * @param paddding la separación entre los elementos de la matriz a la hora de imprimir
     * @param columna la columna que se quiere imprimir
     * @return el string que imprime la columna bonita
     */
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

    /**
     * determina la longitud maxima de un elemento de una matriz double
     * @param matriz la matriz donde analizamos la longitud de los elementos
     * @param decimales la cantidad de decimales que se quieren imprimir
     * @return la longitud maxima de los elementos de la matriz
     */
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

    /**
     * determina la longitud maxima de un elemento en una matriz int
     * @param matriz la matriz donde buscaremos cuál es el elemnto más largo
     * @return la longitud maxima de el elemneto más largo de la matriz
     */
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
