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
        int cdRomDrive = 12;
        boolean hasCdromDrive = cdRomDrive == 12;
        System.out.println("Есть CD привод? = " + hasCdromDrive);

        // 2. Расчет стоимости товара со скидкой
        System.out.println("\n2. Расчет стоимости товара со скидкой");
        float pen = 105.5f;
        float book = 235.83f;
        float sumGoods = pen + book;
        double percent = sumGoods * 0.11;
        double totalSum = sumGoods + percent;
        System.out.println("Cтоимость товаров без скидки = " + sumGoods);
        System.out.println("Cумма скидки = " + percent);
        System.out.println("Cтоимость товаров со скидкой = " + totalSum);
        System.out.println(); 

        // 3. Вывод слова JAVA
        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        // 4. Вывод min и max значений целых числовых типов
        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        // первоначальное значение
        System.out.println("\nПервоначальное значение");
        int intMax = 2147483647;
        System.out.println("intMax = " + intMax);
        byte byteMax = 127;
        System.out.println("byteMax = " + byteMax);
        short shortMax = 32767;
        System.out.println("shortMax = " + shortMax);
        long longMax = 9223372036854775807L;        
        System.out.println("longMax = " + longMax);
        // Значение после инкремента на единицу
        System.out.println("\nЗначение после инкремента на единицу");
        int intMax1 = 2147483647;
        intMax1++;
        System.out.println("intMax++ = " + intMax1);
        byte byteMax1 = 127;
        byteMax1++;
        System.out.println("byteMax = " + byteMax1);
        short shortMax1 = 32767;
        shortMax1++;
        System.out.println("shortMax = " + shortMax1);
        long longMax1 = 9223372036854775807L;
        longMax1++;
        System.out.println("longMax = " + longMax1);
        // значение после декремента на единицу
        System.out.println("\nзначение после декремента на единицу");
        int intMax2 = 2147483647;
        intMax2--;
        System.out.println("intMax-- = " + intMax2);
        byte byteMax2 = 127;
        byteMax2--;
        System.out.println("byteMax-- = " + byteMax2);
        short shortMax2 = 32767;
        shortMax2--;
        System.out.println("shortMax-- = " + shortMax2);
        long longMax2 = 9223372036854775807L;
        longMax2--;
        System.out.println("longMax-- = " + longMax2);
        
        // 5. Перестановка значений переменных
        System.out.println("\n5. Перестановка значений переменных");
        // переменные
        int a = 2;
        int b = 5;
        System.out.println("\nИсходные переменные \na = " + a + "\nb = " + b);
        // с помощью третьей переменной
        int c = a;
        a = b;
        b = c;
        System.out.println("\nс помощью третьей переменной \na = " + a + "\nb = " + b);
        // с помощью арифметических операций
        a += b;
        a -= b;
        System.out.println("\nс помощью арифметических операций \na = " + a + "\nb = " + b);
        // с помощью побитовой операции 
        a ^= b;
        a ^= b;
        System.out.println("\nс помощью побитовой операции \na = " + a + "\nb = " + b);

        // 6. Вывод символов и их кодов
        System.out.println("\n6. Вывод символов и их кодов");
        char simbol36 = '$';
        System.out.println("36 = " + simbol36);
        char simbol42 = '*';
        System.out.println("42 = " + simbol42);
        char simbol64 = '@';
        System.out.println("64 = " + simbol64);
        char simbol124 = '|';
        System.out.println("124 = " + simbol124);
        char simbol126 = '~';
        System.out.println("126 = " + simbol126);

        // 7. Вывод в консоль ASCII-арт Дюка
        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char s1 = '/';
        char s2 = 92;
        char s3 = '_';
        char s4 = '(';
        char s5 = ')';
        System.out.println("    " + s1 + s2);
        System.out.println("   " + s1 + "  " + s2);
        System.out.println("  " + s1 + s3 + s4 + " " + s5 + s2);
        System.out.println(" " + s1 + "      " + s2);
        System.out.println("" + s1 + s3 + s3 + s3 + s3 + s1 + s2 + s3 + s3 + s2);

        // 8. Манипуляции с сотнями, десятками и единицами числа
        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int x8 = 123;
        int hundreds = (x8 / 100) % 10;
        int tens = (x8 / 10) % 10;
        int units = (x8 / 1) % 10;
        int sumNumbers = hundreds + tens + units;
        int productNumbers = hundreds * tens * units;
        System.out.println("Число 123 содержит:");
        System.out.println("  Сотен - " + hundreds + "\n  Десятков - " + tens);
        System.out.println("  Единиц - " + units);
        System.out.println("Сумма разрядов = " + sumNumbers + "\nПроизведение разрядов = " + productNumbers);

        // 9. Перевод секунд в часы, минуты и секунды
        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("ЧЧ:ММ:СС = " + timeString);

        // 10. Расчет стоимости товара со скидкой
        System.out.println("\n10. Расчет стоимости товара со скидкой");
        BigDecimal book2 = new BigDecimal("235.83");
        BigDecimal pen2 = new BigDecimal("105.5");
        BigDecimal percent2 = new BigDecimal("0.11");
        BigDecimal amountGoods = pen2.add(book2);
        BigDecimal productGoods = amountGoods.multiply(percent2);
        BigDecimal amountPercent = amountGoods.add(productGoods);
        BigDecimal decimalProduct = productGoods.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        BigDecimal decimalAmount = amountPercent.setScale(2, BigDecimal.ROUND_HALF_DOWN);
        System.out.println("Cтоимость товаров без скидки = " + amountGoods);
        System.out.println("Cумма скидки = " + decimalProduct);
        System.out.println("Cтоимость товаров со скидкой = " + decimalAmount);
    }
}