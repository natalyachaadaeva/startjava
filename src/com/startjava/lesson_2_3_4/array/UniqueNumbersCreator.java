package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class UniqueNumbersCreator {
    public static void main(String[] args) {
        System.out.println("Исходные данные:");
        printNumbers();
        System.out.println("\nРезультат:");
        createNumbers();
    }

    private static void printNumbers(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void printNumbers() {
        System.out.println("-30, -10, 23");
        System.out.println("10, 50, 10");
        System.out.println("-34, -34, 0");
        System.out.println("-1, 2, -3");
        System.out.println("5, -8, 2");
    }

    private static void createNumbers() {
        createNumbers(-30, -10, 23);
        createNumbers(10, 50, 10);
        createNumbers(-34, -34, 0);
        createNumbers(-1, 2, -3);
        createNumbers(5, -8, 2);
    }

    private static void createNumbers(int start, int end, int perLine) {
        if (start > end) {
            System.out.printf("Ошибка: %d > %d%n", start, end);
            return;
        }
        if (perLine < 1) {
            System.out.printf("Ошибка: чисел в строке < 1 (%d)%n", perLine);
            return;
        }

        int count = (int) ((end - start + 1) * 0.75);
        int[] numbers = new int[count];
        fillUnique(numbers, start, end);
        sort(numbers);
        printNumbers(numbers);
    }

    private static void fillUnique(int[] arr, int min, int max) {
        Random rand = new Random();
        int range = max - min + 1;

        for (int i = 0; i < arr.length; i++) {
            int num;
            boolean exists;

            do {
                exists = false;
                num = rand.nextInt(range) + min;

                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        exists = true;
                        break;
                    }
                }
            } while (exists);

            arr[i] = num;
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}