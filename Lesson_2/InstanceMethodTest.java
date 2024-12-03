public class InstanceMethodTest {
    public static void main(String[] args) {
        BooleanMethod boolean1 = new BooleanMethod();
        boolean1.isProgrammFinished();
        boolean1.isFileOnSsdOrUsbToken();
        boolean1.isDigitUnique();
        boolean1.isEnterLetterOrOther();
        boolean1.hasEqualNumbers();
        boolean1.hasStillAttempts();
        boolean1.isEnterStringWrong();
        boolean1.isNumberEven();
        boolean1.isPathValid();
        boolean1.isFileExist();

        System.out.println();
        NoBooleanMethod noBoolean = new NoBooleanMethod();
        noBoolean.findLongWord();
        noBoolean.selectMenuItem();
        noBoolean.calculateAverageValue();
        noBoolean.countUniqueNumber();
        noBoolean.displayErrorMessage();
        noBoolean.synchronizeData();
        noBoolean.restoreReserveData();
        noBoolean.stopDownloadFile();
        noBoolean.resetToFactorySettings();
        noBoolean.writeContentsToFile();
        noBoolean.convertCelsiusToFahrenheit();
        noBoolean.identifyRacerWinner();
        noBoolean.findBookByWriter();

        StaticMethodClass.staticMethod();
    }
}