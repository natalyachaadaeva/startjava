package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        int[] numbers1 = {};
        int[] reversed = reverse(numbers1);
        printResult(numbers1, reversed);

        int[] numbers2 = null;
        reversed = reverse(numbers2);
        printResult(numbers2, reversed);

        int[] numbers3 = {6, 8, 9, 1};
        reversed = reverse(numbers3);
        printResult(numbers3, reversed);

        int[] numbers4 = {13, 8, 5, 3, 2, 1, 1};
        reversed = reverse(numbers4);
        printResult(numbers4, reversed);
    }

    private static int[] reverse(int[] array) {
        if (array == null) {
            return null;
        }

        int[] reversedArray = new int[array.length];
        int i = array.length - 1;

        // цикл for-each для перебора элементов массива вместо for
        for (int numbers : array) {
            reversedArray[i--] = numbers;
        }
        return reversedArray;
    }

    private static void printResult(int[] original, int[] reversed) {
        if (original == null) {
            System.out.println("   Array is null\n");
            return;
        }

        System.out.println("   До реверса: " + Arrays.toString(original));
        System.out.println("После реверса: " + Arrays.toString(reversed) + "\n");
    }
}