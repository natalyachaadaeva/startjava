package com.startjava.lesson_2_3_4.array;

//
public class Factorial {
    public static void getArray(int... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
            if (i < args.length - 1) { // Если это не последнее число
                System.out.print(",");
            }
        }
        System.out.println();
    }

    public static void sendFactorial(int... args) {
        for (int n : args) {
            if (n < 0) {
                System.out.println("Ошибка: факториал " + n + "! не определен");
            } else if (n <= 1) { // Обработка случая для 0!
                System.out.print(n + "! = ");
                System.out.print(getFactorialExpression(n));
                System.out.print("" + factorial(n));
                System.out.println();
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
        for (int i = 1; i < n; i++) {
            expression += i;
            if (i < n) {
                expression += " * ";
            }
        }
        return expression;
    }

    public static void main(String[] args) {
        // Вызов метода с различными массивами чисел
        getArray(); // массив нулевой длины  - вызовут ошибку, поэтому закомментировала
        // getArray(null); // вызовет ошибку, поэтому закомментировала
        getArray(8, 0, 9);
        getArray(-3, 1, 7, 13);
        getArray(-22, 0);

        sendFactorial(8, 0, 9);
        sendFactorial(-3, 1, 7, 13);
        sendFactorial(-22, 0);
    }
}
