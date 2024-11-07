
public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger("Tom", 2f, 5f, 1);
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setHeight(260f);
        jaegerOne.setWeight(1.980f);
        jaegerOne.setArmor(6);
        System.out.println("ModelName JaegerOne = " + JaegerOne.getModelName() +
                "\nHeight JaegerOne = " + JaegerOne.getHeight() + "\nWeight JaegerOne = " +
                JaegerOne.getWeight() + "\nArmor JaegerOne = " + JaegerOne.getArmor());

        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", 250f, 1.722f, 6);
        System.out.println("\nModelName JaegerTwo = " + jaegerTwo.getModelName() +
                "\nHeight JaegerTwo = " + jaegerTwo.getHeight() + "\nWeight JaegerTwo = " +
                jaegerTwo.getWeight() + "\nArmor JaegerTwo = " + jaegerTwo.getArmor());
    }
}
