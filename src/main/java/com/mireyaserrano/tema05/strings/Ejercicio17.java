package com.mireyaserrano.tema05.strings;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca su NIF: ");
        String nif = scanner.nextLine();
        char letra = nif.charAt(nif.length()-1);
        String dniStr = nif.replace(nif.charAt(nif.length()-1), ' ');
        dniStr = dniStr.trim();//parseInt
        int dni = Integer.parseInt(dniStr);
        String nifReal = Ejercicio16.calcularNIF(dni);
        char letraReal = nifReal.charAt(nifReal.length()-1);
        if (letra == letraReal){
            System.out.println("Su NIF es correcto");
        }else {
            System.out.printf("Su NIF es incorrecto, el NIF correcto de el DNI introducido es: %s", nifReal);
        }
    }
}
