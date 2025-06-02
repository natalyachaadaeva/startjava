package com.startjava.lesson_2_3_4.array;

public class BuildTriangle {
    public static void main(String[] args) {
        String triangle1 = buildTriangle('0', '9', true);
        printTriangle(triangle1);

        String triangle2 = buildTriangle('/', '!', false);
        printTriangle(triangle2);

        String triangle3 = buildTriangle('A', 'J', false);
        printTriangle(triangle3);
    }

    public static String buildTriangle(char start, char end, boolean ascending) {
        if (start > end) {
            return String.format("Ошибка: левая граница (%d) > правой (%d)%n%n", (int) start, (int) end);
        }
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

    private static void printTriangle(String triangle) {
        System.out.println(triangle);
    }
}