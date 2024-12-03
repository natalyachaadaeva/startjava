public class StaticMethodClass {
    public static void staticMethod() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + "() -> " +
                "статический метод, возвращающий имя метода, в котором он был вызван");
    }
}
