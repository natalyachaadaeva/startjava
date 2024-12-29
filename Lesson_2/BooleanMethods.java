public class BooleanMethods {
    public boolean isProgrammRunning() {
        System.out.print(MethodName.getCurrent() + "() -> старт игрового процесса ");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.print(MethodName.getCurrent() +
                "() -> удалить файл на жестком диске или флешке? ");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.print(MethodName.getCurrent() +
                "() -> последовательность содержит уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.print(MethodName.getCurrent() + "() -> пользователь ввел букву? ");
        return true;
    }

    public boolean hasEqualNumbers() {
        System.out.print(MethodName.getCurrent() +
                "() -> в проверяемых числах есть равные цифры? ");
        return true;
    }

    public boolean hasStillAttempts() {
        System.out.print(MethodName.getCurrent() + "() -> \"Марио\" остались попытки? ");
        return true;
    }

    public boolean isEmpty() {
        System.out.print(MethodName.getCurrent() +
                "() -> пользователь ввёл пустую строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.print(MethodName.getCurrent() +
                "() -> на кубике, который бросил компьютер, выпало четное число? ");
        return true;
    }

    public boolean isValidPath() {
        System.out.print(MethodName.getCurrent() +
                "() -> путь до файла, который вы ищите на ssd, действительный? ");
        return true;
    }

    public boolean isFileExist() {
        System.out.print(MethodName.getCurrent() + "() -> файл по указанному адресу существует? ");
        return true;
    }
}