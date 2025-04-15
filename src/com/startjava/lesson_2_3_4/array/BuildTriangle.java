package com.startjava.lesson_2_3_4.array;

public class BuildTriangle {
    public static void main(String[] args) {
        printBuildTriangle('0', '9', true);
        printBuildTriangle('/', '!', false);
        printBuildTriangle('A', 'J', false);
    }

    public static void printBuildTriangle(char start, char end, boolean ascending) {
        if (start > end) {
            System.out.printf("Ошибка: левая граница (%d) > правой (%d)%n%n", (int) start, (int) end);
            return;
        }

        int length = Math.abs(end - start) + 1;
        StringBuilder triangle = new StringBuilder();

        if (ascending) {
            for (int i = 0; i < length; i++) {
                char currentChar = (char) (start + i);
                String spaces = " ".repeat(length - i - 1);
                String chars = String.valueOf(currentChar).repeat(2 * i + 1);
                triangle.append(spaces).append(chars).append("\n");
            }
        } else {
            for (int i = 0; i < length; i++) {
                char currentChar = (char) (end - i);
                String spaces = " ".repeat(i);
                String chars = String.valueOf(currentChar).repeat(2 * (length - i) - 1);
                triangle.append(spaces).append(chars).append("\n");
            }
        }
        System.out.println(triangle);
    }
}