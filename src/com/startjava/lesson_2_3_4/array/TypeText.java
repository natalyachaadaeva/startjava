package com.startjava.lesson_2_3_4.array;

public class TypeText {
    public static void main(String[] args) throws InterruptedException {
        String text1 = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки." +
                "\n- James Gosling";
        String result1 = inputText(text1);
        printText(result1);

        String text2 = "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его." +
                "\n- Robert Martin";
        String result2 = inputText(text2);
        printText(result2);

        String text3 = "null";
        String result3 = inputText(text3);
        printText(result3);

        String text4 = "";
        String result4 = inputText(text4);
        printText(result4);
    }

    private static String inputText(String text) {
        if (text == null || text.isEmpty()) {
            return "Пустая строка";
        }

        String[] words = text.split(" ");
        String[] cleanWords = new String[words.length];
        int wordCount = 0;

        for (String word : words) {
            String clean = cleanWord(word);
            if (!clean.isEmpty()) {
                cleanWords[wordCount++] = clean;
            }
        }

        if (wordCount == 0) {
            return "Текст не содержит слов";
        }

        int shortPos = 0;
        int longPos = 0;
        for (int i = 1; i < wordCount; i++) {
            if (cleanWords[i].length() < cleanWords[shortPos].length()) {
                shortPos = i;
            }
            if (cleanWords[i].length() > cleanWords[longPos].length()) {
                longPos = i;
            }
        }

        int start = Math.min(shortPos, longPos);
        int end = Math.max(shortPos, longPos);

        StringBuilder result = new StringBuilder();
        String[] originalWords = text.split(" ");
        int cleanIndex = 0;

        for (String originalWord : originalWords) {
            String clean = cleanWord(originalWord);
            if (clean.isEmpty()) {
                result.append(originalWord).append(" ");
                continue;
            }

            if (cleanIndex >= start && cleanIndex <= end) {
                String upper = clean.toUpperCase();
                result.append(originalWord.replace(clean, upper)).append(" ");
            } else {
                result.append(originalWord).append(" ");
            }
            cleanIndex++;
        }

        return result.toString().trim();
    }

    private static String cleanWord(String word) {
        if (word.isEmpty()) return "";

        int start = 0;
        while (start < word.length() && !Character.isLetterOrDigit(word.charAt(start))) {
            start++;
        }

        int end = word.length() - 1;
        while (end >= 0 && !Character.isLetterOrDigit(word.charAt(end))) {
            end--;
        }

        return start <= end ? word.substring(start, end + 1) : "";
    }

    private static void printText(String result) throws InterruptedException {
        typewriterEffect(result);
        System.out.println("\n----------------------------------------\n");
    }

    private static void typewriterEffect(String text) throws InterruptedException {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(50);
        }
    }
}