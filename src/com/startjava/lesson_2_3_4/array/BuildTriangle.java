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

        String triangle = buildTriangle(start, end, ascending);
        System.out.println(triangle);
    }

    private static String buildTriangle(char start, char end, boolean ascending) {
        int length = end - start + 1;
        StringBuilder triangle = new StringBuilder();

        for (int i = 0; i < length; i++) {
            char currentChar = ascending ? (char) (start + i) : (char) (end - i);
            int spacesCount = length - i - 1;
            int charsCount = 2 * i + 1;

            triangle.append(" ".repeat(spacesCount))
                    .append(String.valueOf(currentChar).repeat(charsCount))
                    .append("\n");
        }
        return triangle.toString();
    }
}