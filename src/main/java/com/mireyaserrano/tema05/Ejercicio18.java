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

    /**
     * hace la suma de los números que se encuentren en el string fecha
     * @param fecha la fecha a partir de la cual calculamos el luky number del usuario
     * @return la suma de los números que contenga el string fecha introducido
     */
    public static int primeraSuma(String fecha){
        String numeros = "";
        int suma = 0;
        for (int i = 0; i < fecha.length(); i++){
            if (Character.isDigit(fecha.charAt(i))){
                numeros += "" + fecha.charAt(i);
            }
        }
        for (int j = 0; j < numeros.length(); j++){
            char k = numeros.charAt(j);
            suma += Character.getNumericValue(k);
        }
        return suma;
    }

    public static void main(String args[]){
        String fecha = solicitarFecha("Introduzca su fecha de nacimiento en formato dd-mm-aaaa:");
        String primerResultado = "" + primeraSuma(fecha);
        System.out.println("Tu 'luky number' es: " + primeraSuma(primerResultado));
    }
}
