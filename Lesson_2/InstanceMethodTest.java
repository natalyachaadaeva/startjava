public class InstanceMethodTest {
    public void execNoBooleanMethods() {
        NonBooleanMethods nonBm = new NonBooleanMethods();
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

    public void execBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();
        System.out.println(bm.isProgrammRunning());
        System.out.println(bm.isFileDeleted());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualNumbers());
        System.out.println(bm.hasStillAttempts());
        System.out.println(bm.isEmpty());
        System.out.println(bm.isEvenNumber());
        System.out.println(bm.isValidPath());
    }

    public static void main(String[] args) {
        InstanceMethodTest mainClass = new InstanceMethodTest();
        mainClass.execNoBooleanMethods();
        mainClass.execBooleanMethods();
    }
}