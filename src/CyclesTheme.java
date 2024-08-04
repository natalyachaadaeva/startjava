import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
 
public class CyclesTheme {    
    public static void main(String[] args) {
        // 1. Подсчет суммы четных и нечетных чисел
        System.out.println("\n\n1. Подсчет суммы четных и нечетных чисел");
        int evenNumber = 0;
        int oddNumber = 0;
        int result = -10;
        System.out.print("В отрезке [" + result);
        int f = 1;
        do {
            result = result + f;
            if (result % 2 == 0) {
                evenNumber = (evenNumber + 1);
            } else {
                oddNumber = (oddNumber + 1); 
            }
        } while (result < 21);
        System.out.print("," + result + "] сумма четных чисел = " +
                            evenNumber + ", а нечетных = " + oddNumber);

        // 2. Вывод чисел между min и max в порядке убывания
        System.out.println("\n\n2. Вывод чисел между min и max в порядке убывания");
        int numbers = -2;
        for (int y = 10; y > numbers; y--) {      
            System.out.print(y + ",");
            if (y == -1) { 
                System.out.print("(Минимальное " + y + ")");
            } 
            if (y == 10) { 
                System.out.print("(Максимальное " + y + "), ");
            }
        }
        // 3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int myDigit = 1234;
        int reverse = 0;
        int sum = 0;
        while (myDigit != 0) {
            reverse = reverse * 10;
            reverse = reverse + myDigit % 10;
            sum += myDigit % 10;
            myDigit /= 10;
        }
        System.out.println("Поразрядно исходное число в обратном порядке: " + reverse);
        System.out.println("Сумма выделенных цифр: " + sum);
        // 4. Вывод чисел в несколько строк
        System.out.println("\n\n4. Вывод чисел в несколько строк");
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 24; j += 2) {
                System.out.printf("%2d ", i * j);
                if ((j + 1) % 5 == 0) {
                    System.out.println();
                } 
            }
        }

        // 5. Проверка количества двоек числа на четность/нечетность
        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int number2 = 3242592;
        int finalNumber = number2;
        int evenOrodd = 0;
        int numberOfTwos = 0;
        while (number2 != 0) {
            if (number2 != 2) {
                numberOfTwos++; 
            }
            number2 = number2 / 10; 
        }
        evenOrodd = numberOfTwos;
        if (evenOrodd % 2 != 0) {
            System.out.println("В " + finalNumber + " нечетное (" + numberOfTwos + ") количество двоек");
        } else {
            System.out.println("В " + finalNumber + " четное (" + numberOfTwos + ") количество двоек");
        }

        // 6. Вывод геометрических фигур
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
        // 7. Вывод ASCII-символов
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
        // 8. Проверка, является ли число палиндромом
        System.out.println("\n\n8. Проверка, является ли число палиндромом");
        int numberForCheck = 1234321;
        int passing = 0;
        int s = 0;
        int originalnumberForCheck = numberForCheck;

        while (numberForCheck != 0) {
            passing = numberForCheck % 10;
            s = s * 10 + passing;
            numberForCheck = numberForCheck / 10;
        }

        if (originalnumberForCheck == s) {
            System.out.println("Число " + originalnumberForCheck + " - палиндром");
        } else {
            System.out.println("Число " + originalnumberForCheck + " - не палиндром");
        }
        // 9. Проверка, является ли число счастливым
        System.out.println("\n\n9. Проверка, является ли число счастливым");
        int number = 123321;
        int originalNumber = number;
        int round = 1;
        int counts = 0;
        int sum2 = 0;
        int number1 = number / 100000;
        int number22 = (number / 10000) % 10;
        int number3 = (number / 1000) % 10 % 10;
        int number4 = (number / 100) % 10 % 10 % 10;
        int number5 = (number / 10) % 10 % 10 % 10 % 10;
        int number6 = number % 10 % 10 % 10 % 10;
        while (number != 0) {
            sum2 += round * (number % 10);
            number /= 10;
            if (++counts == 3) {
                round = -round;
            }
        }
        if (counts == 6 && sum2 == 0) {
            System.out.println("Число " + originalNumber + " счастливое");
        } else {
            System.out.println("Число " + originalNumber + " не счастливое");
        }
        int print1 = number1 + number22 + number3;
        int print2 = number6 + number4 + number5;
        System.out.println("Сумма цифр " + number1 + number22 + number3 + " = " + print1);
        System.out.println("Сумма цифр " + number4 + number5 + number6 + " = " + print2);

        // 10. Вывод таблицы умножения Пифагора
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
