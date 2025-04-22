package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class DeletingElements {
    public static void main(String[] args) {
        float[] randomNumbers = generateRandomArray(15);

        int[] indices = {-1, 15, 0, 14};
        for (int index : indices) {
            float[] modifiedArray = modifyArray(randomNumbers.clone(), index);
            printResults(randomNumbers, modifiedArray, index);
        }
    }

    private static float[] generateRandomArray(int size) {
        float[] array = new float[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextFloat();
        }
        return array;
    }

    private static float[] modifyArray(float[] array, int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }

        float threshold = array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                array[i] = 0.0f;
            }
        }
        return array;
    }

    private static void printResults(float[] originalArray, float[] modifiedArray, int index) {
        if (modifiedArray == null) {
            System.out.printf("Индекс %d некорректен. Допустимый диапазон: [0, %d].%n%n",
                    index, originalArray.length - 1);
            return;
        }

        System.out.println("Исходный массив:");
        printArray(originalArray, 8);

        System.out.println("Измененный массив:");
        printArray(modifiedArray, 8);

        float threshold = originalArray[index];
        int zeroedCount = countZeroedElements(originalArray, modifiedArray);

        System.out.printf("Значение из ячейки по индексу %d: %.3f%n", index, threshold);
        System.out.printf("Количество обнуленных ячеек: %d%n%n", zeroedCount);
    }

    private static int countZeroedElements(float[] originalArray, float[] modifiedArray) {
        int count = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != modifiedArray[i]) {
                count++;
            }
        }
        return count;
    }

    private static void printArray(float[] array, int numbersPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
            if ((i + 1) % numbersPerLine == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }
}