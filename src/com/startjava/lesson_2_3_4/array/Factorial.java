package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void main(String[] args) {
        int[] nums1 = {};
        printExpression(nums1, calcFactorials(nums1));

        int[] nums2 = null;
        printExpression(nums2, calcFactorials(nums2));

        int[] nums3 = {8, 0, 9};
        printExpression(nums3, calcFactorials(nums3));

        int[] nums4 = {-3, 1, 7, 13};
        printExpression(nums4, calcFactorials(nums4));

        int[] nums5 = {-22, 0};
        printExpression(nums5, calcFactorials(nums5));
    }

    private static long[] calcFactorials(int[] nums) {
        if (nums == null) {
            return null;
        }

        long[] factorials = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            factorials[i] = factorial(nums[i]);
        }
        return factorials;
    }

    private static long factorial(int n) {
        if (n < 0) {
            return 0;
        }
        if (n <= 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static void printExpression(int[] nums, long[] factorials) {
        if (nums == null || factorials == null) {
            System.out.println("Массив не может быть null.");
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (factorials[i] == 0 && n < 0) {
                System.out.println("Ошибка: факториал " + n + "! не определен");
            } else {
                System.out.println(formFactorialExpression(n, factorials[i]));
            }
        }
    }

    private static String formFactorialExpression(int n, long factorial) {
        if (n < 0) {
            return "Ошибка: факториал " + n + "! не определен";
        }
        if (n <= 1) {
            return n + "! = " + factorial;
        }

        StringBuilder expression = new StringBuilder(n + "! = ");
        for (int i = 1; i <= n; i++) {
            expression.append(i);
            if (i < n) {
                expression.append(" * ");
            }
        }
        expression.append(" = ").append(factorial);
        return expression.toString();
    }
}