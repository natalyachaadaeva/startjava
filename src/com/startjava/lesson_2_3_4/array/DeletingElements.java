package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public class DeletingElements {
    private static double[] generateRandomArray(int size) {
        double[] array = new double[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble(); // Генерация числа в диапазоне [0, 1)
        }
        return array;
    }

    private static void processArray(double[] array, int index) {
        System.out.println("Исходный массив:");
        printArray(array, 8);

        if (index < 0 || index >= array.length) {
            System.out.printf("Индекс %d некорректен. " +
                    "Допустимый диапазон: [0, %d].\n", index, array.length - 1);
            System.out.println();
            return;
        }

        double threshold = array[index];
        int zeroedCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                array[i] = 0.0;
                zeroedCount++;
            }
        }

        System.out.println("Измененный массив:");
        printArray(array, 7);
        System.out.printf("Значение из ячейки по индексу %d: %.3f\n", index, threshold);
        System.out.printf("Количество обнуленных ячеек: %d\n", zeroedCount);
        System.out.println();
    }

    private static void printArray(double[] array, int numbersPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
            if ((i + 1) % numbersPerLine == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        double[] array = generateRandomArray(15);

        processArray(array, -1); // Некорректный индекс
        processArray(array, 15); // Некорректный индекс
        processArray(array, 0);  // Первый элемент
        processArray(array, 14); // Последний элемент
    }
}


