public class BooleanMethods {
    public boolean isProgrammRunning() {
        System.out.println(MethodName.getCurrent() + "() -> старт игрового процесса");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println(MethodName.getCurrent() + "() -> удалить файл на жестком диске или флешке?");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.println(MethodName.getCurrent() + "() -> последовательность содержит " +
                "уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.println(MethodName.getCurrent() + "() -> пользователь ввел букву?");
        return true;
    }

    public boolean hasEqualNumbers() {
        System.out.println(MethodName.getCurrent() + "() -> в проверяемых числах есть равные цифры?");
        return true;
    }

    public boolean hasStillAttempts() {
        System.out.println(MethodName.getCurrent() + "() -> \"Марио\" остались попытки?");
        return true;
    }

    public boolean isEmpty() {
        System.out.println(MethodName.getCurrent() + "() -> пользователь ввёл пустую " +
                "строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.println(MethodName.getCurrent() + "() -> на кубике, который " +
                "бросил компьютер, выпало четное число?");
        return true;
    }

    public boolean isValidPath() {
        System.out.println(MethodName.getCurrent() + "() -> путь до файла, который вы " +
                "ищите на ssd, действительный?");
        return true;
    }

    public boolean isFileExist() {
        System.out.println(MethodName.getCurrent() + "() -> файл по указанному адресу существует?");
        return true;
    }
}