public class BooleanMethods {
    public boolean isProgrammRunning() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "старт игрового процесса");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "удалить файл на жестком диске или флешке?");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "пользователь ввел букву?");
        return true;
    }

    public boolean hasEqualNumbers() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "в проверяемых числах есть равные цифры?");
        return true;
    }

    public boolean hasStillAttempts() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() ->  " +
                "\"Марио\" остались попытки?");
        return true;
    }

    public boolean isEmpty() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "на кубике, который бросил компьютер, выпало четное число?");
        return true;
    }

    public boolean isValidPath() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "путь до файла, который вы ищите на ssd, действительный?");
        return true;
    }

    public boolean isFileExist() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "файл по указанному адресу существует?");
        return true;
    }
}