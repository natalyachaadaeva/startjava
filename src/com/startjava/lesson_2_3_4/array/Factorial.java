package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        int[] nums1 = {};
        printExpression(nums1, calculateFactorials(nums1));

        int[] nums2 = null;
        printExpression(nums2, calculateFactorials(nums2));

        int[] nums3 = {8, 0, 9};
        printExpression(nums3, calculateFactorials(nums3));

        int[] nums4 = {-3, 1, 7, 13};
        printExpression(nums4, calculateFactorials(nums4));

        int[] nums5 = {-22, 0};
        printExpression(nums5, calculateFactorials(nums5));
    }

    private static long[] calculateFactorials(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        long[] factorials = new long[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            try {
                factorials[i] = factorial(numbers[i]);
            } catch (IllegalArgumentException e) {
                factorials[i] = -1;
            }
        }
        return factorials;
    }

    private static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен: " + n);
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static void printExpression(int[] numbers, long[] factorials) {
        if (numbers == null || factorials == null) {
            System.out.println("Массив не может быть null.");
            return;
        }

        for (int i = 0; i < numbers.length; i++) {
            int n = numbers[i];
            if (factorials[i] == -1) {
                System.out.println("Ошибка: факториал " + n + "! не определен");
            } else {
                System.out.print(n + "! = ");
                System.out.print(getFactorialExpression(n));
                System.out.print(" = " + factorials[i]);
                System.out.println();
            }
        }
    }

    private static String getFactorialExpression(int n) {
        if (n <= 1) {
            return "1";
        }

        StringBuilder expression = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            expression.append(i);
            if (i < n) {
                expression.append(" * ");
            }
        }
        return expression.toString();
    }
}