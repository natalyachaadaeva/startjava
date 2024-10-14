public class WolfTest {
    public static void main(String[] args) {        
        Wolf wolfOne = new Wolf();
        wolfOne.height = 5.15f;
        wolfOne.color = "серебристый";
        wolfOne.age = 10;
        System.out.println("Рост - " + wolfOne.height + " м " + "\nОкрас - " + wolfOne.color +
                "\nВозраст - " + wolfOne.age + " месяцев");
        wolfOne.howl();  
        System.out.println();
        wolfOne.run();
        System.out.println();
        wolfOne.hunt();
    }
}