import static java.lang.Character.getName;

public class NoBooleanMethod {
    public void findLongWord() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> найти" +
                "самое длинное слово в предложении из книги по Java");
    }

    public void selectMenuItem() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> выбрать " +
                "пункт меню в текстовом редакторе на macOS");
    }

    public void calculateAverageValue() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->" +
                " вычислить среднее значение оценок в школе №1234");
    }

    public void countUniqueNumber() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "подсчитать количество уникальных слов в \"Война и Мир\"");
    }

    public void displayErrorMessage() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->" +
                " вывести сообщение об ошибке");
    }

    public void synchronizeData() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->" +
                " синхронизировать данные с облачным хранилищем");
    }

    public void restoreReserveData() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "восстановить данные из резервной копии от 11.03.2024");
    }

    public void stopDownloadFile() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->" +
                " приостановить загрузку mp3-файла группы \"Ария\"");
    }

    public void resetToFactorySettings() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "сбросить настройки до заводских для пылесоса Mi");
    }

    public void writeContentsToFile() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "записать содержимое в файл по указанному пути на флешку");
    }

    public void convertCelsiusToFahrenheit() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "преобразовать температуру из Цельсия в Фаренгейт");
    }

    public void enterMathematicalExpression() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "ввести математическое выражение с тремя аргументами");
    }

    public void identifyRacerWinner() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "выявить победителя среди гонщиков игры \"Need For Speed\"");
    }

    public void findBookByWriter() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "найти книгу по имени писателя");
    }
}
