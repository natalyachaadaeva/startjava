package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class DeletingElements {
    public static void main(String[] args) {
        double[] array = generateRandomArray(15);

        // Обработка массива для разных индексов
        int[] indices = {-1, 15, 0, 14}; // Индексы для проверки
        for (int index : indices) {
            double[] modifiedArray = processArray(array.clone(), index);
            printResults(array, modifiedArray, index);
        }
    }

    private static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }

    private static double[] processArray(double[] array, int index) {
        if (index < 0 || index >= array.length) {
            return null; // Некорректный индекс
        }

        double threshold = array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                array[i] = 0.0;
            }
        }
        return array;
    }

    private static void printResults(double[] originalArray, double[] modifiedArray, int index) {
        System.out.println("Исходный массив:");
        printArray(originalArray, 8);

        if (modifiedArray == null) {
            System.out.printf("Индекс %d некорректен. " +
                    "Допустимый диапазон: [0, %d].\n", index, originalArray.length - 1);
            System.out.println();
            return;
        }

        System.out.println("Измененный массив:");
        printArray(modifiedArray, 7);

        double threshold = originalArray[index];
        int zeroedCount = countZeroedElements(originalArray, modifiedArray);

        System.out.printf("Значение из ячейки по индексу %d: %.3f\n", index, threshold);
        System.out.printf("Количество обнуленных ячеек: %d\n", zeroedCount);
        System.out.println();
    }

    private static int countZeroedElements(double[] originalArray, double[] modifiedArray) {
        int count = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != modifiedArray[i]) {
                count++;
            }
        }
        return count;
    }

    private static void printArray(double[] array, int numbersPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
            if ((i + 1) % numbersPerLine == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }
}