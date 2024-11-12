package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio18 {
    /**
     * solicita la fecha y la devuelve en un string
     * @param mensaje el mensaje que ve el usuario
     * @return el string fecha
     */
    public static String solicitarFecha(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.println(mensaje);
        String fecha = scanner.nextLine();
        return fecha;
    }

    public static int primeraSuma(){

    }

    public static void main(String args[]){
        String fecha = solicitarFecha("Introduzca su fecha de nacimiento en formato dd-mm-aaaa:");



    }
}
