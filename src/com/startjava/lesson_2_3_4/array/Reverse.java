package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverse {
    public static long[] array(int[] arr) {
        if (arr == null) {
            System.out.println("Array is null");
            return null;
        }
        System.out.print("До реверса: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        Arrays.sort(arr);

        System.out.print("После реверса: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.println();
        return null;
    }

    public static void main(String[] args) {
        array(new int[0]); // массив нулевой длины
        array(null); // null приводит к ошибке
        array(new int[]{6, 8, 9, 1});
        array(new int[]{13, 8, 5, 3, 2, 1, 1}); // 13, 8, 5, 3, 2, 1, 1
        System.out.println();
    }
}