public class WolfTest {
    public static void main(String[] args) {        
        Wolf wolfOne = new Wolf();
        wolfOne.setHeight(5f);
        wolfOne.setColor("серебристый");
        wolfOne.setAge(5);
        System.out.println("Рост - " + wolfOne.getHeight() + " м " + "\nОкрас - " + wolfOne.getColor() +
                "\nВозраст - " +  wolfOne.getAge() + " месяцев");
        wolfOne.howl();  
        System.out.println();
        wolfOne.run();
        System.out.println();
        wolfOne.hunt();
    }
}