public class ReternNameMethod {
    public static String nameMethod() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "статический метод, возвращающий имя метода, в котором он был вызван");
        return null;
    }
}