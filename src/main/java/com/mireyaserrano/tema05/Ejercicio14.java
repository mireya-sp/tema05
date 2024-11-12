package com.mireyaserrano.tema05;

import java.util.Scanner;
import static com.mireyaserrano.tema05.lib.IO.solicitarInt;

public class Ejercicio14 {
    /**
     * Calcula si alguno de los números que se imprimen son el número introducido a cambiar por una letra
     * @param num es el número a cabiar por una letra
     * @param i primer dígito de los números a imprimir
     * @param j segundo dígito de los números a imprimir
     * @param k tercer dígito de los números a imprimir
     * @param a cuarto dígito de los números a imprimir
     * @param leter es la letra que hay que poner en vez del número
     * @return la cadena de números con las letras cambiadas en los correspondientes
     */
    public static String cambioNumLetr(int num, int i, int j, int k, int a, char leter){
        String resultado;
        if (i == num && j == num && k == num && a == num){
            resultado = leter + "-" + leter + "-" + leter+ "-" + leter;
        }else if (i == num && j == num && k == num && a != num){
            resultado = leter + "-" + leter + "-" + leter + "-" + a;
        }else if (i == num && j == num && k != num && a == num){
            resultado = leter + "-" + leter + "-" + k + "-" + leter;
        }else if (i == num && j == num && k != num && a != num){
            resultado = leter + "-" + leter + "-" + k + "-" + a;
        }else if (i == num && j != num && k == num && a == num){
            resultado = leter + "-" + j + "-" + leter + "-" + leter;
        }else if (i == num && j != num && k == num && a != num){
        resultado = leter + "-" + j + "-" + leter + "-" + a;
        }else if (i == num && j != num && k != num && a == num){
            resultado = leter + "-" + j + "-" + k + "-" + leter;
        }else if (i == num && j != num && k != num && a != num){
            resultado = leter + "-" + j + "-" + k + "-" + a;
        }else if (i != num && j == num && k == num && a == num){
            resultado = i + "-" + leter + "-" + leter + "-" + leter;
        }else if (i != num && j == num && k == num && a != num){
            resultado = i + "-" + leter + "-" + leter + "-" + a;
        }else if (i != num && j == num && k != num && a == num){
            resultado = i + "-" + leter + "-" + k + "-" + leter;
        }else if (i != num && j == num && k != num && a != num){
            resultado = i + "-" + leter + "-" + k + "-" + a;
        }else if (i != num && j != num && k == num && a == num){
            resultado = i + "-" + j + "-" + leter + "-" + leter;
        }else if (i != num && j != num && k == num && a != num){
            resultado = i + "-" + j + "-" + leter + "-" + a;
        }else if (i != num && j != num && k != num && a == num){
            resultado = i + "-" + j + "-" + k + "-" + leter;
        }else if (i != num && j != num && k != num && a != num){
            resultado = i + "-" + j + "-" + k + "-" + a;
        }else {
            resultado = "ERROR";
        }
        return resultado;
    }

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int i, j, k, a;
        int num = solicitarInt("Ingrese el número que quiere cambiar por una letra", 0, 9);
        System.out.println("Ingrese la letra que quiere cambiar por el número anterior");
        String letra = scanner.nextLine();
        scanner.close();
        letra = letra.toUpperCase();
        char leter = letra.charAt(0);
        for (i = 0; i <= 9; i++){
            j=0;
            for (j = 0; j <= 9; j++){
                k=0;
                for (k = 0; k <= 9; k++){
                    a=0;
                    for (a = 0; a<=9; a++){
                        System.out.printf("%s\n", cambioNumLetr(num, i, j, k, a, leter));
                    }
                }
            }
        }
    }
}