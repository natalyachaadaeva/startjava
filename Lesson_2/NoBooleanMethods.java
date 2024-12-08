public class NoBooleanMethods {
    public String findLongestWord() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> найти" +
                "самое длинное слово в предложении из книги по Java");
        return null;
    }

    public String selectMenuItem() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> выбрать " +
                "пункт меню в текстовом редакторе на macOS");
        return null;
    }

    public int calculateAverageScore() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->" +
                " вычислить среднее значение оценок в школе №1234");
        return 0;
    }

    public int countUniqueWords() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "подсчитать количество уникальных слов в \"Война и Мир\"");
        return 10;
    }

    public String displayErrorMessage() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->" +
                " вывести сообщение об ошибке");
        return null;
    }

    public String synchronizeData() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->" +
                " синхронизировать данные с облачным хранилищем");
        return null;
    }

    public int restoreData() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "восстановить данные из резервной копии от 11.03.2024");
        return 0;
    }

    public String pauseDownload() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->" +
                " приостановить загрузку mp3-файла группы \"Ария\"");
        return "stop";
    }

    public String resetSettings() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "сбросить настройки до заводских для пылесоса Mi");
        return "reset";
    }

    public int writeContent() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "записать содержимое в файл по указанному пути на флешку");
        return 0;
    }

    public float convertTemperature() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "преобразовать температуру из Цельсия в Фаренгейт");
        return 0;
    }

    public String enterExpression() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "ввести математическое выражение с тремя аргументами");
        return null;
    }

    public String identifyWinner() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "выявить победителя среди гонщиков игры \"Need For Speed\"");
        return null;
    }

    public String findBook() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "найти книгу по имени писателя");
        return null;
    }
}