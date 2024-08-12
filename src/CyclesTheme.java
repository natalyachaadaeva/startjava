import java.math.BigDecimal;
import java.math.RoundingMode;
 
public class CyclesTheme {    
    public static void main(String[] args) {
        System.out.println("\n\n1. Подсчет суммы четных и нечетных чисел");
        int evenSum = 0;
        int oddSum = 0;
        int initialValue = -10;
        int finalValue = 21;
        System.out.print("В отрезке [" + initialValue);
        do {
            if (initialValue % 2 == 0) {
                evenSum += finalValue;
            } else { 
                if (initialValue % 1 == 0) {
                    oddSum += finalValue; 
                }
            }
            initialValue++;
        } while (initialValue < finalValue);
        System.out.print("," + initialValue + "] сумма четных чисел = " +
                evenSum + ", а нечетных = " + oddSum);

        System.out.println("\n\n2. Вывод чисел между min и max в порядке убывания");
        int firstDigit = 10;
        int secondDigit = 5;
        int thirdDigit = -1;
        int finalMax = 0;

        if (firstDigit >= secondDigit && firstDigit >= thirdDigit) {
            finalMax = firstDigit;
            System.out.println(finalMax + " - максимальное число"); 
        }
        if (secondDigit >= firstDigit && secondDigit >= thirdDigit) {
            finalMax = secondDigit;
            System.out.println(finalMax + " - максимальное число"); 
        }
        if (thirdDigit >= firstDigit && thirdDigit >= secondDigit) {
            finalMax = thirdDigit;
            System.out.println(finalMax + " - максимальное число");
        }

        int finalMin = 0;
        if (firstDigit <= secondDigit && firstDigit <= thirdDigit) {
            finalMin = firstDigit;
            System.out.println(finalMin + " - минимальное число"); 
        }
        if (secondDigit <= firstDigit && secondDigit <= thirdDigit) {
            finalMin = secondDigit;
            System.out.println(finalMin + " - минимальное число");
        }
        if (thirdDigit <= firstDigit && thirdDigit <= secondDigit) {
            finalMin = thirdDigit;
            System.out.println(finalMin + " - минимальное число");
        }

        for (int i = finalMax; i >= finalMin; i--) {
            System.out.print(" " + i); 
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNumber = 1234;
        int reverse = 0;
        int sum = 0;
        int ones = 0;
        int tens = 0;
        int hundreds = 0;
        int thousands = 0;

        while (srcNumber != 0) {
            reverse = reverse * 10;
            reverse = reverse + srcNumber % 10;
            sum += srcNumber % 10;
            srcNumber /= 10;   

            ones = reverse % 10;
            tens = reverse / 10 % 10;
            hundreds = reverse / 100 % 10;
            thousands = reverse / 1000; 
        }
        System.out.println("Поразрядно исходное число в обратном порядке: " + thousands + " , " + 
                hundreds + " , " + tens + " , " + ones);
        System.out.println("Сумма выделенных цифр: " + sum);

        System.out.println("\n\n4. Вывод чисел в несколько строк");
        for (int i = 1; i < 24; i += 5 * 2) {
            System.out.printf("%5d", i);
            for (int j = i + 2; j < i + 5 * 2; j += 2) {
                System.out.printf("%5d", j < 24 ? j : 0);
            }
            System.out.println();
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int numberForVerification = 3242592;
        int finalNumber = numberForVerification;
        int evenOrOdd = 0;
        int countsOfTwos = 0;
        while (numberForVerification != 0) {
            if (numberForVerification != 2) {
                countsOfTwos++; 
            }
            numberForVerification = numberForVerification / 10; 
        }
        evenOrOdd = countsOfTwos;
        if (evenOrOdd % 2 != 0) {
            System.out.println("В " + finalNumber + " нечетное (" + countsOfTwos + ") количество двоек");
        } else {
            System.out.println("В " + finalNumber + " четное (" + countsOfTwos + ") количество двоек");
        }

        System.out.println("\n\n6. Вывод геометрических фигур");  
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

        System.out.println("\n\n7. Вывод ASCII-символов");
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

        System.out.println("\n\n8. Проверка, является ли число палиндромом");
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

        System.out.println("\n\n9. Проверка, является ли число счастливым");
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

        System.out.println("\n\n10. Вывод таблицы умножения Пифагора");
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
