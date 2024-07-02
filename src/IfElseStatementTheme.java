import java.math.BigDecimal;

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
        if (n > 0 && n % 1 == 0) {
            System.out.println(n + "положительное и нечетное");
        } else if (n == 0) {
            System.out.println("Число равно нулю");
        } else {
            System.out.print(n + "отрицательное и четное");
        }

        // 4. Поиск одинаковых цифр в числах
        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int firstNumber = 123;
        int secondNumber = 223;
        int onesFirst = firstNumber % 10;
        int tensFirst = firstNumber / 10 % 10;
        int hundsFirst = firstNumber / 100 % 10;
        int onesSecond = secondNumber % 10;
        int tensSecond = secondNumber / 10 % 10;
        int hundsSecond = secondNumber / 100 % 10;
        if (firstNumber == secondNumber) {
            System.out.println("Числа равны, разряды одинаковы");
        } else {
        if (onesFirst != onesSecond && tensFirst != tensSecond && hundsFirst != hundsSecond) {
            System.out.println("Нет совпадающих цифр, разряды разные");
        } else {
        System.out.println("Исходные = " + firstNumber + " и " + secondNumber);
        if (onesFirst == onesSecond) {
            System.out.println("Одинаковые цифры " + onesFirst + " и " +
                onesSecond + " - Номер разряда 3");
        }
        if (tensFirst == tensSecond) {
            System.out.println("Одинаковые цифры " + tensFirst + " и " +
                tensSecond + "- Номер разряда 2");
        }
        if (hundsFirst == hundsSecond) {
            System.out.println("Одинаковые цифры " + hundsFirst + " и " +
                hundsSecond + " - Номер разряда 1");
        }
    }
}

        // 5. Определение символа по его коду
        System.out.println("\n5. Определение символа по его коду");
        char element = '\u0057'; 
        if (Character.isDigit(element)) { 
            System.out.println("'" + element + "'" + " - Это цифра");
        } else { 
        if (Character.isUpperCase(element)) {
            System.out.println("'" + element + "'" + " - Это заглавная буква");
        }
        if (Character.isLowerCase(element)) {
            System.out.println("'" + element + "'" + " - Это маленькая буква");
        }
        if (!(Character.isDigit(element)) && !(Character.isLetter(element))) {
            System.out.println("'" + element + "'" + " - Ни буква и ни цифра");
        }
    }

        // 6. Подсчет начисленных банком %
        System.out.println("\n6. Подсчет начисленных банком %");
        double deposit = 321123.59d; 
        double deposit5 = deposit * 0.05d; 
        double deposit7 = deposit * 0.07d;
        double deposit10 = deposit * 0.10d;
        System.out.println("Cумма вклада " + deposit);
        if (deposit < 100000) { 
            System.out.println("Cумма начисленного процента " + deposit5 + 
                        "\nИтоговая сумма с процентом " + (deposit5 + deposit));
        } else { 
            if (deposit > 100000 && deposit < 300000) {
            System.out.println("Cумма начисленного процента " + deposit7 + 
                        "\nИтоговая сумма с процентом " + (deposit7 + deposit));
        }
        if (deposit >= 300000) {
            System.out.println("Cумма начисленного процента " + deposit10 + 
                        "\nИтоговая сумма с процентом " + (deposit10 + deposit));
        }
}
        // 7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам");
        double historyResult = 59d;
        double programmingResult = 92d;
        int resultTwo = 2;
        int resultTree = 3;
        int resultFour = 4;
        int resultFive = 5;        
        if (historyResult <= 60) {
        System.out.println("История - оценка " + resultTwo);
        } else { 
            if (historyResult > 60); { 
        System.out.println("История - оценка " + resultTree); }
             if (historyResult > 73); {
        System.out.println("История - оценка " + resultFour); }
            if (historyResult > 91); {
        System.out.println("История - оценка " + resultFive); }
        }
        if (programmingResult <= 60) {
        System.out.println("Программирование - оценка " + resultTwo);
        } else { 
            if (programmingResult > 60 && programmingResult < 73) {
        System.out.println("Программирование - оценка " + resultTree);
        }
             if (programmingResult > 73 && programmingResult < 91) {
        System.out.println("Программирование - оценка " + resultFour);
        }
            if (programmingResult > 91) {
        System.out.println("Программирование - оценка " + resultFive);
        }
        }

        double arrayResult = (historyResult + programmingResult) / 2;
        System.out.println("Средний процент " + arrayResult);

        int historyDifference;
        if (historyResult <= 60) {
            historyDifference = 2; 
        } else {
            if (historyResult > 60 && historyResult < 73);
           historyDifference = 3;
        if (historyResult > 73 && historyResult < 91); 
            historyDifference = 4;
        if (historyResult > 91);
            historyDifference = 5; 
        }
        int programmingDifference;
        if (programmingResult <= 60) {
        programmingDifference = 2;
        } else {
        if (programmingResult > 60 && programmingResult < 73);
           programmingDifference = 3;
           if (programmingResult > 73 && programmingResult < 91);
           programmingDifference = 4;
           if (programmingResult > 91); programmingDifference = 5; 
       }

        double difference = (historyDifference + programmingDifference) / 2d;
        System.out.println("Cредний балл оценок по предметам " + difference);

        // 8. Расчет годовой прибыли
        System.out.println("\n8. Расчет годовой прибыли");
        float productPrice = 13025.233f;
        float rental = 5123.018f;
        float costProduction = 9001.729f;
        float yearProfit = (productPrice - costProduction - rental) * 12;
        if (yearProfit > 0) {
            System.out.println("Прибыль за год: " + "+" + yearProfit);
        } else if (yearProfit < 0) {
            System.out.println("Прибыль за год: " + yearProfit);
        } else {
           System.out.println("Прибыль за год: " + yearProfit);
        }

        // 9. Расчет годовой прибыли
        System.out.println("\n9. Расчет годовой прибыли");
        BigDecimal productPrice1 = new BigDecimal("13025.233");
        BigDecimal rental1 = new BigDecimal("5123.018");
        BigDecimal costProduction1 = new BigDecimal("9001.729");
        BigDecimal months = new BigDecimal("12");
        BigDecimal yearProfit2 = (productPrice1.subtract(costProduction1).subtract(rental1)
                        .multiply(months)).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        if (yearProfit2.compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("Прибыль за год: " + "+" + yearProfit2);
        } else if (yearProfit2.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Прибыль за год: " + yearProfit2);
        } else {
           System.out.println("Прибыль за год: " + yearProfit2);
        }

        // 10. Подсчет начисленных банком %
        System.out.println("\n10. Подсчет начисленных банком %");
        BigDecimal deposit2 = new BigDecimal("321123.59");
        BigDecimal percent5 = new BigDecimal("0.05");
        BigDecimal percent7 = new BigDecimal("0.07");
        BigDecimal percent10 = new BigDecimal("0.10");
        BigDecimal deposit5percent = deposit2.multiply(percent5).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal deposit7percent = deposit2.multiply(percent7).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal deposit10percent = deposit2.multiply(percent10).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal totalDeposit5 = deposit5percent.add(deposit2).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal totalDeposit7 = deposit7percent.add(deposit2).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal totalDeposit10 = deposit10percent.add(deposit2).setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("Cумма вклада " + deposit2);
        if (deposit2.compareTo(BigDecimal.ZERO) < 100000) { 
            System.out.println("Cумма начисленного процента " + deposit5percent + 
                        "\nИтоговая сумма с процентом " + totalDeposit5);
        } else { 
            if (deposit2.compareTo(BigDecimal.ZERO) > 100000 && 
                    deposit2.compareTo(BigDecimal.ZERO) < 300000) {
            System.out.println("Cумма начисленного процента " + deposit7percent + 
                        "\nИтоговая сумма с процентом " + totalDeposit7);
        }
        if (deposit2.compareTo(BigDecimal.ZERO) >= 300000) {
            System.out.println("Cумма начисленного процента " + deposit10percent + 
                        "\nИтоговая сумма с процентом " + totalDeposit10);
        }
    }
}
}