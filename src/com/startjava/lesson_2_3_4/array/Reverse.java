package com.startjava.lesson_2_3_4.array;

public class Reverse {
    public static void reverseAndPrint(int[] arr) {
        if (arr == null) {
            System.out.println("   Array is null");
            return;
        }

        System.out.print("   До реверса: ");
        printArray(arr);

        int[] reversedArray = reverseArray(arr);

        System.out.print("После реверса: ");
        printArray(reversedArray);

        System.out.println();
    }

    private static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        return reversedArray;
    }

    private static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        reverseAndPrint(new int[0]); // массив нулевой длины
        reverseAndPrint(null); // null
        reverseAndPrint(new int[]{6, 8, 9, 1}); // 6, 8, 9, 1
        reverseAndPrint(new int[]{13, 8, 5, 3, 2, 1, 1}); // 13, 8, 5, 3, 2, 1, 1
    }
}