package com.startjava.lesson_2_3_4.array;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        runBuildTriangle();
        runDeletingElements();
        runFactorial();
        runReverser();
        runTypeWriterEffect();
        runUniqueNumbersCreator();
    }

    private static void runBuildTriangle() {
        String triangle1 = Arrays.buildTriangle('0', '9', true);
        Console.printString(triangle1);

        String triangle2 = Arrays.buildTriangle('/', '!', false);
        Console.printString(triangle2);

        String triangle3 = Arrays.buildTriangle('A', 'J', false);
        Console.printString(triangle3);
    }

    private static void runDeletingElements() {
        float[] randomNumbers = Arrays.generateRandomFloatArray(15);

        int[] indices = {-1, 15, 0, 14};
        for (int index : indices) {
            float[] modifiedArray = Arrays.nullifyAboveThreshold(randomNumbers.clone(), index);
            Console.printNullificationResults(randomNumbers, modifiedArray, index);
        }
    }

    private static void runFactorial() {
        int[] nums1 = {};
        Console.printFactorialExpression(nums1, Arrays.calcFactorials(nums1));

        int[] nums2 = null;
        Console.printFactorialExpression(nums2, Arrays.calcFactorials(nums2));

        int[] nums3 = {8, 0, 9};
        Console.printFactorialExpression(nums3, Arrays.calcFactorials(nums3));

        int[] nums4 = {-3, 1, 7, 13};
        Console.printFactorialExpression(nums4, Arrays.calcFactorials(nums4));

        int[] nums5 = {-22, 0};
        Console.printFactorialExpression(nums5, Arrays.calcFactorials(nums5));
    }

    private static void runReverser() {
        int[] numbers1 = {};
        int[] reversed = Arrays.reverseArray(numbers1);
        Console.printReversedArray(numbers1, reversed);

        int[] numbers2 = null;
        reversed = Arrays.reverseArray(numbers2);
        Console.printReversedArray(numbers2, reversed);

        int[] numbers3 = {6, 8, 9, 1};
        reversed = Arrays.reverseArray(numbers3);
        Console.printReversedArray(numbers3, reversed);

        int[] numbers4 = {13, 8, 5, 3, 2, 1, 1};
        reversed = Arrays.reverseArray(numbers4);
        Console.printReversedArray(numbers4, reversed);
    }

    private static void runTypeWriterEffect() throws InterruptedException {
        String text1 = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки." +
                "\n- James Gosling";
        String formattedText1 = Arrays.toUpperCaseRange(text1);
        Console.typeTextWithEffect(formattedText1);

        String text2 = "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его." +
                "\n- Robert Martin";
        String formattedText2 = Arrays.toUpperCaseRange(text2);
        Console.typeTextWithEffect(formattedText2);

        String text3 = "null";
        String formattedText3 = Arrays.toUpperCaseRange(text3);
        Console.typeTextWithEffect(formattedText3);

        String text4 = "";
        String formattedText4 = Arrays.toUpperCaseRange(text4);
        Console.typeTextWithEffect(formattedText4);
    }

    private static void runUniqueNumbersCreator() {
        Console.printUniqueNumbersExample();

        int[] numbers1 = Arrays.createRandomUniqueNumbers(-30, -10, 23);
        Console.printIntArray(numbers1);

        int[] numbers2 = Arrays.createRandomUniqueNumbers(10, 50, 10);
        Console.printIntArray(numbers2);

        int[] numbers3 = Arrays.createRandomUniqueNumbers(-34, -34, 1);
        Console.printIntArray(numbers3);

        int[] numbers4 = Arrays.createRandomUniqueNumbers(-1, 2, 1);
        Console.printIntArray(numbers4);

        int[] numbers5 = Arrays.createRandomUniqueNumbers(-8, 5, 2);
        Console.printIntArray(numbers5);
    }
}