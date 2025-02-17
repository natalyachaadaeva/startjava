package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverse {
    public static long[] getArray(int[] arr) {
        if (arr == null) {
            System.out.println("   Array is null");
            return null;
        }
        System.out.printf("%6s", "   До реверса: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
        return null;
    }

    public static long[] reverseArray(int[] arr) {
        if (arr == null) {
            System.out.println("   Array is null");
            return null;
        }
        System.out.print("После реверса: [");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        System.out.println();
        return null;
    }

    public static void main(String[] args) {
        getArray(new int[0]); // массив нулевой длины
        reverseArray(new int[0]); // массив нулевой длины

        getArray(null); // null приводит к ошибке
        reverseArray(null); // null приводит к ошибке

        getArray(new int[]{6, 8, 9, 1});
        reverseArray(new int[]{6, 8, 9, 1});

        getArray(new int[]{13, 8, 5, 3, 2, 1, 1}); // 13, 8, 5, 3, 2, 1, 1
        reverseArray(new int[]{13, 8, 5, 3, 2, 1, 1}); // 13, 8, 5, 3, 2, 1, 1
        System.out.println();
    }
}