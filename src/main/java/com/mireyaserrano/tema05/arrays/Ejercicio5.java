package com.mireyaserrano.tema05.arrays;

import com.mireyaserrano.tema05.lib.IO;
import java.util.Scanner;

public class Ejercicio5 {

    public static int superiorMedia(double[] array, double media){
        int contador = 0;
        for (double numero : array){
            if (numero >= media){
                contador += 1;
            }
        }
        return contador;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el numero de estaturas que va a introducir:");
        final int TAMANYO_ARRAY = Integer.parseInt(scanner.nextLine());
        double[] estaturas = new double[TAMANYO_ARRAY];
        IO.solicitarDatosArray(estaturas);
        System.out.println("La media de estaturas es de " + IO.mediaArray(estaturas));
        System.out.println("Hay " + superiorMedia(estaturas, IO.mediaArray(estaturas)) + " estaturas superiores a la media");
    }
}
