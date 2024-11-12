package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Ejercicio16 {
    /**
     * solicita el DNI y devuelve el int DIN
     * @param mensaje Mensaje que ve el usuario
     * @return
     */
    public static int solicitarDNI(String mensaje){
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensaje);
        int dni = Integer.parseInt(scanner.nextLine());
        return dni;
    }

    /**
     * calcula la letra del NIF a partir de el DNI y devuelve un string del DNI más la letra
     * @param dni El DNI para el cual hay que calcular la letra del NIF
     * @return
     */
    public static String calcularNIF(int dni){
        int resto;
        String letrasNIF = "TRWAGMYFPDXBNJZSQVHLCKE";
        String dniStr = dni + "";
        resto = dni % 23;
        char letraNIF = switch (resto){
            case 0 -> letrasNIF.charAt(0);
            case 1 -> letrasNIF.charAt(1);
            case 2 -> letrasNIF.charAt(2);
            case 3 -> letrasNIF.charAt(3);
            case 4 -> letrasNIF.charAt(4);
            case 5 -> letrasNIF.charAt(5);
            case 6 -> letrasNIF.charAt(6);
            case 7 -> letrasNIF.charAt(7);
            case 8 -> letrasNIF.charAt(8);
            case 9 -> letrasNIF.charAt(9);
            case 10 -> letrasNIF.charAt(10);
            case 11 -> letrasNIF.charAt(11);
            case 12 -> letrasNIF.charAt(12);
            case 13 -> letrasNIF.charAt(13);
            case 14 -> letrasNIF.charAt(14);
            case 15 -> letrasNIF.charAt(15);
            case 16 -> letrasNIF.charAt(16);
            case 17 -> letrasNIF.charAt(17);
            case 18 -> letrasNIF.charAt(18);
            case 19 -> letrasNIF.charAt(19);
            case 20 -> letrasNIF.charAt(20);
            case 21 -> letrasNIF.charAt(21);
            case 22 -> letrasNIF.charAt(22);
            default -> '.';
        };
        String resultadoNIF = dniStr + letraNIF;
        return resultadoNIF;
    }

    public static void main(String args[]){
        int dni = solicitarDNI("Introduzca su DNI: ");
        System.out.printf("Su NIF es: %s", calcularNIF(dni));
    }
}
