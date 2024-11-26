package com.mireyaserrano.tema05.arrays;

public class ArraysEstadisticas {
    private final int[] array;
    private int min;
    private int max;

    public ArraysEstadisticas(int[] array){
        this.array = array;
        min = array[0];
        max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
    }


    public int getMax(){
        return max;
    }

    public int getMin(){
        return min;
    }
}
