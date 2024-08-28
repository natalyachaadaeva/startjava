import java.math.BigDecimal;
import java.math.RoundingMode;
 
public class CyclesTheme {    
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int sumEvens = 0;
        int sumOdds = 0;
        int startRange = -10;
        int endRange = 21;
        System.out.print("В отрезке [" + startRange + ", " + endRange + "]");
        do {
            if (startRange % 2 == 0) {
                sumEvens += startRange; 
            } else if (startRange % 2 == 1) {
                sumOdds += startRange;
            }
            startRange++;
        } while (startRange < endRange);
        System.out.print(" сумма четных чисел = " + sumEvens + ", а нечетных = " + sumOdds);

        System.out.println("\n\n2. Вывод чисел между min и max в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = 0;
        int max = 0;
        if (a < b && a < c && b > c) {
            max = b;
            min = a; 
        } else if (b < c && b < a && c > a) {
            max = c;
            min = b;
        } else {
            max = a;
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(" " + i); 
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int sum = 0;
        int reverse = 0;
        System.out.print("Поразрядно исходное число в обратном порядке: ");
        while (srcNumber > 0) {
            reverse = srcNumber % 10;
            System.out.print(reverse);
            sum += reverse;
            srcNumber /= 10;
        }
        System.out.println("\nСумма выделенных цифр: " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        for (int i = 1; i < 24; i += 5 * 2) {
            System.out.printf("%5d", i);
            for (int j = i + 2; j < i + 5 * 2; j += 2) {
                System.out.printf("%5d", j < 24 ? j : 0);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        srcNumber = 3242592;
        int srcNumberCopy = srcNumber;
        int countsOfTwos = 0;
        while (srcNumber > 0) {
            if (srcNumber % 10 == 2) {
                countsOfTwos++; 
            }
            srcNumber /= 10; 
        }
        if (countsOfTwos % 2 > 0) {
            System.out.println("В " + srcNumberCopy + " нечетное (" + countsOfTwos + ") количество двоек");
        } else {
            System.out.println("В " + srcNumberCopy + " четное (" + countsOfTwos + ") количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");  
        // прямоугольник
        for (int i = 0; i < 5; i++) { 
            for (int j = 0; j < 10; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        // треугольник
        int rows = 5;
        while (rows >= 1) {
            int width = 1; 
            while (width <= rows) {
                System.out.print("#");
                width++;
            }
            System.out.println();
            rows--;
        }
        System.out.println();

        // равнобедренный треугольник
        rows = 3;
        int width = 1;
        int reverseWidth = 1;
        int reverseCount = 1;
        do {
            int count = 0;
            do {
                System.out.print("$");
            } while (++count < width);
            System.out.println();
            if (reverseCount == rows) reverseWidth = -1;
            width += reverseWidth;
        } while (++reverseCount <= (2 * rows - 1));

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.print("DECIMAL  CHARACTER  DESCRIPTION\n");
        for (int i = 0; i < 123; i++) {
            char character = (char) i;
            String description = Character.getName(character);
            if (i > 32 && i < 47 && (i % 2) != 0) {
                System.out.printf("%5d %8s      %-1s%n", i, character, description);
            }
            if (i > 96 && (i % 2) == 0) { 
                System.out.printf("%5d %8s      %-1s%n", i, character, description);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNumber = 1234321;
        int passing = 0;
        sum = 0;
        srcNumberCopy = srcNumber;

        while (srcNumber != 0) {
            passing = srcNumber % 10;
            sum = sum * 10 + passing;
            srcNumber = srcNumber / 10;
        }

        if (srcNumberCopy == sum) {
            System.out.println("Число " + srcNumberCopy + " - палиндром");
        } else {
            System.out.println("Число " + srcNumberCopy + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNumbers = 122421;
        int luckyNumbersCopy = luckyNumbers;
        int firstHalfNumbers = 0;
        int secondHalfNumbers = 0;

        for (int i = 0; i < 3; i++) {
            firstHalfNumbers += luckyNumbersCopy % 10;
            luckyNumbersCopy /= 10;
            secondHalfNumbers += luckyNumbersCopy % 10;
            luckyNumbersCopy /= 10;
        }
        
        if (firstHalfNumbers == secondHalfNumbers) {
            System.out.println("Число " + luckyNumbers + " счастливое");
        } else {
            System.out.println("Число " + luckyNumbers + " не счастливое");
        }

        int halfSum1 = luckyNumbers / 1000;
        int halfSum2 = luckyNumbers % 1000;
        System.out.println("Сумма цифр " + halfSum1 + " = " + secondHalfNumbers);
        System.out.println("Сумма цифр " + halfSum2 + " = " + firstHalfNumbers);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\n        ТАБЛИЦА ПИФАГОРА");
        System.out.printf("   |");
        for (int i = 2; i < 10; i++)
            System.out.printf("%2d ", i);
        System.out.println("\n----------------------------");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++)
                System.out.printf("%2d ", i * j);
            System.out.println();
        }
    }
}
