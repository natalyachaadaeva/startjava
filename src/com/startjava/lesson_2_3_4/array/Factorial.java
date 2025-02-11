package com.startjava.lesson_2_3_4.array;

public class Factorial {
    public static void getFactorial(int... args) {
        for (int n : args) {
            System.out.print("Факториал " + n + ": ");
            if (n < 0) {
                System.out.println("Ошибка: факториал " + n + "! не определен");
            } else {
                System.out.print(n + "! = ");
                System.out.print(getFactorialExpression(n));
                System.out.print(" = " + factorial(n));
                System.out.println();
            }
        }
    }

    // Вычислить факториал
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // получить факториальное выражение в строку
    public static String getFactorialExpression(int n) {
        String expression = "";
        for (int i = 1; i <= n; i++) {
            expression += i;
            if (i < n) {
                expression += " * ";
            }
        }
        return expression;
    }

    public static void main(String[] args) {
        // Вызов метода с различными массивами чисел
        // getFactorial();  массив нулевой длины  - вызовут ошибку, поэтому закомментировала
        // getFactorial((int[]) null); - вызовут ошибку, поэтому закомментировала
        getFactorial(8, 0, 9);
        getFactorial(-3, 1, 7, 13);
        getFactorial(-22, 0);
    }
}
