package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayReverse {
    public static void getArray(int[] arr) {
        if (arr == null) {
            System.out.println("Array is null");
            return;
        }
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        getArray(new int[0]); // массив нулевой длины
        getArray(null); // null приводит к ошибке
        getArray(new int[]{6, 8, 9, 1}); // 6, 8, 9, 1
        getArray(new int[]{13, 8, 5, 3, 2, 1, 1}); // 13, 8, 5, 3, 2, 1, 1

        int[] abc = {1, 2, 3, 4};
        System.out.println("До реверса: " + Arrays.toString(abc));
        System.out.print("После реверса: [");
        for (int i = abc.length - 1; i > 0; i--) {
            System.out.print(abc[i] + ", ");
        }
        System.out.print(abc[0] + "]");
    }
}