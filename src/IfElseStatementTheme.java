import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        // 1. Перевод псевдокода на язык Java
        System.out.println("\n1. Перевод псевдокода на язык Java");
        String gender = "male";
        if (gender != "male") {
            System.out.print("Вы женщина");
        } else {
            System.out.print("Вы мужчина");
        }

        int age = 24;
        if (age > 18) {
            System.out.print("\nВы прошли возрастной ценз - приятного просмотра фильма!");
        } else {
            System.out.print("\nДанный фильм не рекомендуется вам к просмотру, вам нет 18 лет");
        }

        int height = 1;
        if (height < 1.8) {
            System.out.print("\nВам разрешено пройти на данный аттракцион");
        } else {
            System.out.print("\nАттракцион не рекомендован для лиц ростом ниже 1 метра");
        }

        char firstLetterName = 'M';
        firstLetterName = "Marry".charAt(0);
        if (firstLetterName == 'M') {
            System.out.print("\nДобрый день, Мэри!");
        } else if (firstLetterName == 'I') {
            System.out.print("\nДобрый день, Иван");
        } else {
            System.out.print("\nДобрый день!");
        }

        // 2. Поиск большего числа
        System.out.println("\n\n2. Поиск большего числа");
        int a = 4;
        int b = 3;
        System.out.print("a = " + a + "\nb = " + b);
        if (a > b) {
            System.out.print("\na больше, чем b");
        } else if (a < b) {
            System.out.print("\nb больше, чем a");
        } else {
            System.out.print("\nДанные числа равны");
        }

        // 3. Проверка числа
        System.out.println("\n\n3. Проверка числа");
        int n = 0;
        System.out.print(n + " является ");
        if (n != 0) {
            if (n >= 1) {
                System.out.print(" положительным ");
            } else {
                System.out.print(" отрицательным ");
            }
            System.out.print(" и ");
            if (n % 2 == 0) {
                System.out.print(" четным ");
            } else {
                System.out.print(" нечетным ");
            }
        } else {
            System.out.print("нулевым значением");
        }

        // 4. Поиск одинаковых цифр в числах
        System.out.println("\n\n4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 723;
        int ones1 = number1 % 10;
        int tens1 = number1 / 10 % 10;
        int hunds1 = number1 / 100;
        int ones2 = number2 % 10;
        int tens2 = number2 / 10 % 10;
        int hunds2 = number2 / 100;
        if (number1 == number2) {
            System.out.println("Числа равны, разряды одинаковы");
        } else {
            if (ones1 != ones2 && tens1 != tens2 &&
                    hunds1 != hunds2) {
                System.out.println("Нет совпадающих цифр, разряды разные");
            } else {
                System.out.println("Исходные = " + number1 + " и " + number2);
                if (ones1 == ones2) System.out.println("Совпадают: ");
                  {
                    System.out.println(ones1 + " и " + ones2 + " - Номер разряда 1");
                  }
                if (tens1 == tens2) {
                    System.out.println(tens1 + " и " + tens2 + " - Номер разряда 2");
                }
                if (hunds1 == hunds2) {
                    System.out.println(hunds1 + " и " + hunds2 + " - Номер разряда 3");
                }
            }
        }
        // 5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char element = '\u005E';
        System.out.print("'" + element + "'");
        if (Character.isDigit(element)) {
            System.out.print(" - Это цифра");
        }
        if (Character.isUpperCase(element)) {
            System.out.print(" - Это заглавная буква");
        }
        if (Character.isLowerCase(element)) {
            System.out.print(" - Это маленькая буква");
        }
        if (!Character.isLetterOrDigit(element)) {
            System.out.print(" - Ни буква и ни цифра");
        }

        // 6. Подсчет начисленных банком %
        System.out.println("\n\n6. Подсчет начисленных банком %");
        double deposit = 321123.59d;
        double percent = 0;
        System.out.println("Cумма вклада " + deposit);
        if (deposit < 100000) {
            percent = deposit * 0.05d;
        }
        if ((deposit > 100000) && (deposit < 300000)) {
            percent = deposit * 0.07d;
        }
        if (deposit >= 300000) {
            percent = deposit * 0.1d;
        }
        System.out.println("Сумма начисленного процента " + percent);
        System.out.println("итоговую сумму с % " + (deposit + percent));

        // 7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 59d;
        double historyScore = 0d;
        if (historyPercent <= 60) {
            historyScore = 2d;
        }
        if (historyPercent > 60) {
            historyScore = 3d;
        }
        if (historyPercent > 73) {
            historyScore = 4d;
        }
        if (historyPercent > 91) {
            historyScore = 5d;
        }

        double programmingPercent = 92d;
        double programmingScore = 0d;
        if (programmingPercent <= 60) {
            programmingScore = 2d;
        }
        if (programmingPercent > 60) {
            programmingScore = 3d;
        }
        if (programmingPercent > 73) {
            programmingScore = 4d;
        }
        if (programmingPercent > 91) {
            programmingScore = 5d;
        }
        System.out.println("История - оценка " + historyScore);
        System.out.println("Программирование - оценка " + programmingScore);
        System.out.println("Средний процент " + ((historyPercent + programmingPercent) / 2d));
        System.out.println("Cредний балл оценок по предметам " +
                ((historyScore + programmingScore) / 2d));

        // 8. Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли");
        float productPrice = 13025.233f;
        float rental = 5123.018f;
        float costProduction = 9001.729f;
        float yearProfit = (productPrice - costProduction - rental) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + yearProfit);
        } else if (yearProfit <= 0) {
            System.out.println("Прибыль за год: " + yearProfit);
        }

        // 9. Расчет годовой прибыли
        System.out.println("\n9. Расчет годовой прибыли");
        BigDecimal productPrice1 = new BigDecimal("13025.233");
        BigDecimal rental1 = new BigDecimal("5123.018");
        BigDecimal costProduction1 = new BigDecimal("9001.729");
        BigDecimal months = BigDecimal.valueOf(12);
        BigDecimal yearProfit2 = (productPrice1.subtract(costProduction1).subtract(rental1)
                .multiply(months)).setScale(2, RoundingMode.HALF_DOWN);
        if (yearProfit2.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: " + "+" + yearProfit2);
        } else if (yearProfit2.compareTo(BigDecimal.ZERO) <= 0) {
            System.out.println("Прибыль за год: " + yearProfit2);
        }

        // 10. Подсчет начисленных банком %
        double deposit2 = 321123.59d;
        double percent2 = 0;
        System.out.println("Cумма вклада " + deposit2);
        if (deposit2 < 100000) {
            percent2 = deposit2 * 0.05d;
        }
        if ((deposit2 > 100000) && (deposit2 < 300000)) {
            percent2 = deposit2 * 0.07d;
        }
        if (deposit2 >= 300000) {
            percent2 = deposit2 * 0.1d;
        }
        double totalSum = deposit2 + percent2;
        BigDecimal percentBigDecimal = new BigDecimal(percent2).setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal totalSumBigDecimal = new BigDecimal(totalSum).setScale(2, RoundingMode.HALF_DOWN);
        System.out.println("Сумма начисленного процента " + percentBigDecimal);
        System.out.println("Итоговая сумма с % " + totalSumBigDecimal);
    }
}