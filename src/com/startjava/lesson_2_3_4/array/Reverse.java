package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] nums1 = new int[0];
        int[] reversed1 = reverse(nums1);
        printResult(nums1, reversed1);

        int[] nums2 = null;
        int[] reversed2 = reverse(nums2);
        printResult(nums2, reversed2);

        int[] nums3 = new int[]{6, 8, 9, 1};
        int[] reversed3 = reverse(nums3);
        printResult(nums3, reversed3);

        int[] nums4 = new int[]{13, 8, 5, 3, 2, 1, 1};
        int[] reversed4 = reverse(nums4);
        printResult(nums4, reversed4);
    }

    private static int[] reverse(int[] arr) {
        if (arr == null) {
            return null;
        }

        int len = arr.length; // Создаем переменную для длины массива
        int[] reversedArray = new int[len];
        for (int i = 0; i < len; i++) {
            reversedArray[i] = arr[len - 1 - i];
        }
        return reversedArray;
    }

    private static void printResult(int[] original, int[] reversed) {
        if (original == null) {
            System.out.println("   Array is null");
            return;
        }

        System.out.print("   До реверса: ");
        printArray(original);

        System.out.print("После реверса: ");
        printArray(reversed);

        System.out.println();
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}