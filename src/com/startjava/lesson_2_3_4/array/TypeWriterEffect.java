package com.startjava.lesson_2_3_4.array;

public class TypeWriterEffect {
    public static void main(String[] args) throws InterruptedException {
        String text1 = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки." +
                "\n- James Gosling";
        String formattedText1 = processText(text1);
        type(formattedText1);
        String text2 = "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его." +
                "\n- Robert Martin";
        String formattedText2 = processText(text2);
        type(formattedText2);
        String text3 = "null";
        String formattedText3 = processText(text3);
        type(formattedText3);
        String text4 = "";
        String formattedText4 = processText(text4);
        type(formattedText4);
    }

    private static String processText(String text) {
        if (text == null || text.isEmpty()) return text;

        String[] words = text.split(" ");
        int wordCount = words.length;
        int[] validIndices = new int[wordCount];
        String[] cleanWords = new String[wordCount];
        int validCount = 0;

        for (int i = 0; i < wordCount; i++) {
            String clean = cleanWord(words[i]);
            if (!clean.isEmpty()) {
                cleanWords[validCount] = clean;
                validIndices[validCount] = i;
                validCount++;
            }
        }

        if (validCount == 0) return text;
        int minLen = Integer.MAX_VALUE;
        int maxLen = 0;
        int firstMin = 0;
        int lastMin = 0;
        int firstMax = 0;
        int lastMax = 0;

        for (int i = 0; i < validCount; i++) {
            int len = cleanWords[i].length();

            if (len < minLen) {
                minLen = len;
                firstMin = lastMin = i;
            } else if (len == minLen) {
                lastMin = i;
            }

            if (len > maxLen) {
                maxLen = len;
                firstMax = lastMax = i;
            } else if (len == maxLen) {
                lastMax = i;
            }
        }

        int start = Math.min(firstMin, firstMax);
        int end = Math.max(lastMin, lastMax);
        StringBuilder result = new StringBuilder();
        int currentValid = 0;

        for (int i = 0; i < wordCount; i++) {
            if (currentValid < validCount && i == validIndices[currentValid]) {
                String original = words[i];
                String clean = cleanWords[currentValid];

                if (currentValid >= start && currentValid <= end) {
                    result.append(original.replace(clean, clean.toUpperCase()));
                } else {
                    result.append(original);
                }
                currentValid++;
            } else {
                result.append(words[i]);
            }

            if (i < wordCount - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    private static String cleanWord(String word) {
        int start = 0;
        int end = word.length() - 1;
        while (start <= end && !Character.isLetterOrDigit(word.charAt(start))) start++;
        while (end >= start && !Character.isLetterOrDigit(word.charAt(end))) end--;
        return start <= end ? word.substring(start, end + 1) : "";
    }

    private static void type(String result) throws InterruptedException {
        for (char c : result.toCharArray()) {
            System.out.print(c);
            Thread.sleep(25);
        }
        System.out.println("\n----------------------------------------\n");
    }
}