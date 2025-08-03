package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public final class Arrays {
    private Arrays() {}

    public static String buildTriangle(char start, char end, boolean ascending) {
        if (start > end) {
            return String.format("Ошибка: левая граница (%d) > правой (%d)", (int) start, (int) end);
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

    public static long[] calcFactorials(int[] nums) {
        if (nums == null) {
            return null;
        }

        long[] factorials = new long[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                factorials[i] = 0;
            } else if (nums[i] <= 1) {
                factorials[i] = 1;
            } else {
                long result = 1;
                for (int j = 2; j <= nums[i]; j++) {
                    result *= j;
                }
                factorials[i] = result;
            }
        }
        return factorials;
    }

    public static int countZeroedElements(float[] originalArray, float[] modifiedArray) {
        int count = 0;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != modifiedArray[i]) {
                count++;
            }
        }
        return count;
    }

    public static int[] createRandomUniqueNumbers(int start, int end, int perLine) {
        if (start > end || perLine < 1) {
            return null;
        }

        int count = (int) ((end - start + 1) * 0.75);
        int[] numbers = new int[count];
        Random rand = new Random();
        int range = end - start + 1;

        for (int i = 0; i < numbers.length; i++) {
            int num;
            boolean exists;

            do {
                exists = false;
                num = rand.nextInt(range) + start;

                for (int j = 0; j < i; j++) {
                    if (numbers[j] == num) {
                        exists = true;
                        break;
                    }
                }
            } while (exists);

            numbers[i] = num;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }

    public static String formFactorialExpression(int n, long factorial) {
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

    public static float[] generateRandomFloatArray(int size) {
        float[] array = new float[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextFloat();
        }
        return array;
    }

    public static float[] nullifyAboveThreshold(float[] array, int index) {
        if (index < 0 || index >= array.length) {
            return null;
        }

        float threshold = array[index];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > threshold) {
                array[i] = 0.0f;
            }
        }
        return array;
    }

    public static int[] reverseArray(int[] array) {
        if (array == null) {
            return null;
        }

        int[] reversedArray = new int[array.length];
        int i = array.length - 1;
        for (int number : array) {
            reversedArray[i--] = number;
        }
        return reversedArray;
    }

    public static String toUpperCaseRange(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        String[] words = text.split(" ");
        int shortestLength = 0;
        int longestLength = 0;
        int firstShortestIndex = -1;
        int firstLongestIndex = -1;

        for (int i = 0; i < words.length; i++) {
            String cleanedWord = words[i].replaceAll("[\\p{P}\\s]+", "");
            if (cleanedWord.isEmpty()) continue;

            int length = cleanedWord.length();
            if (firstShortestIndex == -1 || length < shortestLength) {
                shortestLength = length;
                firstShortestIndex = i;
            }
            if (length > longestLength) {
                longestLength = length;
                firstLongestIndex = i;
            }
        }

        if (firstShortestIndex == -1 || firstLongestIndex == -1) {
            return text;
        }

        if (firstShortestIndex > firstLongestIndex) {
            int temp = firstShortestIndex;
            firstShortestIndex = firstLongestIndex;
            firstLongestIndex = temp;
        }

        for (int i = firstShortestIndex; i <= firstLongestIndex; i++) {
            words[i] = words[i].toUpperCase();
        }

        return String.join(" ", words);
    }
}