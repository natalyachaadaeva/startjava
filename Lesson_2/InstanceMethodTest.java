public class InstanceMethodTest {
    public static void main(String[] args) {
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
        System.out.println(bm.isFileExist());

        System.out.println();
        NoBooleanMethods nonBm = new NoBooleanMethods();
        System.out.println(nonBm.findLongestWord());
        System.out.println(nonBm.selectMenuItem());
        System.out.println(nonBm.calculateAverageScore());
        System.out.println(nonBm.countUniqueWords());
        System.out.println(nonBm.displayErrorMessage());
        System.out.println(nonBm.synchronizeData());
        System.out.println(nonBm.restoreData());
        System.out.println(nonBm.pauseDownload());
        System.out.println(nonBm.resetSettings());
        System.out.println(nonBm.writeContent());
        System.out.println(nonBm.convertTemperature());
        System.out.println(nonBm.enterExpression());
        System.out.println(nonBm.identifyWinner());
        System.out.println(nonBm.findBook());

        System.out.println();
        ReternNameMethod rm = new ReternNameMethod();
        System.out.println(rm.nameMethod());
    }
}