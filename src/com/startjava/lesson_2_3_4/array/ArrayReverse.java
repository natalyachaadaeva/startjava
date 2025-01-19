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
        getArray(new int[0]);
        getArray(null); // null приводит к ошибке, пробую через if
        getArray(new int[]{6, 8, 9, 1}); // 6, 8, 9, 1
        getArray(new int[]{13, 8, 5, 3, 2, 1, 1}); // 13, 8, 5, 3, 2, 1, 1

        int[] getArray2 = {1, 2, 3, 4};
        System.out.println("До реверса: " + Arrays.toString(getArray2));
        int left = 0;
        int right = getArray2.length - 1;
        while (left < right) {
            int temp = getArray2[left];
            getArray2[left] = getArray2[right];
            getArray2[right] = temp;
            left++;
            right--;
        }
        System.out.println("После реверса: " + Arrays.toString(getArray2));
    }
}