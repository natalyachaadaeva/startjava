import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь к файлу:");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        try {
            Scanner fileScanner = new Scanner(file);

            System.out.println("Введите слово:");
            String word = scanner.next();
            int count = 0;

            while (fileScanner.hasNext()) {
                String nextWord = fileScanner.next();
                if (nextWord.equals(word)) {
                    count++;
                }
            }

            System.out.println("Количество вхождений слова \"" + word + "\" в тексте: " + count);

            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
