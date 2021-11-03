package com.company;

import java.util.*;

public class Test {
//Вариант 3. Дан массив n целых чисел. Найти элемент, который встречается в массиве чаще всего.

    public static void main(String[] args) {

        int[] array = {3, 7, 5, 6, 2, 3, 7, 5, 3, 8, 1, 2, 3};

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int prev = array[0];
        int popular = array[0];
        int count = 1;
        int maxCount = 1;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == prev) {
                count++;
            } else {
                if (count > maxCount) {
                    popular = array[i - 1];
                    maxCount = count;
                }
                prev = array[i];
                count = 1;
            }
        }
        System.out.println("Наиболее часто встречающийся элемент массива: " + popular);
    }
}
