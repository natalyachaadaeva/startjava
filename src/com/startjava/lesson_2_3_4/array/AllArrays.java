package com.startjava.lesson_2_3_4.array;

import java.util.Random;

public final class AllArrays {
    private AllArrays() {}

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

    public static float[] modifyArray(float[] array, int index) {
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

    public static long[] calcFactorials(int[] nums) {
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

    public static int[] reverse(int[] array) {
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
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = 0;
        int firstShortestIndex = -1;
        int firstLongestIndex = -1;

        for (int i = 0; i < words.length; i++) {
            String cleanedWord = removePunctuation(words[i]);
            if (cleanedWord.isEmpty()) continue;

            int length = cleanedWord.length();
            if (length < shortestLength) {
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

        int startHighlight = firstShortestIndex;
        int endHighlight = firstLongestIndex;
        if (startHighlight > endHighlight) {
            int temp = startHighlight;
            startHighlight = endHighlight;
            endHighlight = temp;
        }

        StringBuilder formattedText = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i >= startHighlight && i <= endHighlight) {
                word = word.toUpperCase();
            }
            formattedText.append(word);
            if (i < words.length - 1) {
                formattedText.append(" ");
            }
        }

        return formattedText.toString();
    }

    private static String removePunctuation(String word) {
        return word.replaceAll("[\\p{P}\\s]+", "");
    }

    public static int[] createNumbers(int start, int end, int perLine) {
        if (start > end || perLine < 1) {
            return null;
        }

        int count = (int) ((end - start + 1) * 0.75);
        int[] numbers = new int[count];
        fillUnique(numbers, start, end);
        sort(numbers);
        return numbers;
    }

    private static void fillUnique(int[] arr, int min, int max) {
        Random rand = new Random();
        int range = max - min + 1;

        for (int i = 0; i < arr.length; i++) {
            int num;
            boolean exists;

            do {
                exists = false;
                num = rand.nextInt(range) + min;

                for (int j = 0; j < i; j++) {
                    if (arr[j] == num) {
                        exists = true;
                        break;
                    }
                }
            } while (exists);

            arr[i] = num;
        }
    }

    private static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static float[] generateRandomArray(int size) {
        float[] array = new float[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextFloat();
        }
        return array;
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
}