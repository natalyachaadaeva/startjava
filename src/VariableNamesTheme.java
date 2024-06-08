import java.util.Scanner;

public class VariableNamesTheme {
    public static void main(String[] args) {
        // 1. Разные переменные 
        System.out.println("1. Разные переменные");
        // Цифра
        int digit = 5;
        System.out.println("Цифра = " + digit);
        // Сумма цифр
        int sumDigits = 5;
        System.out.println("Сумма чисел = " + sumDigits);
        // Максимальное число
        int maxDigits = 120;
        System.out.println("Максимальное число = " + maxDigits);
        // Количество десятков
        int numTens = 15;
        System.out.println("Количество десятков = " + numTens);
        // Вес собаки
        int dogWeight = 45;
        System.out.println("Вес собаки = " + dogWeight + " кг");
        // Исходное число
        int origNumber = 8;
        System.out.println("Исходное число = " + origNumber);
        // Процент по вкладу
        int intDeposit = 57;
        System.out.println("Процент по вкладу = " + intDeposit + "%");
        // Переменная хранит символ &
        char simbol = '&';
        System.out.println("Переменная хранит символ = " + simbol);
        // Код ошибки
        String errorCode = "0x80072f8f";
        System.out.println("Код ошибки = " + errorCode);
        // Тип сообщения
        String typeMessage = "SMS";
        System.out.println("Тип сообщения = " + typeMessage);
        // Число нулей
        int numZero = 5;
        System.out.println("Число нулей = " + numZero);
        // Уникальное число
        int uniqNumber = 54;
        System.out.println("Уникальное число = " + uniqNumber);
        // Случайное число
        int randomNumber = 15;
        System.out.println("Уникальное число = " + randomNumber);
        // Математическое выражение
        String mathExpression = "a * b = c";
        System.out.println("Математическое выражение = " + mathExpression);
        // Cчет в игре
        int gameScore = 44;
        System.out.println("Cчет в игре = " + gameScore);
        // Максимальная длина
        int maxLength = 4;
        System.out.println("Максимальная длина = " + maxLength);
        // Пункт меню
        String menuItem = "Главное";
        System.out.println("Пункт меню = " + menuItem);
        // Стоимость кофе
        int coastCoffee = 4;
        System.out.println("Стоимость кофе = " + coastCoffee + "$");
        // Дата начала
        String beginDate = "12.02.2024";
        System.out.println("Дата начала = " + beginDate);
        // Окончание диапазона
        String endRange = "n: 90 87 88";
        System.out.println("Окончание диапазона = " + endRange);
        // Полное имя работника месяца
        String fullNameEmployeeMonth = "Иванов Юрий Петрович";
        System.out.println("Полное имя работника месяца = " + fullNameEmployeeMonth);
        // Заголовок электронной книги
        String titleEbook = "Краткое пособие для начинающих программистов";
        System.out.println("Заголовок электронной книги = " + titleEbook);        
        // Размер
        int size = 43;
        System.out.println("Размер = " + size + " см");
        // Вместимость
        int capacity = 66;
        System.out.println("Вместимость = " + capacity + " литров");
        // Счетчик
        int counter = 6;
        System.out.println("Счетчик = " + counter);
        // Путь до файла
        String pathToFile = "c:/Windows/SysWOW64/";
        System.out.println("Путь до файла = " + pathToFile);
        // Количество чисел в каждой строке
        int numberInEachRow = 6;
        System.out.println("Количество чисел в каждой строке = " + numberInEachRow);

        // 2. boolean-переменные 
        System.out.println("\n2. boolean-переменные");
        // Сотни равны?
        int hundred = 100;
        boolean isEqualHunder = hundred == 100;
        System.out.println("Сотни равны? = " + isEqualHunder);
        // Компьютер включен?
        String computerTurnOn = "да";
        boolean isComputerTurn = computerTurnOn != "да";
        System.out.println("Компьютер включен? = " + isComputerTurn);
        // Есть равные цифры?
        int digital1 = 1;
        boolean hasEqualDigital = digital1 == 1;
        System.out.println("Есть равные цифры? = " + hasEqualDigital);
        // Создано?
        String created = "да";
        boolean isCreate = created == "да";
        System.out.println("Создано? = " + isCreate);
        // Пустое?
        String empty = "да";
        boolean isEmpty = empty != "да";
        System.out.println("Пустое? = " + isEmpty);
        // Активное?
        String active = "Active";
        boolean isActive = active != "Active";
        System.out.println("Активное? = " + isActive);
        // Новое?
        String new1 = "New";
        boolean isNew = new1 == "New";
        System.out.println("Новое? = " + isNew);
        // Электронная почта действительная?
        String email = "действительная";
        boolean isValidEmail = email == "действительная";
        System.out.println("Электронная почта действительная? = " + isValidEmail);
        // Имеются уникальные строки?
        int uniqStrings = 54;
        boolean isUniqStrings = uniqStrings == 54;
        System.out.println("Имеются уникальные строки? = " + isUniqStrings);

        // 3. Аббревиатуры 
        System.out.println("\n3. Аббревиатуры");
        // Cтарый universally unique identifier
        String oldUuid = "3422b448-2460-4fd2-9183-8000de6f8343";
        System.out.println("Cтарый universally unique identifier = " + oldUuid);
        // Cтарый universally unique identifier
        String ramManuf = "Kingston";
        System.out.println("Производитель оперативной памяти = " + ramManuf);
        // Емкость жесткого диска
        String spaceHdd = "500gb";
        System.out.println("Емкость жесткого диска = " + spaceHdd);
        // Протокол передачи гипертекста
        String http = "HTTP";
        System.out.println("Протокол передачи гипертекста = " + http);
        // Сокращенный uniform resource locator
        String url = "URL";
        System.out.println("Сокращенный uniform resource locator = " + url);        
        // Новый идентификатор клиента
        String newCuid = "14363376548734874281";
        System.out.println("Новый идентификатор клиента = " + newCuid);
        // Кодировка american standard code for information interchange
        String ascii = "ASCII";
        System.out.println("Кодировка american standard code for information interchange = " + ascii);
    }
}