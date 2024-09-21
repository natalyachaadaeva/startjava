import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int computerNumber = 4; // компьютер "загадывает" число от 1 до 100
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число: ");
        int playerNumber = console.nextInt();
        while (playerNumber != computerNumber) {
            if (playerNumber < computerNumber) {
                System.out.println(playerNumber + " меньше того, что загадал компьютер");
                System.out.println("Введите число: ");
                playerNumber = console.nextInt();
            } else {
                System.out.println(playerNumber + " больше того, что загадал компьютер");
                System.out.println("Введите число: ");
                playerNumber = console.nextInt();
            }
        }
        System.out.println("Вы победили! Загаданное число: " + computerNumber);
    }
}