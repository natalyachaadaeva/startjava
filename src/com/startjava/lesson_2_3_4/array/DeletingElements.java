package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;
import java.util.Random;

public class DeletingElements {
    public static void getArray(int[] array, int index) {
        System.out.println("Исходный массив: " + Arrays.toString(array));

        int countZeros = 0; // Счетчик обнуленных ячеек

        for (int i = 0; i < array.length; i++) {
            // Проверка на превышение значения по индексу
            if (array[i] > array[index]) {
                array[i] = 0; // Обнуление ячейки
                countZeros++; // Увеличение счетчика
            }
        }

        //  измененный массив
        System.out.println("Измененный массив: " + Arrays.toString(array));
        // значение из ячейки по переданному индексу
        // (вообще не знаю, правильно ли поняла задание в этой части)
        if (index >= 0 && index < array.length) {
            System.out.printf("Значение из ячейки по индексу %d: %.3f%n", index, (double) array[index]);
        } else {
            System.out.printf("Индекс %d вне диапазона массива.%n", index);
        }
        // количество обнуленных ячеек
        System.out.println("Количество обнуленных ячеек: " + countZeros);
    }

    public static void main(String[] args) {
        int[] array = {-1, 15, 0, 14};
        int index = 1;
        getArray(array, index);

        // Создание и заполнение массива случайными числами
        double[] arrayRandom = new double[15];
        System.out.println("Случайный массив:");
        for (int i = 0; i < arrayRandom.length; i++) {
            double generatedDouble = new Random().nextDouble();
            arrayRandom[i] = generatedDouble;
            System.out.printf("%.3f ", arrayRandom[i]);
        }

        System.out.println("\n\nИзмененный случайный массив:");
        int countZeros = 0; // Счетчик для случайного массива
        for (int i = 0; i < arrayRandom.length; i++) {
            if (arrayRandom[i] > 0.5) {
                arrayRandom[i] = 0;
                countZeros++;
            }
            System.out.printf("%.3f ", arrayRandom[i]);
        }

        System.out.println("\nКоличество обнуленных ячеек в случайном массиве: " + countZeros);
    }
}


