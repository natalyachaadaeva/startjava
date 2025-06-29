package com.startjava.lesson_2_3_4.array;

public class TypeWriterEffect {
    public static void main(String[] args) throws InterruptedException {
        String text1 = "Java - это C++, из которого убрали все пистолеты, ножи и дубинки." +
                "\n- James Gosling";
        String formattedText1 = formatTextWithHighlightedExtremes(text1);
        printWithTypewriterEffect(formattedText1);

        String text2 = "Чтобы написать чистый код, мы сначала пишем грязный код, затем рефакторим его." +
                "\n- Robert Martin";
        String formattedText2 = formatTextWithHighlightedExtremes(text2);
        printWithTypewriterEffect(formattedText2);

        String text3 = "null";
        String formattedText3 = formatTextWithHighlightedExtremes(text3);
        printWithTypewriterEffect(formattedText3);

        String text4 = "";
        String formattedText4 = formatTextWithHighlightedExtremes(text4);
        printWithTypewriterEffect(formattedText4);
    }

    private static String formatTextWithHighlightedExtremes(String text) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        String[] words = text.split(" ");
        int shortestLength = Integer.MAX_VALUE;
        int longestLength = 0;
        int firstShortestIndex = -1;
        int firstLongestIndex = -1;

        for (String word : words) {
            String cleanedWord = removePunctuation(word);
            if (!cleanedWord.isEmpty()) {
                int length = cleanedWord.length();
                if (length < shortestLength) {
                    shortestLength = length;
                }
                if (length > longestLength) {
                    longestLength = length;
                }
            }
        }

        for (int i = 0; i < words.length; i++) {
            String cleanedWord = removePunctuation(words[i]);
            if (!cleanedWord.isEmpty()) {
                int length = cleanedWord.length();
                if (length == shortestLength && firstShortestIndex == -1) {
                    firstShortestIndex = i;
                }
                if (length == longestLength && firstLongestIndex == -1) {
                    firstLongestIndex = i;
                }
            }
        }

        if (firstShortestIndex == -1 || firstLongestIndex == -1) {
            return text;
        }

        int startHighlight = Math.min(firstShortestIndex, firstLongestIndex);
        int endHighlight = Math.max(firstShortestIndex, firstLongestIndex);

        StringBuilder formattedText = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i >= startHighlight && i <= endHighlight) {
                String cleanedWord = removePunctuation(word);
                if (!cleanedWord.isEmpty()) {
                    word = word.replace(cleanedWord, cleanedWord.toUpperCase());
                }
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

    private static void printWithTypewriterEffect(String textToPrint) throws InterruptedException {
        for (char character : textToPrint.toCharArray()) {
            System.out.print(character);
            Thread.sleep(25);
        }
        System.out.println("\n----------------------------------------\n");
    }
}