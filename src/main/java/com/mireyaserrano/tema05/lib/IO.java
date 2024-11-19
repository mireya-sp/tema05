package com.mireyaserrano.tema05.lib;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class IO{
    /**
     * Solicita un texto y valida que su longitud este comprendida entre longitudMinima y longitudMaxima
     * @param mensaje Mensaje que se le mostrará al usuario
     * @param longitudMinima Número mínimo de caracteres que debe tener el texto
     * @param longitudMaxima Número máximo de caracteres que debe tener el texto
     * @return El texto leido validado
     */
    public static String solicitarString(String mensaje, int longitudMinima, int longitudMaxima){
        Scanner scanner = new Scanner(System.in);
        String texto;
        boolean valido;
        do {
            System.out.println(mensaje);
            texto = scanner.nextLine();
            valido = texto.length() >= longitudMinima && texto.length() <= longitudMaxima;
            if (!valido){
                System.err.printf("La longitud debe estar comprendida entre [%d - %d]\n", longitudMinima, longitudMaxima);
            }
        }while (!valido);
        scanner.close();
        return texto;
    }

    public static int solicitarInt(String mensaje, int min, int max) {
        int respuesta;
        do {
            //Solicitamos el 'int'
            System.out.println(mensaje);
            respuesta = Integer.parseInt(Escaner.lector.nextLine());
            //Validamos la respuesta
            if (respuesta<min||respuesta>max) {
                System.err.printf("El número introducido no puede ser inferior a %d, ni superior a %d.\n\n", min, max);
            }
        } while (respuesta<min||respuesta>max);
        return respuesta;
    }

    public static void solicitarDatosArray(double[] array){
        if (array == null){
            return ;
        }
        for (int i = 0; i < array.length; i++){
            System.out.printf("a [%d]?\n", i);
            array[i] = Double.parseDouble(Escaner.lector.nextLine());
        }
    }

    public static String arrayToString(double[] array, int decimales){
        if (array == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        String espacio = "";
        String coma = ",";
        String formato = "%." + decimales + "f";
        for (int i = 0; i < array.length; i++){
            if (i == array.length-1){
                coma = "";
            }
            sb.append(espacio).append(String.format("%.4f", array[i])).append(coma);
            if (i == 0){
                espacio = " ";
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static void rellenarArray(double[] array, double valorMinimo, double valorMaximo){
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = aleatorio(valorMinimo, valorMaximo);
        }
    }

    public static double aleatorio(double valorMinimo, double valorMaximo){
        Random random = new Random();
        return valorMinimo + random.nextDouble() * (valorMaximo - valorMinimo);
    }

    public static double mediaArray(double[] array){
        double suma = 0;
        for (double numero : array){
            suma += numero;
        }
        return suma / array.length;
    }


    public static void solicitarDatosArray(char[] array){
        if (array == null){
            return;
        }
        for (int i = 0; i < array.length; i++){
            System.out.printf("a [%d]?\n", i);
            array[i] = Escaner.lector.nextLine().charAt(0);
        }
    }

    public enum Paridad{
        PAR, IMPAR
    }

    public static String arrayToString(char[] array, Paridad paridad){
        final int NUM_ELEMENTOS = paridad == Paridad.PAR ? array.length / 2 : array.length / 2+1;
        char [] resultado = new char [NUM_ELEMENTOS];
        int contador = 0;
        for (int i = paridad == Paridad.PAR ? 0: 1; i < array.length; i += 2){
            resultado[contador++] = array[i];
        }
        return Arrays.toString(resultado);
    }

    public static int determinarLongitudMaxima(double[] array, int decimales){
        int longitudMaxima = 0;
        String formato = "%." + decimales + "f";
        for (int i = 0; i < array.length; i++){
            int longitudActual = String.format(formato, array[i]).length();
            if (){

            }
        }
    }

    public static String arrayToString(double[] array, int decimales, int columnas){
        return arrayToString(array, decimales, columnas, 1)
    }

    public static String arrayToString(double[] array, int decimales, int columnas, int padding){
        if (array == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String formato = "%." + decimales + "f";
        int tamanyoColumna = determinarLongitudMaxima(array, decimales) + padding;
        String formatoColumna = "%" + tamanyoColumna + "s";
        for (int i = 0; i < array.length; i++){
            sb.append(String.format(formatoColumna, String.format(formato, array[i]));
            if ((i + 1) % columnas == 0){
                sb.append("\n");
            }
        }
        return sb.toString();
    }

}
