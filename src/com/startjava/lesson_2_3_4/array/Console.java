package com.startjava.lesson_2_3_4.array;

public final class Console {
    private Console() {}

    public static void printFactorialExpression(int[] nums, long[] factorials) {
        if (nums == null || factorials == null) {
            System.out.println("Массив не может быть null.");
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (factorials[i] == 0) {
                System.out.println("Ошибка: факториал " + n + "! не определен");
            } else {
                System.out.println(Arrays.formFactorialExpression(n, factorials[i]));
            }
        }
    }

    public static void printFloatArrayWithFormat(float[] array, int numbersPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%.3f ", array[i]);
            if ((i + 1) % numbersPerLine == 0 || i == array.length - 1) {
                System.out.println();
            }
        }
    }

    public static void printIntArray(int[] arr) {
        if (arr == null) {
            System.out.println("Ошибка: массив не может быть null");
            return;
        }
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void printNullificationResults(float[] originalArray, float[] modifiedArray, int index) {
        if (modifiedArray == null) {
            System.out.printf("Индекс %d некорректен. Допустимый диапазон: [0, %d].%n%n",
                    index, originalArray.length - 1);
            return;
        }

        System.out.println("Исходный массив:");
        printFloatArrayWithFormat(originalArray, 8);

        System.out.println("Измененный массив:");
        printFloatArrayWithFormat(modifiedArray, 8);

        float threshold = originalArray[index];
        int zeroedCount = Arrays.countZeroedElements(originalArray, modifiedArray);

        System.out.printf("Значение из ячейки по индексу %d: %.3f%n", index, threshold);
        System.out.printf("Количество обнуленных ячеек: %d%n%n", zeroedCount);
    }

    public static void printReversedArray(int[] original, int[] reversed) {
        if (original == null) {
            System.out.println("   Array is null\n");
            return;
        }

        System.out.println("   До реверса: " + java.util.Arrays.toString(original));
        System.out.println("После реверса: " + java.util.Arrays.toString(reversed) + "\n");
    }

    public static void printString(String triangle) {
        System.out.println(triangle);
    }

    public static void printUniqueNumbersExample() {
        System.out.println("Исходные данные:");
        System.out.println("-30, -10, 23");
        System.out.println("10, 50, 10");
        System.out.println("-34, -34, 0");
        System.out.println("-1, 2, -3");
        System.out.println("5, -8, 2");
        System.out.println("\nРезультат:");
    }

    public static void typeTextWithEffect(String textToPrint) throws InterruptedException {
        for (char character : textToPrint.toCharArray()) {
            System.out.print(character);
            Thread.sleep(25);
        }
        System.out.println("\n----------------------------------------\n");
    }
}