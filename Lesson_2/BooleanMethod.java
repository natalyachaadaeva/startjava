public class BooleanMethod {
    public boolean isProgrammFinished() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "старт игрового процесса");
        return true;
    }

    public boolean isFileOnSsdOrUsbToken() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "удалить файл на жестком диске или флешке?");
        return true;
    }

    public boolean isDigitUnique() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isEnterLetterOrOther() {
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

    public boolean isEnterStringWrong() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isNumberEven() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "на кубике, который бросил компьютер, выпало четное число?");
        return true;
    }

    public boolean isPathValid() {
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