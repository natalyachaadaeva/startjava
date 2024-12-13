public class InstanceMethodTest {
    public void callNoBooleanMethods(NoBooleanMethods nonBm) {
        nonBm.findLongestWord();
        nonBm.selectMenuItem();
        nonBm.calculateAverageScore();
        nonBm.countUniqueWords();
        nonBm.displayErrorMessage();
        nonBm.synchronizeData();
        nonBm.restoreData();
        nonBm.pauseDownload();
        nonBm.resetSettings();
        nonBm.writeContent();
        nonBm.convertTemperature();
        nonBm.enterExpression();
        nonBm.identifyWinner();
        nonBm.findBook();
        System.out.println();
    }

    public void callBooleanMethods(BooleanMethods bm) {
        bm.isProgrammRunning();
        bm.isFileDeleted();
        bm.hasUniqueDigit();
        bm.isLetter();
        bm.hasEqualNumbers();
        bm.hasStillAttempts();
        bm.isEmpty();
        bm.isEvenNumber();
        bm.isValidPath();
        bm.isFileExist();
    }

    public static void main(String[] args) {
        NoBooleanMethods bm1 = new NoBooleanMethods();
        BooleanMethods nonBm1 = new BooleanMethods();

        InstanceMethodTest mainClass = new InstanceMethodTest();

        mainClass.callNoBooleanMethods(bm1);
        mainClass.callBooleanMethods(nonBm1);
    }
}