package com.mireyaserrano.tema05;

import java.util.Scanner;

public class Main {
        public static int potencia(int exp) {
            int sol = 0;
            int base = 16;
            if (exp == 0){
                sol = 1;
            }else if (exp == 1) {
                sol = base;
            } else {
                sol = base * potencia(exp - 1);
            }
            return sol;
        }

        public static void main(String args[]) {
            // Obtener un número hexadecimal válido del usuario
            String hexadecimal = obtenerHexadecimalValido("Dime el hexadecimal a convertir en decimal:");

            // Convertir el número hexadecimal a decimal
            int decimal = conversionHexadecimalADecimal(hexadecimal);

            // Mostrar el resultado
            System.out.println("El número hexadecimal " + hexadecimal + " en decimal es: " + decimal);
        }

        public static String obtenerHexadecimalValido(String mensaje) { //METODO REUTILIZABLE
            Scanner scanner = new Scanner(System.in);
            String hexadecimal;
            boolean valido;
            do {
                System.out.println(mensaje);
                hexadecimal = scanner.nextLine();
                hexadecimal = hexadecimal.toUpperCase();
                valido = isHexadecimal(hexadecimal);
            } while (!valido);

            return hexadecimal;
        }

        public static boolean isHexadecimal(String hexadecimal) {
            if(hexadecimal.isEmpty()) {
                System.err.println("ERROR. Introduce un valor.");
            }

            char[] hexDigits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };

            for (char simbolo : hexadecimal.toCharArray()) {
                boolean valido = false;
                for (char hexDigit : hexDigits) {
                    if (simbolo == hexDigit) {
                        valido = true;
                        break;
                    }
                }
                if (!valido){
                    return false;
                }
            }
            return true;
        }

        public static int conversionHexadecimalADecimal(String hexadecimal) {
            int decimal = 0;
            int j = 0;
            int[] numeros = new int[hexadecimal.length()];
            char[] digito = new char[hexadecimal.length()];
            for (int i = hexadecimal.length() - 1; i >= 0; i--) {
                digito[j] = hexadecimal.charAt(i);
                j++;
            }
            for (int k = 0; k < digito.length; k++) {
                if (Character.isDigit(digito[k])) {
                    numeros[k] = Character.getNumericValue(digito[k]);
                    decimal += numeros[k] * potencia(k);
                } else {
                    switch (digito[k]) {
                        case 'A' -> decimal += 10 * potencia(k);
                        case 'B' -> decimal += 11 * potencia(k);
                        case 'C' -> decimal += 12 * potencia(k);
                        case 'D' -> decimal += 13 * potencia(k);
                        case 'E' -> decimal += 14 * potencia(k);
                        case 'F' -> decimal += 15 * potencia(k);
                    }
                    ;
                }
            }
            return decimal;
        }

}

