package com.company;

import java.util.Arrays;

public class Test3 {

    public static void main(String[] args) {
//Вариант 3. Дан двумерный массив nxn целых чисел. Вывести строку, сумма элементов которой минимальна.
        int[][] array = {{2, 6, 9, -10}, {1, 1, 50, 1}, {5, 2, 3, 4}};
        System.out.println(Arrays.toString(sum2(array)));

    }
    public static int[] sum2(int[][] array) {
        int summ = Integer.MAX_VALUE;
        int rowIndex = -1;
        for (int i = 0; i < array.length; i++) {
            int total = 0;
            for (int j = 0; j < array[i].length; j++) {
                total += array[i][j];
                }
            if (total< summ) {
                summ = total;
                rowIndex = i;
            }
        }
        return array[rowIndex];
    }
}
