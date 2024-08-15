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
            }
            if (startRange % 2 != 0) {
                sumOdds += startRange;
            }
            startRange++;
        } while (startRange < endRange);
        System.out.print(" сумма четных чисел = " +
                sumEvens + ", а нечетных = " + sumOdds);

        System.out.println("\n\n2. Вывод чисел между min и max в порядке убывания");
        int a = 10;
        int b = 5;
        int c = -1;
        int min = 0;
        int max = 0;
        if (a > b && a > c) {
            max = a; 
        } else if (b > c) { 
            max = b;
        } else {
            max = c;
        }
        if (a < b && a < c) {
            min = a; 
        } else if (b < c) { 
            min = b;
        } else {
            min = c; 
        }
        
        for (int i = min; i <= max; i++) {
            if (a < max && a >= min) i++;
            System.out.print(" " + i); 
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int sum = 0;
        System.out.print("Поразрядно исходное число в обратном порядке: ");
        while (srcNumber > 0) {
            sum += srcNumber % 10;
            System.out.print("" + srcNumber % 10);
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
        int evenOrOdd = 0;
        int countsOfTwos = 0;
        while (srcNumber > 0) {
            if (srcNumber != 2) {
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
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("");
            }
            for (int k = i; k <= rows - 1; k++) { 
                System.out.print("#");
            } 
            System.out.println();
        }
        // стрелка
        int n = 2;
        for (int i = 0; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("$");
            }
            System.out.println();
        }
        int rows2 = 3;            
        for (int i = 0; i <= rows2 - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("");
            }
            for (int k = i; k <= rows2 - 1; k++) { 
                System.out.print("$");
            } 
            System.out.println();
        }

        System.out.println("\n7. Вывод ASCII-символов");
        System.out.print("DECIMAL  CHARACTER  DESCRIPTION\n");
        for (int i = 33; i < 47; i = i + 2) {
            char character = (char) i;
            String description = Character.getName(character);
            System.out.printf("%5d %8s      %-1s%n", i, character, description);
        }
        for (int i = 98; i < 123; i = i + 2) {
            char character = (char) i;
            String description = Character.getName(character);
            System.out.printf("%5d %8s      %-1s%n", i, character, description);
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int numberForCheck = 1234321;
        int passing = 0;
        int s = 0;
        int originalNumberForCheck = numberForCheck;

        while (numberForCheck != 0) {
            passing = numberForCheck % 10;
            s = s * 10 + passing;
            numberForCheck = numberForCheck / 10;
        }

        if (originalNumberForCheck == s) {
            System.out.println("Число " + originalNumberForCheck + " - палиндром");
        } else {
            System.out.println("Число " + originalNumberForCheck + " - не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int luckyNumbers = 123321;
        int originalLuckyNumbers = luckyNumbers;
        int round = 1;
        int counts = 0;
        int sumluckyNumbers = 0;
        int luckyNumbers1 = luckyNumbers / 100000;
        int luckyNumbers2 = (luckyNumbers / 10000) % 10;
        int luckyNumbers3 = (luckyNumbers / 1000) % 10 % 10;
        int luckyNumbers4 = (luckyNumbers / 100) % 10 % 10 % 10;
        int luckyNumbers5 = (luckyNumbers / 10) % 10 % 10 % 10 % 10;
        int luckyNumbers6 = luckyNumbers % 10 % 10 % 10 % 10;
        while (luckyNumbers != 0) {
            sumluckyNumbers += round * (luckyNumbers % 10);
            luckyNumbers /= 10;
            if (++counts == 3) {
                round = -round;
            }
        }
        if (counts == 6 && sumluckyNumbers == 0) {
            System.out.println("Число " + originalLuckyNumbers + " счастливое");
        } else {
            System.out.println("Число " + originalLuckyNumbers + " не счастливое");
        }
        int print1 = luckyNumbers1 + luckyNumbers2 + luckyNumbers3;
        int print2 = luckyNumbers6 + luckyNumbers4 + luckyNumbers5;
        System.out.println("Сумма цифр " + luckyNumbers1 + luckyNumbers2 + luckyNumbers3 + 
                " = " + print1);
        System.out.println("Сумма цифр " + luckyNumbers4 + luckyNumbers5 + luckyNumbers6 + 
                " = " + print2);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        System.out.println("\n        ТАБЛИЦА ПИФАГОРА");
        System.out.printf("   |");
        for (int i = 2; i < 10; i++)
            System.out.printf("%2d ", i);
        System.out.printf("\n--------------");
        System.out.printf("--------------\n");
        for (int i = 2; i < 10; i++) {
            System.out.printf("%2d |", i);
            for (int j = 2; j < 10; j++)
                System.out.printf("%2d ", i * j);
            System.out.printf("\n");
        }
    }
}
