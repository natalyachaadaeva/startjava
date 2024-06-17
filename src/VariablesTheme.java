import java.math.BigDecimal;

public class VariablesTheme {
    public static void main(String[] args) {
        // 1. Вывод характеристик компьютера
        System.out.println("\n1. Вывод характеристик компьютера");
        int spaceHdd = 120; 
        System.out.println("Объем жесткого диска = " + spaceHdd + " Гб");
        short osVersion = 10; 
        System.out.println("Версия операционной системы Windows = " + osVersion);
        float buildNumberOs = 19045.4474f;
        System.out.println("Номер сборки операционной системы = " + buildNumberOs);
        byte systemType = 64;
        System.out.println("Тип системы = " + systemType + "x");
        long spaceRam = 32;
        System.out.println("Объем оперативной памяти = " + spaceRam);
        char quantityCore = 52;
        System.out.println("Количество ядер процессора = " + quantityCore);
        double frequencyCpu = 2.6d;
        System.out.println("Частота процессора = " + frequencyCpu + " ГГц");
        int psuPower = 400;
        boolean isPsuPowerMoreThen200 = psuPower > 200;
        System.out.println("Мощность блока питания больше 200 Вт? = " + isPsuPowerMoreThen200);

        // 2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float costPen = 105.5f;
        float costBook = 235.83f;
        float basePrice = costPen + costBook;
        double discounSum = basePrice * 0.11;
        double totalSum = basePrice - discounSum;
        System.out.println("Стоимость товаров без скидки = " + basePrice);
        System.out.println("Сумма скидки = " + discounSum);
        System.out.println("Стоимость товаров со скидкой = " + totalSum);

        // 3. Вывод слова JAVA
        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // 4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");

        int extremesIntValue = 2147483647;
        System.out.println("\nПервоначальное значение переменной Int = " + extremesIntValue);
        extremesIntValue++;
        System.out.println("Значение после инкремента на единицу = " + extremesIntValue);
        extremesIntValue--;
        extremesIntValue--;
        System.out.println("Значение после декремента на единицу = " + extremesIntValue);

        byte extremesByteValue = 127;
        System.out.println("\nПервоначальное значение переменной Byte = " + extremesByteValue);
        extremesByteValue++;
        System.out.println("Значение после инкремента на единицу = " + extremesByteValue);
        extremesByteValue--;
        extremesByteValue--;
        System.out.println("Значение после декремента на единицу= " + extremesByteValue);

        short extremesShortValue = 32767;
        System.out.println("\nПервоначальное значение переменной Short = " + extremesShortValue);
        extremesShortValue++;
        System.out.println("Значение после инкремента на единицу = " + extremesShortValue);
        extremesShortValue--;
        extremesShortValue--;
        System.out.println("Значение после декремента на единицу= " + extremesShortValue);

        long extremesLongValue = 9223372036854775807L;
        System.out.println("\nПервоначальное значение переменной Long = " + extremesLongValue);
        extremesLongValue++;
        System.out.println("Значение после инкремента на единицу = " + extremesLongValue);
        extremesLongValue--;
        extremesLongValue--;
        System.out.println("Значение после декремента на единицу= " + extremesLongValue);

        // 5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        // переменные
        int a = 2;
        int b = 5;
        System.out.println("\nИсходные переменные \na = " + a + "\nb = " + b);
        // с помощью третьей переменной
        int swap = a;
        a = b;
        b = swap;
        System.out.println("\nс помощью третьей переменной \na = " + a + "\nb = " + b);
        // с помощью арифметических операций
        a += b;
        b = a - b;
        a -= b;
        System.out.println("\nс помощью арифметических операций \na = " + a + "\nb = " + b);
        // с помощью побитовой операции 
        a ^= b;
        b = a ^ b;
        a ^= b; 
        System.out.println("\nс помощью побитовой операции \na = " + a + "\nb = " + b);

        // 6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        System.out.println((int) dollar + " = " + dollar);
        char asterisk = '*';
        System.out.println((int) asterisk + " = " + asterisk);
        char atSign = '@';
        System.out.println((int) atSign + " = " + atSign);
        char verticalBar = '|';
        System.out.println((int) verticalBar + " = " + verticalBar);
        char tilde = '~';
        System.out.println((int) tilde + " = " + tilde);

        // 7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + rightParenthesis + 
                           backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                           backslash + underscore + underscore + backslash);

        // 8. Манипуляции с сотнями, десятками и единицами числа
        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int originNumber = 123;
        int hundreds = originNumber / 100;
        int tens = (originNumber / 10) % 10;
        int ones = originNumber % 10;
        int sumNumbers = hundreds + tens + ones;
        int productNumbers = hundreds * tens * ones;
        System.out.println("Число 123 содержит:");
        System.out.println("  Сотен - " + hundreds + "\n  Десятков - " + tens);
        System.out.println("  Единиц - " + ones);
        System.out.println("Сумма разрядов = " + sumNumbers);
        System.out.println("Произведение разрядов = " + productNumbers);

        // 9. Перевод секунд в часы, минуты и секунды
        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = (totalSeconds % 3600) / 60;
        int ss = totalSeconds % 60;
        System.out.printf("%02d:%02d:%02d", hh, mm, ss);

        // 10. Расчет стоимости товара со скидкой
        System.out.println("\n\n10. Расчет стоимости товара со скидкой");
        BigDecimal costBook2 = new BigDecimal("235.83");
        BigDecimal costPen2 = new BigDecimal("105.5");
        BigDecimal discoun = new BigDecimal("0.11");
        BigDecimal basePrice2 = costPen2.add(costBook2);
        BigDecimal discounSum2 = basePrice2.multiply(discoun);
        BigDecimal totalSum2 = basePrice2.subtract(discounSum2);
        BigDecimal decimalDiscounSum2 = discounSum2.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal decimalTotalSum2 = totalSum2.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("Стоимость товаров без скидки = " + basePrice2);
        System.out.println("Сумма скидки = " + decimalDiscounSum2);
        System.out.println("Стоимость товаров со скидкой = " + decimalTotalSum2);
    }
}