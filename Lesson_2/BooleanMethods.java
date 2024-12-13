public class BooleanMethods {
    RetrieveInfo returnName = new RetrieveInfo();

    public boolean isProgrammRunning() {
        System.out.println(returnName.getMethodName() + "() -> старт игрового процесса");
        return true;
    }

    public boolean isFileDeleted() {
        System.out.println(returnName.getMethodName() + "() -> удалить файл на жестком диске или флешке?");
        return true;
    }

    public boolean hasUniqueDigit() {
        System.out.println(returnName.getMethodName() + "() -> последовательность содержит " +
                "уникальную цифру? ");
        return true;
    }

    public boolean isLetter() {
        System.out.println(returnName.getMethodName() + "() -> пользователь ввел букву?");
        return true;
    }

    public boolean hasEqualNumbers() {
        System.out.println(returnName.getMethodName() + "() -> в проверяемых числах есть равные цифры?");
        return true;
    }

    public boolean hasStillAttempts() {
        System.out.println(returnName.getMethodName() + "() -> \"Марио\" остались попытки?");
        return true;
    }

    public boolean isEmpty() {
        System.out.println(returnName.getMethodName() + "() -> пользователь ввёл пустую " +
                "строку или из одних пробелов? ");
        return true;
    }

    public boolean isEvenNumber() {
        System.out.println(returnName.getMethodName() + "() -> на кубике, который " +
                "бросил компьютер, выпало четное число?");
        return true;
    }

    public boolean isValidPath() {
        System.out.println(returnName.getMethodName() + "() -> путь до файла, который вы " +
                "ищите на ssd, действительный?");
        return true;
    }

    public boolean isFileExist() {
        System.out.println(returnName.getMethodName() + "() -> файл по указанному адресу существует?");
        return true;
    }
}