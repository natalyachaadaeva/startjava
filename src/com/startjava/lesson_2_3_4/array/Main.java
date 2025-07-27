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
        String triangle1 = AllArrays.buildTriangle('0', '9', true);
        Console.printTriangle(triangle1);

        String triangle2 = AllArrays.buildTriangle('/', '!', false);
        Console.printTriangle(triangle2);

        String triangle3 = AllArrays.buildTriangle('A', 'J', false);
        Console.printTriangle(triangle3);
    }

    private static void runDeletingElements() {
        float[] randomNumbers = AllArrays.generateRandomArray(15);

        int[] indices = {-1, 15, 0, 14};
        for (int index : indices) {
            float[] modifiedArray = AllArrays.modifyArray(randomNumbers.clone(), index);
            Console.printModificationResults(randomNumbers, modifiedArray, index);
        }
    }

    private static void runFactorial() {
        int[] nums1 = {};
        Console.printFactorialExpression(nums1, AllArrays.calcFactorials(nums1));

        int[] nums2 = null;
        Console.printFactorialExpression(nums2, AllArrays.calcFactorials(nums2));

        int[] nums3 = {8, 0, 9};
        Console.printFactorialExpression(nums3, AllArrays.calcFactorials(nums3));

        int[] nums4 = {-3, 1, 7, 13};
        Console.printFactorialExpression(nums4, AllArrays.calcFactorials(nums4));

        int[] nums5 = {-22, 0};
        Console.printFactorialExpression(nums5, AllArrays.calcFactorials(nums5));
    }

    private static void runReverser() {
        int[] numbers1 = {};
        int[] reversed = AllArrays.reverse(numbers1);
        Console.printReversedArray(numbers1, reversed);

        int[] numbers2 = null;
        reversed = AllArrays.reverse(numbers2);
        Console.printReversedArray(numbers2, reversed);

        int[] numbers3 = {6, 8, 9, 1};
        reversed = AllArrays.reverse(numbers3);
        Console.printReversedArray(numbers3, reversed);

        int[] numbers4 = {13, 8, 5, 3, 2, 1, 1};
        reversed = AllArrays.reverse(numbers4);
        Console.printReversedArray(numbers4, reversed);
    }

    private static void runTypeWriterEffect() throws InterruptedException {
        String text1 = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки." +
                "\n- James Gosling";
        String formattedText1 = AllArrays.toUpperCaseRange(text1);
        Console.typeText(formattedText1);

        String text2 = "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его." +
                "\n- Robert Martin";
        String formattedText2 = AllArrays.toUpperCaseRange(text2);
        Console.typeText(formattedText2);

        String text3 = "null";
        String formattedText3 = AllArrays.toUpperCaseRange(text3);
        Console.typeText(formattedText3);

        String text4 = "";
        String formattedText4 = AllArrays.toUpperCaseRange(text4);
        Console.typeText(formattedText4);
    }

    private static void runUniqueNumbersCreator() {
        Console.printUniqueNumbersExample();

        int[] numbers1 = AllArrays.createNumbers(-30, -10, 23);
        Console.printNumbers(numbers1);

        int[] numbers2 = AllArrays.createNumbers(10, 50, 10);
        Console.printNumbers(numbers2);

        int[] numbers3 = AllArrays.createNumbers(-34, -34, 1);
        Console.printNumbers(numbers3);

        int[] numbers4 = AllArrays.createNumbers(-1, 2, 1);
        Console.printNumbers(numbers4);

        int[] numbers5 = AllArrays.createNumbers(-8, 5, 2);
        Console.printNumbers(numbers5);
    }
}